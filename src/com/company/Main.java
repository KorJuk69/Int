package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int gradus = scanner.nextInt();

        int hours = gradus/30;
        int minutes = (gradus - hours*30)*2;

        System.out.print("It is " + hours + " hours " + minutes + " minutes.");

    }
}
