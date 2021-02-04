package ejercicio.servicio;

import ejercicio.dao.HistorialJugadorDao;
import ejercicio.dao.HistorialJugadorImpl;
import ejercicio.dto.DireccionDto;
import ejercicio.dto.HistorialJugadorDto;
import ejercicio.model.Direccion;
import ejercicio.model.HistorialJugador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HistorialJugadorServicioImpl implements HistorialJugadorServicio{
    HistorialJugadorDao historialJugadorDao = new HistorialJugadorImpl();

    @Override
    public void insert(HistorialJugadorDto historialDto) {
        HistorialJugador historialJugador = this.convertirHistorialJugadorDtoAModel(historialDto);

        try {
            historialJugadorDao.insert(historialJugador);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void insertListaHistoriales(List<HistorialJugadorDto> historialesDto) {
        List<HistorialJugador> historialesJugador = this.convertirListaHistorialJugadorDtoAModel(historialesDto);

        try {
            historialJugadorDao.insertListaHistoriales(historialesJugador);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Override
    public void update(HistorialJugadorDto historialDto) {
        HistorialJugador historialJugador = this.convertirHistorialJugadorDtoAModel(historialDto);

        try {
            historialJugadorDao.update(historialJugador);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void read() {
        try {
            historialJugadorDao.read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(HistorialJugadorDto historialDto) {
        Integer id = obtenerIdHistorial(historialDto);
        try {
            historialJugadorDao.delete(id);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Integer obtenerIdHistorial(HistorialJugadorDto historialJugadorDto) {
        HistorialJugador historialJugador = this.convertirHistorialJugadorDtoAModel(historialJugadorDto);
        Integer id = 0;
        try {
           id = historialJugadorDao.obtenerIdHistorial(historialJugador);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  id;
    }


    @Override
    public HistorialJugador convertirHistorialJugadorDtoAModel(HistorialJugadorDto historialDto) {
        LocalDate fechaInicioContrato = historialDto.getFechaInicioContrato();
        LocalDate fechaFinContrato = historialDto.getFechaFinContrato();
        String posicion = historialDto.getPosicion();
        Integer cuitEquipo = historialDto.getCuitEquipo();
        Integer dniJugador = historialDto.getDniJugador();
        HistorialJugador historialJugador = new HistorialJugador(fechaInicioContrato, posicion, cuitEquipo,dniJugador);

        if(fechaFinContrato != null){
            historialJugador.setFechaFinContrato(fechaFinContrato);
        }

        return historialJugador;
    }

    @Override
    public HistorialJugadorDto convertirHistorialJugadorModelADto(HistorialJugador historial) {

        HistorialJugadorDto historialJugadorDto = new HistorialJugadorDto();
        historialJugadorDto.setFechaInicioContrato(historial.getFechaInicioContrato());
        historialJugadorDto.setPosicion(historial.getPosicion());
        historialJugadorDto.setCuitEquipo(historial.getCuitEquipo());
        historialJugadorDto.setDniJugador(historial.getDniJugador());

        if(historial.getFechaFinContrato() != null){
            historialJugadorDto.setFechaFinContrato(historial.getFechaFinContrato());
        }

        return historialJugadorDto;
    }

    @Override
    public List<HistorialJugador> convertirListaHistorialJugadorDtoAModel(List<HistorialJugadorDto> historialesJugadorDto) {
        List<HistorialJugador> historialesJugador = new ArrayList<>();

        for (HistorialJugadorDto historialDto: historialesJugadorDto) {

            LocalDate fechaInicioContrato = historialDto.getFechaInicioContrato();
            LocalDate fechaFinContrato = historialDto.getFechaFinContrato();
            String posicion = historialDto.getPosicion();
            Integer cuitEquipo = historialDto.getCuitEquipo();
            Integer dniJugador = historialDto.getDniJugador();
            HistorialJugador historialJugador = new HistorialJugador(fechaInicioContrato, posicion, cuitEquipo,dniJugador);

            if(fechaFinContrato != null){
                historialJugador.setFechaFinContrato(fechaFinContrato);
            }

            historialesJugador.add(historialJugador);
        }

        return historialesJugador;
    }
}
