package th.th_listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Cac Bien tham chieu den cac dieu khien
    EditText edThongTin;
    ListView lvTen;
    //Bien luu tru  danh sach ten
    ArrayList<String> dsTen;
    ArrayAdapter<String> bo_nguon;
    void getControls(){
        edThongTin =(EditText) findViewById(R.id.edThongTin);
        lvTen =(ListView) findViewById(R.id.lvTen);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        getControls(); //Lay tham chieu
        //Tao nguon du lieu, tao danh sach ten
        dsTen = new ArrayList<String>(); //Tao moi danh sach
        dsTen.add("Mai");
        dsTen.add("Lan");
        dsTen.add("Cuc");
        dsTen.add("Hong");
        bo_nguon = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsTen);
        //Cam bo nguon vao listview
        lvTen.setAdapter(bo_nguon);
        //Khi user nhan item
        lvTen.setOnClickListener(new AdapterView.OnClickListener(){
            @Override
            public void onClick(View v) {
                edThongTin.setText("");
            }
        });
    }

    public void ThemPhanTu(View v){
        //Lay du lieu dieu khien
        EditText editTenMoi = (EditText)findViewById(R.id.edNhapTen);
        String tenNhap = editTenMoi.getText().toString();
        //Them vao dsTen
        dsTen.add(tenNhap);
        //Yeu cau Adapter baos cho view (Listview biet) da co thay doi nguon du lieu can cap nhat lai view
        bo_nguon.notifyDataSetChanged();
    }
}