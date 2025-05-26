package repeticao.exerFor;

import java.util.Scanner;

public class exe02 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int n = tc.nextInt(); // qtd de valores

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++){
            int x = tc.nextInt();
            if (x >= 10 && x <= 20){
                in += 1; // in = in (0) + 1 = 1 + 1 = 2
            } else {
                out += 1; // out = out + 1 = 1 + 1 = 2 + 1 = 3
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
