package ejercicio.servicio;

import ejercicio.dto.DireccionDto;
import ejercicio.model.Direccion;

public interface DireccionServicio {
    public Integer insert(DireccionDto direccionDto);
    public void update(DireccionDto direccionDto);
    public void read(DireccionDto direccionDto);
    public void delete(DireccionDto direccionDto);

    public Integer obtenerIdDireccion(DireccionDto direccionDto);

    public Direccion convertirDireccionDtoAModel(DireccionDto direccionDto);
    public DireccionDto convertirDireccionModelADto(Direccion direccion);
}
