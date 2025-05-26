import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;

public class bhaskara {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        double a, b, c;

        a = tc.nextDouble();
        b = tc.nextDouble();
        c = tc.nextDouble();


        double delta = Math.pow(b, 2.0) - (4*a*c);
        double raiz = Math.sqrt(delta);

        double x1 = ((-b + raiz) / (2 * a));
        double x2 = ((-b - raiz) / (2 * a));

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

        tc.close();
    }
}
