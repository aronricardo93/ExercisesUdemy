
import java.util.Scanner;


public class Exercicio3 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a,b;
        
        System.out.print("Digite valor de A: ");
        a = sc.nextInt();
        System.out.print("Digite valor de B: ");
        b = sc.nextInt();
        
        if(a % b == 0 || b % a == 0){
            System.out.println("São Múltiplos!");
        }else{
            System.out.println("Não são Múltiplos!");
        }
        if(a == b){
            System.out.println("São Múltiplos!");
        }
    }
    
}
