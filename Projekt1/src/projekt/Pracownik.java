package projekt;


/*
* Zadanie 6. Napisz program, który będzie się składał z dwóch klas:
    Pracownik - przechowująca takie dane jak imię, nazwisko i wiek pracownika, oraz co najmniej trzy konstruktory,
    które posłużą do inicjowania obiektów z różnymi parametrami - w przypadku gdy przykładowo konstruktor przyjmuje
    tylko 1 parametr, zainicjuj pozostałe pola jakimiś domyślnymi wartościami.
    Firma - klasa testowa, w której utworzysz kilka obiektów klasy Pracownik i wyświetlisz dane na ekran.
Mile widziane wykorzystanie tablic oraz pętli.*/


public class Pracownik {

    private String imie;
    private String nazwisko;
    private int wiek;

    public Pracownik(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Pracownik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = 0;
    }

    public Pracownik(String imie) {
        this.imie = imie;
        this.nazwisko = "Nowak";
        this.wiek = 0;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void przedstawSie(){
        System.out.println("Imie: "+ imie + " Nazwisko: " + nazwisko + " Wiek: " + wiek);
    }


}
