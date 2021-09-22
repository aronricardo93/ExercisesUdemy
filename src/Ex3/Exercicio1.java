import java.util.Scanner;

public class Exercicio1 {


    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int num;
        
        System.out.print("Digite um número: ");
        num = scan.nextInt();
        
        if(num >= 0){
            System.out.println("NÃO NEGATIVO");
        }else{
            System.out.println("NEGATIVO");
        }
    }
    
    
}
