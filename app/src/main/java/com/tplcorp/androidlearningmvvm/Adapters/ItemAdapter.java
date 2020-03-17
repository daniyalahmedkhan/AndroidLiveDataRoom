package com.tplcorp.androidlearningmvvm.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tplcorp.androidlearningmvvm.R;
import com.tplcorp.androidlearningmvvm.Room.Tables.ItemModel;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private Context context;
    private List<ItemModel> list;

    public ItemAdapter(Context context, List<ItemModel> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    public void loadItems(List<ItemModel> newItems) {
        list = newItems;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {

        holder.item.setText(list.get(position).getITEMNAME());

    }

    @Override
    public int getItemCount() {
        if (list.size() > 0){
            return list.size();
        }else{
            return 0;
        }

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView item;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item  = itemView.findViewById(R.id.item);
        }
    }
}
