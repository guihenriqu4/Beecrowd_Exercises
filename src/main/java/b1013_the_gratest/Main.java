package b1013_the_gratest;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int maiorAB = (A + B + Math.abs(A - B)) / 2;
        int includeC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

        System.out.println(includeC + " eh o maior");
    }
}
