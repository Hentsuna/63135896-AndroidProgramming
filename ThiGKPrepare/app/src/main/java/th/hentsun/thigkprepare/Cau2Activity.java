package th.hentsun.thigkprepare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Cau2Activity extends AppCompatActivity {

    ImageView home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau2);

        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(Cau2Activity.this, MainActivity.class);
                startActivity(home);
            }
        });


        // 1. Tạo danh sách dữ liệu
        ArrayList<String> items = new ArrayList<>();
        items.add("Solo Leveling");
        items.add("Dược Sư Tự Sự");
        items.add("One Piece");
        items.add("Shangri-La Frontier");
        items.add("Detective Conan");

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
                Intent intent = new Intent(Cau2Activity.this, ItemActivity.class);
                intent.putExtra("data", selectedItem);
                startActivity(intent);

//                Toast toast = Toast.makeText(Cau2Activity.this, selectedItem, Toast.LENGTH_LONG);
//                toast.show();
            }
        });
    }
}