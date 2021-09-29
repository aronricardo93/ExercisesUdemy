
import java.util.Scanner;


public class Exercicio4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double n;
        
        System.out.print("Digite o número de repetições N: ");
        n = sc.nextDouble();
        
        for(int i = 1; i <= n; i++){
            System.out.print("Digite o numerador: ");
            double numerador = sc.nextDouble();
            System.out.print("Digite o denominador: ");
            double denominador = sc.nextDouble();
            
            if(denominador == 0){
                System.out.println("Divisão impossível");
            }else{
                System.out.println(numerador/denominador);
            }
        }
    }
    
}
