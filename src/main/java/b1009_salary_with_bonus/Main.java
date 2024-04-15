package b1009_salary_with_bonus;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double sale = sc.nextDouble();
        double aux = sale * 0.15;
        double total = salary + aux;
        System.out.println("TOTAL = R$ " + String.format("%.2f", total));
    }
}