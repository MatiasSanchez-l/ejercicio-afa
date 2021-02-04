package ejercicio.servicio;

import ejercicio.dao.DireccionDao;
import ejercicio.dao.DireccionDaoImpl;
import ejercicio.dto.DireccionDto;
import ejercicio.model.Direccion;

public class DireccionServicioImpl implements DireccionServicio{
    DireccionDao direccionDao = new DireccionDaoImpl();

    @Override
    public Integer insert(DireccionDto direccionDto) {
        Direccion direccion = this.convertirDireccionDtoAModel(direccionDto);
        Integer resultado = 0;

        try {
            resultado = direccionDao.insert(direccion);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  resultado;
    }

    @Override
    public void update(DireccionDto direccionDto) {

    }

    @Override
    public void read(DireccionDto direccionDto) {

    }

    @Override
    public void delete(DireccionDto direccionDto) {
        Direccion direccion = this.convertirDireccionDtoAModel(direccionDto);
        Integer id = direccionDao.obtenerIdDireccion(direccion);

        direccionDao.delete(id);
    }

    @Override
    public Integer obtenerIdDireccion(DireccionDto direccionDto) {
        Direccion direccion = this.convertirDireccionDtoAModel(direccionDto);
        Integer resultado = 0;

        try {
            resultado = direccionDao.obtenerIdDireccion(direccion);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  resultado;
    }

    @Override
    public Direccion convertirDireccionDtoAModel(DireccionDto direccionDto) {
        String calle = direccionDto.getCalle();
        Integer numero = direccionDto.getNumero();
        String localidad = direccionDto.getLocalidad();
        String provincia = direccionDto.getProvincia();

        Direccion direccion = new Direccion(calle, numero, localidad, provincia);

        return direccion;

    }

    @Override
    public DireccionDto convertirDireccionModelADto(Direccion direccion) {

        String calle = direccion.getCalle();
        Integer numero = direccion.getNumero();
        String localidad = direccion.getLocalidad();
        String provincia = direccion.getProvincia();

        DireccionDto direccionDto = new DireccionDto();

        direccionDto.setCalle(calle);
        direccionDto.setNumero(numero);
        direccionDto.setLocalidad(localidad);
        direccionDto.setProvincia(provincia);

        return direccionDto;
    }
}
