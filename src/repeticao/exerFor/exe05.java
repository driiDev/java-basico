package repeticao.exerFor;

import java.util.Scanner;

public class exe05 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int n = tc.nextInt(); // 3

        int fatorial = 1;

        for (int i = 1 ; i <= n; i++){
                fatorial *= i; //  (1 * 1 = 1) + (1 * 2 = 2) + ( 3 * 1 = 3) = 6
        }
        System.out.println(fatorial);

    }
}
