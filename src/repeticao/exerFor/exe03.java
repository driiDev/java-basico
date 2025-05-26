package repeticao.exerFor;

import java.util.Scanner;

public class exe03 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int n = tc.nextInt(); // nº casos de teste

        for (int i = 0; i < n; i++){
            double a = tc.nextDouble();
            double b = tc.nextDouble();
            double c = tc.nextDouble();

            double media = ((a*2) + (b*3) + (c*5)) / 10.0;

            System.out.printf("%.1f", media);
        }
        tc.close();
    }
}
