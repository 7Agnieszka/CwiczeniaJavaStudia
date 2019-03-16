package projekt;

/*Napisać klasę Lista, której zadaniem będzie przechowywać listę liczb całkowitych. Klasa ta powinna następujące pola prywatne:

        int [] liczby; - tablica, w której przechowywane będą liczby
        int pojemnosc; - maksymalna liczba elementów, możliwych do przechowywania
        int rozmiar; - liczba przechowywanych elementów (liczb w tablicy ,,liczby'')

        Klasa Lista powinna mieć również następujące metody:

        konstruktor z parametrem określającym pojemność, który przydziela pamięć dla tablicy liczby
        oraz ustala wartości pozostałych pól klasy;
        metodę dodajElement, która przyjmuje dokładnie jeden element – liczbę całkowitą, która dodawana
        jest do listy; w przypadku, gdy lista jest pełna powinien zostać wyświetlony komunikat o błędzie;
        metodę znajdz, której jedynym parametrem powinna być szukana liczba, natomiast wynikiem pozycja
        podanej liczby w liście (licząc od 0) lub -1, gdy liczby nie ma na liście;
        bezparametrową metodę pisz, która wypisuje informacje o liście, w tym jej rozmiar, pojemność
        oraz listę przechowywanych elementów;
        metodę usunPierwszy, która usuwa pierwsze wystąpienie podanej jako parametr liczby, jeżeli
        znajduje się ona na liście, tzn. jeżeli podana liczba występuje więcej niż jeden raz, to usuwane
        jest jedynie pierwsze jej wystąpienie;
        metodę usunPowtorzenia, która usuwa wszystkie powtórzenia elementów na liście, tzn. po jej
        wykonaniu na liście nie powinno być żadnych powtórzonych liczb.

*/

public class Lista {

    private int[] liczby;
    private int pojemnosc;
    private int rozmiar=0;

    public Lista(int pojemnosc) {
        this.pojemnosc = pojemnosc;

        liczby = new int[pojemnosc];

        for (int i = 0; i < pojemnosc; i++)
            liczby[i] = 0;

      }


    public int[] getLiczby() {
        return liczby;
    }

    public void setLiczby(int[] liczby) {
        this.liczby = liczby;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(int rozmiar) {
        this.rozmiar = rozmiar;
    }

    public void dodajElement(int liczba)
    {
        if(rozmiar == pojemnosc){
            System.out.println("blad, tablica pelna");
        }
        else{
            liczby[rozmiar] = liczba;
            rozmiar++;
        }
    }


    public int znajdz(int d){
        int pozycja =rozmiar;
        for(int i = 0; i<rozmiar; i++ )
        {
            if(liczby[i]==d) {
                pozycja = i;
                break;
            }
            else pozycja =-1;
        }

        return pozycja;
    }

    public int znajdzOd(int d, int n){
        int pozycja =rozmiar;
        for(int i = n; i<rozmiar; i++ )
        {
            if(liczby[i]==d) {
                pozycja = i;
                break;
            }
            else pozycja =-1;
        }

        return pozycja;
    }


    /*        bezparametrową metodę pisz, która wypisuje informacje o liście, w tym jej rozmiar, pojemność
        oraz listę przechowywanych elementów;*/

    public void pisz(){
        System.out.println("rozmiar: "+rozmiar);
        System.out.println("pojemnosc: "+ pojemnosc);
        for(int i = 0; i<rozmiar; i++)
        {
            System.out.println("lista["+i+"] = "+ liczby[i]);
        }

    }


    /*metodę usunPierwszy, która usuwa pierwsze wystąpienie podanej jako parametr liczby, jeżeli
        znajduje się ona na liście, tzn. jeżeli podana liczba występuje więcej niż jeden raz, to usuwane
        jest jedynie pierwsze jej wystąpienie;
        metodę usunPowtorzenia, która usuwa wszystkie powtórzenia elementów na liście, tzn. po jej
        wykonaniu na liście nie powinno być żadnych powtórzonych liczb.*/

    public void usunPierwszy(int d){
        int n = znajdz(d), r;
        liczby[n] = 0;
        for(int i = n; i < rozmiar-1; i++)
        {
          liczby[i]=liczby[i+1];
        }
        liczby[rozmiar]=0;
        rozmiar--;
    }

    public void usunPierwszy2(int d, int z){
        int n = znajdzOd(d,z), r;
        liczby[n] = 0;
        for(int i = n; i < rozmiar-1; i++)
        {
            liczby[i]=liczby[i+1];
        }
        liczby[rozmiar]=0;
        rozmiar--;
    }

    public void usunPowtorzenia()
        {
            for(int i=0; i<rozmiar; i++)
            {
                for(int j=i+1; j<rozmiar; j++ )
                  if(znajdzOd(liczby[i], i+1)>-1)
                   usunPierwszy2(liczby[i], i+1);
            }
        }


}
