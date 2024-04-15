package b1019_time_conversation;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int seconds = N % 60;
        int minutes = (N % 3600) / 60;
        int hours = N / 3600;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}