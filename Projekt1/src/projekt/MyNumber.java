package projekt;


/*
* Utwórz klasę o nazwie MyNumber, której jedyny konstruktor przyjmuje liczbę. Klasa powinna mieć następujące metody:

    MyNumber isOdd() – zwraca true jeśli liczba jest nieparzysta,
    MyNumber isEven() – zwraca true jeśli liczba jest parzysta,
    MyNumber sqrt() – zwraca pierwiastek z liczby,
    MyNumber pow(MyNumber x) – liczba podniesiona do potęgi x (użyj funkcji Math.pow),
    MyNumber add(MyNumber x) – zwraca sumę atrybutu (obiektu) i x opakowaną w klasę MyNumber,
    MyNumber subtract(MyNumber x) – zwraca różnicę atrybutu i x opakowaną w klasę MyNumber.

Przetestuj klasę po jej napisaniu.
*
*
* */

public class MyNumber {


    double x;



    public MyNumber(double x) {
        this.x = x;
    }

    public boolean isOdd() {
        if (x % 2 == 0) return false;
        return true;
    }

    public boolean isEven() {
        if (x % 2 == 0) return true;
        return false;
    }

    public double sqrt(){

        return Math.sqrt(x);
    }

    public double pow(MyNumber y)
    {
        return Math.pow( x , y.x );
    }

    public double add(MyNumber a)
    {
        return x+a.x;
    }
    public double subtract(MyNumber a)
    {
        return x-a.x;
    }


}
