package b1014_consumption;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        double Y = sc.nextDouble();

        double avarage = X / Y;
        System.out.println(String.format("%.3f", avarage) + " km/l");
    }
}
