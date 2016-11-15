package com.sjlee.mytools;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nansjlee on 2016-11-14.
 */

class MyViewFactory {
    public static Map<ViewType, ContentsView<? extends RecyclerView.ViewHolder>> createViews(Context context) {
        Map<ViewType, ContentsView<? extends RecyclerView.ViewHolder>> views = new HashMap<>();

        views.put(BarometerView.VIEW_TYPE, BarometerView.create(context));
        views.put(WeatherView.VIEW_TYPE, WeatherView.create(context));

        return views;
    }
}
