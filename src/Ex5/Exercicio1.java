import java.util.Scanner;

public class Exercicio1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Digite um valor inteiro: ");
        num = sc.nextInt();
        
        for(int i = 0; i <= num; i++){
            if(i % 2 == 1){
                System.out.println(i);
            } 
        }
    }
    
}
