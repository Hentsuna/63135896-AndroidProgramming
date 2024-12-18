package thi.trong63135896.Dethi2;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

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
        BottomNavigationView bottonNav = findViewById(R.id.bottomNavigationView);
        bottonNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedFragment = null;
                int itemId = menuItem.getItemId();
                if(itemId == R.id.nav_welcome){
                    selectedFragment = new WelcomeFragment();
                } else if (itemId == R.id.nav_unit) {
                    selectedFragment = new UnitConverterFragment();
                } else if (itemId == R.id.nav_welknown) {
                    selectedFragment = new WelknownCoffeeFragment();
                }else if (itemId == R.id.nav_subject) {
                    selectedFragment = new SubjectsFragment();
                }else if (itemId == R.id.nav_mycv) {
                    selectedFragment = new MyCVFragment();
                }

                if (selectedFragment != null){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frgamentSpace, selectedFragment).commit();
                }
                return true;
            }
        });
    }
}