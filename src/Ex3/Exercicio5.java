
import java.util.Locale;
import java.util.Scanner;


public class Exercicio5 {


    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        byte codigo;
        int qtd;
        double total;
        
        System.out.println("Código| Especificação | Preço |");
        System.out.println("1     |Cachorro Quente|R$ 4,00|");
        System.out.println("2     |   X - Salada  |R$ 4,50|");
        System.out.println("3     |   X - Bacon   |R$ 5,00|");
        System.out.println("4     |Torrada Simples|R$ 2,00|");
        System.out.println("5     |  Refrigerante |R$ 1,50|");
        System.out.print("\nDigite o código do item: ");
        codigo = ler.nextByte();
        System.out.print("Digite a quantidade: ");
        qtd = ler.nextInt();
        
        if(codigo == 1){
            total = qtd * 4.00;
            System.out.printf("Total: R$ %.2f",total);
        }else if (codigo == 2) {
            total = qtd * 4.50;
            System.out.printf("Total: R$ %.2f",total);
        }else if (codigo == 3) {
            total = qtd * 5.00;
            System.out.printf("Total: R$ %.2f",total);
        }else if (codigo == 4) {
            total = qtd * 2.00;
            System.out.printf("Total: R$ %.2f",total);
        }else{
            total = qtd * 1.50;
            System.out.printf("Total: R$ %.2f",total);
        }
        
        ler.close();
    }
    
}
