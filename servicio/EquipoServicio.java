package ejercicio.servicio;

import ejercicio.dto.DireccionDto;
import ejercicio.dto.EquipoDto;
import ejercicio.model.Direccion;
import ejercicio.model.Equipo;

import java.time.LocalDate;

public interface EquipoServicio {
    public void insert(EquipoDto equipoDto);
    public void insertEquipoConDireccion(EquipoDto equipoDto, DireccionDto direccionDto);
    public void update(EquipoDto equipoDto);
    public void read();
    public void delete(Integer cuit);

    public void mostrarCantidadDeJugadoresActuales();
    public void mostrarCantidadDeDefensoresActuales();

    public void mostrarCantidadDeJugadoresEnUnaFecha(LocalDate fecha);

    public Equipo convertirEquipoDtoAModel(EquipoDto equipoDto);
    public EquipoDto convertirEquipoModelADTO(Equipo equipo);
}
