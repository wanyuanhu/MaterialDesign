package com.learn.tang.materialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Tang on 2017/8/30.
 */

public class ListFragment extends Fragment {
    private RecyclerView mRecyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRecyclerView =
                (RecyclerView) inflater.inflate(R.layout.list_fragment, container, false);
        return mRecyclerView;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mRecyclerView.getContext()));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getActivity());
        adapter.setRecyclerViewItemClick(new RecyclerViewAdapter.RecyclerViewItemClick() {
            @Override
            public void onItemClick(View view, int position) {
                startActivity(new Intent("myself.sun.up"));
            }
        });
        mRecyclerView.setAdapter(adapter);
    }
}
