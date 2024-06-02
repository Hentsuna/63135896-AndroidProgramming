package vt.dam.testthi;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Cau4Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cau4Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Cau4Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Cau4Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Cau4Fragment newInstance(String param1, String param2) {
        Cau4Fragment fragment = new Cau4Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Buoc 0: Tao file CSDL
//        SQLiteDatabase db = getActivity().openOrCreateDatabase("QLSach.db", Context.MODE_PRIVATE, null);
//        //Buoc 1: Tao Table
//        //cau lenh tao bang
//        String sqlXoaBangNeuDaCo = "DROP TABLE IF EXISTS Books;";
//        String sqlTaoBang = "CREATE TABLE Books (BookID integer PRIMARY KEY, " +
//                                                    "BookName text, " +
//                                                    "Page integer, " +
//                                                    "Price Float, " +
//                                                    "Description text);";
//        //Thuc hien lenh SQL
//        db.execSQL(sqlXoaBangNeuDaCo);
//        db.execSQL(sqlTaoBang);
//        //Them mot so dong du lieu vao bang
//        String sqlThem1 = "INSERT INTO Books VALUES(1, 'Java', 100, 9.99, 'sách về Java');";
//        String sqlThem2 = "INSERT INTO Books VALUES(2, 'Android', 320, 19.00, 'Android cơ bản');";
//        String sqlThem3 = "INSERT INTO Books VALUES(3, 'Học làm giàu', 120, 0.99, 'sách đọc cho vui');";
//        String sqlThem4 = "INSERT INTO Books VALUES(4, 'Từ điển Anh-Việt', 1000, 29.50, 'Từ điển');";
//        String sqlThem5 = "INSERT INTO Books VALUES(5, 'CNXH', 1, 1, 'Chủ nghĩa xã hội');";
//        db.execSQL(sqlThem1);
//        db.execSQL(sqlThem2);
//        db.execSQL(sqlThem3);
//        db.execSQL(sqlThem4);
//        db.execSQL(sqlThem5);
//
//        //Dong CSDL
//        db.close();

        //B1. Mo CSDL
        SQLiteDatabase db = getActivity().openOrCreateDatabase("QLSach.db", Context.MODE_PRIVATE, null);
        //B2. Thuc thi cau lenh Select
        String sqlSelect = "Select * from Books;";
        Cursor cs = db.rawQuery(sqlSelect, null);
        cs.moveToFirst();
        //B3. Do vao bien nao do de xu ly
        ArrayList<Book> dsSach = new ArrayList<Book>();
        //Duyet ban ghi va them vao ds
        do{
            int idSach = cs.getInt(0);//Lay du lieu o cot 0 (dau tien)
            String tenSach = cs.getString(1);
            int soTrang = cs.getInt(2);
            float gia = cs.getFloat(3);
            String mota = cs.getString(4);
            //Tao mot doi tuong va them vao ds
            Book b = new Book(idSach, tenSach, soTrang, gia, mota);
            dsSach.add(b);
        }while (cs.moveToNext());
        //B4. Hien len listView, recycleView
        ArrayList<String> dsTenSach = new ArrayList<String>();
        for (int i = 0; i < dsSach.size(); i++) {
            dsTenSach.add(dsSach.get(i).getBookName());
        }
        // Inflate the layout for this fragment
        View viewCau4 = inflater.inflate(R.layout.fragment_cau4, container, false);
        ListView listViewTenSach = viewCau4.findViewById(R.id.lvTenSach);
        ArrayAdapter<String> adapterTenSach = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_list_item_1,
                dsTenSach);
        listViewTenSach.setAdapter(adapterTenSach);
        //Lang nghe va xu ly
        //listViewTenSach.setOnItemClickListener();
        return viewCau4;
    }
}