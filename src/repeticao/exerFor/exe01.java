package repeticao.exerFor;

import java.util.Scanner;

public class exe01 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int x = tc.nextInt();

        for (int i = 1; i < x; i++){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        tc.close();
    }
}
