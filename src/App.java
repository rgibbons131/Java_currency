import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // set currancy rates test
        Currency currency = new Currency();

        // create a terminal line reader
        Scanner lineReader = new Scanner(System.in);

        //prompt user for currency type
        System.out.println("From (choose usd, eur, mxn, or cad):");

        String fromCurrency = lineReader.nextLine();

        System.out.println("To (choose usd, eur, mxn, or cad):");

        String toCurrency = lineReader.nextLine();

        //prompt user for amount
        System.out.println("Amount:");
        float amount = lineReader.nextFloat();

        float total = currency.getRate(toCurrency) * amount / currency.getRate(fromCurrency);

        System.out.println("$"+total);
        lineReader.close();
    }
}
