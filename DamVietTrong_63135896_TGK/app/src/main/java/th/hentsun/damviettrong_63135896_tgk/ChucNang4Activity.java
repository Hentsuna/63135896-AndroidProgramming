package th.hentsun.damviettrong_63135896_tgk;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ChucNang4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang4);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Tạo danh sách dữ liệu
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("Solo Leveling", R.mipmap.solo));
        itemList.add(new Item("Dược Sư Tự Sự", R.mipmap.duocsutusu2));
        itemList.add(new Item("One Piece", R.mipmap.onepiece));
        itemList.add(new Item("Shangri-La Frontier", R.mipmap.sharingta));
        itemList.add(new Item("Detective Conan", R.mipmap.conan));

        // Gán Adapter cho RecyclerView
        ItemAdapter adapter = new ItemAdapter(this, itemList);
        recyclerView.setAdapter(adapter);
    }
}