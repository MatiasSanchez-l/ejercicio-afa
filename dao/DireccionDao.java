package ejercicio.dao;

import ejercicio.model.Direccion;

public interface DireccionDao {
    public Integer insert(Direccion direccion);
    public void update(Direccion direccion);
    public void read(Direccion direccion);
    public void delete(Integer id);

    public Integer obtenerIdDireccion(Direccion direccion);
}
