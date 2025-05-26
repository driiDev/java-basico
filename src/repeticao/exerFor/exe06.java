package repeticao.exerFor;

import java.util.Scanner;

public class exe06 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int n = tc.nextInt();

        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                System.out.println(i);
            }

        }
    }
}
