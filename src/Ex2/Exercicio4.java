
import java.util.Locale;
import java.util.Scanner;


public class Exercicio4 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int number,hours;
        double value,salary;
        
        System.out.print("Digite o número do funcionário: ");
        number = sc.nextInt();
        System.out.print("Digite as horas trabalhadas: ");
        hours = sc.nextInt();
        System.out.print("Digite o valor/hora: ");
        value = sc.nextDouble();
        salary = value * hours;
        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n",number,salary);
    }
    
}
