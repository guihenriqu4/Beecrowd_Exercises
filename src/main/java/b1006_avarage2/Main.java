package b1006_avarage2;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double average = (A * 2 + B * 3 + C * 5)/10;
        DecimalFormat numberFormat = new DecimalFormat("0.0");
        System.out.println("MEDIA = " + numberFormat.format(average));
    }
}