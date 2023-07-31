package com.app.sockets.chat;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;


//Se define una clase llamada Servidor, que extiende la clase Observable e implementa la interfaz 
//Runnable. La herencia de Observable
//es para que el servidor pueda notificar a sus observadores sobre eventos importantes.
public class Servidor extends Observable implements Runnable {

    
    //Se declara un atributo privado llamado puerto, que almacenará 
    //el número de puerto en el que el servidor escuchará las conexiones de los clientes.
    private int puerto;

    //4.
    public Servidor(int puerto) {
        this.puerto = puerto;
    }
    //5.
    @Override
    public void run() {
        ServerSocket servidor = null;
        Socket socket = null;
        DataInputStream entrada;

        try {
            //Creamos el servidor del socket
            servidor = new ServerSocket(puerto);
            System.out.println("Servidor iniciado");

            //Siempre estara escuchando peticiones
            while (true) {
                //Espero que el cliente se contecte
                socket = servidor.accept();
                System.out.println("Cliente conectado");
                entrada = new DataInputStream(socket.getInputStream());

                //Leemos el mensaje
                String mensaje = entrada.readUTF();
                System.out.println(mensaje);

                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();

                socket.close();
                System.out.println("Cliente desconectado");
            }
        } catch (IOException error) {
            System.out.println(error);
        }
    }

}
