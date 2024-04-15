package b1005_avarage1;

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
        double average = (A * 3.5 + B * 7.5)/11;
        DecimalFormat numberFormat = new DecimalFormat("0.00000");
        System.out.println("MEDIA = " + numberFormat.format(average));
    }
}