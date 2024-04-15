package b1010_simple_calculate;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int code1, units1, code2, units2;
        float price1, price2;
        code1 = sc.nextInt();;
        units1 = sc.nextInt();
        price1 = sc.nextFloat();
        code2 = sc.nextInt();
        units2 = sc.nextInt();
        price2 = sc.nextFloat();
        float total = price1 * units1 + price2 * units2;
        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", total));
    }
}