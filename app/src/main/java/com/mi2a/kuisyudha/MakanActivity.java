package com.mi2a.kuisyudha;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mi2a.kuisyudha.MyAdapter.MyAdapterMakan;
import com.mi2a.kuisyudha.MyModel.MakanModel;

import java.util.ArrayList;

public class MakanActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<MakanModel> makanModel;
    private MyAdapterMakan makanAdapter;

    private int[] imageMakanList = new int[]{R.drawable.food1,R.drawable.food2,R.drawable.food3,R.drawable.food4,R.drawable.food5,R.drawable.food6,R.drawable.food7,R.drawable.food8,R.drawable.food9,R.drawable.food10};
    private String[] namaMakanList = new String[]{"Beef with Fried Potato","Waffle with Strawberry sauce","Crips with Mustard sauce","Chicken katsu rice","Noodle Beef sauce karage","Beef burger with Mozzarella","Beef burger with scrumble egg","Fluffy Bread sweet","Papperoni Pizza","Beef Pizza"};
    private String[] hargaMakanList = new String[]{"Rp.15000","Rp.20000","Rp.17500","Rp.14500","Rp.17500","Rp.15000","Rp.20000","Rp.12000","Rp.25000","Rp.30000"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makan);

        recyclerView = findViewById(R.id.makan_layout);

        makanModel = makanlist();
        makanAdapter = new MyAdapterMakan(this, makanModel);
        recyclerView.setAdapter(makanAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
    }

    private ArrayList<MakanModel> makanlist(){

        ArrayList<MakanModel> makan = new ArrayList<>();

        for(int i = 0; i < 10; i ++){
            MakanModel mk = new MakanModel();
            mk.setImageMakan(imageMakanList[i]);
            mk.setNamaMakan(namaMakanList[i]);
            mk.setHargaMakan(hargaMakanList[i]);
            makan.add(mk);
        }

        return makan;
    }
}
