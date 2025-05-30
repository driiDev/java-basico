package triangulo.application;

import triangulo.entities.Triangle;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    Scanner tc = new Scanner(System.in);

    Triangle x,y;
    x = new Triangle();
    y = new Triangle();

    System.out.println("Enter the measures of triangle X: ");
    x.a = tc.nextDouble();
    x.b = tc.nextDouble();
    x.c = tc.nextDouble();

    System.out.println("Enter the measures of triangle Y: ");
    y.a = tc.nextDouble();
    y.b = tc.nextDouble();
    y.c = tc.nextDouble();

    double areaX = x.area();
    double areaY = y.area();

    System.out.printf("Triangle X area: %.4f\n", areaX);
    System.out.printf("Triangle Y area: %.4f\n", areaY);

    if (areaX > areaY){
        System.out.println("Larger area: X");
    } else {
        System.out.println("Larger area: Y");

         }
    }
}
