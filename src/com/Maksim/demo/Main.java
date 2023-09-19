package com.Maksim.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ange användarnamn: ");
        Scanner scan = new Scanner (System.in);
        String name = scan.next();

        System.out.println("Player #1 " + name);

        /*while (!scan.hasNextInt()) {
            System.out.println("That's not a number!");
            scan.next();
        }*/




    }


}
