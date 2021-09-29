
import java.util.Scanner;


public class Exercicio2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n, x, in = 0, out = 0;
        
        System.out.print("Digite o número de repetições N: ");
        n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            x = sc.nextInt();
            if(x >= 10 && x >= 20){
                in++;
            }else{
                out++;
            }
        }
        sc.close();
        System.out.printf("in: %d%nout: %d%n", in, out);
    }
    
}
