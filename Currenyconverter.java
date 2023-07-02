import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Currenyconverter {
    private Map<String, Double> exchangeRates;

    public Currenyconverter() {
        exchangeRates = new HashMap<>();
        // Set the exchange rates based on current values
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.73);
        exchangeRates.put("JPY", 110.37);
        exchangeRates.put("INR", 74.73);
    }

    public double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        double fromRate = exchangeRates.get(fromCurrency);
        double toRate = exchangeRates.get(toCurrency);
        return amount * (toRate / fromRate);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Currenyconverter converter = new Currenyconverter();

        System.out.println("Currency Converter");
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter from currency (e.g., USD): ");
        String fromCurrency = scanner.next().toUpperCase();
        System.out.print("Enter to currency (e.g., EUR): ");
        String toCurrency = scanner.next().toUpperCase();

        double convertedAmount = converter.convertCurrency(amount, fromCurrency, toCurrency);
        System.out.printf("%.2f %s is equal to %.2f %s.%n", amount, fromCurrency, convertedAmount, toCurrency);

        scanner.close();
    }
}
