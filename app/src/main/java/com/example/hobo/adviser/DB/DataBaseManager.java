package com.example.hobo.adviser.DB;

/**
 * Created by Caleb on 11/17/2017.
 */

public class DataBaseManager {
    public static final String DATA_BASE_NAME = "preferencias";
    public static final int DATA_BASE_VERSION = 1;

    public static final String TABLE_NAME_PREFERENCES   = "preferencias";
    public static final String TABLE_PREFERENCES_ID     = "id_preferencias";
    public static final String TABLE_PREFERENCES_NAME   = "nombre_preferencias";
    public static final String CREATE_TABLE_PREFERENCES = "CREATE TABLE " + TABLE_NAME_PREFERENCES + " (" +
            TABLE_PREFERENCES_ID    + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            TABLE_PREFERENCES_NAME  + " TEXT));";

    public static final String TABLE_NAME_PREFERENCES_USER   = "preferencias_usuario";
    public static final String CREATE_TABLE_PREFERENCES_USER = "CREATE TABLE " + TABLE_NAME_PREFERENCES_USER + " (" +
            TABLE_PREFERENCES_ID    + " INTEGER PRIMARY KEY, " +
            TABLE_PREFERENCES_NAME  + " TEXT));";
}
