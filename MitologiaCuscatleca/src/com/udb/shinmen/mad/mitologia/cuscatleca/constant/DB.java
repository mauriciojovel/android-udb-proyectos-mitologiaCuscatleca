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
    				+"values('El cipitío', 'Hijo de la Sihuanaba, \"El Cipitío\" es un personaje muy conocido en las leyendas salvadoreñas, se trata de un niño pequeño y barrigón que nunca creció.<br/><br/>"
    				+"El Cipitío se alimenta de guineos y de la ceniza que queda en las cocinas de leña de las viviendas rurales, utiliza un sombrero muy grande que se mueve al compás de su caminar, " 
    				+"se aparece por las noches como un espíritu burlón haciendo bromas, riendo y bailando alrededor de su victima.<br/><br/>"
    				+"Se cuenta que el Cipitío arroja piedritas a las muchachas bonitas que van solas a lavar ropa en las pozas de los ríos.<br/><br/>"
    				+"Este personaje de la mitología salvadoreña llamado originalmente \"Cipit\", y en la actualidad \"Cipitío\" o \"Cipitillo\", "
    				+"nació de la relación que tuvo su madre Sihuehuet (Mujer hermosa) con el Dios Lucero de la Mañana, traicionando infielmente al Dios Sol. " 
    				+"Es por eso que el dios, Tlaloc condenó tanto a la madre como al hijo. A la madre la condenó a ser una mujer errante y al niño a nunca crecer, y conservarse por siempre en la edad de diez años.<br/><br/>"
    				+"Cipit es hijo de un dios, pero su aspecto es el de un niño de bajas condiciones sociales y económicas, con una deformación en los pies, " 
    				+"teniéndolos al revés, enorme barriga y con el poder de desaparecer y aparecer en otro lugar.<br/><br/>"
    				+"El Cipitío es un ser propio del folklore salvadoreño. La leyenda ha evolucionado de generación en generación, "
    				+"adaptando muchos de los elementos de la misma para no perder vigencia; aunque en el fondo, conserva la esencia ancestral.<br/>"
    				+"'"
    				+",'cipitio.jpg'"
    				+", 0"
    				+")"
    		,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario) "
    				+"values('La Carreta Bruja o Carreta Chillona', '"
    				+"Cuentan que hace años vivió un hombre sin fé a quien todos llamaban \"Pedro el Malo\".<br/><br/>"
    				+"Para un 15 de mayo, fiesta de San Isidro Labrador, mucha gente llegó al pueblo para la bendición de carretas. "
    				+"Pedro también llevó su carreta, pero tenía malas intensiones. La paró muy cerca de la puerta de la iglesia, lejos de las otras carretas.<br/><br/>"
    				+"Cuando el sacerdote le pidió a Pedro que alineara su carreta con las demás, este le respondió que no la había llevado para que la bendijera, "
    				+"pues ya estaba bendecida por el diablo. Y de seguido, hincando a los bueyes sin piedad, intentó entrar a la iglesia con todo y carreta, "
    				+"pero los bueyes se resistieron a entrar; más bien lograron zafarse del yugo y la carreta salió calle abajo con todo y Pedro.<br/><br/>"
    				+"El sacerdote le dijo entonces: \"Andarás con tu carreta por todo la eternidad\".<br/><br/>"
    				+"Los bueyes se salvaron de la maldición, porque se negaron a entrar a la iglesia.<br/><br/>"
    				+"Cuenta la leyenda que desde entonces la carreta sin bueyes, va bendecida por el diablo, "
    				+"anda sola sin bueyes que la conduzcan, causando espanto por donde se oye el \"traca, taca, tarata\", que hacen sus ruedas de madera.<br/><br/>"
    				+"Los abuelos cuentan que la carreta sin bueyes pasa por los pueblos de la campiña salvadoreña donde no hay amor ni armonía entre sus habitantes,"
    				+"siempre después de la media noche.<br/>"
    				+"'"
    				+",'carreta.gif'"
    				+", 0"
    				+")"
    		,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario) "
    	    				+"values('La Flor de Amate', '"
    	    				+"El Ámate es un árbol muy conocido en El Salvador, este árbol es muy diferente a los demás en su estructura física." 
    	    				+"Su tronco es muy grueso y mal formado, pues tiene unas protuberancias (Si así se le pueden llamar), que hacen que el tronco "
    	    				+"parezca un rollo de cables mal hecho, sus ramas también un poco mal formadas, si uno se fija bien en ellas tienen un "
    	    				+"aspecto de garras. En fin un árbol fuera de lo común, además de no dar ni flores ni frutos.<br/><br/>"
    	    				+"Pero la leyenda dice que este árbol tiene un negro secreto oculto entre sus deformadas ramas, y es que a las "
    	    				+"12:00 de la noche en punto, en la copa de éste, nace una hermosa FLOR BLANCA, la cual cae al suelo y el hombre "
    	    				+"que logre agarrar esta flor, tendrá todo lo que quiera, AMOR, DINERO Y SALUD, pero no es tan fácil, "
    	    				+"pues la verdadera prueba es luchar contra EL DIABLO, que es el dueño de esa flor.<br/><br/>"
    	    				+"Se dice que tiene que ser una lucha a muerte; si el Demonio gana, se lleva el alma de aquel hombre, pero si el "
    	    				+"hombre gana tendrá todo lo que él quiera.<br/><br/>"
    	    				+"Se cuenta que las únicas personas que ven a este árbol florecer en cualquier época del año son los MUDOS, ya que "
    	    				+"se sabe que nunca dirán nada de esta flor encantada.<br/>"
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
