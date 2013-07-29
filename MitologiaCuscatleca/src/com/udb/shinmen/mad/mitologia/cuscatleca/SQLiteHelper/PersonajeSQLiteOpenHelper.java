package com.udb.shinmen.mad.mitologia.cuscatleca.SQLiteHelper;

import com.udb.shinmen.mad.mitologia.cuscatleca.constant.DB;
import com.udb.shinmen.mad.mitologia.cuscatleca.constant.DB.Personaje;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class PersonajeSQLiteOpenHelper extends SQLiteOpenHelperBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PersonajeSQLiteOpenHelper(Context context) {
		super(context);
	}
	
	public boolean save(String nombre, String sipnosis, String urlImagen
			, String linksInteres) {
		return save(nombre, sipnosis, urlImagen, linksInteres, -1);
	}
	
	public boolean save(String nombre, String sipnosis, String urlImagen
			, String linksInteres, long id) {
		boolean r = false;
		ContentValues values = new ContentValues();
		SQLiteDatabase db = null;
		//long primaryKey = 0L;
		try {
			db = getDatabase();
			db.beginTransaction();
			values.put(DB.PersonajeDescribe.NOMBRE, nombre);
			values.put(DB.PersonajeDescribe.SIPNOSIS, sipnosis);
			if(urlImagen != null && !urlImagen.equals("")) {
				values.put(DB.PersonajeDescribe.RUTA_IMAGEN, urlImagen);
			} else {
				values.putNull(DB.PersonajeDescribe.RUTA_IMAGEN);
			}
			if(linksInteres != null && !linksInteres.equals("")) {
				values.put(DB.PersonajeDescribe.LINK_INTERES, linksInteres);
			} else {
				values.putNull(DB.PersonajeDescribe.LINK_INTERES);
			}
			//values.put(DB.PersonajeDescribe.PERSONAJE_ID, primaryKey);
			if(id > 0L) {
				db.update(DB.PersonajeDescribe.TABLE_NAME, values
						, DB.PersonajeDescribe.ID + "=?", new String[]{id+""}
				);
			} else {
				db.insertOrThrow(DB.PersonajeDescribe.TABLE_NAME, null, values);
			}
			r = true;
			
		} catch (Exception e) {
			Log.e(DB.TAG_DB, "error de base de datos: " + e.getMessage(), e);
			throw new RuntimeException(e);
		} finally {
			if(db != null) {
				if(r) {
					db.setTransactionSuccessful();
				}
				db.endTransaction();
				//db.close();
			}
		}
		return r;
	}
	
	public boolean delete(long id) {
		boolean r = false;
		SQLiteDatabase db = null;
		int eraser = 0;
		try {
			db = getDatabase();
			db.beginTransaction();
			eraser = db.delete(
					DB.PersonajeDescribe.TABLE_NAME
						, DB.PersonajeDescribe.ID+"=?", new String[]{id+""});
			r = eraser>0;
		} catch(Exception e) {
			Log.e(DB.TAG_DB, "error de base de datos: " + e.getMessage(), e);
			throw new RuntimeException(e);
		} finally {
			if(db != null) {
				if(r) {
					db.setTransactionSuccessful();
				}
				db.endTransaction();
				//db.close();
			}
		}
		return r;
	}
	
	public Cursor findAll(Personaje orderBy) {
		SQLiteDatabase db = null;
		Cursor r = null;
		db = getDatabase();
		r = db.query(DB.PersonajeDescribe.TABLE_NAME
				, DB.PersonajeDescribe.ALL_COLUMNS
				, null, null, null, null
				, orderBy!=null?
						DB.PersonajeDescribe.ALL_COLUMNS[orderBy.ordinal()]
								:null);
//		db.close();
		return r;
		
	}
	
	public Cursor get(long id) {
		SQLiteDatabase db = null;
		Cursor r = null;
		db = getDatabase();
		r = db.query(DB.PersonajeDescribe.TABLE_NAME
				, DB.PersonajeDescribe.ALL_COLUMNS
				, DB.PersonajeDescribe.ID+"=?", new String[]{id+""}
				, null, null
				,DB.PersonajeDescribe.NOMBRE
			);
	//	db.close();
		return r;
	}
	
	

}
