package com.tplcorp.androidlearningmvvm.Room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.tplcorp.androidlearningmvvm.Room.Tables.ItemModel;

import java.util.List;

@Dao
public interface DaoAccess {

    @Insert
    void insertData(ItemModel itemModel);

    @Query("Select * from ItemModel")
    LiveData<List<ItemModel>> getItems();
}
