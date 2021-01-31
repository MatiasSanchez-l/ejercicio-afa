package ejercicio.dao;

import ejercicio.Direccion;

public interface DireccionDao {
    public Integer insert(Direccion direccion);
    public void update(Direccion direccion);
    public void read(Direccion direccion);
    public void delete(Direccion direccion);

    public Integer obtenerIdDireccion(Direccion direccion);
}
