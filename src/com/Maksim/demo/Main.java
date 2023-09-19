package com.Maksim.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("insert number");
        Scanner scan = new Scanner (System.in);

        while (!scan.hasNextInt()) {
            System.out.println("That's not a number!");
            scan.next();
        }




    }


}
