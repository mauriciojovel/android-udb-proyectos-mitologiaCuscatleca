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
    				+"values('El cipitío', 'Hijo de la Sihuanaba, \"El Cipitío\" es un personaje muy conocido en las leyendas salvadoreñas, se trata de un niño pequeño y barrigón que nunca creció.\n\n"
    				+"El Cipitío se alimenta de guineos y de la ceniza que queda en las cocinas de leña de las viviendas rurales, utiliza un sombrero muy grande que se mueve al compás de su caminar, " 
    				+"se aparece por las noches como un espíritu burlón haciendo bromas, riendo y bailando alrededor de su victima.\n\n"
    				+"Se cuenta que el Cipitío arroja piedritas a las muchachas bonitas que van solas a lavar ropa en las pozas de los ríos.\n\n"
    				+"Este personaje de la mitología salvadoreña llamado originalmente \"Cipit\", y en la actualidad \"Cipitío\" o \"Cipitillo\", "
    				+"nació de la relación que tuvo su madre Sihuehuet (Mujer hermosa) con el Dios Lucero de la Mañana, traicionando infielmente al Dios Sol. " 
    				+"Es por eso que el dios, Tlaloc condenó tanto a la madre como al hijo. A la madre la condenó a ser una mujer errante y al niño a nunca crecer, y conservarse por siempre en la edad de diez años.\n\n"
    				+"Cipit es hijo de un dios, pero su aspecto es el de un niño de bajas condiciones sociales y económicas, con una deformación en los pies, " 
    				+"teniéndolos al revés, enorme barriga y con el poder de desaparecer y aparecer en otro lugar.\n\n"
    				+"El Cipitío es un ser propio del folklore salvadoreño. La leyenda ha evolucionado de generación en generación, "
    				+"adaptando muchos de los elementos de la misma para no perder vigencia; aunque en el fondo, conserva la esencia ancestral.\n"
    				+"'"
    				+",'cipitio.jpg'"
    				+", 0"
    				+", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/elcipitio.php'"
    				+")"
    		,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
    				+"values('La Carreta Bruja o Carreta Chillona', '"
    				+"Cuentan que hace años vivió un hombre sin fé a quien todos llamaban \"Pedro el Malo\".\n\n"
    				+"Para un 15 de mayo, fiesta de San Isidro Labrador, mucha gente llegó al pueblo para la bendición de carretas. "
    				+"Pedro también llevó su carreta, pero tenía malas intensiones. La paró muy cerca de la puerta de la iglesia, lejos de las otras carretas.\n\n"
    				+"Cuando el sacerdote le pidió a Pedro que alineara su carreta con las demás, este le respondió que no la había llevado para que la bendijera, "
    				+"pues ya estaba bendecida por el diablo. Y de seguido, hincando a los bueyes sin piedad, intentó entrar a la iglesia con todo y carreta, "
    				+"pero los bueyes se resistieron a entrar; más bien lograron zafarse del yugo y la carreta salió calle abajo con todo y Pedro.\n\n"
    				+"El sacerdote le dijo entonces: \"Andarás con tu carreta por todo la eternidad\".\n\n"
    				+"Los bueyes se salvaron de la maldición, porque se negaron a entrar a la iglesia.\n\n"
    				+"Cuenta la leyenda que desde entonces la carreta sin bueyes, va bendecida por el diablo, "
    				+"anda sola sin bueyes que la conduzcan, causando espanto por donde se oye el \"traca, taca, tarata\", que hacen sus ruedas de madera.\n\n"
    				+"Los abuelos cuentan que la carreta sin bueyes pasa por los pueblos de la campiña salvadoreña donde no hay amor ni armonía entre sus habitantes,"
    				+"siempre después de la media noche.\n"
    				+"'"
    				+",'carreta.gif'"
    				+", 0 "
    				+", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/lacarretabruja.php'"
    				+")"
    		,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
    	    				+"values('La Flor de Amate', '"
    	    				+"El Ámate es un árbol muy conocido en El Salvador, este árbol es muy diferente a los demás en su estructura física." 
    	    				+"Su tronco es muy grueso y mal formado, pues tiene unas protuberancias (Si así se le pueden llamar), que hacen que el tronco "
    	    				+"parezca un rollo de cables mal hecho, sus ramas también un poco mal formadas, si uno se fija bien en ellas tienen un "
    	    				+"aspecto de garras. En fin un árbol fuera de lo común, además de no dar ni flores ni frutos.\n\n"
    	    				+"Pero la leyenda dice que este árbol tiene un negro secreto oculto entre sus deformadas ramas, y es que a las "
    	    				+"12:00 de la noche en punto, en la copa de éste, nace una hermosa FLOR BLANCA, la cual cae al suelo y el hombre "
    	    				+"que logre agarrar esta flor, tendrá todo lo que quiera, AMOR, DINERO Y SALUD, pero no es tan fácil, "
    	    				+"pues la verdadera prueba es luchar contra EL DIABLO, que es el dueño de esa flor.\n\n"
    	    				+"Se dice que tiene que ser una lucha a muerte; si el Demonio gana, se lleva el alma de aquel hombre, pero si el "
    	    				+"hombre gana tendrá todo lo que él quiera.\n\n"
    	    				+"Se cuenta que las únicas personas que ven a este árbol florecer en cualquier época del año son los MUDOS, ya que "
    	    				+"se sabe que nunca dirán nada de esta flor encantada.\n"
    	    				+"'"
    	    				+",'amate.png'"
    	    				+", 0"
    	    				+", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/laflordeamate.php'"
    	    				+")"
			,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('El Gallo e'' Don Chema'"
			        +",'"
                    +"Acostumbrado a levantarme tempranito, pá compañar a mi Papa al trabajo, ese veinticuatro era como si juera Domingo, nada e''tareya, nada e''asoliada, ¡Sólo Choteyo!\nLa María, mi hermana, también se levantó temprano, pá ir con mi Mama al pueblo a trer los comprados pá la Cena.\n\nJuimos a bañarnos. Diunos bejucos me tiré a la poza, igual como ví a Tarzán en el pedazo de diario a colores, en que venía envuelta la tapa de dulce.\n\nLa María por estarme aplaudiendo, simás dejír en la corriente el huacal con que se estaba bañando.\n\nLlegamos de guelta al rancho, despertando con el retozo a todos, Bravo, mi Papa, nos calló la bulla diciendo: - ¡Dejen dormir cipotes! ¡no jodan tanto! ¡trínquense otra vez! ¡quioy nuay pisto!. Tristes, nos miramos; nuiva ver pollo, ni cuetes, ni nada.\n\nSalimos al patio; nos sentamos en las raices del mango y con las manos teniéndonos las quijadas, nos quedamos viendo salir al sol dialláaa lejos\".\n\nPasaron los Pérez, los Monzones, todos los del Valle. La vereda los llevaba recto al Pueblo.\n\nCaminamos un rato, viendo siempre pá bajo. Pasamos el riyo y salimos al otro lado, onde vivía Don Chema.\n\nEran enemigos mi Papa y Don Chema. Desde la vez que me metí al gallinero y lespanté toditiiitas las gallinas. Como me reí everlo ese día. Corriya y corriya diun lado pá otro sin poder alcanzarlas.\n\nEn eso estaba pensando cuando oyí un papaleo: ¡Era el gallo chorompo e Don Chema!.\n\nCuando el animal, quiandaba buscando comida, estuvo más cerca, miré a la María con sonrisa e malicia y le dije : - Seguro se saltó el cedaaazo.  La María se rió al entenderme y me siguió pa yudarme.\n\nDespacito nos juimos moviendo.  El gallo volteaba el ojo y sonaba el pescuezo cada vez que nos miraba acercanos.  Caminaba pa trás, y no siva, confiado de sus espuelas quiá más diuno le había ensartado.\n\nLo acorralamos por unos bambús, la María con miedo se le tiró encima.  ¡¡ Se armó un gran relaaajo !! .  Al final de cuentas se le salió, dejándole solo las plumas de la cola en las manos.  Pero ahí estaba Yo, detrás, y conmigo si no se jué.\n\nAl nomás agarrarlo y oyir la vocesota e Don Chema gritando: -Dejenme al gallo cipotes! ¡no se lo gueveyen!- Salimos zumbados como el diablo.\n\nApenas habíamos llegado al riyo, cuando sentí las manotas e don Chema clavadas en l espalda.  Medio me le solté, gatiando y por entre las patas me le juí.\n\nComencé a saltar de piedra en piedra, y en una desas ¡PUM GUM!. Me cayí dándome un sopapo en el coco.\n\nAsí quedamos: destripado el gallo, sin sentido yo.  Mi hermana chillando y gritando: - ¡Camilo! - ¡Camilo!¡ levantaate, jodido!  ¡levantaate ! Y Don Chema\" cheeerche, cheerche de la flisión.\n\nMe levantó antes que me hogara; me acostó en l orilla.  Cuando desperté, lo que busqué primero fuel gallo.  Al ver que la María lo tenía bien agarrado, todo bolo y quebrado del brazo le dije: ¡Monós María! ¡Monós! ¡ que nos nos quite el gallo! ¡Quese gallo es miyo!.\n\nNo nos dejuir solos.  Me llevó chiniado.\n\nAl verme mi Papa todo bañado e sangre e gallo, fual rancho y salió con el colín en la mano.\n\n¡Que melizo al cipote! ¡Que cosa melizo jué tantas ! Gritaba.  ¡No Papa! Le dije.\n\nNada mizo.  Me cayí en el riyo.  Juí Yo solo.\n\nLe conté más o menos como estuvo la cosa, y nos dijo: ¡Ya no chillen! Si no, ya les va caer.\n\nDon Chema pagó la enyesada y nos regaló el gallo.\n\nParecía otro.  Se veía gueno y sonrisas empezaba a enseñarnos.\n\nInvitaaaaalo\", dijo mi Mama a mi Papa, y así jué.\n\nEn la noche, Don Chema, sentado en el mejor zancudo del rancho, chistaba.\n\nNubo cuetes pa mi, tenía el brazo tilinte.  Mi alegriya fue oyirlos hablando, y ver los escupidores y los buscaniguas alumbrando la noche.\n\n¡Dieron las doce en el radio!\n\n¡Afuera, reventaron mas cuetes! ¡Sonaron balazos! ¡Del pueblo llegaba el ruido de las reventazones !\n\n¡Y aentro, en el rancho, hubieron abrazos! \" ¡Y tragos! ¡Y panes !\n\nHoy ya siablan, son compadres.\n\nDon Chema es mi padrino\n\nEsse veinnticuatro, pa mí,  pa mí, fuel mejor \""
                    +"'"
                    +",'gallo.jpg'"
                    +", 0"
                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/elgalloedonchema.php'"
                    +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                            +"values('La Poza de Bululu'"
                            +",'"
                            +"Se ubica en el Río Sensunapán entre el limite municipal de Sonzacate y Sonsonate, se afirmaba que en tiempos pasados la poza llamada \"Bululú\" era encantada y se hablaba con insistencia que ahí aparecía un guacal de oro que contenía un paste lleno de brillantes y un jabón plateado. El que osaba cogerlo era burlado por el objeto aparecido, sumergiéndose para salir a flote en otro lugar de la poza, y si por desgracia lograba tomarlo, se hundía juntamente con el guacal para nunca más volver.\n\nTambién hay quien cuenta, que estos objetos, pertenecían a la Virgen de Candelaria (Patrona del Departamento),Â  que quien se acercaba para agarrarlo, ella los castigaba por su ambición, ahogándolos en la poza. Pero quien lo veía y no lo tocaba, sabiendo que no le pertenecía, ella lo colmaba de riquezas."
                            +"'"
                            +",'la_poza_del_bululu.jpg'"
                            +", 0"
                            +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/lapozadebululu.php'"
                            +")"
             ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                                    +"values('La Llorona'"
                                    +",'"
                                    +"Esta es una de las leyendas más populares de  El Salvador. Los lamentos de una mujer que clama por sus hijos perdidos son escuchados con temor en noches de luna llena.\nTestigos afirman que la mujer va flotando en el aire vestida de blanco y cuando se detiene a llorar en la puerta o ventana de alguna casa, es presagio que los moradores de la misma pasarán por muchas penas, problemas y tribulaciones.\n\nSe dice que para alejarla junto con su sombrío augurio, se debe hacer un rezo especial en la casa durante nueve noches consecutivas."
                                    +"'"
                                    +",'la_llorona.jpg'"
                                    +", 0"
                                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/lallorona.php'"
                                    +")"
             ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                                            +"values('El Cerro de la Juana Pancha'"
                                            +",'"
                                            +"Se cuenta que en la cumbre del cerro Conchagua, a tres kilómetros al sur de la población, en una cueva habitaba una hermosa mujer que se dedicaba a robar grandes cantidades de dinero. Su nombre era Juana Francisca Callejas, pero le decían Juana Pancha. Era una hechicera que volaba de un lugar a otro y con la rapidez del viento podía desaparecer.\n\nCon frecuencia hacía sus hechizos, que la llevaban al palacio de los capitanes generales de la antigua Guatemala y en ocasiones se convertía en un animal casero, capaz de entrar en cualquier lugar y sustraer los botines.\n\nDicen que una noche, cuando viajaba a su acostumbrada visita de la Unión a Guatemala, unos hombres hechiceros la atraparon y en consejo acordaron que debían quemarla.\n\nElla, en venganza, dejó la cueva encantada y toda persona que llega ahí nunca más vuelve a salir, y entre más lo intenta más se pierde en los opuestos caminos que conducen a su misteriosa abertura.\n\nSin embargo hay una profecía que dice que \"el embrujo cesará a las tres de la tarde en un Viernes Santo, si alguien se atreve a entrar a la cueva y dormir esa noche, solo, sin temor a lo que pueda escuchar\"."
                                            +"'"
                                            +",'el_cerro_de_la_juana_pancha.jpg'"
                                            +", 0"
                                            +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/elcerrodelajuanapancha.php'"
                                            +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                                            +"values('La Señora de los Anillos'"
                                            +",'"
                                            +"Esto sucedió en San Salvador: Hace ya varios años estaban desapareciendo muchos niños, esto se le atribuía a una mujer de vestimenta blanca, con un rostro indescriptible, que en sus manos llevaba muchos anillos.\n\nLa historia se centra específicamente en una pareja y su bebé que vivían en un apartamento.\n\nUna noche el señor estaba trabajando y su esposa leyendo en el cuarto; hacía mucho calor y pusieron al niño a la orilla de la ventana a quien el señor cuidaba de reojo.\nAl poco rato, ya con una pesadez de sueño el señor empezó a cabecear y miró hacia la ventana... en la cual vio una mano detenida con muchos anillos... pero se sacudió frotándose los ojos y volviendo a ver de nuevo, cual fue su sorpresa, que ya no había nada.\n\nSe queda dormido y luego de unos minutos se despierta dando un sobresalto. Ve una mujer parada a lado de su hijo el cual solo tenia unos cuantos meses de nacido. En ese momento se quedó paralizado sin poder hablar pero reaccionando corrió y tomó el niño y se fue al cuarto donde estaba la esposa. Quien le dijo que lo que veía, se debía a que no había podido dormir bien por varios días.\n\nAl siguiente día se va a trabajar el señor y cuál fue su sorpresa que la mujer estaba en la entrada del edificio y la identificó por los anillos, luego tomó el bus dejándola sentada como una estatua.\n\nEn el bus oyendo que alguien que se reía a carcajadas miró hacia adelante y vio a la misma mujer parada frente a él, con el niño en manos, y desde ese día el hombre no coordino ideas, quedó directo y sin su bebé."
                                            +"'"
                                            +",'la_senora_de_los_anillos.jpg'"
                                            +", 0"
                                            +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/lasenoradelosanillos.php'"
                                            +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('Nuestra Señora de Santa Ana'"
                    +",'"
                    +"Una de las leyendas más conocidas es la que explica la manera en que llegó la Señora de Santa Ana a dicho lugar.\n\nSe dice \"que unos indios llevaban esta imagen para Honduras y al pasar por Santa Ana ya era de noche y decidieron pernoctar en una gran Ceiba que estaba situada en la única plazoleta del lugar, llamado entonces Sihuatehuacán.\n\nAl amanecer quisieron levantar la imagen para seguir su camino, pero ésta se les puso muy pesada y fue imposible moverla, de manera que decidieron dejarla en ese sitio\". Allí se levantó después una ermita y posteriormente una iglesia.\n\nOtra de las leyendas sobre la Señora de Santa Ana: \"Durante la Revolución de los 44\", una de las batallas más importantes celebrada en el cerro Techan, los soldados se encontraban desesperados, casi sin armas, y el bando contrario estaba muy cerca. De repente, vieron llegar a una señora extraña, alta, hermosa que llevaba un bulto en su delantal y un cántaro de agua. Les empezó a dar de beber agua. Después supieron que había sido la señora Santa Ana quien los libró en esa batalla."
                    +"'"
                    +",'nuestra_senora_de_santa_ana.jpg'"
                    +", 0"
                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/nuestrasenoradesantaana.php'"
                    +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('Las Botijas'"
                    +",'"
                    +"Contaban nuestros abuelos que eran cantaros llenos de monedas de plata o de oro enterrados; que con el pasar de los años quedaban al descubierto; pero aquel que se encontraba una botija se aferraba a ella a tal grado que solo vivía para cuidarla, nunca llegaba a gastarse ni una sola de sus monedas y moría en la miseria. Más de alguno de nuestros abuelos las han visto cuando eran jóvenes pero han preferido seguir su pobreza; a que el mal les gane el alma.\n\nExisten quienes cuentan que estas botijas es dinero pactado; que alguna persona a hecho con Satanás y al no poder cumplir su trato; el se llevaba el cuerpo y el alma de la persona, luego volvía a enterrar este caudal de dinero en una botija para atrapar a otro ambicioso que se atreva a desenterrarla y así poder ganar también su alma."
                    +"'"
                    +",'las_botijas.jpg'"
                    +", 0"
                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/lasbotijas.php'"
                    +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('El Mico Brujo'"
                    +",'"
                    +"En todo El Salvador se conoce la leyenda del \"Mico Brujo\". En algunas partes también lo relacionan con otras especies como La Mona o El Chancho.\n\nDecían nuestros antepasados que habían unas mujeres que a las once de la noche  se daban tres volantines para atrás y luego tres para adelante (saltaban hacia delante o hacia atrás); que estas mujeres tenían un guacal donde dejaban su alma y ya sin esta tomaban figura  de monos, o chanchos y se dedicaban a hacer diabluras.\n\nY así estas brujas, acompañadas de la oscuridad de la noche, se trepaban a los árboles y tiraban frutas a la gente. Se subían a los techos de las casas, saltando de un lugar a otro y arrojando pedradas contra las personas que pasaban en la calle vecinas.\n\nMuchas personas han tratado de agarrarlas y matar a la mona o chancha, pero de nada les sirve, pues cuando ya están cerca y creen tenerla acorralada se les esfuma como por encanto.\n\nTambién contaban nuestros antepasados que esas mujeres podían convertirse en chanchas grandes, negras y llenas de lodo. Apenas veían a la persona señalada, aligeraban su trote y comenzaban a gruñir, embestían furiosamente a la persona y le daban trompadas y mordiscos en las piernas hasta derribarla y hacerle perder el conocimiento, al día siguiente, la víctima amanecía molida y mordida, y con los bolsillos vacíos."
                    +"'"
                    +",'el_mico_brujo.jpg'"
                    +", 0"
                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/elmicobrujo.php'"
                    +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('El Duende'"
                    +",'"
                    +"Es un espíritu enamorado que siempre busca a las mujeres jóvenes y bonitas, a las cuales no deja en paz hasta que hacen algo desagradable para él, como no bañarse o hacer cosas antihigiénicas. No deja tranquila a la muchacha bonita que escoge, por medio de ruidos por las noches, brisas y aromas, hasta causar que se quede solterona.\n\nTambién cuentan otras historias que estos extraños seres son hombrecitos muy pequeños y de orejas puntiagudas, les gusta vestir ropas muy lujosas y de colores brillantes; y son guardianes de enormes ollas llenas de monedas de oro, y hablan un idioma que solo ellos entienden.\n\nEn nuestro medio se cree que son espíritus en pena y llegan a la casa donde los niños tienen un comportamiento incorregible, para llévaselos; es por eso que nuestros abuelos nos cantaban a la hora de dormir \"Si no te duermes va a venir el duende y te va a llevar\"."
                    +"'"
                    +",'el_duende.jpg'"
                    +", 0"
                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/elduende.php'"
                    +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('El Cadejo'"
                    +",'"
                    +"El cadejo es representado por un perro de gran tamaño y de mirada penetrante del cual se aparecen dos especimenes, uno de ellos es blanco que simboliza el bien y otro negro que simboliza el mal.\n\nSe dice que El cadejo negro representa al espíritu del mal el cual se le aparece a las personas que deambulan en los pueblos en altas horas de la noche, persigue a sus víctimas durante un rato para asustarlos y luego los hipnotiza con sus enormes ojos color rojo, similar a carbones encendidos, cuando los atrapa les roba el alma dejándolos como tontos para el resto de su vidas, a esto se le denomina en El Salvador que una persona ha quedado jugada por un mal espíritu.\n\nEl cadejo blanco representa a un espíritu de luz que protege a todos los fieles creyentes y no permite que el cadejo negro se robe el alma de los recién nacidos o de los niños pequeños principalmente los que viven alejados de los pueblos.\n\nSe dice que el cadejo negro es normalmente ahuyentando de las viviendas con el humo del incienso que en El Salvador se conoce como Sahumerio."
                    +"'"
                    +",'el_cadejo.jpg'"
                    +", 0"
                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/elcadejo.php'"
                    +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('La Descarnada'"
                    +",'"
                    +"En El Salvador abundan las personas que afirman haber tenido una experiencia macabra con una hermosa mujer que se aparecía en alguna carretera desolada pidiendo que la llevaran. La mujer salía a orillas de la calle con una vestimenta provocativa y con una actitud sensual, audazmente llamaba la atención de los incautos que eran atraídos por su belleza y coquetería.\n\nCuando los conductores le preguntaban hacía donde se dirigía, ella les contestaba que a unos pocos kilómetros del lugar, entonces se montaba al auto y comenzaba a seducirlos. Cuando los hombres empezaban a tocarla y besarla sucedía algo espantoso, la piel de la mujer se desprendía de su cuerpo hasta quedar totalmente convertida en pocos segundos en un esqueleto humano. Minutos después sus víctimas eran encontradas en estado de total confusión y únicamente recordaban los instantes en que aquella escena tenebrosa había ocurrido.\n\nAlgunos pobladores dicen que \"La Descarnada\" es en realidad el espíritu de una bruja maligna."
                    +"'"
                    +",'la_descarnada.jpg'"
                    +", 0"
                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/ladescarnada.php'"
                    +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('El Tabudo'"
                    +",'"
                    +"Esta leyenda se ha vuelto muy popular entre los pescadores, moradores y visitantes de del Lago de Coatepeque y se ha propagado tanto que se relata la misma leyenda en todos los lagos y lagunas de El Salvador.\n\nAl parecer, el dueño de una hermosa mansión localizada a orillas del Lago de Coatepeque salió a dar un paseo en una canoa artesanal; al estar cerca de la isla fue arrastrado por una corriente subterránea y llevado hasta los dominios de la diosa de agua dulce.\n\nNunca se le volvió a ver con vida. A los pocos meses se apareció a las personas que cuidaban su propiedad y se las heredó. Ellos quedaron perplejos al verlo pues sus rodillas se habían ensanchado tanto que parecían un par de balones de fútbol, al igual que sus labios y se asemejaba a una criatura marina más que un ser humano.\n\nLas tabas son las rodillas de donde proviene el nombre. El tabudo es como una especie de magnate submarino y cuando le agrada una persona, se les aparece aparentando ser un humilde pescador para ganar su confianza, luego se lo lleva hasta lo más profundo del lago; a los hombres los convierte en enormes peces de colores y a las mujeres en sirenas de agua dulce."
                    +"'"
                    +",'el_tabudo.jpg'"
                    +", 0"
                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/eltabudo.php'"
                    +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('La Sihuanaba'"
                    +",'"
                    +"Una leyenda salvadoreña que cuenta la aparición de una mujer con pelo largo y enredado que le cubre el rostro, de cuerpo delgado y uñas largas, con busto enorme que le cuelga hasta casi tocar el suelo, se aparece en los caminos, ríos y quebradas especialmente a hombres solteros y borrachos que se conducen a altas horas de la noche a pie o caballo.\n\nOriginalmente llamada Sihuehuet (Mujer hermosa), tenía un romance con el hijo del dios Tlaloc, el dios Lucero de la Mañana; del cual resultó embarazada; traicionando así al dios sol. Sihuehuet fue una mala madre, dejaba solo a su hijo para satisfacer a su amante. Cuando Tlaloc descubrió lo que estaba ocurriendo, maldijo a Sihuehuet llamándola Sihuanaba (Mujer Horrible). En adelante, sería hermosa a primera vista, pero cuando los hombres se le acercaran, ella se convertiría en una mujer horrenda.\n\nDicen que la Sihuanaba es vista por la noche en los ríos de nuestro país, lavando ropa y siempre buscando a su hijo el Cipitío, al cual le fue concedida la juventud eterna por el dios Tlaloc como sufrimiento.\n\nSegún lo que cuenta la leyenda, todos los trasnochadores están propensos a encontrarse con la Sihuanaba, sin embargo, persigue con más insistencia a los hombres enamorados, a los \"Don Juan\" que hacen alarde de sus conquistas amorosas. A éstos, la Siguanaba se les aparece en cualquier tanque de agua en altas horas de la noche. La ven bañándose con guacal de oro y peinándose con un peine del mismo metal, su bello cuerpo se trasluce a través del camisón.\n\nAlgunos mencionan que la aparecida se presenta como una joven hermosa en un principio, al cautivar a su víctima y lograr atraer su atención ésta le pedía que la llevara o la acompañara, después de un rato al tener su confianza ésta se convertía en una mujer fea y grotesca, dándoles a sus víctimas el susto de sus vidas y haciéndolos correr despavoridamente mientras ésta se quedaba riendo a grandes carcajadas y golpeando sus senos en las piedras de los ríos, todo esto en la oscuridad de la noche.\n\nDicen las tradiciones que el hombre que la mira se vuelve loco por ella. Entonces, la Siguanaba lo llama, conduciéndolo hasta un barranco y enseña la cara cuando ya se ha ganado la confianza de su víctima.\n\nPara no perder su alma, el hombre que ha sido víctima de la Sihuanaba debe morder una cruz o una medallita y encomendarse a Dios. Otra forma de librarse del hechizo de la Siguanaba, consiste en hacer un esfuerzo supremo y acercarse a ella lo más posible, tirarse al suelo cara al cielo, estirar la mano hasta tocarle el pelo, y luego halárselo. Así la Siguanaba se asusta y se tira al barranco. Otras versiones dicen que debe agarrarse de una mata de escobilla, y así, cuando ella tira de uno, al agarrase la víctima de la escobilla, ella siente que le halan el pelo. Esta última práctica es más efectiva, ya que es el antídoto propio que contrarresta el poder maléfico de esta malvada mujer."
                    +"'"
                    +",'la_sihuanaba_1.jpg'"
                    +", 0"
                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/lasihuanaba.php'"
                    +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('La Cuyancuat'"
                    +",'"
                    +"Esta historia se narra principalmente en el municipio de Izalco, en el Departamento de Sonsonate que es donde sale por las noches una especie de animal mitológico de gran tamaño, mitad culebra en los extremos inferiores y mitad cerdo en los extremos superiores.\nAl visitar el centro turístico Atecozol en Sonsonate puedes encontrar una imagen en piedra de este fantástico animal.\n\nSegún cuentan los lugareños, se escucha por la noche a lo lejos un chillido tenebroso seguido de fuertes turbulencias bajo la tierra, dicho sonido se dice que proviene de éste animal, por lo cual, los lugareños se encierran a tempranas horas en sus hogares, esto se dá principalmente en los alrededores de los ríos y quebradas, dicho animal se arrastra recorriendo la zona en busca de alimento."
                    +"'"
                    +",'la_cuyancuat_1.jpg'"
                    +", 0"
                    +", 'http://www.elsalvadordestinos.com/espanol/cuentosyleyendas/lacuyancuat.php'"
                    +")"
            ,"INSERT INTO " + TABLE_NAME +"(nombre, sipnosis, ruta_imagen, ingresado_usuario,link_interes) "
                    +"values('La Iglesia Vieja'"
                    +",'"
                    +"En el pueblo de San Dionisio, que se encuentra hacia el Sur de la ciudad de Usulután, El Salvador, hay un lugar llamado \"La Iglesia Vieja\".\nCuando los españoles llegaron a nuestras tierras, ése lugar se conocía con el nombre de \"Ucelucla\" que en lengua indígena significa \"Lugar de Tigres\". Cuentan que los españoles fundaron allí un pueblo y construyeron una iglesia.\n\nUn día en que se estaba celebrando misa, la iglesia de hundió totalmente. Algunas personas opinan que la causa del desastre fue que la iglesia estaba muy cerca del mar y allí la tierra es muy floja y como la iglesia pesaba mucho, el terreno se fue hundiendo.\n\nLo cierto es que la gente se llenó de miedo, como además los piratas atacaban mucho los pueblos de la costa y arrasaban con todo, decidieron abandonar sus hogares y se internaron más al norte. Allí fundaron una nueva ciudad a orillas del Río Chiquito, a la que le dieron el nombre \"Usulután\".\n\nCuentan que todos los años, para el Miércoles Santo y el Sábado Santo, a la hora en que se celebra la misa, se oye un repiqueteo de campanas que se va alejando del pueblo y se acerca al propio lugar en donde se hundió la iglesia de los primeros usuluclanes."
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
