package b1017_fuel_spent;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int spent_time = sc.nextInt();
        int avarage_speed = sc.nextInt();

        int distance = spent_time * avarage_speed;
        double liters_necessary = distance / 12.0;
        System.out.printf("%.3f%n", liters_necessary);
    }
}
