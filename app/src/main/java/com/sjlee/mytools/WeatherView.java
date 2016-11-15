package com.sjlee.mytools;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by nansjlee on 2016-11-14.
 */

public class WeatherView implements ContentsView<WeatherView.WeatherViewHolder> {
    public static final ViewType VIEW_TYPE = ViewType.WEATHER;
    private final Context context;

    public WeatherView(Context context) {
        this.context = context;
    }

    public static ContentsView create(Context context) {
        return new WeatherView(context);
    }

    public WeatherView.WeatherViewHolder createViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_barometer, parent, false);
        return new WeatherView.WeatherViewHolder(view);
    }

    @Override
    public void bindViewHolder(WeatherViewHolder holder) {

    }

    public class WeatherViewHolder extends RecyclerView.ViewHolder {
        TextView valueView;

        public WeatherViewHolder(View itemView) {
            super(itemView);

            valueView = (TextView) itemView.findViewById(R.id.barometer);
        }
    }
}
