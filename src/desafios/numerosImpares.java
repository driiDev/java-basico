package desafios;

import java.util.Scanner;

public class numerosImpares {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int num = tc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
        tc.close();
    }
}
