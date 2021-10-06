package com.company;

public class Elbil extends Bil{

    double batterikapacitetKWh;
    int maxKm;
    double whPrKm;

    public Elbil(String regNr, String mærke, String model, int årgang, int antalDøre, double batterikapacitetKWh, int maxKm, double whPrKm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public double getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(double batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(double whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "Elbil{" +
                "regNr='" + regNr + '\'' +
                ", mærke='" + mærke + '\'' +
                ", model='" + model + '\'' +
                ", årgang=" + årgang +
                ", antalDøre=" + antalDøre +
                ", batterikapacitetKWh=" + batterikapacitetKWh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                '}';
    }

    @Override
    public double beregnGrønEjerafgift() {
        double number = whPrKm / 91.25;
        double kmPrL = 100 / number;
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
