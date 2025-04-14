package th.hentsun.damviettrong_63135896_tgk;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Item3Activity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_item3);
        String data = getIntent().getStringExtra("data");

        // Hiển thị nội dung lên TextView
        textView = findViewById(R.id.textView);
        textView.setText("Bạn đã chọn: " + data);
    }
}