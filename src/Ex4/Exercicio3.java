
import java.util.Scanner;


public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int alcool = 0, gasolina = 0, diesel = 0, combustivel;
        
        System.out.println("Digite o combustível:\n1 - Alcool\n2 - Gasoline\n3 - Diesel");
        combustivel = sc.nextInt();
        
        while(combustivel != 4){
            switch(combustivel){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
            System.out.println("Digite o combustível:\n1 - Alcool\n2 - Gasoline\n3 - Diesel");
            combustivel = sc.nextInt();
        }
        
        System.out.println("MUITO OBRIGADO\nAlcool: " + alcool
        + "\nGasolina: " + gasolina + "\nDiesel: " + diesel);
        
        sc.close();
    }
    
}
