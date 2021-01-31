package ejercicio.dao;

import ejercicio.Direccion;
import ejercicio.Equipo;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.List;

public interface EquipoDao {
    public void insert(Equipo equipo);
    public void insertEquipoConDireccion(Equipo equipo, Direccion direccion);
    public void update(Equipo equipo);
    public void read();
    public void readEquipoPorNombre(String nombre);
    public void delete(Equipo equipo);

    public void mostrarCantidadDeJugadoresActuales();
    public void mostrarCantidadDeDefensoresActuales();

    public void mostrarCantidadDeJugadoresEnUnaFecha(LocalDate fecha);
}
