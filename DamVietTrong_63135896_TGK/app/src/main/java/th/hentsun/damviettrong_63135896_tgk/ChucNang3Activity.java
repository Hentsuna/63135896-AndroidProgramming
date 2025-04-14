package th.hentsun.damviettrong_63135896_tgk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ChucNang3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang3);
        // 1. Tạo danh sách dữ liệu
        ArrayList<String> items = new ArrayList<>();
        items.add("Tiến về Xài Gòn");
        items.add("Giải phóng Miền nam");
        items.add("Đất nước trọn niềm vui");
        items.add("Bài ca thống nhất");
        items.add("Mùa xuân trên thành phố HCM");

        // 2. Gán dữ liệu vào Adapter
        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        // 3. Bắt sự kiện click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = items.get(position);

                // Chuyển sang ItemActivity
                Intent intent = new Intent(ChucNang3Activity.this, Item3Activity.class);
                intent.putExtra("data", selectedItem);
                startActivity(intent);

                Toast toast = Toast.makeText(ChucNang3Activity.this, selectedItem, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}