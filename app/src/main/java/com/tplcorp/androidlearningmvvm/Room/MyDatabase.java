package com.tplcorp.androidlearningmvvm.Room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.tplcorp.androidlearningmvvm.Room.Tables.ItemModel;

@Database(entities =  {ItemModel.class} , version =  1 , exportSchema =  false)
public abstract  class MyDatabase extends RoomDatabase {
    public abstract DaoAccess daoAccess();


}
