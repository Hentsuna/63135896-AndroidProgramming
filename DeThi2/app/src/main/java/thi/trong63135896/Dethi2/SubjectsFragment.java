package thi.trong63135896.Dethi2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SubjectsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SubjectsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SubjectsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SubjectsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SubjectsFragment newInstance(String param1, String param2) {
        SubjectsFragment fragment = new SubjectsFragment();
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
        SQLiteDatabase db = getActivity().openOrCreateDatabase("Subject.db", Context.MODE_PRIVATE, null);
        //Buoc 1: Tao Table
        //cau lenh tao bang
        String sqlXoaBangNeuDaCo = "DROP TABLE IF EXISTS SUBJECTS";
        String sqlTaoBang = "CREATE TABLE Books (ID integer PRIMARY KEY, " +
                                                    "SubMa text, " +
                                                    "SubName text);";
        //Thuc hien lenh SQL
        db.execSQL(sqlXoaBangNeuDaCo);
        db.execSQL(sqlTaoBang);
        //Them mot so dong du lieu vao bang
        String sqlThem1 = "INSERT INTO Books VALUES(1, '01', 'Toán');";
        String sqlThem2 = "INSERT INTO Books VALUES(1, '01', 'Toán');";
        String sqlThem3 = "INSERT INTO Books VALUES(1, '01', 'Toán');";
        String sqlThem4 = "INSERT INTO Books VALUES(1, '01', 'Toán');";
        String sqlThem5 = "INSERT INTO Books VALUES(1, '01', 'Toán');";
        db.execSQL(sqlThem1);
        db.execSQL(sqlThem2);
        db.execSQL(sqlThem3);
        db.execSQL(sqlThem4);
        db.execSQL(sqlThem5);

        //Dong CSDL
        db.close();
        // Inflate the layout for this fragment
        View viewCau4 = inflater.inflate(R.layout.fragment_subjects, container, false);
        return viewCau4;
    }
}