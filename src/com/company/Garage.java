package com.company;

import java.util.ArrayList;

public class Garage {
    String name;
    ArrayList<Bil> bilerIGaragen = new ArrayList<>();



    public void tilføjBilTilGare (Bil bil) {
        bilerIGaragen.add(bil);
    }

    @Override
    public String toString() {

        return "Biler i garagen: " + bilerIGaragen;
    }

    public double beregnGrønAfgiftForBilpark(){
        double fuldPris = 0;
        double prisPrBil;
        for (int i = 0; i < bilerIGaragen.size(); i++) {
            prisPrBil = bilerIGaragen.get(i).beregnGrønEjerafgift();
            fuldPris = prisPrBil + fuldPris;
        }
    return fuldPris;
    }
}


