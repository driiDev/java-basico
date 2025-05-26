package repeticao.exerFor;

import java.util.Scanner;

public class exe04 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int n = tc.nextInt();

        for (int i = 0; i < n; i++){
            double a = tc.nextInt();
            double b = tc.nextInt();

            if (b == 0){
                System.out.println("divisão impossível!");
            } else {
                double divisao = a / b;
                System.out.println(divisao);
            }
        }
        tc.close();
    }
}
