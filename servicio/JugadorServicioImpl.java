package ejercicio.servicio;

import ejercicio.dao.JugadorDao;
import ejercicio.dao.JugadorDaoImpl;
import ejercicio.dto.DireccionDto;
import ejercicio.dto.JugadorDto;
import ejercicio.model.Direccion;
import ejercicio.model.Jugador;

import java.time.LocalDate;

public class JugadorServicioImpl implements JugadorServicio{
    private JugadorDao jugadorDao = new JugadorDaoImpl();
    private DireccionServicio direccionServicio = new DireccionServicioImpl();

    @Override
    public void insert(JugadorDto jugadorDto) {
        Jugador jugador = this.convertirJugadorDtoAModel(jugadorDto);

        try {
            jugadorDao.insert(jugador);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void insertJugadorConDireccion(JugadorDto jugadorDto, DireccionDto direccionDto) {
        Jugador jugador = this.convertirJugadorDtoAModel(jugadorDto);
        Direccion direccion = direccionServicio.convertirDireccionDtoAModel(direccionDto);

        try {
            jugadorDao.insertJugadorConDireccion(jugador, direccion);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(JugadorDto jugadorDto, Integer dni) {
        Jugador jugador = this.convertirJugadorDtoAModel(jugadorDto);
        try {
            jugadorDao.update(jugador, dni);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void read() {
        try {
            jugadorDao.read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer dni) {
        try {
            jugadorDao.delete(dni);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Jugador convertirJugadorDtoAModel(JugadorDto jugadorDto) {

        String nombre = jugadorDto.getNombre();
        String apellido = jugadorDto.getApellido();
        Integer dni = jugadorDto.getDni();
        Integer telefono = jugadorDto.getTelefono();
        String email = jugadorDto.getEmail();
        LocalDate fechaDebut = jugadorDto.getFechaDebut();
        LocalDate fechaNacimiento = jugadorDto.getFechaNacimiento();
        Integer cantidadPartidos = jugadorDto.getCantidadPartidos();
        Integer cantidadGoles = jugadorDto.getCantidadGoles();
        Float peso = jugadorDto.getPeso();
        Float altura = jugadorDto.getAltura();

        Jugador jugador = new Jugador(nombre, apellido, dni, telefono, email, fechaDebut, fechaNacimiento,
                cantidadPartidos,cantidadGoles,peso,altura);

        return jugador;
    }

    @Override
    public JugadorDto convertirJugadorModelADTO(Jugador jugador) {

        JugadorDto jugadorDto = new JugadorDto();

        jugadorDto.setNombre(jugador.getNombre());
        jugadorDto.setApellido(jugador.getApellido());
        jugadorDto.setDni(jugador.getDni());
        jugadorDto.setTelefono(jugador.getTelefono());
        jugadorDto.setEmail(jugador.getEmail());
        jugadorDto.setFechaDebut(jugador.getFechaDebut());
        jugadorDto.setFechaNacimiento(jugador.getFechaNacimiento());
        jugadorDto.setCantidadPartidos(jugador.getCantidadPartidos());
        jugadorDto.setCantidadGoles(jugador.getCantidadGoles());
        jugadorDto.setPeso(jugador.getPeso());
        jugadorDto.setAltura(jugador.getAltura());

        return jugadorDto;
    }
}
