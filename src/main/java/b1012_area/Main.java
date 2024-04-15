package b1012_area;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double area_rectangled_triangle = A * C / 2;
        double area_radius_circle = pi * Math.pow(C, 2);
        double area_trapezium = (A + B) * C / 2;
        double area_square = Math.pow(B, 2);
        double area_rectangle = A * B;

        System.out.println("TRIANGULO: " + String.format("%.3f", area_rectangled_triangle));
        System.out.println("CIRCULO: " + String.format("%.3f", area_radius_circle));
        System.out.println("TRAPEZIO: " + String.format("%.3f", area_trapezium));
        System.out.println("QUADRADO: " + String.format("%.3f", area_square));
        System.out.println("RETANGULO: " + String.format("%.3f", area_rectangle));
    }
}
