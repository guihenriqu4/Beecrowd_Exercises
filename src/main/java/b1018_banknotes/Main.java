package b1018_banknotes;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();
        int aux = value;

        int notas100 = value / 100;
        value -= notas100 * 100;
        int notas50 = value / 50;
        value -= notas50 * 50;
        int notas20 = value / 20;
        value -= notas20 * 20;
        int notas10 = value / 10;
        value -= notas10 * 10;
        int notas5 = value / 5;
        value -= notas5 * 5;
        int notas2 = value / 2;
        value -= notas2 * 2;
        int notas1 = value;

        System.out.println(aux);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");
    }
}