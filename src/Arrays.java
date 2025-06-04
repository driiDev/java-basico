public class Arrays {
    public static void main(String[] args) {

        System.out.println("-------------UNIDIMENSIONAL-----------------");

        String[] semana = new String[7]; // new = reservar espaço na memória

        semana[0] = "Domingo";
        semana[1] = "Segunda";
        semana[2] = "Terça";
        semana[3] = "Quarta";
        semana[4] = "Quinta";
        semana[5] = "Sexta";
        semana[6] = "Sábado";

        // loop for-each
       for (String dia : semana){ // dia = gaveta temporária
           System.out.println("dia = "+ dia);
       }
        System.out.println("Tamanho do array: " + semana.length);

       String[] nomes = new String[]{"Andrielle", "Fran", "Diva"};

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
       for (String nome : nomes){
           System.out.print(nome + " ");
       }
        System.out.println("\n-------------MULTIDIMENSIONAL-----------------");

        int [][] multi = {{1,2}, {3,4}};
        for (int i = 0; i < multi.length; i++){
            System.out.println(i);
        }
    }
}
