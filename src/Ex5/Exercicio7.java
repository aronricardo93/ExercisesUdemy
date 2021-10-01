
import java.util.Scanner;


public class Exercicio7 {


    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int num, quadrado = 0, cubo = 0;
        
        do{
            System.out.print("Digite um número positivo maior que zero: ");
            num = sc.nextInt();
        }while(num <= 0);
        
        for(int i = 1; i <= num; i++){
            quadrado = (int) Math.pow(i,2);
            cubo = (int) Math.pow(i, 3);
            System.out.printf("%d %d %d%n",i,quadrado,cubo);
        }
    }
}
