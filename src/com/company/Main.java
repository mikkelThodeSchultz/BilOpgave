package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Garage garage = new Garage();



        Benzinbil bil1 = new Benzinbil("2510", "Toyota", "model1", 1995, 4, 999, 99.5);
        Dieselbil bil2 = new Dieselbil("9910", "Mercedes", "model2", 1888, 4, true, 88.5);
        Elbil bil3 = new Elbil("5550", "Samsung", "model3", 1366, 6, 930.5, 100, 100.5);

        garage.tilføjBilTilGare(bil1);
        garage.tilføjBilTilGare(bil2);
        garage.tilføjBilTilGare(bil3);

        System.out.println(garage);

        System.out.println("bil 1 Benzinbil " + bil1.beregnGrønEjerafgift() + " kr.");
        System.out.println("bil 2 Dieselbil " + bil2.beregnGrønEjerafgift() + " kr.");
        System.out.println("bil 3 Elbil " + bil3.beregnGrønEjerafgift() + " kr.");
        System.out.println("hele garagen " + garage.beregnGrønAfgiftForBilpark() + " kr.");


    }

}
