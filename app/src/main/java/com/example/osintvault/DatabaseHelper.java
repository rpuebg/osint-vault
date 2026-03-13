
package com.example.osintvault;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context){
        super(context,"osint.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE persons(id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,alias TEXT,email TEXT)");
        db.execSQL("CREATE TABLE institutions(id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,website TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
        db.execSQL("DROP TABLE IF EXISTS persons");
        db.execSQL("DROP TABLE IF EXISTS institutions");
        onCreate(db);
    }

    public void insertPerson(String name,String alias,String email){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("name",name);
        cv.put("alias",alias);
        cv.put("email",email);
        db.insert("persons",null,cv);
    }

    public void insertInstitution(String name,String web){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("name",name);
        cv.put("website",web);
        db.insert("institutions",null,cv);
    }
}
