import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = scanner.nextDouble();

        scanner.close();
        
        // create custom locale
        Locale IN = new Locale.Builder().setLanguage("in").setRegion("IN").build();
        
        String us = formattedPayment(money, Locale.US);
        String india = formattedPayment(money, IN);
        String china = formattedPayment(money, Locale.CHINA);
        String france = formattedPayment(money, Locale.FRANCE);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

    public static String formattedPayment(double money, Locale locale) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        String moneyString = formatter.format(money);
        return moneyString;
    }
}
