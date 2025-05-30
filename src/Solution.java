import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int n = tc.nextInt();
        int m = tc.nextInt();

        int resultado = differenceOfSums(n,m);

        mostrarResultado(resultado);
        tc.close();
    }
    public static int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        for(int i = 1; i <= n; i++){
            if(i % m != 0){
                num1 += i;
            } else{
                num2 += i;
            }
        }
        // System.out.println("Soma dos números não divisíveis: " + num1);
        // System.out.println("Soma dos números divisíveis: " + num2);

        return (num1 - num2);
    }

    public static void mostrarResultado(int valor){ // quando não retorna valor, é void
        System.out.println(valor);
    }

}