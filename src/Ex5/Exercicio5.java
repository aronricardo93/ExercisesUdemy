
import java.util.Scanner;


public class Exercicio5 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n, fat = 1;
        
        System.out.print("Digite um número: ");
        n = sc.nextInt();

	for (int i=1; i<=n; i++) {
            fat = fat * i;
	}
		
	System.out.println(fat);
    }
    
}
