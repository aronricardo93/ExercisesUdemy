
package fixacao4;


public class CurrencyConverter {

    public static final double IOF = 0.06;
    
    public static double converter(double price, double quantity){
        double result = price * quantity;
        return result + (result * IOF);
    }
    
}
