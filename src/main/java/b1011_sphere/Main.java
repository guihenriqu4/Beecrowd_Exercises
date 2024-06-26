package b1011_sphere;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double R = sc.nextDouble();
        double volume = (4.0/3) * pi * Math.pow(R, 3);
        System.out.println("VOLUME = " + String.format("%.3f", volume));
    }
}