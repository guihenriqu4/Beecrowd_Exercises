package b1002_area_circle;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DecimalFormat numberFormat = new DecimalFormat("#.0000");
        double n = 3.14159;
        double R = sc.nextDouble();
        double A = n * Math.pow(R, 2);
        System.out.print("A=" + numberFormat.format(A) + "\n");
    }
}