package com.kn0en.simplemateriallogin;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kn0en.simplemateriallogin.MyAdapter.MyAdapterMakan;
import com.kn0en.simplemateriallogin.MyModel.MakanModel;

import java.util.ArrayList;

public class MakanActivity extends AppCompatActivity {

    private int[] imageMakanList = new int[]{R.drawable.food1,R.drawable.food2,R.drawable.food3,R.drawable.food4,R.drawable.food5,R.drawable.food6,R.drawable.food7,R.drawable.food8,R.drawable.food9,R.drawable.food10};
    private String[] namaMakanList = new String[]{"Beef with Fried Potato","Waffle with Strawberry sauce","Crips with Mustard sauce","Chicken katsu rice","Noodle Beef sauce karage","Beef burger with Mozzarella","Beef burger with scrumble egg","Fluffy Bread sweet","Papperoni Pizza","Beef Pizza"};
    private String[] hargaMakanList = new String[]{"Rp.15000","Rp.20000","Rp.17500","Rp.14500","Rp.17500","Rp.15000","Rp.20000","Rp.12000","Rp.25000","Rp.30000"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makan);

        RecyclerView recyclerView = findViewById(R.id.makan_layout);

        ArrayList<MakanModel> makanModel = makanlist();
        MyAdapterMakan makanAdapter = new MyAdapterMakan(this, makanModel);
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
