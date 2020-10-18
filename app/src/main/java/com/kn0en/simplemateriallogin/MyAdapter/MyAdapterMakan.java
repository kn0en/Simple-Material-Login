package com.kn0en.simplemateriallogin.MyAdapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kn0en.simplemateriallogin.MyModel.MakanModel;
import com.kn0en.simplemateriallogin.R;

import java.util.ArrayList;

public class MyAdapterMakan extends RecyclerView.Adapter<MyAdapterMakan.ViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<MakanModel> makanModel;

    public MyAdapterMakan(Context ctx, ArrayList<MakanModel> makanModel) {
        this.inflater = LayoutInflater.from(ctx);
        this.makanModel = makanModel;
    }

    @NonNull
    @Override
    public MyAdapterMakan.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = inflater.inflate(R.layout.row_makan, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapterMakan.ViewHolder viewHolder, int position) {
        viewHolder.imageMakann.setImageResource(makanModel.get(position).getImageMakan());
        viewHolder.namaMakann.setText(makanModel.get(position).getNamaMakan());
        viewHolder.hargaMakann.setText(makanModel.get(position).getHargaMakan());
    }

    @Override
    public int getItemCount() {

        return makanModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView namaMakann, hargaMakann;
        ImageView imageMakann;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namaMakann = itemView.findViewById(R.id.namaMakan);
            hargaMakann = itemView.findViewById(R.id.hargaMakan);
            imageMakann = itemView.findViewById(R.id.imageMakan);
        }
    }
}