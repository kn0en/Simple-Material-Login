package com.kn0en.simplemateriallogin.MyAdapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kn0en.simplemateriallogin.MyModel.MinumModel;
import com.kn0en.simplemateriallogin.R;

import java.util.ArrayList;

public class MyAdapterMinum extends RecyclerView.Adapter<MyAdapterMinum.ViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<MinumModel> minumModel;

    public MyAdapterMinum(Context ctx, ArrayList<MinumModel> minumModel) {
        this.inflater = LayoutInflater.from(ctx);
        this.minumModel = minumModel;
    }

    @NonNull
    @Override
    public MyAdapterMinum.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.row_minum, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.imageMinumm.setImageResource(minumModel.get(position).getImageMinum());
        viewHolder.namaMinumm.setText(minumModel.get(position).getNamaMinum());
        viewHolder.hargaMinumm.setText(minumModel.get(position).getHargaMinum());
    }

    @Override
    public int getItemCount() {

        return minumModel.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView namaMinumm, hargaMinumm;
        ImageView imageMinumm;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namaMinumm = itemView.findViewById(R.id.namaMinum);
            hargaMinumm = itemView.findViewById(R.id.hargaMinum);
            imageMinumm = itemView.findViewById(R.id.imageMinum);
        }
    }
}