package membrosEstaticos.util;

public class CurrentConverter {

    public static final double TAX = 0.06;

    public static double amount(double dollarPrice, double dollars){
        return (dollarPrice + (dollarPrice * TAX)) * dollars;
    }
}
