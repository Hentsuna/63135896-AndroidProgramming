package tinh.th_ex4_addsubmuldiv_onclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Khai báo các đối tượng tương ứng
    EditText soA;
    EditText soB;
    EditText kQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TimDieuKhien();
        //Gắn bộ lắng nghe sự kiện
        nutCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyCong();
            }
        });
    }

    void TimDieuKhien(){
        soA = (EditText)findViewById(R.id.edtA);
        soB = (EditText)findViewById(R.id.edtB);
        kQ = (EditText)findViewById(R.id.edtKQ);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }

    //Hàm xử lý cộng
    public void XuLyCong(){
        float strA =  Float.parseFloat(soA.getText().toString());
        float strB =  Float.parseFloat(soB.getText().toString());
        float tong = strA + strB;
        String chuoiKQ = String.valueOf(tong);
        kQ.setText(chuoiKQ);
    }

    //Hàm xử lý trừ
    public void XuLyTru(View v){
        float strA =  Float.parseFloat(soA.getText().toString());
        float strB =  Float.parseFloat(soB.getText().toString());
        float hieu = strA - strB;
        String chuoiKQ = String.valueOf(hieu);
        kQ.setText(chuoiKQ);
    }

    //Hàm xử lý nhân
    public void XuLyNhan(View v){
        float strA =  Float.parseFloat(soA.getText().toString());
        float strB =  Float.parseFloat(soB.getText().toString());
        float tich = strA * strB;
        String chuoiKQ = String.valueOf(tich);
        kQ.setText(chuoiKQ);
    }

    //Hàm xử lý chia
    public void XuLyChia(View v){
        float strA =  Float.parseFloat(soA.getText().toString());
        float strB =  Float.parseFloat(soB.getText().toString());
        String chuoiKQ;
        if(strB == 0) chuoiKQ = "Không chia được";
        else {
            float thuong = strA / strB;
            chuoiKQ = String.valueOf(thuong);
        }
        kQ.setText(chuoiKQ);
    }
}