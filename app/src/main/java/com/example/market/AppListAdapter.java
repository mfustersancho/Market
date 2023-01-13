package com.example.market;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AppListAdapter extends RecyclerView.Adapter<AppListAdapter.AppListViewHolder> {

    private List<AppInfo> mAppList;

    public static class AppListViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;

        public AppListViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            textView = itemView.findViewById(R.id.text_view);
        }
    }

    public AppListAdapter(List<AppInfo> data) {
        mAppList = data;
    }

    @NonNull
    @Override
    public AppListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.app_item, parent, false);
        AppListViewHolder appListViewHolder = new AppListViewHolder(v);
        return appListViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AppListViewHolder holder, int position) {
        AppInfo appInfo = mAppList.get(position);
        holder.imageView.setImageDrawable(appInfo.icon);
        holder.textView.setText(appInfo.title);
    }

    @Override
    public int getItemCount() {
        return mAppList.size();
    }

}
