package vt.dam.th_intentlogin_vd2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityLogin extends AppCompatActivity {
    EditText ten, matKhau, email;
    Button nutXacNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TimDieuKhien();
        nutXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChuyenManHinhHome();
            }
        });
    }

    void TimDieuKhien(){
        ten = findViewById(R.id.edtUserName);
        matKhau = findViewById(R.id.edtPass);
        email = findViewById(R.id.edtMail);
        nutXacNhan = findViewById(R.id.btnOK);
    }

    void ChuyenManHinhHome(){
        String tenDN = ten.getText().toString();
        String matKhauDN = matKhau.getText().toString();
        String emailDN = email.getText().toString();

        if(tenDN.equals("63CNTT2") && matKhauDN.equals("123456") && emailDN.equals("trong@gmail.com")){
            Intent iQuiz = new Intent(this, ActivityHome.class);
            iQuiz.putExtra("name_key", tenDN);
            startActivity(iQuiz);
        }else {
            Toast toast = Toast.makeText(this, "Sai thông tin đăng nhập", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}