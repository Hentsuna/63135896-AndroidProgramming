package th.hentsun.damviettrong_63135896_tgk;

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

public class ChucNang2Activity extends AppCompatActivity {

    EditText edt1, edt2, edt3;
    Button bt1;
    TextView kq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang2);

        edt1 =  findViewById(R.id.edt1);
        edt2 =  findViewById(R.id.edt2);
        edt3 =  findViewById(R.id.edt3);
        bt1 =  findViewById(R.id.button1);
        kq = findViewById(R.id.kq);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ngay = Integer.parseInt(edt1.getText().toString());
                int thang = Integer.parseInt(edt2.getText().toString());
                int nam = Integer.parseInt(edt3.getText().toString());

                if(ngay == 30 && thang == 4 && nam == 1975){
                    kq.setText("Đúng");
                }else {
                    kq.setText("Sai");
                }
            }
        });

    }
}