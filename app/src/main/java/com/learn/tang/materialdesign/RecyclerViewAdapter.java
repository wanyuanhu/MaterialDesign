package com.learn.tang.materialdesign;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Tang on 2017/8/30.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private Context mContext;
    public RecyclerViewAdapter(Context mContext) {
        this.mContext = mContext;
    }
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(mContext).inflate(R.layout.list_item_card_main, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, final int position) {
        final View view = holder.mView;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null != recyclerViewItemClick){
                    recyclerViewItemClick.onItemClick(view,position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return 10;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public ViewHolder(View view) {
            super(view);
            mView = view;
        }
    }

    public interface  RecyclerViewItemClick{
        public void onItemClick(View view,int position);
    }
    private RecyclerViewItemClick recyclerViewItemClick;
    public void setRecyclerViewItemClick(RecyclerViewItemClick listenter){
        this.recyclerViewItemClick = listenter;
    }
}
