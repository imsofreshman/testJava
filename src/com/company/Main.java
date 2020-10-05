package com.company;

    class FelsorolasMinta{
        public enum Kapcsolat{
            RENDBEN,
            HIBA,
            KAPCSOLODAS,
            ADATFELTOLTES
        };
        public enum Napok {
            HE,
            KE,
            SZE,
            CSU,
            PE,
            SZO,
            VA
        };
    }

public class Main {



    public static void main(String[] args) {
        System.out.println(Kapcsolat.RENDBEN);
    }
}
