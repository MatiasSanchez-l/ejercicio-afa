package ejercicio;

import ejercicio.dao.*;
import ejercicio.dto.DireccionDto;
import ejercicio.dto.EquipoDto;
import ejercicio.dto.HistorialJugadorDto;
import ejercicio.dto.JugadorDto;
import ejercicio.model.Direccion;
import ejercicio.model.Equipo;
import ejercicio.model.HistorialJugador;
import ejercicio.model.Jugador;
import ejercicio.servicio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        //********************************************CREAR DIRECCIONDTO***************************************************//

        DireccionDto direccionDto0 = new DireccionDto();
        direccionDto0.setCalle("A");
        direccionDto0.setNumero(2);
        direccionDto0.setLocalidad("La Boca");
        direccionDto0.setProvincia("Buenos Aires");

        DireccionDto direccionDto1 = new DireccionDto();
        direccionDto1.setCalle("B");
        direccionDto1.setNumero(8);
        direccionDto1.setLocalidad("Nuñez");
        direccionDto1.setProvincia("Buenos Aires");

        DireccionDto direccionDto2 = new DireccionDto();
        direccionDto2.setCalle("D");
        direccionDto2.setNumero(7);
        direccionDto2.setLocalidad("Auriel");
        direccionDto2.setProvincia("Mendoza");

        //********************************************INSERTAR DIRECCIONDTO***************************************************//
        DireccionServicio direccionServicio = new DireccionServicioImpl();

        //direccionServicio.insert(direccionDto0);



        //***************************CREAR EQUIPODTO*************************************//

        EquipoDto equipoDto0 = new EquipoDto();
        equipoDto0.setCuit(1);
        equipoDto0.setNombre("Boca");
        equipoDto0.setFechaFundacion(LocalDate.of(1905,05,03));
        equipoDto0.setPresidenteNombreApellido("Jorge Amor");
        equipoDto0.setTelefono(9);
        equipoDto0.setEmail("boca@email.com");
        equipoDto0.setFechaPrimeraDivision( LocalDate.of(1913,02,10));
        equipoDto0.setCategoria('A');

        EquipoDto equipoDto1 = new EquipoDto();
        equipoDto1.setCuit(2);
        equipoDto1.setNombre("River");
        equipoDto1.setFechaFundacion(LocalDate.of(1901,05,25));
        equipoDto1.setPresidenteNombreApellido("Rodolfo DOnofrio");
        equipoDto1.setTelefono(9);
        equipoDto1.setEmail("river@email.com");
        equipoDto1.setFechaPrimeraDivision(LocalDate.of(1925,05,03));
        equipoDto1.setCategoria('A');

        EquipoDto equipoDto2 = new EquipoDto();
        equipoDto2.setCuit(3);
        equipoDto2.setNombre("San Lorenzo");
        equipoDto2.setFechaFundacion(LocalDate.of(1908,04,01));
        equipoDto2.setPresidenteNombreApellido("Marcelo Tinelli");
        equipoDto2.setTelefono(43);
        equipoDto2.setEmail("casla@email.com");
        equipoDto2.setFechaPrimeraDivision(LocalDate.of(1925,05,03));
        equipoDto2.setCategoria('A');

        //***************************INSERTAR EQUIPODTO*************************************//
        EquipoServicio equipoServicio = new EquipoServicioImpl();
        //equipoServicio.insert(equipoDto1);
        //equipoServicio.insertEquipoConDireccion(equipoDto1, direccionDto0);



        //***************************CREAR JUGADORESDTO*************************************//

        JugadorDto jugadorDto0 = new JugadorDto();
        jugadorDto0.setNombre("Carlos");
        jugadorDto0.setApellido("Tevez");
        jugadorDto0.setDni(1);
        jugadorDto0.setTelefono(78);
        jugadorDto0.setEmail("tevez@email.com");
        jugadorDto0.setFechaDebut(LocalDate.of(2001,10,21));
        jugadorDto0.setFechaNacimiento(LocalDate.of(1984,02,05));
        jugadorDto0.setCantidadPartidos(201);
        jugadorDto0.setCantidadGoles(58);
        jugadorDto0.setPeso(68.8f);
        jugadorDto0.setAltura(1.56f);

        JugadorDto jugadorDto1 = new JugadorDto();
        jugadorDto1.setNombre("Sebastian");
        jugadorDto1.setApellido("Villa");
        jugadorDto1.setDni(2);
        jugadorDto1.setTelefono(87);
        jugadorDto1.setEmail("villa@email.com");
        jugadorDto1.setFechaDebut(LocalDate.of(2001,10,21));
        jugadorDto1.setFechaNacimiento(LocalDate.of(1984,02,05));
        jugadorDto1.setCantidadPartidos(201);
        jugadorDto1.setCantidadGoles(58);
        jugadorDto1.setPeso(68.8f);
        jugadorDto1.setAltura(1.56f);

        JugadorDto jugadorDto2 = new JugadorDto();
        jugadorDto2.setNombre("Rafael");
        jugadorDto2.setApellido("Santos");
        jugadorDto2.setDni(3);
        jugadorDto2.setTelefono(87);
        jugadorDto2.setEmail("rafael@email.com");
        jugadorDto2.setFechaDebut(LocalDate.of(2001,10,21));
        jugadorDto2.setFechaNacimiento(LocalDate.of(1984,02,05));
        jugadorDto2.setCantidadPartidos(201);
        jugadorDto2.setCantidadGoles(58);
        jugadorDto2.setPeso(68.8f);
        jugadorDto2.setAltura(1.56f);

        JugadorDto jugadorDto3 = new JugadorDto();
        jugadorDto3.setNombre("Jorge");
        jugadorDto3.setApellido("Carrascal");
        jugadorDto3.setDni(4);
        jugadorDto3.setTelefono(87);
        jugadorDto3.setEmail("jorge@email.com");
        jugadorDto3.setFechaDebut(LocalDate.of(2001,10,21));
        jugadorDto3.setFechaNacimiento(LocalDate.of(1984,02,05));
        jugadorDto3.setCantidadPartidos(201);
        jugadorDto3.setCantidadGoles(58);
        jugadorDto3.setPeso(68.8f);
        jugadorDto3.setAltura(1.56f);

        JugadorDto jugadorDto4 = new JugadorDto();
        jugadorDto4.setNombre("Ignacio");
        jugadorDto4.setApellido("Fernandez");
        jugadorDto4.setDni(5);
        jugadorDto4.setTelefono(78);
        jugadorDto4.setEmail("ignacio@email.com");
        jugadorDto4.setFechaDebut(LocalDate.of(2001,10,21));
        jugadorDto4.setFechaNacimiento(LocalDate.of(1984,02,05));
        jugadorDto4.setCantidadPartidos(201);
        jugadorDto4.setCantidadGoles(58);
        jugadorDto4.setPeso(68.8f);
        jugadorDto4.setAltura(1.56f);

        JugadorDto jugadorDto5 = new JugadorDto();
        jugadorDto5.setNombre("Leonardo");
        jugadorDto5.setApellido("Ponzio");
        jugadorDto5.setDni(6);
        jugadorDto5.setTelefono(87);
        jugadorDto5.setEmail("leonard@email.com");
        jugadorDto5.setFechaDebut(LocalDate.of(2001,10,21));
        jugadorDto5.setFechaNacimiento(LocalDate.of(1984,02,05));
        jugadorDto5.setCantidadPartidos(201);
        jugadorDto5.setCantidadGoles(58);
        jugadorDto5.setPeso(68.8f);
        jugadorDto5.setAltura(1.56f);

        JugadorDto jugadorDto6 = new JugadorDto();
        jugadorDto6.setNombre("Federico");
        jugadorDto6.setApellido("Gattoni");
        jugadorDto6.setDni(7);
        jugadorDto6.setTelefono(78);
        jugadorDto6.setEmail("federico@email.com");
        jugadorDto6.setFechaDebut(LocalDate.of(2001,10,21));
        jugadorDto6.setFechaNacimiento(LocalDate.of(1984,02,05));
        jugadorDto6.setCantidadPartidos(201);
        jugadorDto6.setCantidadGoles(58);
        jugadorDto6.setPeso(68.8f);
        jugadorDto6.setAltura(1.56f);

        JugadorDto jugadorDto7 = new JugadorDto();
        jugadorDto7.setNombre("Angel");
        jugadorDto7.setApellido("Romero");
        jugadorDto7.setDni(8);
        jugadorDto7.setTelefono(78);
        jugadorDto7.setEmail("angel@email.com");
        jugadorDto7.setFechaDebut(LocalDate.of(2001,10,21));
        jugadorDto7.setFechaNacimiento(LocalDate.of(1984,02,05));
        jugadorDto7.setCantidadPartidos(201);
        jugadorDto7.setCantidadGoles(58);
        jugadorDto7.setPeso(68.8f);
        jugadorDto7.setAltura(1.56f);

        JugadorDto jugadorDto8 = new JugadorDto();
        jugadorDto8.setNombre("Franco");
        jugadorDto8.setApellido("Santo");
        jugadorDto8.setDni(9);
        jugadorDto8.setTelefono(78);
        jugadorDto8.setEmail("franco@email.com");
        jugadorDto8.setFechaDebut(LocalDate.of(2001,10,21));
        jugadorDto8.setFechaNacimiento(LocalDate.of(1984,02,05));
        jugadorDto8.setCantidadPartidos(201);
        jugadorDto8.setCantidadGoles(58);
        jugadorDto8.setPeso(68.8f);
        jugadorDto8.setAltura(1.56f);

        //***************************INSERTAR JUGADORESDTO*************************************//
        JugadorServicio jugadorServicio = new JugadorServicioImpl();

        //jugadorServicio.insert(jugadorDto0);
        //jugadorServicio.insertJugadorConDireccion(jugadorDto0, direccionDto0);



        //********************************************CREAR HISTORIALESDTO JUGADORES SIN FECHA FIN***************************************************//

        HistorialJugadorDto historialDto0 = new HistorialJugadorDto();
        historialDto0.setFechaInicioContrato(LocalDate.of(2020,04,30));
        historialDto0.setPosicion("defensor");
        historialDto0.setCuitEquipo(equipoDto0.getCuit());
        historialDto0.setDniJugador(jugadorDto0.getDni());


        HistorialJugadorDto historialDto1 = new HistorialJugadorDto();
        historialDto1.setFechaInicioContrato(LocalDate.of(2020,04,30));
        historialDto1.setPosicion("portero");
        historialDto1.setCuitEquipo(equipoDto0.getCuit());
        historialDto1.setDniJugador(jugadorDto1.getDni());


        HistorialJugadorDto historialDto2 = new HistorialJugadorDto();
        historialDto2.setFechaInicioContrato(LocalDate.of(2020,04,30));
        historialDto2.setPosicion("mediocentro");
        historialDto2.setCuitEquipo(equipoDto1.getCuit());
        historialDto2.setDniJugador(jugadorDto2.getDni());


        HistorialJugadorDto historialDto3 = new HistorialJugadorDto();
        historialDto3.setFechaInicioContrato(LocalDate.of(2020,04,30));
        historialDto3.setPosicion("delantero");
        historialDto3.setCuitEquipo(equipoDto1.getCuit());
        historialDto3.setDniJugador(jugadorDto3.getDni());


        HistorialJugadorDto historialDto4 = new HistorialJugadorDto();
        historialDto4.setFechaInicioContrato(LocalDate.of(2020,04,30));
        historialDto4.setPosicion("portero");
        historialDto4.setCuitEquipo(equipoDto1.getCuit());
        historialDto4.setDniJugador(jugadorDto4.getDni());


        HistorialJugadorDto historialDto5 = new HistorialJugadorDto();
        historialDto5.setFechaInicioContrato(LocalDate.of(2020,04,30));
        historialDto5.setPosicion("mediocentro");
        historialDto5.setCuitEquipo(equipoDto1.getCuit());
        historialDto5.setDniJugador(jugadorDto5.getDni());


        HistorialJugadorDto historialDto6 = new HistorialJugadorDto();
        historialDto6.setFechaInicioContrato(LocalDate.of(2020,04,30));
        historialDto6.setPosicion("defensor");
        historialDto6.setCuitEquipo(equipoDto2.getCuit());
        historialDto6.setDniJugador(jugadorDto6.getDni());


        HistorialJugadorDto historialDto7 = new HistorialJugadorDto();
        historialDto7.setFechaInicioContrato(LocalDate.of(2020,04,30));
        historialDto7.setPosicion("delantero");
        historialDto7.setCuitEquipo(equipoDto2.getCuit());
        historialDto7.setDniJugador(jugadorDto7.getDni());


        HistorialJugadorDto historialDto8 = new HistorialJugadorDto();
        historialDto8.setFechaInicioContrato(LocalDate.of(2020,04,30));
        historialDto8.setPosicion("defensor");
        historialDto8.setCuitEquipo(equipoDto2.getCuit());
        historialDto8.setDniJugador(jugadorDto8.getDni());


        //********************************************INSERTAR HISTORIALESDTO JUGADORES***************************************************//
        HistorialJugadorServicio hJugadorServicio = new HistorialJugadorServicioImpl();

        //hJugadorServicio.insert(historialDto0);
        //hJugadorServicio.insert(historialDto1);
        //hJugadorServicio.insert(historialDto2);
        //hJugadorServicio.insert(historialDto3);
        //hJugadorServicio.insert(historialDto4);
        //hJugadorServicio.insert(historialDto5);
        //hJugadorServicio.insert(historialDto6);
        //hJugadorServicio.insert(historialDto7);
        //hJugadorServicio.insert(historialDto8);


        //********************************************CREAR HISTORIALESDTO CON FECHA FIN PARA AGREGARLOS A LISTAS***************************************************//

        HistorialJugadorDto historialDto9 = new HistorialJugadorDto();
        historialDto9.setFechaInicioContrato(LocalDate.of(2003,04,30));
        historialDto9.setFechaFinContrato(LocalDate.of(2004,04,30));
        historialDto9.setPosicion("defensor");
        historialDto9.setCuitEquipo(equipoDto2.getCuit());
        historialDto9.setDniJugador(jugadorDto0.getDni());


        HistorialJugadorDto historialDto10 = new HistorialJugadorDto();
        historialDto10.setFechaInicioContrato(LocalDate.of(2004,04,30));
        historialDto10.setFechaFinContrato(LocalDate.of(2005,04,30));
        historialDto10.setPosicion("delantero");
        historialDto10.setCuitEquipo(equipoDto0.getCuit());
        historialDto10.setDniJugador(jugadorDto0.getDni());


        HistorialJugadorDto historialDto11 = new HistorialJugadorDto();
        historialDto11.setFechaInicioContrato(LocalDate.of(2012,04,30));
        historialDto11.setFechaFinContrato(LocalDate.of(2015,04,30));
        historialDto11.setPosicion("defensor");
        historialDto11.setCuitEquipo(equipoDto0.getCuit());
        historialDto11.setDniJugador(jugadorDto0.getDni());


        HistorialJugadorDto historialDto12 = new HistorialJugadorDto();
        historialDto12.setFechaInicioContrato(LocalDate.of(2001,04,30));
        historialDto12.setFechaFinContrato(LocalDate.of(2003,04,30));
        historialDto12.setPosicion("defensor");
        historialDto12.setCuitEquipo(equipoDto0.getCuit());
        historialDto12.setDniJugador(jugadorDto8.getDni());


        HistorialJugadorDto historialDto13 = new HistorialJugadorDto();
        historialDto13.setFechaInicioContrato(LocalDate.of(2009,04,30));
        historialDto13.setFechaFinContrato(LocalDate.of(2010,04,30));
        historialDto13.setPosicion("portero");
        historialDto13.setCuitEquipo(equipoDto1.getCuit());
        historialDto13.setDniJugador(jugadorDto8.getDni());


        HistorialJugadorDto historialDto14 = new HistorialJugadorDto();
        historialDto14.setFechaInicioContrato(LocalDate.of(2015,04,30));
        historialDto14.setFechaFinContrato(LocalDate.of(2017,04,30));
        historialDto14.setPosicion("delantero");
        historialDto14.setCuitEquipo(equipoDto1.getCuit());
        historialDto14.setDniJugador(jugadorDto8.getDni());

        List<HistorialJugadorDto> lista0 = new ArrayList<>();

        List<HistorialJugadorDto> lista1 = new ArrayList<>();

        //********************************************CREAR LISTAS DE HISTORIALESDTO***************************************************//
        lista0.add(historialDto9);
        lista0.add(historialDto10);
        lista0.add(historialDto11);

        lista1.add(historialDto12);
        lista1.add(historialDto13);
        lista1.add(historialDto14);

        //********************************************INSERTAR LISTA DE HISTORIALESDTO***************************************************//
        //hJugadorServicio.insertListaHistoriales(lista0);
        //hJugadorServicio.insertListaHistoriales(lista1);



       //********************************************CANTIDAD DE JUGADORES POR EQUIPOS ORDENADOS ALFABETICAMENTE***************************************************//
        System.out.println("/*----CANTIDAD DE JUGADORES POR EQUIPOS ORDENADOS ALFABETICAMENTE----*/");
        equipoServicio.mostrarCantidadDeJugadoresActuales();

        //********************************************CANTIDAD DE DEFENSORES POR EQUIPOS ORDENADOS ALFABETICAMENTE***************************************************//
        System.out.println("/*----CANTIDAD DE DEFENSORES POR EQUIPOS ORDENADOS ALFABETICAMENTE----*/");
        equipoServicio.mostrarCantidadDeDefensoresActuales();

        //********************************************CANTIDAD DE JUGADORES POR EQUIPOS EN UNA FECHA ORDENADOS ALFABETICAMENTE***************************************************//
        System.out.println("/*----CANTIDAD DE JUGADORES POR EQUIPOS EN UNA FECHA ORDENADOS ALFABETICAMENTE----*/");
        LocalDate fechaEnUnEquipo = LocalDate.of(2020,05,30);
        equipoServicio.mostrarCantidadDeJugadoresEnUnaFecha(fechaEnUnEquipo);

        //********************************************READS***************************************************//
        System.out.println("/*----EQUIPOS EN BDD----*/");
        equipoServicio.read();

        System.out.println("/*----JUGADORES EN BDD----*/");
        jugadorServicio.read();

        System.out.println("/*----HISTORIALES EN BDD----*/");
        hJugadorServicio.read();


    }
}
