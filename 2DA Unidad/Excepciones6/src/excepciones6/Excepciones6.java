/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones6;

/**
 *
 * @author Andrea
 */
public class Excepciones6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            int element = numbers[5];
        
        System.out.println("El elemento es: " + element);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lo siento, ingresaste un indice superior al maximo en el arreglo.");
        }
        
    }
}
    