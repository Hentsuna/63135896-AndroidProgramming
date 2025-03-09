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

public class SWActivity extends AppCompatActivity {
    Button kk, ff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_swactivity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        kk = findViewById(R.id.button);
        ff = findViewById(R.id.button2);

        kk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentkk = new Intent(SWActivity.this, MainActivity.class);
                startActivity(intentkk);
            }
        });

        ff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentff = new Intent(SWActivity.this, FFActivity.class);
                startActivity(intentff);
            }
        });
    }
}