package com.udb.shinmen.mad.mitologia.cuscatleca.constant;

import java.io.Serializable;

public class DB implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
   
    
    public enum Personaje {
    	_id
    	,nombre
    	,sipnosis
    	,ruta_imagen
    	,link_interes
    	,personaje_id
    }
    
    public static class PersonajeDescribe {
    	public static String TABLE_NAME = "sipnosis";
    	public static String[] ALL_COLUMNS = {
			"_id"
			,"nombre"
			,"sipnosis"
			,"ruta_imagen"
			,"link_interes"
    	};
    	public static String ID = ALL_COLUMNS[Personaje._id.ordinal()];
    	public static String NOMBRE = ALL_COLUMNS[Personaje.nombre.ordinal()];
    	public static String SIPNOSIS = ALL_COLUMNS[Personaje.sipnosis
    	                                            			.ordinal()];
    	public static String RUTA_IMAGEN = ALL_COLUMNS[Personaje.ruta_imagen
    	                                               		.ordinal()];
    	public static String LINK_INTERES = ALL_COLUMNS[Personaje.link_interes
	                                               		.ordinal()];
    	public static String PERSONAJE_ID = ALL_COLUMNS[Personaje.personaje_id
	                                               		.ordinal()];
    	
    	public static String SQL_CREATE = "CREATE TABLE " + TABLE_NAME
    			+ "("
    			+ " _id INTEGER PRIMARY KEY"
    			+ " nombre TEXT NOT NULL"
    			+ " sipnosis TEXT NOT NULL"
    			+ " ruta_imagen TEXT"
    			+ " link_interes TEXT"
    			+")";
    	public static String SQL_DROP = "DROP TABLE IF EXISTS " + TABLE_NAME;
    	
    	public static String[] INITIAL_DATA = {
    		
    	};
    }
    
    public static final String DATABASE_NAME = "mitologia_cuscatleca";
    
    public static final Integer DATABASE_VERSION = 1;

	public static final String TAG_DB = "MitologiaCuscatlecaDB";

}
