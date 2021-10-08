
package Pensionato;

import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        Registration[] registration = new Registration[n];
        
        for(int i = 0; i < n; i++){
            System.out.println("\nRent #" + (i+1));
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            registration[i] = new Registration(name,email,room);
        }
        
        System.out.println("Busy rooms: ");
        
        for (int i = 0; i < registration.length; i++){
            System.out.println(registration[i]);
        }
        
    }
    
}
