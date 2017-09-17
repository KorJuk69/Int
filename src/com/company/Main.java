package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int KolvoStrok = scanner.nextInt();
        int NomerStroki = scanner.nextInt();

        int NomerStr = (NomerStroki/KolvoStrok) + 1;
        int NomerStrokiNaStr = NomerStroki - (NomerStr-1)*KolvoStrok;

        System.out.print(NomerStr + " " + NomerStrokiNaStr);

    }
}
