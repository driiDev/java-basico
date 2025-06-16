public class casting {

    public static void main(String[] args) {

        int a, b;
        double resultado;

        a = 5;
        b = 2;
        resultado = (double ) a / b;

        System.out.println(resultado);

        int idade  = 20;
        long numeroGrande = (int) 10000000000L;
        double salarioDouble = 2000;
        float salarioFloat = 2500.0F; //double precisa do f no final
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean vdd = true;
        boolean fake = false;
        char charactere = '\u0041';

        System.out.println("char: "+charactere);
        System.out.println("A idade é "+idade+" anos");
        System.out.println(vdd);
        System.out.println(salarioFloat);
        System.out.println(numeroGrande);


    }
}
