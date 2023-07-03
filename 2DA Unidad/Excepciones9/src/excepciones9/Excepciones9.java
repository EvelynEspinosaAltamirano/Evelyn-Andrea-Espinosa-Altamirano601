package excepciones9;

public class Excepciones9 {

    public static void main(String[] args) {
        try {
            
            String str = null;
        
                int length = str.length(); 
        
        System.out.println("La longitud de la cadena es: " + length);
            
        } catch (NullPointerException e) {
            System.out.println("El valor que mandó a llamar es nulo");
        }
    


    }
    
}
    
    
