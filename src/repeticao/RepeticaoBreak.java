package repeticao;

import java.util.Scanner;

public class RepeticaoBreak {
    public static void main(String[] args) {
        // imprimir primeiros 25 números de um dado valor. Por exemplo, 50

        int valorMaximo = 50;
        for (int i = 0; i <= valorMaximo; i++){
            if (i > 25){
                break; // precisa estar dentro de um switch ou loop
            }
            System.out.println(i);
        }
        // dado o valor de um carro, descubra quantas parcelas podem ser feitas
        // condição: valorParcela >= 1000

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela: " + parcela + " R$ " + valorParcela);
        }
    }
}
