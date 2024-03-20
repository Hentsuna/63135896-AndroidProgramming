package th63.th_sumquiz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText so1;
    EditText so2;
    TextView kq;
    Button nutA;
    Button nutB;
    Button nutC;
    Button nutD;
    Button nutG;
    Random rand = new Random();

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
        nutG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RandomG();
            }
        });
    }

    void TimDieuKhien(){
        so1 = findViewById(R.id.edtA);
        so2 = findViewById(R.id.edtB);
        kq = findViewById(R.id.txtD);
        nutA = findViewById(R.id.btnA);
        nutB = findViewById(R.id.btnB);
        nutC = findViewById(R.id.btnC);
        nutD = findViewById(R.id.btnD);
        nutG = findViewById(R.id.btnG);
    }

    void RandomG(){
        so1.setText(String.valueOf(rand.nextInt(10)));
        int s1 = Integer.parseInt(so1.getText().toString());
        so2.setText(String.valueOf(rand.nextInt(10)));
        int s2 = Integer.parseInt(so2.getText().toString());
        int tong = s1 + s2;
        String chuoikq = String.valueOf(tong);
        switch (rand.nextInt(4)){
            case 0:
                nutA.setText(chuoikq);
                nutB.setText(rand.nextInt(20));
                nutC.setText(rand.nextInt(20));
                nutD.setText(rand.nextInt(20));
                break;
            case 1:
                nutB.setText(chuoikq);
                nutC.setText(rand.nextInt(20));
                nutD.setText(rand.nextInt(20));
                nutA.setText(rand.nextInt(20));
                break;
            case 2:
                nutC.setText(chuoikq);
                nutB.setText(rand.nextInt(20));
                nutD.setText(rand.nextInt(20));
                nutA.setText(rand.nextInt(20));
                break;
            case 3:
                nutD.setText(chuoikq);
                nutB.setText(rand.nextInt(20));
                nutC.setText(rand.nextInt(20));
                nutA.setText(rand.nextInt(20));
                break;
        }

    }

}