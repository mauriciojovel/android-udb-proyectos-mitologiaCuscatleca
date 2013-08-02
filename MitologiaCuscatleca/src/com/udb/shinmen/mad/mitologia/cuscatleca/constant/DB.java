package com.udb.shinmen.mad.mitologia.cuscatleca.constant;

import java.io.Serializable;

public class DB implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public static final String INGRESADO_USUARIO_TRUE = "1";
  
    public enum Personaje {
    	_id
    	,nombre
    	,sipnosis
    	,ruta_imagen
    	,link_interes
    	,ingresado_usuario
    }
    
    public static class PersonajeDescribe {
    	public static String TABLE_NAME = "personaje";
    	public static String[] ALL_COLUMNS = {
			"_id"
			,"nombre"
			,"sipnosis"
			,"ruta_imagen"
			,"link_interes"
			,"ingresado_usuario"
    	};
    	public static String ID = ALL_COLUMNS[Personaje._id.ordinal()];
    	public static String NOMBRE = ALL_COLUMNS[Personaje.nombre.ordinal()];
    	public static String SIPNOSIS = ALL_COLUMNS[Personaje.sipnosis
    	                                            			.ordinal()];
    	public static String RUTA_IMAGEN = ALL_COLUMNS[Personaje.ruta_imagen
    	                                               		.ordinal()];
    	public static String LINK_INTERES = ALL_COLUMNS[Personaje.link_interes
	                                               		.ordinal()];
    	public static String INGRESADO_USUARIO = ALL_COLUMNS[Personaje.ingresado_usuario
                                                        .ordinal()];
    	
    	public static String SQL_CREATE = "CREATE TABLE " + TABLE_NAME
    			+ "("
    			+ " _id INTEGER PRIMARY KEY"
    			+ " ,nombre TEXT NOT NULL"
    			+ " ,sipnosis TEXT NOT NULL"
    			+ " ,ruta_imagen TEXT"
    			+ " ,link_interes TEXT"
    			+ " ,ingresado_usuario INTEGER NOT NULL"
    			+")";
    	public static String SQL_DROP = "DROP TABLE IF EXISTS " + TABLE_NAME;
    	
    	public static String[] INITIAL_DATA = {
    		"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario) "
    				+"values('El cipit�o', 'Hijo de la Sihuanaba, \"El Cipit�o\" es un personaje muy conocido en las leyendas salvadore�as, se trata de un ni�o peque�o y barrig�n que nunca creci�.<br/><br/>"
    				+"El Cipit�o se alimenta de guineos y de la ceniza que queda en las cocinas de le�a de las viviendas rurales, utiliza un sombrero muy grande que se mueve al comp�s de su caminar, " 
    				+"se aparece por las noches como un esp�ritu burl�n haciendo bromas, riendo y bailando alrededor de su victima.<br/><br/>"
    				+"Se cuenta que el Cipit�o arroja piedritas a las muchachas bonitas que van solas a lavar ropa en las pozas de los r�os.<br/><br/>"
    				+"Este personaje de la mitolog�a salvadore�a llamado originalmente \"Cipit\", y en la actualidad \"Cipit�o\" o \"Cipitillo\", "
    				+"naci� de la relaci�n que tuvo su madre Sihuehuet (Mujer hermosa) con el Dios Lucero de la Ma�ana, traicionando infielmente al Dios Sol. " 
    				+"Es por eso que el dios, Tlaloc conden� tanto a la madre como al hijo. A la madre la conden� a ser una mujer errante y al ni�o a nunca crecer, y conservarse por siempre en la edad de diez a�os.<br/><br/>"
    				+"Cipit es hijo de un dios, pero su aspecto es el de un ni�o de bajas condiciones sociales y econ�micas, con una deformaci�n en los pies, " 
    				+"teni�ndolos al rev�s, enorme barriga y con el poder de desaparecer y aparecer en otro lugar.<br/><br/>"
    				+"El Cipit�o es un ser propio del folklore salvadore�o. La leyenda ha evolucionado de generaci�n en generaci�n, "
    				+"adaptando muchos de los elementos de la misma para no perder vigencia; aunque en el fondo, conserva la esencia ancestral.<br/>"
    				+"'"
    				+",'cipitio.jpg'"
    				+", 0"
    				+")"
    		,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario) "
    				+"values('La Carreta Bruja o Carreta Chillona', '"
    				+"Cuentan que hace a�os vivi� un hombre sin f� a quien todos llamaban \"Pedro el Malo\".<br/><br/>"
    				+"Para un 15 de mayo, fiesta de San Isidro Labrador, mucha gente lleg� al pueblo para la bendici�n de carretas. "
    				+"Pedro tambi�n llev� su carreta, pero ten�a malas intensiones. La par� muy cerca de la puerta de la iglesia, lejos de las otras carretas.<br/><br/>"
    				+"Cuando el sacerdote le pidi� a Pedro que alineara su carreta con las dem�s, este le respondi� que no la hab�a llevado para que la bendijera, "
    				+"pues ya estaba bendecida por el diablo. Y de seguido, hincando a los bueyes sin piedad, intent� entrar a la iglesia con todo y carreta, "
    				+"pero los bueyes se resistieron a entrar; m�s bien lograron zafarse del yugo y la carreta sali� calle abajo con todo y Pedro.<br/><br/>"
    				+"El sacerdote le dijo entonces: \"Andar�s con tu carreta por todo la eternidad\".<br/><br/>"
    				+"Los bueyes se salvaron de la maldici�n, porque se negaron a entrar a la iglesia.<br/><br/>"
    				+"Cuenta la leyenda que desde entonces la carreta sin bueyes, va bendecida por el diablo, "
    				+"anda sola sin bueyes que la conduzcan, causando espanto por donde se oye el \"traca, taca, tarata\", que hacen sus ruedas de madera.<br/><br/>"
    				+"Los abuelos cuentan que la carreta sin bueyes pasa por los pueblos de la campi�a salvadore�a donde no hay amor ni armon�a entre sus habitantes,"
    				+"siempre despu�s de la media noche.<br/>"
    				+"'"
    				+",'carreta.gif'"
    				+", 0"
    				+")"
    		,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario) "
    	    				+"values('La Flor de Amate', '"
    	    				+"El �mate es un �rbol muy conocido en El Salvador, este �rbol es muy diferente a los dem�s en su estructura f�sica." 
    	    				+"Su tronco es muy grueso y mal formado, pues tiene unas protuberancias (Si as� se le pueden llamar), que hacen que el tronco "
    	    				+"parezca un rollo de cables mal hecho, sus ramas tambi�n un poco mal formadas, si uno se fija bien en ellas tienen un "
    	    				+"aspecto de garras. En fin un �rbol fuera de lo com�n, adem�s de no dar ni flores ni frutos.<br/><br/>"
    	    				+"Pero la leyenda dice que este �rbol tiene un negro secreto oculto entre sus deformadas ramas, y es que a las "
    	    				+"12:00 de la noche en punto, en la copa de �ste, nace una hermosa FLOR BLANCA, la cual cae al suelo y el hombre "
    	    				+"que logre agarrar esta flor, tendr� todo lo que quiera, AMOR, DINERO Y SALUD, pero no es tan f�cil, "
    	    				+"pues la verdadera prueba es luchar contra EL DIABLO, que es el due�o de esa flor.<br/><br/>"
    	    				+"Se dice que tiene que ser una lucha a muerte; si el Demonio gana, se lleva el alma de aquel hombre, pero si el "
    	    				+"hombre gana tendr� todo lo que �l quiera.<br/><br/>"
    	    				+"Se cuenta que las �nicas personas que ven a este �rbol florecer en cualquier �poca del a�o son los MUDOS, ya que "
    	    				+"se sabe que nunca dir�n nada de esta flor encantada.<br/>"
    	    				+"'"
    	    				+",'amate.png'"
    	    				+", 0"
    	    				+")"
    	};
    }
    
    public static final String DATABASE_NAME = "mitologia_cuscatleca";
    
    public static final Integer DATABASE_VERSION = 10;

	public static final String TAG_DB = "MitologiaCuscatlecaDB";

}
