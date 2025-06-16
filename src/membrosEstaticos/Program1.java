package membrosEstaticos;

import membrosEstaticos.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = tc.nextDouble();

        double c = Calculator.circumference(radius); //inves de criar um objeto, chama a própria classe
        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI value: %.2f\n", Calculator.PI);


        tc.close();
    }


}
