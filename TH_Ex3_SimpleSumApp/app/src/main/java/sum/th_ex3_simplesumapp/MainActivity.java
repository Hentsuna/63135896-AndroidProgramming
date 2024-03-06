package sum.th_ex3_simplesumapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
    }

    public void XuLyCong(View view){
        //Tìm đến View
        EditText soA = findViewById(R.id.edtA);
        EditText soB = findViewById(R.id.edtB);
        EditText ketqua = findViewById(R.id.edtCong);
        //Lấy dữ liệu và ép kiểu
        int strA =  Integer.parseInt(soA.getText().toString());
        int strB =  Integer.parseInt(soB.getText().toString());
        //Tính
        int tong = strA + strB;
        ketqua.setText(String.valueOf(tong));
    }
}