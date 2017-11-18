package com.example.hobo.adviser.DB;

import android.content.ContentValues;
import android.content.Context;

import com.example.hobo.adviser.pojo.Preference;

import java.util.ArrayList;

/**
 * Created by Caleb on 11/18/2017.
 */

public class DataBaseConstructor {
    private DataBaseCRUD db;

    public DataBaseConstructor(Context context) {
        this.db = new DataBaseCRUD(context);
    }

    public void insertPreferencesUser(int id, String name) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DataBaseManager.TABLE_PREFERENCES_ID, id);
        contentValues.put(DataBaseManager.TABLE_PREFERENCES_NAME, name);
        db.insertPreferencesUser(contentValues);
    }

    public ArrayList<Preference> getPreferences(String table) {
        return db.getPreferences(table);
    }
}
