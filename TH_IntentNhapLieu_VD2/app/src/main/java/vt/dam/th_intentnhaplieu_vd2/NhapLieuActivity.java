package vt.dam.th_intentnhaplieu_vd2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NhapLieuActivity extends AppCompatActivity {
    Button xacNhan, huy;
    TextView tenNhap, namNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nhap_lieu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TimDieuKhien();
        xacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Nhap_QuayVe();
            }
        });

        huy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Huy_QuayVe();
            }
        });
    }

    void TimDieuKhien(){
        xacNhan = findViewById(R.id.btnNhap);
        huy = findViewById(R.id.btnHuy);
        tenNhap = findViewById(R.id.edtTenLay);
        namNhap = findViewById(R.id.edtNamLay);
    }

    public void Nhap_QuayVe(){
        String hoTen = tenNhap.getText().toString();
        int namSinh = Integer.parseInt(namNhap.getText().toString());
        Intent iKQNhapLieu = new Intent();
        iKQNhapLieu.putExtra("HT", hoTen);
        iKQNhapLieu.putExtra("NS", namSinh);
        setResult(RESULT_OK, iKQNhapLieu);
        finish();
    }

    public void Huy_QuayVe(){
        Intent iKQNhapLieu = new Intent();
        setResult(RESULT_OK, iKQNhapLieu);
        finish();
    }
}