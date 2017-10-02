/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectheight ;
import java.util.Scanner; 

/**
 *
 * @author Jackson
 */
public class ObjectHeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  
        System.out.println("Enter time less than 4.5 seconds: ");
        double t = reader.nextFloat();
        double h = 100-4.9*t*2;
        
        System.out.println("The height of the object is " + h + " meters." );
    }
    
}
