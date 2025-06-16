package desafios;

import java.util.Scanner;

public class Resto2 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int n = tc.nextInt();

        if (n < 1000) {
            for (int i = 1; i < 1000; i++) {
                if (i % n == 2) {
                    System.out.println(i);
                }
            }
        }
        tc.close();
    }
}
