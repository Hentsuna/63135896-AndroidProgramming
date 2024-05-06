package vt.dam.th_intentnhaplieu_vd2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button nhapLieu;
    TextView ten, nam;

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
        LayDieuKhien();
        nhapLieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NhapLieu();
            }
        });
    }

    void LayDieuKhien(){
        nhapLieu = findViewById(R.id.btnChuyenMH);
        ten = findViewById(R.id.edtTenNhan);
        nam = findViewById(R.id.edtNamNhan);
    }

    public void NhapLieu(){
        Intent iNhap = new Intent(this, NhapLieuActivity.class);
        startActivityForResult(iNhap, 8000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 8000){
            if (resultCode == RESULT_OK){
                String hoTenNhanDuoc = data.getStringExtra("HT");
                int namSinhNhanDuoc = data.getIntExtra("NS", 2024);
                ten.setText(hoTenNhanDuoc);
                nam.setText(String.valueOf(namSinhNhanDuoc));
            }
            else Toast.makeText(this, "Trả về thất bại", Toast.LENGTH_LONG);
        }
        else super.onActivityResult(requestCode, resultCode, data);
    }
}