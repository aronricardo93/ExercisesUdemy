
import java.util.Locale;
import java.util.Scanner;


public class Exercicio5 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[] peca1 = new double [3];
        double[] peca2 = new double[3];
        double total = 0;
        
        System.out.print("Digite o código da peça 1: ");
        peca1[0] = sc.nextDouble();
        System.out.print("Digite o número de peças: ");
        peca1[1] = sc.nextDouble();
        System.out.print("Digite o valor unitário de cada peça 1:");
        peca1[2] = sc.nextDouble();
        
        System.out.print("Digite o código da peça 2: ");
        peca2[0] = sc.nextDouble();
        System.out.print("Digite o número de peças: ");
        peca2[1] = sc.nextDouble();
        System.out.print("Digite o valor unitário de cada peça 2:");
        peca2[2] = sc.nextDouble();
        
        total = peca1[1] * peca1[2] + peca2[1] * peca2[2];
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
    
}
