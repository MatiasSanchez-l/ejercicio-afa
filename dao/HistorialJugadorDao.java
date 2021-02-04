package ejercicio.dao;

import ejercicio.dto.HistorialJugadorDto;
import ejercicio.model.HistorialJugador;

import java.util.List;

public interface HistorialJugadorDao {
    public void insert(HistorialJugador historial);
    public void insertListaHistoriales(List<HistorialJugador> historiales);
    public void insertHistorialSinFechaFin(HistorialJugador historial);
    public void update(HistorialJugador historial);
    public void read();
    public void delete(Integer id);
    public Integer obtenerIdHistorial(HistorialJugador historialJugador);
    public void insertHistorialConFechaFin(HistorialJugador historial);
}
