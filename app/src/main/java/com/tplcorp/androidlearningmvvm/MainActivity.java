package com.tplcorp.androidlearningmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import com.tplcorp.androidlearningmvvm.Adapters.ItemAdapter;
import com.tplcorp.androidlearningmvvm.Room.Tables.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button addItem;
    RecyclerView recyclerView;
    MainActivityViewModel mainActivityViewModel;
    ItemAdapter itemAdapter;
    List<ItemModel> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addItem = findViewById(R.id.addItem);
        recyclerView = findViewById(R.id.recyclerView);

        mainActivityViewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemAdapter = new ItemAdapter(this , list);
        recyclerView.setAdapter(itemAdapter);
        mainActivityViewModel.getListLiveData().observe(this, new Observer<List<ItemModel>>() {
            @Override
            public void onChanged(List<ItemModel> itemModels) {
                itemAdapter.loadItems(itemModels);
                itemAdapter.notifyDataSetChanged();
            }
        });



        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ItemModel itemModel = new ItemModel("Daniyal");
                mainActivityViewModel.insertDB(itemModel);

            }
        });


    }
}
