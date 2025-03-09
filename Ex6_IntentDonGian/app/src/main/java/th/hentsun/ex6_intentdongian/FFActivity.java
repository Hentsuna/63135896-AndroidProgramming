package th.hentsun.ex6_intentdongian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FFActivity extends AppCompatActivity {
    Button kk, sw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ffactivity2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        sw = findViewById(R.id.button);
        kk = findViewById(R.id.button2);

        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentsw = new Intent(FFActivity.this, SWActivity.class);
                startActivity(intentsw);
            }
        });

        kk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentkk = new Intent(FFActivity.this, MainActivity.class);
                startActivity(intentkk);
            }
        });
    }
}