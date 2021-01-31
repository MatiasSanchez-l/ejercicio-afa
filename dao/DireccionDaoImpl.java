package ejercicio.dao;

import ejercicio.Direccion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DireccionDaoImpl implements  DireccionDao{
    private Conecxion conection = new Conecxion();

    /*static private String url= "jdbc:mysql://localhost:3306/afa";
    static private String usr = "root";
    static private String pwd = "";
    static private String driver = "com.mysql.cj.jdbc.Driver";

    private void elDriver(){
        try{
            Class.forName(driver);
        }catch (Exception e){
            e.printStackTrace();
        }
    }*/

    @Override
    public Integer insert(Direccion direccion) {
        Connection conneccion = null;
        Integer resultado=0;
        try{
            //elDriver();
            conneccion = conection.conection();//DriverManager.getConnection(url, usr, pwd);

            try (Statement instruccion = conneccion.createStatement()){
                String dirCalle = direccion.getCalle();
                Integer dirNro = direccion.getNumero();
                String dirLocalidad = direccion.getLocalidad();
                String dirProvincia = direccion.getProvincia();

                String sql = "INSERT INTO direccion(calle, nro, localidad, provincia) VALUES('"+dirCalle+"',"+dirNro+",'"
                        +dirLocalidad+"','"+dirProvincia+"');";
                instruccion.execute(sql);
                ResultSet resultSet = instruccion.executeQuery("SELECT LAST_INSERT_ID();");
                resultSet.next();
                resultado = resultSet.getInt(1);

            }catch (Exception e){
                e.printStackTrace();
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        if(conneccion != null){
            try{
                conneccion.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return resultado;
    }

    @Override
    public void update(Direccion direccion) {

    }

    @Override
    public void read(Direccion direccion) {

    }

    @Override
    public void delete(Direccion direccion) {

    }

    @Override
    public Integer obtenerIdDireccion(Direccion direccion) {
        Connection conneccion = null;
        Integer resultado=0;
        try{
            //elDriver();
            conneccion = conection.conection();//DriverManager.getConnection(url, usr, pwd);

            try (Statement instruccion = conneccion.createStatement()){
                String dirCalle = direccion.getCalle();
                Integer dirNro = direccion.getNumero();
                String dirLocalidad = direccion.getLocalidad();
                String dirProvincia = direccion.getProvincia();

                String sql = "SELECT id_direccion FROM direccion WHERE calle LIKE '"+dirCalle+"' AND nro LIKE "+dirNro+" " +
                        " AND localidad LIKE '"+dirLocalidad+"'AND provincia LIKE '"+dirProvincia+"'";
                ResultSet resultSet = instruccion.executeQuery(sql);
                if(resultSet.next()){
                    resultado = resultSet.getInt("id_direccion");
                }else{
                    resultado = this.insert(direccion);
                }

            }catch (Exception e){
                e.printStackTrace();
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        if(conneccion != null){
            try{
                conneccion.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return resultado;
    }
}
