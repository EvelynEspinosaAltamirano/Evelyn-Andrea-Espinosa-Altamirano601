package excepciones10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Excepciones10 {

    public static void main(String[] args) {

BufferedReader reader = null;
        
        try {
            
            reader = new BufferedReader(new FileReader("archivo.txt"));
            
           
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error en la entrada o  puede ser la salida");
        } 



    }
    
}