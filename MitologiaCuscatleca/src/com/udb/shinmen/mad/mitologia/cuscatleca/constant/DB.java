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
    		"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
    				+"values('El cipit�o', 'Hijo de la Sihuanaba, \"El Cipit�o\" es un personaje muy conocido en las leyendas salvadore�as, se trata de un ni�o peque�o y barrig�n que nunca creci�.\n\n"
    				+"El Cipit�o se alimenta de guineos y de la ceniza que queda en las cocinas de le�a de las viviendas rurales, utiliza un sombrero muy grande que se mueve al comp�s de su caminar, " 
    				+"se aparece por las noches como un esp�ritu burl�n haciendo bromas, riendo y bailando alrededor de su victima.\n\n"
    				+"Se cuenta que el Cipit�o arroja piedritas a las muchachas bonitas que van solas a lavar ropa en las pozas de los r�os.\n\n"
    				+"Este personaje de la mitolog�a salvadore�a llamado originalmente \"Cipit\", y en la actualidad \"Cipit�o\" o \"Cipitillo\", "
    				+"naci� de la relaci�n que tuvo su madre Sihuehuet (Mujer hermosa) con el Dios Lucero de la Ma�ana, traicionando infielmente al Dios Sol. " 
    				+"Es por eso que el dios, Tlaloc conden� tanto a la madre como al hijo. A la madre la conden� a ser una mujer errante y al ni�o a nunca crecer, y conservarse por siempre en la edad de diez a�os.\n\n"
    				+"Cipit es hijo de un dios, pero su aspecto es el de un ni�o de bajas condiciones sociales y econ�micas, con una deformaci�n en los pies, " 
    				+"teni�ndolos al rev�s, enorme barriga y con el poder de desaparecer y aparecer en otro lugar.\n\n"
    				+"El Cipit�o es un ser propio del folklore salvadore�o. La leyenda ha evolucionado de generaci�n en generaci�n, "
    				+"adaptando muchos de los elementos de la misma para no perder vigencia; aunque en el fondo, conserva la esencia ancestral.\n"
    				+"'"
    				+",'cipitio.jpg'"
    				+", 0"
    				+", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/elcipitio.php'"
    				+")"
    		,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
    				+"values('La Carreta Bruja o Carreta Chillona', '"
    				+"Cuentan que hace a�os vivi� un hombre sin f� a quien todos llamaban \"Pedro el Malo\".\n\n"
    				+"Para un 15 de mayo, fiesta de San Isidro Labrador, mucha gente lleg� al pueblo para la bendici�n de carretas. "
    				+"Pedro tambi�n llev� su carreta, pero ten�a malas intensiones. La par� muy cerca de la puerta de la iglesia, lejos de las otras carretas.\n\n"
    				+"Cuando el sacerdote le pidi� a Pedro que alineara su carreta con las dem�s, este le respondi� que no la hab�a llevado para que la bendijera, "
    				+"pues ya estaba bendecida por el diablo. Y de seguido, hincando a los bueyes sin piedad, intent� entrar a la iglesia con todo y carreta, "
    				+"pero los bueyes se resistieron a entrar; m�s bien lograron zafarse del yugo y la carreta sali� calle abajo con todo y Pedro.\n\n"
    				+"El sacerdote le dijo entonces: \"Andar�s con tu carreta por todo la eternidad\".\n\n"
    				+"Los bueyes se salvaron de la maldici�n, porque se negaron a entrar a la iglesia.\n\n"
    				+"Cuenta la leyenda que desde entonces la carreta sin bueyes, va bendecida por el diablo, "
    				+"anda sola sin bueyes que la conduzcan, causando espanto por donde se oye el \"traca, taca, tarata\", que hacen sus ruedas de madera.\n\n"
    				+"Los abuelos cuentan que la carreta sin bueyes pasa por los pueblos de la campi�a salvadore�a donde no hay amor ni armon�a entre sus habitantes,"
    				+"siempre despu�s de la media noche.\n"
    				+"'"
    				+",'carreta.gif'"
    				+", 0 "
    				+", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/lacarretabruja.php'"
    				+")"
    		,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
    	    				+"values('La Flor de Amate', '"
    	    				+"El �mate es un �rbol muy conocido en El Salvador, este �rbol es muy diferente a los dem�s en su estructura f�sica." 
    	    				+"Su tronco es muy grueso y mal formado, pues tiene unas protuberancias (Si as� se le pueden llamar), que hacen que el tronco "
    	    				+"parezca un rollo de cables mal hecho, sus ramas tambi�n un poco mal formadas, si uno se fija bien en ellas tienen un "
    	    				+"aspecto de garras. En fin un �rbol fuera de lo com�n, adem�s de no dar ni flores ni frutos.\n\n"
    	    				+"Pero la leyenda dice que este �rbol tiene un negro secreto oculto entre sus deformadas ramas, y es que a las "
    	    				+"12:00 de la noche en punto, en la copa de �ste, nace una hermosa FLOR BLANCA, la cual cae al suelo y el hombre "
    	    				+"que logre agarrar esta flor, tendr� todo lo que quiera, AMOR, DINERO Y SALUD, pero no es tan f�cil, "
    	    				+"pues la verdadera prueba es luchar contra EL DIABLO, que es el due�o de esa flor.\n\n"
    	    				+"Se dice que tiene que ser una lucha a muerte; si el Demonio gana, se lleva el alma de aquel hombre, pero si el "
    	    				+"hombre gana tendr� todo lo que �l quiera.\n\n"
    	    				+"Se cuenta que las �nicas personas que ven a este �rbol florecer en cualquier �poca del a�o son los MUDOS, ya que "
    	    				+"se sabe que nunca dir�n nada de esta flor encantada.\n"
    	    				+"'"
    	    				+",'amate.png'"
    	    				+", 0"
    	    				+", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/laflordeamate.php'"
    	    				+")"
			,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('El Gallo e'' Don Chema'"
			        +",'"
                    +"Acostumbrado a levantarme tempranito, p� compa�ar a mi Papa al trabajo, ese veinticuatro era como si juera Domingo, nada e''tareya, nada e''asoliada, �S�lo Choteyo!\nLa Mar�a, mi hermana, tambi�n se levant� temprano, p� ir con mi Mama al pueblo a trer los comprados p� la Cena.\n\nJuimos a ba�arnos. Diunos bejucos me tir� a la poza, igual como v� a Tarz�n en el pedazo de diario a colores, en que ven�a envuelta la tapa de dulce.\n\nLa Mar�a por estarme aplaudiendo, sim�s dej�r en la corriente el huacal con que se estaba ba�ando.\n\nLlegamos de guelta al rancho, despertando con el retozo a todos, Bravo, mi Papa, nos call� la bulla diciendo: - �Dejen dormir cipotes! �no jodan tanto! �tr�nquense otra vez! �quioy nuay pisto!. Tristes, nos miramos; nuiva ver pollo, ni cuetes, ni nada.\n\nSalimos al patio; nos sentamos en las raices del mango y con las manos teni�ndonos las quijadas, nos quedamos viendo salir al sol diall�aa lejos\".\n\nPasaron los P�rez, los Monzones, todos los del Valle. La vereda los llevaba recto al Pueblo.\n\nCaminamos un rato, viendo siempre p� bajo. Pasamos el riyo y salimos al otro lado, onde viv�a Don Chema.\n\nEran enemigos mi Papa y Don Chema. Desde la vez que me met� al gallinero y lespant� toditiiitas las gallinas. Como me re� everlo ese d�a. Corriya y corriya diun lado p� otro sin poder alcanzarlas.\n\nEn eso estaba pensando cuando oy� un papaleo: �Era el gallo chorompo e Don Chema!.\n\nCuando el animal, quiandaba buscando comida, estuvo m�s cerca, mir� a la Mar�a con sonrisa e malicia y le dije : - Seguro se salt� el cedaaazo.  La Mar�a se ri� al entenderme y me sigui� pa yudarme.\n\nDespacito nos juimos moviendo.  El gallo volteaba el ojo y sonaba el pescuezo cada vez que nos miraba acercanos.  Caminaba pa tr�s, y no siva, confiado de sus espuelas qui� m�s diuno le hab�a ensartado.\n\nLo acorralamos por unos bamb�s, la Mar�a con miedo se le tir� encima.  �� Se arm� un gran relaaajo !! .  Al final de cuentas se le sali�, dej�ndole solo las plumas de la cola en las manos.  Pero ah� estaba Yo, detr�s, y conmigo si no se ju�.\n\nAl nom�s agarrarlo y oyir la vocesota e Don Chema gritando: -Dejenme al gallo cipotes! �no se lo gueveyen!- Salimos zumbados como el diablo.\n\nApenas hab�amos llegado al riyo, cuando sent� las manotas e don Chema clavadas en l espalda.  Medio me le solt�, gatiando y por entre las patas me le ju�.\n\nComenc� a saltar de piedra en piedra, y en una desas �PUM GUM!. Me cay� d�ndome un sopapo en el coco.\n\nAs� quedamos: destripado el gallo, sin sentido yo.  Mi hermana chillando y gritando: - �Camilo! - �Camilo!� levantaate, jodido!  �levantaate ! Y Don Chema\" cheeerche, cheerche de la flisi�n.\n\nMe levant� antes que me hogara; me acost� en l orilla.  Cuando despert�, lo que busqu� primero fuel gallo.  Al ver que la Mar�a lo ten�a bien agarrado, todo bolo y quebrado del brazo le dije: �Mon�s Mar�a! �Mon�s! � que nos nos quite el gallo! �Quese gallo es miyo!.\n\nNo nos dejuir solos.  Me llev� chiniado.\n\nAl verme mi Papa todo ba�ado e sangre e gallo, fual rancho y sali� con el col�n en la mano.\n\n�Que melizo al cipote! �Que cosa melizo ju� tantas ! Gritaba.  �No Papa! Le dije.\n\nNada mizo.  Me cay� en el riyo.  Ju� Yo solo.\n\nLe cont� m�s o menos como estuvo la cosa, y nos dijo: �Ya no chillen! Si no, ya les va caer.\n\nDon Chema pag� la enyesada y nos regal� el gallo.\n\nParec�a otro.  Se ve�a gueno y sonrisas empezaba a ense�arnos.\n\nInvitaaaaalo\", dijo mi Mama a mi Papa, y as� ju�.\n\nEn la noche, Don Chema, sentado en el mejor zancudo del rancho, chistaba.\n\nNubo cuetes pa mi, ten�a el brazo tilinte.  Mi alegriya fue oyirlos hablando, y ver los escupidores y los buscaniguas alumbrando la noche.\n\n�Dieron las doce en el radio!\n\n�Afuera, reventaron mas cuetes! �Sonaron balazos! �Del pueblo llegaba el ruido de las reventazones !\n\n�Y aentro, en el rancho, hubieron abrazos! \" �Y tragos! �Y panes !\n\nHoy ya siablan, son compadres.\n\nDon Chema es mi padrino\n\nEsse veinnticuatro, pa m�,  pa m�, fuel mejor \""
                    +"'"
                    +",'gallo.jpg'"
                    +", 0"
                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/elgalloedonchema.php'"
                    +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                            +"values('La Poza de Bululu'"
                            +",'"
                            +"Se ubica en el R�o Sensunap�n entre el limite municipal de Sonzacate y Sonsonate, se afirmaba que en tiempos pasados la poza llamada \"Bulul�\" era encantada y se hablaba con insistencia que ah� aparec�a un guacal de oro que conten�a un paste lleno de brillantes y un jab�n plateado. El que osaba cogerlo era burlado por el objeto aparecido, sumergi�ndose para salir a flote en otro lugar de la poza, y si por desgracia lograba tomarlo, se hund�a juntamente con el guacal para nunca m�s volver.\n\nTambi�n hay quien cuenta, que estos objetos, pertenec�an a la Virgen de Candelaria (Patrona del Departamento),�  que quien se acercaba para agarrarlo, ella los castigaba por su ambici�n, ahog�ndolos en la poza. Pero quien lo ve�a y no lo tocaba, sabiendo que no le pertenec�a, ella lo colmaba de riquezas."
                            +"'"
                            +",'la_poza_del_bululu.jpg'"
                            +", 0"
                            +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/lapozadebululu.php'"
                            +")"
             ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                                    +"values('La Llorona'"
                                    +",'"
                                    +"Esta es una de las leyendas m�s populares de  El Salvador. Los lamentos de una mujer que clama por sus hijos perdidos son escuchados con temor en noches de luna llena.\nTestigos afirman que la mujer va flotando en el aire vestida de blanco y cuando se detiene a llorar en la puerta o ventana de alguna casa, es presagio que los moradores de la misma pasar�n por muchas penas, problemas y tribulaciones.\n\nSe dice que para alejarla junto con su sombr�o augurio, se debe hacer un rezo especial en la casa durante nueve noches consecutivas."
                                    +"'"
                                    +",'la_llorona.jpg'"
                                    +", 0"
                                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/lallorona.php'"
                                    +")"
             ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                                            +"values('El Cerro de la Juana Pancha'"
                                            +",'"
                                            +"Se cuenta que en la cumbre del cerro Conchagua, a tres kil�metros al sur de la poblaci�n, en una cueva habitaba una hermosa mujer que se dedicaba a robar grandes cantidades de dinero. Su nombre era Juana Francisca Callejas, pero le dec�an Juana Pancha. Era una hechicera que volaba de un lugar a otro y con la rapidez del viento pod�a desaparecer.\n\nCon frecuencia hac�a sus hechizos, que la llevaban al palacio de los capitanes generales de la antigua Guatemala y en ocasiones se convert�a en un animal casero, capaz de entrar en cualquier lugar y sustraer los botines.\n\nDicen que una noche, cuando viajaba a su acostumbrada visita de la Uni�n a Guatemala, unos hombres hechiceros la atraparon y en consejo acordaron que deb�an quemarla.\n\nElla, en venganza, dej� la cueva encantada y toda persona que llega ah� nunca m�s vuelve a salir, y entre m�s lo intenta m�s se pierde en los opuestos caminos que conducen a su misteriosa abertura.\n\nSin embargo hay una profec�a que dice que \"el embrujo cesar� a las tres de la tarde en un Viernes Santo, si alguien se atreve a entrar a la cueva y dormir esa noche, solo, sin temor a lo que pueda escuchar\"."
                                            +"'"
                                            +",'el_cerro_de_la_juana_pancha.jpg'"
                                            +", 0"
                                            +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/elcerrodelajuanapancha.php'"
                                            +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                                            +"values('La Se�ora de los Anillos'"
                                            +",'"
                                            +"Esto sucedi� en San Salvador: Hace ya varios a�os estaban desapareciendo muchos ni�os, esto se le atribu�a a una mujer de vestimenta blanca, con un rostro indescriptible, que en sus manos llevaba muchos anillos.\n\nLa historia se centra espec�ficamente en una pareja y su beb� que viv�an en un apartamento.\n\nUna noche el se�or estaba trabajando y su esposa leyendo en el cuarto; hac�a mucho calor y pusieron al ni�o a la orilla de la ventana a quien el se�or cuidaba de reojo.\nAl poco rato, ya con una pesadez de sue�o el se�or empez� a cabecear y mir� hacia la ventana... en la cual vio una mano detenida con muchos anillos... pero se sacudi� frot�ndose los ojos y volviendo a ver de nuevo, cual fue su sorpresa, que ya no hab�a nada.\n\nSe queda dormido y luego de unos minutos se despierta dando un sobresalto. Ve una mujer parada a lado de su hijo el cual solo tenia unos cuantos meses de nacido. En ese momento se qued� paralizado sin poder hablar pero reaccionando corri� y tom� el ni�o y se fue al cuarto donde estaba la esposa. Quien le dijo que lo que ve�a, se deb�a a que no hab�a podido dormir bien por varios d�as.\n\nAl siguiente d�a se va a trabajar el se�or y cu�l fue su sorpresa que la mujer estaba en la entrada del edificio y la identific� por los anillos, luego tom� el bus dej�ndola sentada como una estatua.\n\nEn el bus oyendo que alguien que se re�a a carcajadas mir� hacia adelante y vio a la misma mujer parada frente a �l, con el ni�o en manos, y desde ese d�a el hombre no coordino ideas, qued� directo y sin su beb�."
                                            +"'"
                                            +",'la_senora_de_los_anillos.jpg'"
                                            +", 0"
                                            +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/lasenoradelosanillos.php'"
                                            +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('Nuestra Se�ora de Santa Ana'"
                    +",'"
                    +"Una de las leyendas m�s conocidas es la que explica la manera en que lleg� la Se�ora de Santa Ana a dicho lugar.\n\nSe dice \"que unos indios llevaban esta imagen para Honduras y al pasar por Santa Ana ya era de noche y decidieron pernoctar en una gran Ceiba que estaba situada en la �nica plazoleta del lugar, llamado entonces Sihuatehuac�n.\n\nAl amanecer quisieron levantar la imagen para seguir su camino, pero �sta se les puso muy pesada y fue imposible moverla, de manera que decidieron dejarla en ese sitio\". All� se levant� despu�s una ermita y posteriormente una iglesia.\n\nOtra de las leyendas sobre la Se�ora de Santa Ana: \"Durante la Revoluci�n de los 44\", una de las batallas m�s importantes celebrada en el cerro Techan, los soldados se encontraban desesperados, casi sin armas, y el bando contrario estaba muy cerca. De repente, vieron llegar a una se�ora extra�a, alta, hermosa que llevaba un bulto en su delantal y un c�ntaro de agua. Les empez� a dar de beber agua. Despu�s supieron que hab�a sido la se�ora Santa Ana quien los libr� en esa batalla."
                    +"'"
                    +",'nuestra_senora_de_santa_ana.jpg'"
                    +", 0"
                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/nuestrasenoradesantaana.php'"
                    +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('Las Botijas'"
                    +",'"
                    +"Contaban nuestros abuelos que eran cantaros llenos de monedas de plata o de oro enterrados; que con el pasar de los a�os quedaban al descubierto; pero aquel que se encontraba una botija se aferraba a ella a tal grado que solo viv�a para cuidarla, nunca llegaba a gastarse ni una sola de sus monedas y mor�a en la miseria. M�s de alguno de nuestros abuelos las han visto cuando eran j�venes pero han preferido seguir su pobreza; a que el mal les gane el alma.\n\nExisten quienes cuentan que estas botijas es dinero pactado; que alguna persona a hecho con Satan�s y al no poder cumplir su trato; el se llevaba el cuerpo y el alma de la persona, luego volv�a a enterrar este caudal de dinero en una botija para atrapar a otro ambicioso que se atreva a desenterrarla y as� poder ganar tambi�n su alma."
                    +"'"
                    +",'las_botijas.jpg'"
                    +", 0"
                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/lasbotijas.php'"
                    +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('El Mico Brujo'"
                    +",'"
                    +"En todo El Salvador se conoce la leyenda del \"Mico Brujo\". En algunas partes tambi�n lo relacionan con otras especies como La Mona o El Chancho.\n\nDec�an nuestros antepasados que hab�an unas mujeres que a las once de la noche  se daban tres volantines para atr�s y luego tres para adelante (saltaban hacia delante o hacia atr�s); que estas mujeres ten�an un guacal donde dejaban su alma y ya sin esta tomaban figura  de monos, o chanchos y se dedicaban a hacer diabluras.\n\nY as� estas brujas, acompa�adas de la oscuridad de la noche, se trepaban a los �rboles y tiraban frutas a la gente. Se sub�an a los techos de las casas, saltando de un lugar a otro y arrojando pedradas contra las personas que pasaban en la calle vecinas.\n\nMuchas personas han tratado de agarrarlas y matar a la mona o chancha, pero de nada les sirve, pues cuando ya est�n cerca y creen tenerla acorralada se les esfuma como por encanto.\n\nTambi�n contaban nuestros antepasados que esas mujeres pod�an convertirse en chanchas grandes, negras y llenas de lodo. Apenas ve�an a la persona se�alada, aligeraban su trote y comenzaban a gru�ir, embest�an furiosamente a la persona y le daban trompadas y mordiscos en las piernas hasta derribarla y hacerle perder el conocimiento, al d�a siguiente, la v�ctima amanec�a molida y mordida, y con los bolsillos vac�os."
                    +"'"
                    +",'el_mico_brujo.jpg'"
                    +", 0"
                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/elmicobrujo.php'"
                    +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('El Duende'"
                    +",'"
                    +"Es un esp�ritu enamorado que siempre busca a las mujeres j�venes y bonitas, a las cuales no deja en paz hasta que hacen algo desagradable para �l, como no ba�arse o hacer cosas antihigi�nicas. No deja tranquila a la muchacha bonita que escoge, por medio de ruidos por las noches, brisas y aromas, hasta causar que se quede solterona.\n\nTambi�n cuentan otras historias que estos extra�os seres son hombrecitos muy peque�os y de orejas puntiagudas, les gusta vestir ropas muy lujosas y de colores brillantes; y son guardianes de enormes ollas llenas de monedas de oro, y hablan un idioma que solo ellos entienden.\n\nEn nuestro medio se cree que son esp�ritus en pena y llegan a la casa donde los ni�os tienen un comportamiento incorregible, para ll�vaselos; es por eso que nuestros abuelos nos cantaban a la hora de dormir \"Si no te duermes va a venir el duende y te va a llevar\"."
                    +"'"
                    +",'el_duende.jpg'"
                    +", 0"
                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/elduende.php'"
                    +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('El Cadejo'"
                    +",'"
                    +"El cadejo es representado por un perro de gran tama�o y de mirada penetrante del cual se aparecen dos especimenes, uno de ellos es blanco que simboliza el bien y otro negro que simboliza el mal.\n\nSe dice que El cadejo negro representa al esp�ritu del mal el cual se le aparece a las personas que deambulan en los pueblos en altas horas de la noche, persigue a sus v�ctimas durante un rato para asustarlos y luego los hipnotiza con sus enormes ojos color rojo, similar a carbones encendidos, cuando los atrapa les roba el alma dej�ndolos como tontos para el resto de su vidas, a esto se le denomina en El Salvador que una persona ha quedado jugada por un mal esp�ritu.\n\nEl cadejo blanco representa a un esp�ritu de luz que protege a todos los fieles creyentes y no permite que el cadejo negro se robe el alma de los reci�n nacidos o de los ni�os peque�os principalmente los que viven alejados de los pueblos.\n\nSe dice que el cadejo negro es normalmente ahuyentando de las viviendas con el humo del incienso que en El Salvador se conoce como Sahumerio."
                    +"'"
                    +",'el_cadejo.jpg'"
                    +", 0"
                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/elcadejo.php'"
                    +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('La Descarnada'"
                    +",'"
                    +"En El Salvador abundan las personas que afirman haber tenido una experiencia macabra con una hermosa mujer que se aparec�a en alguna carretera desolada pidiendo que la llevaran. La mujer sal�a a orillas de la calle con una vestimenta provocativa y con una actitud sensual, audazmente llamaba la atenci�n de los incautos que eran atra�dos por su belleza y coqueter�a.\n\nCuando los conductores le preguntaban hac�a donde se dirig�a, ella les contestaba que a unos pocos kil�metros del lugar, entonces se montaba al auto y comenzaba a seducirlos. Cuando los hombres empezaban a tocarla y besarla suced�a algo espantoso, la piel de la mujer se desprend�a de su cuerpo hasta quedar totalmente convertida en pocos segundos en un esqueleto humano. Minutos despu�s sus v�ctimas eran encontradas en estado de total confusi�n y �nicamente recordaban los instantes en que aquella escena tenebrosa hab�a ocurrido.\n\nAlgunos pobladores dicen que \"La Descarnada\" es en realidad el esp�ritu de una bruja maligna."
                    +"'"
                    +",'la_descarnada.jpg'"
                    +", 0"
                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/ladescarnada.php'"
                    +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('El Tabudo'"
                    +",'"
                    +"Esta leyenda se ha vuelto muy popular entre los pescadores, moradores y visitantes de del Lago de Coatepeque y se ha propagado tanto que se relata la misma leyenda en todos los lagos y lagunas de El Salvador.\n\nAl parecer, el due�o de una hermosa mansi�n localizada a orillas del Lago de Coatepeque sali� a dar un paseo en una canoa artesanal; al estar cerca de la isla fue arrastrado por una corriente subterr�nea y llevado hasta los dominios de la diosa de agua dulce.\n\nNunca se le volvi� a ver con vida. A los pocos meses se apareci� a las personas que cuidaban su propiedad y se las hered�. Ellos quedaron perplejos al verlo pues sus rodillas se hab�an ensanchado tanto que parec�an un par de balones de f�tbol, al igual que sus labios y se asemejaba a una criatura marina m�s que un ser humano.\n\nLas tabas son las rodillas de donde proviene el nombre. El tabudo es como una especie de magnate submarino y cuando le agrada una persona, se les aparece aparentando ser un humilde pescador para ganar su confianza, luego se lo lleva hasta lo m�s profundo del lago; a los hombres los convierte en enormes peces de colores y a las mujeres en sirenas de agua dulce."
                    +"'"
                    +",'el_tabudo.jpg'"
                    +", 0"
                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/eltabudo.php'"
                    +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('La Sihuanaba'"
                    +",'"
                    +"Una leyenda salvadore�a que cuenta la aparici�n de una mujer con pelo largo y enredado que le cubre el rostro, de cuerpo delgado y u�as largas, con busto enorme que le cuelga hasta casi tocar el suelo, se aparece en los caminos, r�os y quebradas especialmente a hombres solteros y borrachos que se conducen a altas horas de la noche a pie o caballo.\n\nOriginalmente llamada Sihuehuet (Mujer hermosa), ten�a un romance con el hijo del dios Tlaloc, el dios Lucero de la Ma�ana; del cual result� embarazada; traicionando as� al dios sol. Sihuehuet fue una mala madre, dejaba solo a su hijo para satisfacer a su amante. Cuando Tlaloc descubri� lo que estaba ocurriendo, maldijo a Sihuehuet llam�ndola Sihuanaba (Mujer Horrible). En adelante, ser�a hermosa a primera vista, pero cuando los hombres se le acercaran, ella se convertir�a en una mujer horrenda.\n\nDicen que la Sihuanaba es vista por la noche en los r�os de nuestro pa�s, lavando ropa y siempre buscando a su hijo el Cipit�o, al cual le fue concedida la juventud eterna por el dios Tlaloc como sufrimiento.\n\nSeg�n lo que cuenta la leyenda, todos los trasnochadores est�n propensos a encontrarse con la Sihuanaba, sin embargo, persigue con m�s insistencia a los hombres enamorados, a los \"Don Juan\" que hacen alarde de sus conquistas amorosas. A �stos, la Siguanaba se les aparece en cualquier tanque de agua en altas horas de la noche. La ven ba��ndose con guacal de oro y pein�ndose con un peine del mismo metal, su bello cuerpo se trasluce a trav�s del camis�n.\n\nAlgunos mencionan que la aparecida se presenta como una joven hermosa en un principio, al cautivar a su v�ctima y lograr atraer su atenci�n �sta le ped�a que la llevara o la acompa�ara, despu�s de un rato al tener su confianza �sta se convert�a en una mujer fea y grotesca, d�ndoles a sus v�ctimas el susto de sus vidas y haci�ndolos correr despavoridamente mientras �sta se quedaba riendo a grandes carcajadas y golpeando sus senos en las piedras de los r�os, todo esto en la oscuridad de la noche.\n\nDicen las tradiciones que el hombre que la mira se vuelve loco por ella. Entonces, la Siguanaba lo llama, conduci�ndolo hasta un barranco y ense�a la cara cuando ya se ha ganado la confianza de su v�ctima.\n\nPara no perder su alma, el hombre que ha sido v�ctima de la Sihuanaba debe morder una cruz o una medallita y encomendarse a Dios. Otra forma de librarse del hechizo de la Siguanaba, consiste en hacer un esfuerzo supremo y acercarse a ella lo m�s posible, tirarse al suelo cara al cielo, estirar la mano hasta tocarle el pelo, y luego hal�rselo. As� la Siguanaba se asusta y se tira al barranco. Otras versiones dicen que debe agarrarse de una mata de escobilla, y as�, cuando ella tira de uno, al agarrase la v�ctima de la escobilla, ella siente que le halan el pelo. Esta �ltima pr�ctica es m�s efectiva, ya que es el ant�doto propio que contrarresta el poder mal�fico de esta malvada mujer."
                    +"'"
                    +",'la_sihuanaba_1.jpg'"
                    +", 0"
                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/lasihuanaba.php'"
                    +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('La Cuyancuat'"
                    +",'"
                    +"Esta historia se narra principalmente en el municipio de Izalco, en el Departamento de Sonsonate que es donde sale por las noches una especie de animal mitol�gico de gran tama�o, mitad culebra en los extremos inferiores y mitad cerdo en los extremos superiores.\nAl visitar el centro tur�stico Atecozol en Sonsonate puedes encontrar una imagen en piedra de este fant�stico animal.\n\nSeg�n cuentan los lugare�os, se escucha por la noche a lo lejos un chillido tenebroso seguido de fuertes turbulencias bajo la tierra, dicho sonido se dice que proviene de �ste animal, por lo cual, los lugare�os se encierran a tempranas horas en sus hogares, esto se d� principalmente en los alrededores de los r�os y quebradas, dicho animal se arrastra recorriendo la zona en busca de alimento."
                    +"'"
                    +",'la_cuyancuat_1.jpg'"
                    +", 0"
                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/lacuyancuat.php'"
                    +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('La Iglesia Vieja'"
                    +",'"
                    +"En el pueblo de San Dionisio, que se encuentra hacia el Sur de la ciudad de Usulut�n, El Salvador, hay un lugar llamado \"La Iglesia Vieja\".\nCuando los espa�oles llegaron a nuestras tierras, �se lugar se conoc�a con el nombre de \"Ucelucla\" que en lengua ind�gena significa \"Lugar de Tigres\". Cuentan que los espa�oles fundaron all� un pueblo y construyeron una iglesia.\n\nUn d�a en que se estaba celebrando misa, la iglesia de hundi� totalmente. Algunas personas opinan que la causa del desastre fue que la iglesia estaba muy cerca del mar y all� la tierra es muy floja y como la iglesia pesaba mucho, el terreno se fue hundiendo.\n\nLo cierto es que la gente se llen� de miedo, como adem�s los piratas atacaban mucho los pueblos de la costa y arrasaban con todo, decidieron abandonar sus hogares y se internaron m�s al norte. All� fundaron una nueva ciudad a orillas del R�o Chiquito, a la que le dieron el nombre \"Usulut�n\".\n\nCuentan que todos los a�os, para el Mi�rcoles Santo y el S�bado Santo, a la hora en que se celebra la misa, se oye un repiqueteo de campanas que se va alejando del pueblo y se acerca al propio lugar en donde se hundi� la iglesia de los primeros usuluclanes."
                    +"'"
                    +",'la_iglesia_vieja.jpg'"
                    +", 0"
                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/laiglesiavieja.php'"
                    +")"
    	};
    }
    
    public static final String DATABASE_NAME = "mitologia_cuscatleca";
    
    public static final Integer DATABASE_VERSION = 19;

	public static final String TAG_DB = "MitologiaCuscatlecaDB";

}
