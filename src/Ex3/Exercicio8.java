
import java.util.Locale;
import java.util.Scanner;


public class Exercicio8 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final double JUROS1 =  0.08;
        final double JUROS2 =  0.18;
        final double JUROS3 =  0.28;
        double salario;
        
        System.out.print("Digite o salário: R$ ");
        salario = sc.nextDouble();
        
        if(salario >= 0.00 && salario <= 2000.00){
            System.out.println("Isento");
        }else if (salario > 2000.00 && salario <= 3000.00) {
            salario -= 2000.00;
            salario *= JUROS1;
            System.out.printf("R$ %.2f%n",salario);
        }else if (salario > 3000.00 && salario <= 4500.00) {
            salario -= 3000.00;
            salario = salario * JUROS2 + 1000.00 * JUROS1;            
            System.out.printf("R$ %.2f%n",salario);
        }else{
            salario -= 4500;
            salario = salario * JUROS3 + (1000.00 * JUROS1) + (1500.00 * JUROS2);
            System.out.printf("R$ %.2f%n",salario);
        }
        sc.close();
    }  
}
