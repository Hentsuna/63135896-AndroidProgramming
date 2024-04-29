package vt.dam.th_intentlogin_vd2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button nutLogin;

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
        nutLogin = findViewById(R.id.btnLogin);
        nutLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChuyenManHinhLogin();
            }
        });
    }

    public void ChuyenManHinhLogin(){
        Intent iLogin = new Intent(this, ActivityLogin.class);
        startActivity(iLogin);
    }

}