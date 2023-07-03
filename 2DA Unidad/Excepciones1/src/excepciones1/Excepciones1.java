
package excepciones1;

import javax.swing.JOptionPane;

public class Excepciones1 {

    public static void main(String[] args) {
        // TODO code application logic here
    
    int x=0;
    int y=0;
    
  
        try {
            
            x= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero 1", "Solicito datos",3));
    
            
            
        } catch (NumberFormatException n) {
            System.out.println(n.getMessage()+ " NO ES NUMERO ENTERO");
        }
    
   
    }
    
}
