package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sec = scanner.nextInt();

        int hours = sec/3600;
        int minutes = (sec - hours*3600)/60;

        System.out.print("It is " + hours + " hours " + minutes + " minutes");

    }
}
