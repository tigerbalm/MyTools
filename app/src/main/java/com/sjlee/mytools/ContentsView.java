package com.sjlee.mytools;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by nansjlee on 2016-11-14.
 */

interface ContentsView<T extends RecyclerView.ViewHolder> {
    T createViewHolder(ViewGroup parent);

    void bindViewHolder(T holder);
}
