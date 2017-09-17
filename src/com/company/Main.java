package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long chislo = (1 + n) * n / 2;

        System.out.print(chislo);

    }
}
