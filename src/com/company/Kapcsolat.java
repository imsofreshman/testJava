package com.company;

public class Kapcsolat {

    private String allapot;

    private Kapcsolat(String allapot) {
        this.allapot = allapot;
    }

    public String toString() {
        return allapot;
    }


    public static final Kapcsolat RENDBEN =
            new Kapcsolat("Rendben");
    public static final Kapcsolat HIBA =
            new Kapcsolat("Hiba");
    public static final Kapcsolat KAPCSOLODAS =
            new Kapcsolat("Kapcsolodas");
    public static final Kapcsolat ADATFELTOLTES =
            new Kapcsolat("Adatfeltoltes");

}
