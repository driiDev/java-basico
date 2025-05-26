import java.util.Scanner;

public class primeiro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y, media;

        System.out.println("Digite o primeiro número: ");
        x = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        y = sc.nextDouble();

        media = (x + y) / 2;

        System.out.printf("A média de %f + %f é: %.2f\n",x,y, media);
        System.out.printf("A média é: %.2f\n", media);
        System.out.println("Olá mundo!");
        sc.close();
    }
}
