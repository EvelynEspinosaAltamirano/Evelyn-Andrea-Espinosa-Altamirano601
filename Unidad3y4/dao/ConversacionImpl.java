package com.app.sockets.dao;

import com.app.sockets.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//7.
public class ConversacionImpl implements ConversacionDAO {
//8.
    Conexion instanciaMysql = Conexion.getInstance();

    @Override
    public void registrarConversacionA(String mensaje) {
        PreparedStatement consulta = null;
        Connection conexion = null;

        try {
            conexion = instanciaMysql.conectar();
            consulta = conexion.prepareStatement("insert into conversaciones(conversacionA) values(?)");

            consulta.setString(1, mensaje);
            consulta.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        }

    }

    @Override
    public void registrarConversacionB(String mensaje) {
        PreparedStatement consulta = null;
        Connection conexion = null;

        try {
            conexion = instanciaMysql.conectar();
            consulta = conexion.prepareStatement("insert into conversaciones(conversacionB) values(?)");

            consulta.setString(1, mensaje);
            consulta.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

}
