package com.android.bignerdranch.android.databindingdemo;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by admin on 2018/5/29.
 */

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private List<TemperatureData> data;

    public MyAdapter(List<TemperatureData> data) {
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.rowlayout,parent,false);
         return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final TemperatureData temperatureData = data.get(position);
        holder.bind(temperatureData);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private final ViewDataBinding binding;
        public MyViewHolder( ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Object obj) {
            binding.setVariable(BR.obj,obj);
            binding.executePendingBindings();
        }
    }
}
