package vt.dam.viewpager2recyclerviewadapter;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> viewPagerDatas;
    ViewPager2 viewPager2Land;

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
        viewPagerDatas = getDataForViewPager();
        viewPager2Land = findViewById(R.id.vp2Land);
        landScapeAdapter = new LandScapeAdapter(this, viewPagerDatas);
        viewPager2Land.setAdapter(landScapeAdapter);
        viewPager2Land.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }

    ArrayList<LandScape> getDataForViewPager(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("fire", "Chiêu thức lửa");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("electric", "Chiêu thức điện"));
        dsDuLieu.add(new LandScape("water", "Chiêu thức nước"));
        dsDuLieu.add(new LandScape("grass", "Chiêu thức cỏ"));
        return dsDuLieu;
    }
}