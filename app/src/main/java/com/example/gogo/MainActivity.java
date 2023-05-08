package com.example.gogo;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.gogo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

private ActivityMainBinding binding;

    private ListView listview ;
    //private ListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     binding = ActivityMainBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        /*//setContentView(R.layout.fragment_home);

        // Adapter 생성
        adapter = new ListViewAdapter();

        // 리스트뷰 참조 및 Adapter 달기
        listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(adapter);
        //listview.setOnItemClickListener(listener);

        adapter.addItem("제목1", R.drawable.ic_home_black_24dp, "내용1");  //(제목 부분, 이미지, 내용)
        adapter.addItem("제목2", R.drawable.ic_home_black_24dp, "내용2");
        adapter.addItem("제목3", R.drawable.ic_home_black_24dp, "내용3");
        adapter.addItem("제목4", R.drawable.ic_home_black_24dp, "내용4");
        adapter.addItem("제목5", R.drawable.ic_home_black_24dp, "내용5");

        adapter.notifyDataSetChanged(); //어댑터의 변경을 알림.*/
    }

}