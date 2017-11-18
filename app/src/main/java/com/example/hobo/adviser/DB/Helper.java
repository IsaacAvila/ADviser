package com.example.hobo.adviser.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Caleb on 11/17/2017.
 */

public class Helper extends SQLiteOpenHelper{

    Helper(Context context) {
        super(context, DataBaseManager.DATA_BASE_NAME, null, DataBaseManager.DATA_BASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(DataBaseManager.CREATE_TABLE_PREFERENCES);
        sqLiteDatabase.execSQL(DataBaseManager.CREATE_TABLE_PREFERENCES_USER);
        sqLiteDatabase.insert(DataBaseManager.TABLE_NAME_PREFERENCES, null, fillPreferencesTable());
    }

    private ContentValues fillPreferencesTable() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DataBaseManager.TABLE_PREFERENCES_ID, "Autos");
        contentValues.put(DataBaseManager.TABLE_PREFERENCES_ID, "Bancos");
        contentValues.put(DataBaseManager.TABLE_PREFERENCES_ID, "Belleza");
        contentValues.put(DataBaseManager.TABLE_PREFERENCES_ID, "Bodas");
        contentValues.put(DataBaseManager.TABLE_PREFERENCES_ID, "Deportes");
        contentValues.put(DataBaseManager.TABLE_PREFERENCES_ID, "Electrónica");
        contentValues.put(DataBaseManager.TABLE_PREFERENCES_ID, "Ferretería");
        contentValues.put(DataBaseManager.TABLE_PREFERENCES_ID, "Farmacia y salud");
        contentValues.put(DataBaseManager.TABLE_PREFERENCES_ID, "Hogar");
        contentValues.put(DataBaseManager.TABLE_PREFERENCES_ID, "Juguetes");
        contentValues.put(DataBaseManager.TABLE_PREFERENCES_ID, "Libros");
        contentValues.put(DataBaseManager.TABLE_PREFERENCES_ID, "Moda");
        contentValues.put(DataBaseManager.TABLE_PREFERENCES_ID, "Ópticas");
        contentValues.put(DataBaseManager.TABLE_PREFERENCES_ID, "Restaurantes");
        contentValues.put(DataBaseManager.TABLE_PREFERENCES_ID, "Supermercados");
        contentValues.put(DataBaseManager.TABLE_PREFERENCES_ID, "Tiendas Departamentales");
        contentValues.put(DataBaseManager.TABLE_PREFERENCES_ID, "Viajes");
        return contentValues;
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
