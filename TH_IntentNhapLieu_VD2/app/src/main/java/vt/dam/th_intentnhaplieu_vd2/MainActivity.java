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
}