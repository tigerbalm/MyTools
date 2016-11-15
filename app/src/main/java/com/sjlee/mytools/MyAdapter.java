package com.sjlee.mytools;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nansjlee on 2016-11-14.
 */

class MyAdapter extends RecyclerView.Adapter {
    Map<ViewType, ContentsView<? extends RecyclerView.ViewHolder>> views;

    public MyAdapter(Context context) {
        views = new HashMap<>();
        views = MyViewFactory.createViews(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (views.containsKey(ViewType.values()[viewType])) {
            return views.get(ViewType.values()[viewType]).createViewHolder(parent);
        }

        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (views.containsKey(ViewType.values()[position])) {
            views.get(ViewType.values()[position]).bindViewHolder(holder);
        }
    }

    @Override
    public int getItemCount() {
        return views.size();
    }
}
