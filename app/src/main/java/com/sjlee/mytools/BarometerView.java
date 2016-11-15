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

class BarometerView implements ContentsView<BarometerView.BarometerViewHolder> {
    public static final ViewType VIEW_TYPE = ViewType.BAROMETER;
    private final Context context;

    private BarometerView(Context context) {
        this.context = context;
    }

    public static ContentsView create(Context context) {
        return new BarometerView(context);
    }

    @Override
    public BarometerViewHolder createViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_barometer, parent, false);
        return new BarometerViewHolder(view);
    }

    @Override
    public void bindViewHolder(BarometerViewHolder holder) {
        ((BarometerViewHolder)holder).valueView.setText("9999mb");
    }

    public class BarometerViewHolder extends RecyclerView.ViewHolder {
        TextView valueView;

        public BarometerViewHolder(View itemView) {
            super(itemView);

            valueView = (TextView) itemView.findViewById(R.id.barometer);
        }
    }
}
