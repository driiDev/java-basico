package retangulo.application;

import retangulo.entities.Rectangle;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = tc.nextDouble();
        rectangle.height = tc.nextDouble();

        System.out.println(rectangle);

    }
}
