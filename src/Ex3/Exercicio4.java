
import java.util.Scanner;


public class Exercicio4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int horaInicial, horaFinal,calc=0;
        
        System.out.print("Digite a Hora Inicial: ");
        horaInicial = sc.nextInt();
        System.out.print("Digite a Hora Final: ");
        horaFinal = sc.nextInt();
        
        if(horaFinal > horaInicial){
            calc = horaFinal - horaInicial;
        }else if(horaInicial == horaFinal){
            calc = 24;
        }else{
            calc = (24 - horaInicial) + horaFinal;
        }
        System.out.println("O JOGO DUROU " + calc + " HORAS(S)");
    }
    
}
