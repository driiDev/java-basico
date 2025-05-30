import java.util.Scanner;

public class funcoes2 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.println("Entre com três números: ");
        int a = tc.nextInt();
        int b = tc.nextInt();
        int c = tc.nextInt();

        int maior = max(a,b,c);

        mostrarResultado(maior);
        /* jeito complicado

        */
        tc.close();
    }

    public static int max(int x, int y, int z){
        int aux;
        if (x > y && x > z){
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void mostrarResultado(int valor){ // quando não retorna valor, é void
        System.out.println("Maior = " + valor);
    }
}
