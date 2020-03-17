package com.tplcorp.androidlearningmvvm;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.tplcorp.androidlearningmvvm.Room.MyDatabase;
import com.tplcorp.androidlearningmvvm.Room.RoomObject;
import com.tplcorp.androidlearningmvvm.Room.Tables.ItemModel;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

     static MyDatabase myDatabase;


    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        myDatabase = RoomObject.getMyDatabase(application);
    }


    public  void insertDB(ItemModel itemModel){
        myDatabase.daoAccess().insertData(itemModel);
    }

    LiveData<List<ItemModel>> getListLiveData(){
        return  myDatabase.daoAccess().getItems();
    }

}
