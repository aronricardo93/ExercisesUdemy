
package matriz;

import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite dois números inteiros: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int[][] matriz = new int[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("\nDigite um número para verificar se está contido na matriz: ");
        int num = sc.nextInt();
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(num == matriz[i][j]){
                    System.out.printf("\nPosição: %d,%d%n",i,j);
                    if(j - 1 >= 0){
                        System.out.print("Esquerda: " + matriz[i][j-1] + "\n");
                    }
                    if(j + 1 <= m){
                        System.out.print("Direita: " + matriz[i][j+1] + "\n");
                    }
                    if(i - 1 >= 0){
                        System.out.print("Acima: " + matriz[i-1][j] + "\n");
                    }
                    if(i + 1 <= n){
                        System.out.print("Embaixo: " + matriz[i+1][j] + "\n");
                    }
                }
            }
        }
        
    }
    
}
