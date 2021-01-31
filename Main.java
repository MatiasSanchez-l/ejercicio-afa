package ejercicio;

import ejercicio.dao.*;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){


        //********************************************CREAR DIRECCION***************************************************//
        Direccion direccion0 = new Direccion("A",2,"La Boca","Buenos Aires");
        Direccion direccion1 = new Direccion("B",8,"Nuñez","Buenos Aires");
        Direccion direccion2 = new Direccion("C",6,"Chacarita","Cordoba");
        Direccion direccion4 = new Direccion("D",7,"Auriel","Mendoza");

        //********************************************INSERTAR DIRECCION***************************************************//
        DireccionDao direccionDao = new DireccionDaoImpl();
        //direccionDao.insert(direccion0);



        //********************************************CREAR EQUIPOS***************************************************//
        Equipo equipo0 = new Equipo(1, "Boca", LocalDate.of(1905,05,03), "Jorge Amor",
                9, "boca@email.com", LocalDate.of(1913,02,10), 'A');

        Equipo equipo1 = new Equipo(2, "River", LocalDate.of(1901,05,25), "Rodolfo DOnofrio",
                9, "river@email.com", LocalDate.of(1925,05,03), 'A');

        Equipo equipo2 = new Equipo(3, "San Lorenzo", LocalDate.of(1908,04,01), "Marcelo Tinelli",
                43, "casla@email.com", LocalDate.of(1925,05,03), 'A');

        //***************************INSERTAR EQUIPO*************************************//
        EquipoDao equipoDao = new EquipoDaoImpl();

        //equipoDao.insert(equipo0);
        //equipoDao.insertEquipoConDireccion(equipo0, direccion0);
        //equipoDao.insertEquipoConDireccion(equipo1, direccion1);
        //equipoDao.insertEquipoConDireccion(equipo2, direccion2);



        //***************************CREAR JUGADORES*************************************//
        Jugador jugador0 = new Jugador("Carlos", "Tevez", 1,78, "tevez@email.com", LocalDate.of(2001,10,21),
                LocalDate.of(1984,02,05),201,58,68.8f,1.56f);
        Jugador jugador1 = new Jugador("Sebastian", "Villa", 2,87, "villa@email.com", LocalDate.of(2001,10,21),
                LocalDate.of(1984,02,05),201,58,68.8f,1.56f);

        Jugador jugador2 = new Jugador("Rafael", "Santos", 3,87, "rafael@email.com", LocalDate.of(2001,10,21),
                LocalDate.of(1984,02,05),201,58,68.8f,1.56f);
        Jugador jugador3 = new Jugador("Jorge", "Carrascal", 4,87, "jorge@email.com", LocalDate.of(2001,10,21),
                LocalDate.of(1984,02,05),201,58,68.8f,1.56f);
        Jugador jugador4 = new Jugador("Ignacio", "Fernandez", 5,87, "ignacio@email.com", LocalDate.of(2001,10,21),
                LocalDate.of(1984,02,05),201,58,68.8f,1.56f);
        Jugador jugador5 = new Jugador("Leonardo", "Ponzio", 6,87, "leonard@email.com", LocalDate.of(2001,10,21),
                LocalDate.of(1984,02,05),201,58,68.8f,1.56f);

        Jugador jugador6 = new Jugador("Federico", "Gattoni", 7,87, "federico@email.com", LocalDate.of(2001,10,21),
                LocalDate.of(1984,02,05),201,58,68.8f,1.56f);
        Jugador jugador7 = new Jugador("Angel", "Romero", 8,87, "angel@email.com", LocalDate.of(2001,10,21),
                LocalDate.of(1984,02,05),201,58,68.8f,1.56f);
        Jugador jugador8 = new Jugador("Franco", "Santo", 9,87, "franco@email.com", LocalDate.of(2001,10,21),
                LocalDate.of(1984,02,05),201,58,68.8f,1.56f);

        //***************************INSERTAR JUGADORES*************************************//
        JugadorDao jugadorDao = new JugadorDaoImpl();

        /*jugadorDao.insert(jugador0);
        jugadorDao.insertJugadorConDireccion(jugador1, direccion4);
        jugadorDao.insertJugadorConDireccion(jugador2, direccion4);
        jugadorDao.insert(jugador3);
        jugadorDao.insert(jugador4);
        jugadorDao.insert(jugador5);
        jugadorDao.insert(jugador6);
        jugadorDao.insert(jugador7);
        jugadorDao.insert(jugador8);*/



        //********************************************CREAR HISTORIALES JUGADORES SIN FECHA FIN***************************************************//
        HistorialJugador historial0 = new HistorialJugador(LocalDate.of(2020,04,30),
                "defensor", equipo0.getCuit(), jugador0.getDni());
        HistorialJugador historial1 = new HistorialJugador(LocalDate.of(2020,04,30),
                "portero", equipo0.getCuit(), jugador1.getDni());
        HistorialJugador historial2 = new HistorialJugador(LocalDate.of(2020,04,30),
                "mediocentro", equipo1.getCuit(), jugador2.getDni());
        HistorialJugador historial3 = new HistorialJugador(LocalDate.of(2020,04,30),
               "delantero", equipo1.getCuit(), jugador3.getDni());
        HistorialJugador historial4 = new HistorialJugador(LocalDate.of(2020,04,30),
                "portero", equipo1.getCuit(), jugador4.getDni());
        HistorialJugador historial5 = new HistorialJugador(LocalDate.of(2020,04,30),
                "mediocentro", equipo1.getCuit(), jugador5.getDni());
        HistorialJugador historial6 = new HistorialJugador(LocalDate.of(2020,04,30),
                "defensor", equipo2.getCuit(), jugador6.getDni());
        HistorialJugador historial7 = new HistorialJugador(LocalDate.of(2020,04,30),
                "delantero", equipo2.getCuit(), jugador7.getDni());
        HistorialJugador historial8 = new HistorialJugador(LocalDate.of(2020,04,30),
                "defensor", equipo2.getCuit(), jugador8.getDni());



        //********************************************INSERTAR HISTORIALES JUGADORES***************************************************//
        HistorialJugadorDao hJugadorDao = new HistorialJugadorImpl();

        /*hJugadorDao.insert(historial0);
        hJugadorDao.insert(historial1);
        hJugadorDao.insert(historial2);
        hJugadorDao.insert(historial3);
        hJugadorDao.insert(historial4);
        hJugadorDao.insert(historial5);
        hJugadorDao.insert(historial6);
        hJugadorDao.insert(historial7);
        hJugadorDao.insert(historial8);*/

        //********************************************CREAR HISTORIALES PARA AGREGARLOS A LISTAS***************************************************//
        HistorialJugador historial9 = new HistorialJugador(LocalDate.of(2003,04,30),LocalDate.of(2004,04,30),
                "defensor", equipo2.getCuit(), jugador0.getDni());
        HistorialJugador historial10 = new HistorialJugador(LocalDate.of(2004,04,30),LocalDate.of(2005,04,30),
                "delantero", equipo0.getCuit(), jugador0.getDni());
        HistorialJugador historial11 = new HistorialJugador(LocalDate.of(2012,04,30),LocalDate.of(2015,04,30),
                "defensor", equipo0.getCuit(), jugador0.getDni());

        HistorialJugador historial12 = new HistorialJugador(LocalDate.of(2001,04,30),LocalDate.of(2003,04,30),
                "defensor", equipo0.getCuit(), jugador8.getDni());
        HistorialJugador historial13 = new HistorialJugador(LocalDate.of(2009,04,30),LocalDate.of(2010,04,30),
                "portero", equipo1.getCuit(), jugador8.getDni());
        HistorialJugador historial14 = new HistorialJugador(LocalDate.of(2015,04,30),LocalDate.of(2017,04,30),
                "delantero", equipo1.getCuit(), jugador8.getDni());

        List<HistorialJugador> lista0 = new ArrayList<>();

        List<HistorialJugador> lista1 = new ArrayList<>();

        //********************************************CREAR LISTAS DE HISTORIALES***************************************************//
        lista0.add(historial9);
        lista0.add(historial10);
        lista0.add(historial11);

        lista1.add(historial12);
        lista1.add(historial13);
        lista1.add(historial14);

        //********************************************INSERTAR LISTA DE HISTORIALES***************************************************//
        //hJugadorDao.insertListaHistoriales(lista0);
        //hJugadorDao.insertListaHistoriales(lista1);



        //********************************************CANTIDAD DE JUGADORES POR EQUIPOS ORDENADOS ALFABETICAMENTE***************************************************//
        System.out.println("/*----CANTIDAD DE JUGADORES POR EQUIPOS ORDENADOS ALFABETICAMENTE----*/");
        equipoDao.mostrarCantidadDeJugadoresActuales();

        //********************************************CANTIDAD DE DEFENSORES POR EQUIPOS ORDENADOS ALFABETICAMENTE***************************************************//
        System.out.println("/*----CANTIDAD DE DEFENSORES POR EQUIPOS ORDENADOS ALFABETICAMENTE----*/");
        equipoDao.mostrarCantidadDeDefensoresActuales();


        //********************************************CANTIDAD DE JUGADORES POR EQUIPOS EN UNA FECHA ORDENADOS ALFABETICAMENTE***************************************************//
        System.out.println("/*----CANTIDAD DE JUGADORES POR EQUIPOS EN UNA FECHA ORDENADOS ALFABETICAMENTE----*/");
        LocalDate fechaEnUnEquipo = LocalDate.of(2020,05,30);
        equipoDao.mostrarCantidadDeJugadoresEnUnaFecha(fechaEnUnEquipo);


        //********************************************READS***************************************************//
        System.out.println("/*----EQUIPOS EN BDD----*/");
        equipoDao.read();

        System.out.println("/*----JUGADORES EN BDD----*/");
        jugadorDao.read();

        System.out.println("/*----HISTORIALES EN BDD----*/");
        hJugadorDao.read();


    }
}
