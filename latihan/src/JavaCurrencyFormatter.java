import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat france = NumberFormat.getNumberInstance(Locale.FRANCE);


        System.out.println("US " + us.format(payment));
        System.out.println("CHINA " + china.format(payment));
        System.out.println("INDIA " + india.format(payment));
        System.out.println("FRANCE " + france.format(payment));
    }
}
