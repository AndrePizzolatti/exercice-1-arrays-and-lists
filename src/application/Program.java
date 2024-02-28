package application;

import entities.Rent;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        final int NUMBER_OF_ROOMS = 10;

        Scanner sc = new Scanner(System.in);

        Rent[] rent = new Rent[NUMBER_OF_ROOMS];

        System.out.print("How many rooms will be rented? ");
        int numberOfRoomsRented = sc.nextInt();
        sc.nextLine();
        System.out.println();

        for (int i=0; i<numberOfRoomsRented; i++) {

            System.out.println("Rent #" + (i + 1) + ": ");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();

            System.out.println();

            rent[room] = new Rent(name, email, room);

        }

        System.out.println("Busy rooms:");

        for (int i=0; i<NUMBER_OF_ROOMS; i++) {

            if (rent[i] != null) {
                System.out.println(rent[i]);
            }
        }
    }
}
