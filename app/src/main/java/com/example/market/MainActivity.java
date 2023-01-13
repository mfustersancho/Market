package com.example.market;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            Intent intent = new Intent(getApplicationContext(), MainMenuActivity.class);
            startActivity(intent);
        }, 3000);
    }

    /* Guardada para uso futuro
    private void core() {
        setContentView(R.layout.app_list);
        List<AppInfo> appList = new ArrayList<>();
        AppInfo app;

        app = new AppInfo(this, "com.example.lightout");
        if(app != null) {
            appList.add(app);
        }

        app = new AppInfo(this,"com.example.a2048");
        if(app != null) {
            appList.add(app);
        }

        RecyclerView recyclerView = findViewById(R.id.spinner_apps);
        AppListAdapter appListAdapter = new AppListAdapter(appList);
        recyclerView.setAdapter(appListAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
    */


}