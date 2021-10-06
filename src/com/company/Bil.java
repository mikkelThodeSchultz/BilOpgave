package com.company;

public abstract class Bil {
    String regNr;
    String mærke;
    String model;
    int årgang;
    int antalDøre;

    public Bil(String regNr, String mærke, String model, int årgang, int antalDøre) {
        this.regNr = regNr;
        this.mærke = mærke;
        this.model = model;
        this.årgang = årgang;
        this.antalDøre = antalDøre;
    }

    public String getRegNr() {
        return regNr;
    }

    public String getMærke() {
        return mærke;
    }

    public String getModel() {
        return model;
    }

    public int getÅrgang() {
        return årgang;
    }

    public int getAntalDøre() {
        return antalDøre;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setÅrgang(int årgang) {
        this.årgang = årgang;
    }

    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }

    public abstract double beregnGrønEjerafgift();

}
