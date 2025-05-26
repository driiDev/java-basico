package condicional;

import java.util.Arrays;
import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.println("Digite um horario (entre 0h e 23h)");
        int horario = tc.nextInt();

        if (horario >= 6 && horario < 12) {
            System.out.println("Bom dia");
        }
        else if( horario >= 12 && horario < 18){
            System.out.println("Boa tarde");

        }
        else{
            System.out.println("Boa noite");
            }
        }


    }