package com.example.hobo.adviser.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.hobo.adviser.pojo.Preference;

import java.util.ArrayList;
import java.util.prefs.Preferences;

/**
 * Created by Caleb on 11/18/2017.
 */

public class DataBaseCRUD {
    private Helper helper;
    private SQLiteDatabase sqLiteDatabase;

    public DataBaseCRUD(Context context) {
        this.helper = new Helper(context);
        this.sqLiteDatabase = helper.getWritableDatabase();
    }

    public void insertPreferencesUser(ContentValues contentValues) {
        sqLiteDatabase.insert(DataBaseManager.TABLE_NAME_PREFERENCES_USER, null, contentValues);
    }

    public ArrayList<Preference> getPreferences(String table) {
        ArrayList<Preference> preferences = new ArrayList<>();
        String query = "SELECT * FROM " + table;
        Cursor cursor = sqLiteDatabase.rawQuery(query, null);
        while (cursor.moveToNext()) {
            int id = cursor.getInt(cursor.getColumnIndexOrThrow(DataBaseManager.TABLE_PREFERENCES_ID));
            String name = cursor.getString(cursor.getColumnIndexOrThrow(DataBaseManager.TABLE_PREFERENCES_NAME));
            preferences.add(new Preference(id, name));
        }
        cursor.close();
        return preferences;
    }
}
