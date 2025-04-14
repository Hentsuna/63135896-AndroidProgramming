package th.hentsun.damviettrong_63135896_tgk;

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

    Button nut1, nut2, nut3, nut4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        nut1 = findViewById(R.id.button1);
        nut2 = findViewById(R.id.button2);
        nut3 = findViewById(R.id.button3);
        nut4 = findViewById(R.id.button4);

        nut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, ChucNang2Activity.class);
                startActivity(intent1);
            }
        });
        nut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, ChucNang3Activity.class);
                startActivity(intent1);
            }
        });
        nut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, ChucNang4Activity.class);
                startActivity(intent1);
            }
        });
        nut4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, AboutMeActivity.class);
                startActivity(intent1);
            }
        });
    }
}