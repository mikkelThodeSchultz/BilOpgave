package com.company;

public class Dieselbil extends Bil {

    boolean harPartikelfilter;
    double kmPrl;

    public Dieselbil(String regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelfilter, double kmPrl) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrl = kmPrl;
    }

    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public double getKmPrl() {
        return kmPrl;
    }

    public void setKmPrl(double kmPrl) {
        this.kmPrl = kmPrl;
    }

    @Override
    public String toString() {
        return "Dieselbil{" +
                "regNr='" + regNr + '\'' +
                ", mærke='" + mærke + '\'' +
                ", model='" + model + '\'' +
                ", årgang=" + årgang +
                ", antalDøre=" + antalDøre +
                ", harPartikelfilter=" + harPartikelfilter +
                ", kmPrl=" + kmPrl +
                '}';
    }


    @Override
    public double beregnGrønEjerafgift() {
        double returVærdi = 0;
        double udligninsafgift = 0;
        double partikelUdledningsAfgift = 0;

        if (kmPrl >  20 )
            udligninsafgift = 130;
        else if (kmPrl > 15)
            udligninsafgift = 1390;
        else if (kmPrl > 10)
            udligninsafgift = 1850;
        else if (kmPrl > 5)
            udligninsafgift  = 2770;
        else udligninsafgift = 15260;


        if (kmPrl >  20 )
            returVærdi = 330 + udligninsafgift;
        else if (kmPrl > 15)
            returVærdi = 1050 + udligninsafgift;
        else if (kmPrl > 10)
            returVærdi = 2340 + udligninsafgift;
        else if (kmPrl > 5)
            returVærdi  = 5500 + udligninsafgift;
        else returVærdi = 10470 + udligninsafgift;


        if (!harPartikelfilter) {
             partikelUdledningsAfgift = 1000;
        }

        returVærdi = returVærdi + partikelUdledningsAfgift;
        return returVærdi;
    }
}
