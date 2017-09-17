package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ch1 = scanner.nextInt();
        int min1 = scanner.nextInt();
        int sec1 = scanner.nextInt();
        int ch2 = scanner.nextInt();
        int min2 = scanner.nextInt();
        int sec2 = scanner.nextInt();

        sec1 = sec1 + min1*60 + ch1*3600;
        sec2 = sec2 + min2*60 + ch2*3600;

        int sec = sec2 - sec1;

        System.out.print(sec);

    }
}
