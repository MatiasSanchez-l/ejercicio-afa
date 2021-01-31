package ejercicio.dao;

import ejercicio.Direccion;
import ejercicio.HistorialJugador;

import java.util.List;

public interface HistorialJugadorDao {
    public void insert(HistorialJugador historial);
    public void insertListaHistoriales(List<HistorialJugador> historiales);
    public void insertHistorialSinFechaFin(HistorialJugador historial);
    public void update(HistorialJugador historial);
    public void read();
    public void delete(HistorialJugador historial);
    public void insertHistorialConFechaFin(HistorialJugador historial);
}
