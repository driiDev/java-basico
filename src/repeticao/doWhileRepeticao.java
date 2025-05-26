package repeticao;

import java.util.Scanner;

public class doWhileRepeticao {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        char resp;

        do {
            System.out.printf("Digite a temperatura em Celsius: ");
            double c = tc.nextDouble();
            double f = (9.0 * c) / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f\n", f);
            System.out.println("Deseja repetir (s/n)?");
            resp = tc.next().charAt(0);
        } while (resp != 'n');

        tc.close();
    }
}
