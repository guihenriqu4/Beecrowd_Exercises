package b1020_age_days_to_years;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int totalDays = sc.nextInt();
        int years = totalDays / 365;
        int months = (totalDays % 365) / 30;
        int days = totalDays % 30;
        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days + " dia(s)");
    }
}
