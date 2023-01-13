package com.example.market;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;

public class AppInfo {
    public String title;
    public Drawable icon;

    public AppInfo(Context context, String packageName) {
        PackageManager packageManager = context.getPackageManager();
        try {
            icon = packageManager.getApplicationIcon(packageName);
            title = packageManager.getApplicationInfo(packageName, 0).packageName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
