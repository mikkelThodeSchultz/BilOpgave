package com.company;

public class Benzinbil extends Bil {

    int oktantal;
    double kmPrL;

    public Benzinbil(String regNr, String mærke, String model, int årgang, int antalDøre, int oktantal, double kmPrlL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktantal = oktantal;
        this.kmPrL = kmPrlL;
    }

    public int getOktantal() {
        return oktantal;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Benzinbil{" +
                "oktantal=" + oktantal +
                ", kmPrlL=" + kmPrL +
                ", regNr='" + regNr + '\'' +
                ", mærke='" + mærke + '\'' +
                ", model='" + model + '\'' +
                ", årgang=" + årgang +
                ", antalDøre=" + antalDøre +
                '}';
    }

    @Override
    public double beregnGrønEjerafgift() {
        double returVærdi = 0;
        if (kmPrL >  20 )
            returVærdi = 330;
        else if (kmPrL > 15)
            returVærdi = 1050;
        else if (kmPrL > 10)
            returVærdi = 2340;
        else if (kmPrL > 5)
            returVærdi  = 5500;
        else returVærdi = 10470;
        return returVærdi;
    }
}

