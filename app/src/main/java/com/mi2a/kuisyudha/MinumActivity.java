package com.mi2a.kuisyudha;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mi2a.kuisyudha.MyAdapter.MyAdapterMinum;
import com.mi2a.kuisyudha.MyModel.MinumModel;

import java.util.ArrayList;

public class MinumActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<MinumModel> minumModel;
    private MyAdapterMinum minumAdapter;

    private int[] imageMinumList = new int[]{R.drawable.drink1,R.drawable.drink2,R.drawable.drink3,R.drawable.drink4,R.drawable.drink5,R.drawable.drink6,R.drawable.drink7,R.drawable.drink8,R.drawable.drink9,R.drawable.drink10};
    private String[] namaMinumList = new String[]{"Beef with Fried Potato","Waffle with Strawberry sauce","Crips with Mustard sauce","Chicken katsu rice","Noodle Beef sauce karage","Beef burger with Mozzarella","Beef burger with scrumble egg","Fluffy Bread sweet","Papperoni Pizza","Beef Pizza"};
    private String[] hargaMinumList = new String[]{"Rp.15000","Rp.20000","Rp.17500","Rp.14500","Rp.17500","Rp.15000","Rp.20000","Rp.12000","Rp.25000","Rp.30000"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minum);

        recyclerView = findViewById(R.id.minum_layout);

        minumModel = minumlist();
        minumAdapter = new MyAdapterMinum(this, minumModel);
        recyclerView.setAdapter(minumAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
    }

    private ArrayList<MinumModel> minumlist(){

        ArrayList<MinumModel> minum = new ArrayList<>();

        for(int i = 0; i < 10; i ++){
            MinumModel mk = new MinumModel();
            mk.setImageMinum(imageMinumList[i]);
            mk.setNamaMinum(namaMinumList[i]);
            mk.setHargaMinum(hargaMinumList[i]);
            minum.add(mk);
        }

        return minum;
    }
}
