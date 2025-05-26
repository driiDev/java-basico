package repeticao;

import java.util.Scanner;

public class whileRepeticao {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int numero = tc.nextInt();
        int soma = 0;

        while (numero != 0){
            soma += numero;
            numero = tc.nextInt();
        }
        System.out.println("Soma: " + soma);

        tc.close();
    }
}
