package ntu_63135896.cau2;

import android.os.Bundle;
import android.view.View;
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
        nutKq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nutA.isChecked()){
                    DiBo();
                }
                if(nutB.isChecked()){
                    XeDap();
                }
                if (nutC.isChecked()){
                    Oto();
                }
            }
        });
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

    //Tính xe oto
    public void Oto(){
        double Km = Double.parseDouble(soKm.getText().toString());
        double time = Km/50;
        double buoc = time * 60 * 80;
        buoc = Math.round(buoc);
        String soB = String.valueOf(buoc);
        if(time < 1){
            time *= 60;
            time = Math.round(time);
            String soH = time + " phút";
            soGio.setText(soH);
            soBuoc.setText(soB);
        }else {
            time = Math.round(time);
            String soH = time + " giờ";
            soGio.setText(soH);
            soBuoc.setText(soB);
        }
    }

    //Tính xe đạp
    public void XeDap(){
        double Km = Double.parseDouble(soKm.getText().toString());
        double time = Km/15;
        double buoc = time * 60 * 80;
        buoc = Math.round(buoc);
        String soB = String.valueOf(buoc);
        if(time < 1){
            time *= 60;
            time = Math.round(time);
            String soH = time + " phút";
            soGio.setText(soH);
            soBuoc.setText(soB);
        }else {
            time = Math.round(time);
            String soH = time + " giờ";
            soGio.setText(soH);
            soBuoc.setText(soB);
        }
    }

    //Tính đi bộ
    public void DiBo(){
        double Km = Double.parseDouble(soKm.getText().toString());
        double time = Km/5;
        double buoc = time * 60 * 80;
        buoc = Math.round(buoc);
        String soB = String.valueOf(buoc);
        if(time < 1){
            time *= 60;
            time = Math.round(time);
            String soH = time + " phút";
            soGio.setText(soH);
            soBuoc.setText(soB);
        }else {
            time = Math.round(time);
            String soH = time + " giờ";
            soGio.setText(soH);
            soBuoc.setText(soB);
        }
    }
}