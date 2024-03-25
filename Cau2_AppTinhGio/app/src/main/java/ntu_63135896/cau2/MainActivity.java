package ntu_63135896.cau2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText soKm;
    EditText soGio;
    EditText soBuoc;
    RadioGroup nutGroup;
    RadioButton nutA, nutB, nutC;
    Button nutKq;

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
    }

    void TimDieuKhien(){
        soKm = findViewById(R.id.edtkm);
        soGio = findViewById(R.id.edth);
        soBuoc = findViewById(R.id.edtb);
        nutA = findViewById(R.id.btnA);
        nutB = findViewById(R.id.btnB);
        nutC = findViewById(R.id.btnC);
        nutKq = findViewById(R.id.btnkq);
        nutGroup = findViewById(R.id.btnGroup);
    }
}