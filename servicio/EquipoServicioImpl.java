package ejercicio.servicio;

import ejercicio.dao.EquipoDao;
import ejercicio.dao.EquipoDaoImpl;
import ejercicio.dto.DireccionDto;
import ejercicio.dto.EquipoDto;
import ejercicio.model.Direccion;
import ejercicio.model.Equipo;

import java.time.LocalDate;

public class EquipoServicioImpl implements EquipoServicio{
    private EquipoDao equipoDao = new EquipoDaoImpl();
    private DireccionServicio direccionServicio = new DireccionServicioImpl();

    @Override
    public void insert(EquipoDto equipoDto) {
        Equipo equipo = this.convertirEquipoDtoAModel(equipoDto);

        try {
            equipoDao.insert(equipo);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void insertEquipoConDireccion(EquipoDto equipoDto, DireccionDto direccionDto) {
        Equipo equipo = this.convertirEquipoDtoAModel(equipoDto);
        Direccion direccion = direccionServicio.convertirDireccionDtoAModel(direccionDto);

        try {
            equipoDao.insertEquipoConDireccion(equipo, direccion);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(EquipoDto equipoDto) {

    }

    @Override
    public void read() {
        try {
            equipoDao.read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer cuit) {
        try {
            equipoDao.delete(cuit);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void mostrarCantidadDeJugadoresActuales() {
        try {
            equipoDao.mostrarCantidadDeJugadoresActuales();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void mostrarCantidadDeDefensoresActuales() {
        try {
            equipoDao.mostrarCantidadDeDefensoresActuales();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void mostrarCantidadDeJugadoresEnUnaFecha(LocalDate fecha) {
        try {
            equipoDao.mostrarCantidadDeJugadoresEnUnaFecha(fecha);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Equipo convertirEquipoDtoAModel(EquipoDto equipoDto) {

        Equipo equipo = new Equipo();
        equipo.setCuit(equipoDto.getCuit());
        equipo.setNombre(equipoDto.getNombre());
        equipo.setFechaFundacion(equipoDto.getFechaFundacion());
        equipo.setPresidenteNombreApellido(equipoDto.getPresidenteNombreApellido());
        equipo.setTelefono(equipoDto.getTelefono());
        equipo.setEmail(equipoDto.getEmail());
        equipo.setFechaPrimeraDivision(equipoDto.getFechaPrimeraDivision());
        equipo.setCategoria(equipoDto.getCategoria());

        return equipo;
    }

    @Override
    public EquipoDto convertirEquipoModelADTO(Equipo equipo) {

        EquipoDto equipoDto = new EquipoDto();
        equipoDto.setCuit(equipo.getCuit());
        equipoDto.setNombre(equipo.getNombre());
        equipoDto.setFechaFundacion(equipo.getFechaFundacion());
        equipoDto.setPresidenteNombreApellido(equipo.getPresidenteNombreApellido());
        equipoDto.setTelefono(equipo.getTelefono());
        equipoDto.setEmail(equipo.getEmail());
        equipoDto.setFechaPrimeraDivision(equipo.getFechaPrimeraDivision());
        equipoDto.setCategoria(equipo.getCategoria());

        return equipoDto;
    }
}
