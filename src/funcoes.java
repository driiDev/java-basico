public class funcoes {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG     ";
        System.out.println("Original: " + original+ "-");

        String s01 = original.toUpperCase();
        System.out.println("Maiúsculas: " + s01 + "-");

        String s02 = original.toLowerCase();
        System.out.println("Minúsculas: " + s02+ "-");

        String s03 = original.trim();
        System.out.println("Sem espaço em branco: " + s03+ "-");

        System.out.println("Original: " + original+ "-");
        System.out.println(original.toUpperCase().trim());

        String s04 = original.substring(3);
        System.out.println(s04);

        String s05 = original.substring(1, 9);
        System.out.println(original);
        System.out.println(s05);

        String s06 = original.toLowerCase().replace('a', 'y');
        System.out.println(original);
        System.out.println(s06);

        String s07 = original.toLowerCase().replace("abc", "xyz");
        System.out.println(s07);

        int i = original.indexOf("bc");
        System.out.println("IndexOf 'bc': " + i);

        int j = original.lastIndexOf("bc");
        System.out.println("lasIndexOf 'bc': " + j);

        System.out.println("--------SPLIT----------");
        String s = "potato-apple-lemon-orange";
        String[] vect = s.split("-"); // declarando um vetor e utilizando 'espaço' como delimitador
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];
        String word4 = vect[3];

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.println(word4);
    }
}
