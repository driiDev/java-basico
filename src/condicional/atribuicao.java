package condicional;

import java.util.Scanner;

public class atribuicao {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int minutos = tc.nextInt();

        double conta = 50;

        if (minutos > 100){
            conta += (minutos - 100) * 2;
            // conta = conta (50) + (103 - 100) * 2 = 56
            System.out.printf("Valor a pagar: R$ %.2f", conta);
        } else {
            System.out.printf("Valor a pagar: R$ %.2f", conta);
        }

        tc.close();
    }
}
