package com.tplcorp.androidlearningmvvm.Room.Tables;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ItemModel {

    @PrimaryKey(autoGenerate = true)
    public int ID;
    public String ITEMNAME;

    public ItemModel(String ITEMNAME) {
        this.ITEMNAME = ITEMNAME;
    }

    public String getITEMNAME() {
        return ITEMNAME;
    }

    public void setITEMNAME(String ITEMNAME) {
        this.ITEMNAME = ITEMNAME;
    }
}
