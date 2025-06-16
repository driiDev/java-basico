package membrosEstaticos;

import java.util.Scanner;
import membrosEstaticos.util.CurrentConverter;

public class Program2 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = tc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollars = tc.nextDouble();

        System.out.printf("Amount to be paid in reais: %.2f" , CurrentConverter.amount(dollarPrice, dollars));

    }
}
