package th.hentsun.thigkprepare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Cau3Activity extends AppCompatActivity {

    ImageView home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau3);

        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(Cau3Activity.this, MainActivity.class);
                startActivity(home);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Tạo danh sách dữ liệu
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("Bài hát yêu thích", R.drawable.baseline_music_note_24));
        itemList.add(new Item("Môn học đã học", R.drawable.baseline_book_24));
        itemList.add(new Item("Sách yêu thích", R.drawable.baseline_local_library_24));
        itemList.add(new Item("Bộ phim hay nhất", R.drawable.baseline_movie_24));

        // Gán Adapter cho RecyclerView
        ItemAdapter adapter = new ItemAdapter(this, itemList);
        recyclerView.setAdapter(adapter);
    }
}