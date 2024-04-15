package b1008_salary;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int wh = sc.nextInt();
        float amoutPerHour = sc.nextFloat();
        float salary = wh * amoutPerHour;
        System.out.println("NUMBER = " + number);
        System.out.println("SALARY = U$ " + String.format("%.2f", salary));
    }
}