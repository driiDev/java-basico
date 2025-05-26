public class funcoesMatematicas {

    public static void main(String[] args) {
        double x = 3;
        double y = 4;
        double z = -5;
        double a, b, c;

        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(25);
        System.out.println("Raiza quadrada de " + x + " = " + a);
        System.out.println("Raiza quadrada de " + y + " = " + b);
        System.out.println("Raiza quadrada de " + z + " = " + c);

        System.out.println();

        a = Math.pow(x, y);
        b = Math.pow(x,2);
        c = Math.pow(5, 2);
        System.out.println(x + " elevado a " + y + " = " + a);
        System.out.println(x + " elevado ao quadrado = " + b);
        System.out.println("5 elevado ao quadrado = " + c);

        System.out.println();

        a = Math.abs(y);
        b = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + a);
        System.out.println("Valor absoluto de " + z + " = " + b);

    }
}
