import java.util.Scanner;

public class uri1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int horas = x / 3600;
        int minutos = (x % 3600) / 60;
        int segundos = x % 60;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);


    }
}
