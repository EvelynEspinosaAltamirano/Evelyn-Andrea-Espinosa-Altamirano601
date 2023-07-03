/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones8;

/**
 *
 * @author Andrea
 */
public class Excepciones8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   
       
        try {
            
            Class.forName("ClassNoExistente");
        } catch (ClassNotFoundException e) {
            System.out.println("La clase ingresada no se encuentra");
        }
        
    }
    
}

