package com.Maksim.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ange användarnamn: ");
        Scanner scan = new Scanner (System.in);
        String name = scan.nextLine();

        System.out.println("Player #1 " + name);

        System.out.println("Ange ett tal");
        Scanner scan1 = new Scanner(System.in);
        int tal1 = scan1.nextInt();

        System.out.println("Du angav talet: " + tal1);
        for (int i = 0; i < tal1; i++) {
            System.out.println("denna loop körs så många gånger: " + tal1 );
        }


        boolean iGång = (true);

        do {
            String a = scan.nextLine();
            System.out.println( a + " fortsätter köras.. skriv stop för att avsluta");

            if (a.equals("stop")) {
                iGång = false;
            }

        }while (iGång);

        /* while (!scan.hasNextInt()) {
            System.out.println("That's not a number!");
            scan.next();
        }*/




    }


}
