package com.udb.shinmen.mad.mitologia.cuscatleca.SQLiteHelper;

import java.io.Serializable;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.udb.shinmen.mad.mitologia.cuscatleca.constant.DB;

public abstract class SQLiteOpenHelperBase extends SQLiteOpenHelper 
		implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private SQLiteDatabase db;

	public SQLiteOpenHelperBase(Context context) {
		super(context, DB.DATABASE_NAME, null, DB.DATABASE_VERSION);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		// Creamos todas las tablas
		db.execSQL(DB.PersonajeDescribe.SQL_CREATE);
		for (String sql : DB.PersonajeDescribe.INITIAL_DATA) {
			db.execSQL(sql);
		}
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// Borramos las tablas
		db.execSQL(DB.PersonajeDescribe.SQL_DROP);
		
		// Creamos todas las tablas
		db.execSQL(DB.PersonajeDescribe.SQL_CREATE);
		for (String sql : DB.PersonajeDescribe.INITIAL_DATA) {
			db.execSQL(sql);
		}
	}
	
	public SQLiteDatabase getDatabase() {
		if(db == null) {
			db = getWritableDatabase();
		}
		return db;
	}
	
	public void close() {
		if(db != null) {
			db.close();
		}
	}

}
