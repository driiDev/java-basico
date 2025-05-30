import java.util.Scanner;

class Palindromo {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int x = tc.nextInt();

        boolean resultado = isPalindrome(x);
        System.out.println(resultado);

        tc.close();
    }
    public static boolean isPalindrome(int x){
        String xString = String.valueOf(x); // converter int p/ string
        System.out.println(xString);

        String textoInvertido = new StringBuilder(xString).reverse().toString(); // modifica sequencia de caracteres sem criar muitos objetos, sendo mais rapido e ocupando menos memoria
        System.out.println(textoInvertido);

        if (xString.equals(textoInvertido)){
            return true;
        } else {
            return false;
        }

    }
}