package projekt;

class Telefon {
    // deklaracja pol
    private String numerTelefonu;
    private int lacznyCzasRozmow;
    private static double cenaRozmowy = 0.48;

    // konstruktor
    public Telefon (String numer) {
        this.numerTelefonu = numer;
        this.lacznyCzasRozmow = 0;
    }

    // konstruktor pusty
    public Telefon () {
        this.numerTelefonu = "10";
        this.lacznyCzasRozmow = 0;
    }



    // deklaracja metod
    public double obliczKwoteDoZaplaty() {
        return cenaRozmowy * (lacznyCzasRozmow / 60);
    }

    public static void ustawCeneRozmowy(double nowaCena){
       cenaRozmowy = nowaCena;
    }

    public void zadzwon(String nrTelefonu) {
        System.out.println ("Dzwonic do: " + nrTelefonu);
        System.out.println ("Dryn, dryn...");
        System.out.println ("Rozmowa w toku...");
        int czasRozmowy = (int) (Math.random()*3600);
        lacznyCzasRozmow += czasRozmowy;
        System.out.println ("Rozmowa zakonczona. ");
        System.out.printf ("Czas rozmowy: %d min. %d sek. \n", czasRozmowy/60, czasRozmowy%60);
    }
}

