package com.app.sockets.conexion;


//Esta línea importa las clases necesarias para trabajar con SQL y JDBC
import java.sql.*;

//Se define una clase llamada Conexion con la palabra clave public.
public class Conexion {

    //Definen constantes 
    private static final String URL = "jdbc:mysql://localhost:3307/chat";
    private static final String USER = "root";
    private static final String PASSWORD = "ymir";
    
    
    //este es la variable privada de conexion 
    private static Conexion instancia;
    
    //Este método se encarga de establecer y devolver una conexión a la base de 
    //datos utilizando las constantes definidas anteriormente.
    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    //Estos métodos se utilizan para cerrar diferentes elementos que se utilizan en las
    //operaciones de la base de datos. En este caso, se proporcionan métodos para cerrar un ResultSet, 
    //un PreparedStatement y una conexión (Connection). 
    //Cada método intenta cerrar el elemento correspondiente y atrapa cualquier excepción 
    public void cerrarResultado(ResultSet resultado) {
        try {
            resultado.close();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

    public void desconectar(Connection conexion) {
        try {
            conexion.close();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

    public void cerrarStatement(PreparedStatement statement) {
        try {
            statement.close();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }
    
    //y aqui me comprueba que solo la implementacion del patron singleton
    //que asegura de que solo exista una unica instancia de la clase
    public static Conexion getInstance(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
}