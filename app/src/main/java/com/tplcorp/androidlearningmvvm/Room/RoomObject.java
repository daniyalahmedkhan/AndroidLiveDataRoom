package com.tplcorp.androidlearningmvvm.Room;

import android.content.Context;
import android.widget.CheckBox;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.tplcorp.androidlearningmvvm.Room.MyDatabase;

public class RoomObject {

   public static  MyDatabase myDatabase;

    public RoomObject() {
    }

    public static MyDatabase getMyDatabase(Context context){

        if (myDatabase == null){
            myDatabase = Room.databaseBuilder(context , MyDatabase.class , "ITEM").fallbackToDestructiveMigration().allowMainThreadQueries().build();
        }

        return myDatabase;
    }
}
