package excepciones11;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Excepciones11 {

    public static void main(String[] args) throws IOException {

 BufferedReader reader = null;
        
        try {
            // Abrir el archivo para lectura
            reader = new BufferedReader(new FileReader("archivo.txt"));
            
            // Leer contenido del archivo
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        
        }

    }
    
}