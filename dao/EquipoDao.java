package ejercicio.dao;

import ejercicio.model.Direccion;
import ejercicio.model.Equipo;

import java.time.LocalDate;

public interface EquipoDao {
    public void insert(Equipo equipo);
    public void insertEquipoConDireccion(Equipo equipo, Direccion direccion);
    public void update(Equipo equipo, Integer cuit);
    public void read();
    public void delete(Integer cuit);

    public void mostrarCantidadDeJugadoresActuales();
    public void mostrarCantidadDeDefensoresActuales();

    public void mostrarCantidadDeJugadoresEnUnaFecha(LocalDate fecha);
}
