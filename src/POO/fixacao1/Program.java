
package exercicio.fixacao1;

import java.util.Locale;
import java.util.Scanner;


public class Program {


    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        
        System.out.println("Enter rectangle width and heigth: ");
        rectangle.width = scan.nextDouble();
        rectangle.heigth = scan.nextDouble();
        System.out.println(rectangle);
    }
    
}
