package repeticao;

public class Repeticaocontinue {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;

            if (valorParcela < 1000){
                continue; // vai procurando até a parcela ser maior que mil
            }
            System.out.println("Parcela: " + parcela + " R$ " + valorParcela);
        }
    }
}
