package th.hentsun.ex4_addsubmuldiv_onclick;

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

    EditText txt1, txt2, txt3;
    Button btn1, btn2, btn3, btn4;

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

        txt1 = findViewById(R.id.edt1);
        txt2 = findViewById(R.id.edt2);
        txt3 = findViewById(R.id.edt3);
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cong();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tru();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Nhan();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Chia();
            }
        });

    }

    void Cong(){
        int kq = Integer.parseInt(txt1.getText().toString()) + Integer.parseInt(txt2.getText().toString());
        txt3.setText(String.valueOf(kq));
    }
    void Tru(){
        int kq = Integer.parseInt(txt1.getText().toString()) - Integer.parseInt(txt2.getText().toString());
        txt3.setText(String.valueOf(kq));
    }
    void Nhan(){
        int kq = Integer.parseInt(txt1.getText().toString()) * Integer.parseInt(txt2.getText().toString());
        txt3.setText(String.valueOf(kq));
    }
    void Chia(){
        if (Integer.parseInt(txt2.getText().toString()) == 0){
            txt3.setText("Không thể chia cho 0");
        }else {
            double kq = Double.parseDouble(txt1.getText().toString()) / Double.parseDouble(txt2.getText().toString());
            txt3.setText(String.valueOf(kq));
        }
    }
}