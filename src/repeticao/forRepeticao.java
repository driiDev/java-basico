package repeticao;

import java.util.Scanner;

public class forRepeticao {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        for (int i = 5; i > 0 ; i--){
            System.out.println("Valor de i: " + i);
        }
        /*
        int N = tc.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++){
            int x = tc.nextInt();
            soma += x;
        }
        System.out.println(soma);
     */

        tc.close();
    }
}
