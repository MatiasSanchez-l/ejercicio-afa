package ejercicio.servicio;

import ejercicio.dto.DireccionDto;
import ejercicio.dto.JugadorDto;
import ejercicio.model.Jugador;

public interface JugadorServicio {
    public void insert(JugadorDto jugadorDto);
    public void insertJugadorConDireccion(JugadorDto jugadorDto, DireccionDto direccionDto);
    public void update(JugadorDto jugadorDto, Integer dni);
    public void read();
    public void delete(Integer dni);

    public Jugador convertirJugadorDtoAModel(JugadorDto jugadorDto);
    public JugadorDto convertirJugadorModelADTO(Jugador jugador);
}
