package ejercicio.servicio;

import ejercicio.dto.HistorialJugadorDto;
import ejercicio.model.Direccion;
import ejercicio.model.HistorialJugador;

import java.util.List;

public interface HistorialJugadorServicio {
    public void insert(HistorialJugadorDto historialDto);
    public void insertListaHistoriales(List<HistorialJugadorDto> historialesDto);
    public void update(HistorialJugadorDto historialDto);
    public void read();
    public void delete(HistorialJugadorDto historialDto);

    public Integer obtenerIdHistorial(HistorialJugadorDto historialJugadorDto);
    public HistorialJugador convertirHistorialJugadorDtoAModel(HistorialJugadorDto historialDto);
    public HistorialJugadorDto convertirHistorialJugadorModelADto(HistorialJugador historial);
    public List<HistorialJugador> convertirListaHistorialJugadorDtoAModel(List<HistorialJugadorDto> historialesDto);

}
