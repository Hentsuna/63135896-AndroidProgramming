package vt.dam.th_intentsimple_vidu1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SubActivityOne extends AppCompatActivity {
    Button nutTrangManHinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub_one);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        nutTrangManHinh = findViewById(R.id.btnTrangManHinh);
        nutTrangManHinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QuayVe();
            }
        });
    }

    public void QuayVe(){
        Intent iManHinhChinh = new Intent(this, MainActivity.class);
        startActivity(iManHinhChinh);
    }
}