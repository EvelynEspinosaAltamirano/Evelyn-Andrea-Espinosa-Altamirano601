/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones7;

/**
 *
 * @author Andrea
 */
public class Excepciones7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Object obj = "Hola mundo";
        
        try {
                   
        
        Integer num = (Integer) obj; 
        
        System.out.println("El número es: " + num);
            
        } catch (ClassCastException e) {
            System.out.println("La convercion de tipo de dato es incorrecta.");
        }
        
        
    }
    
}
    
    