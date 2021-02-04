package ejercicio.dao;

import ejercicio.model.Direccion;
import ejercicio.model.Jugador;

public interface JugadorDao {
    public void insert(Jugador jugador);
    public void insertJugadorConDireccion(Jugador jugador, Direccion direccion);
    public void update(Jugador jugador);
    public void read();
    public void delete(Integer dni);
}
