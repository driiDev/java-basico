package condicional;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int numero = tc.nextInt();
        String dia;

        switch (numero){
            case 1:
                dia = ("Domingo");
                break;
            case 2:
                dia = ("Segunda");
                break;
            case 3:
                dia = ("Terça");
                break;
            case 4:
                dia = ("Quarta");
                break;
            case 5:
                dia = ("Quinta");
                break;
            case 6:
                dia = ("Sexta");
                break;
            case 7:
                dia = ("Sábado");
                break;
            default:
                dia = ("Dia inválido!");
                break;

        }
        System.out.println("Dia da semana: " + dia);

        char sexo = 'F';
        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Não identificado");
        }
        int day = tc.nextInt();
        switch (day){
            case 1,7 -> System.out.println("Fim de Semana");
            case 2,3,4,5,6 -> System.out.println("Dia útil");

            default -> System.out.println("Dia não identificado");
        }
    }
}
