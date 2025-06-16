package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int[] numeros = {1,2,3,4,5};
    /*
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    */
        // com esse não da pra acessar um indice específico
        for (int  num : numeros){
            System.out.println(num);
        }

        System.out.println("--------------------------");
        int[] idades = new int[3]; // precisa colocar a qtd na memoria
        idades[0] = tc.nextInt();
        idades[1] = tc.nextInt();
        idades[2] = tc.nextInt();

        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + ", ");
        }
    }
}
