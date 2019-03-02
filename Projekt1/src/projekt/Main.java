package projekt;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Tools t = new Tools();
        t.zadanie1();
        Scanner scanner = new Scanner(System.in);

        t.zadanie1();
        t.zadanie2();
        t.zadanie3();
        t.zadanie4();
        t.zadanie6();
        t.zadanie7();
        t.zadanie12();
        t.postipreinkrementacja();
        t.zadanie1z1();
        t.zadanie1z2();
        t.zadanie1z3();
        t.zadanie1z4();
        t.komunikat("Przedstaw sie");
        t.zadanie1z5(scanner.next());
        t.komunikat("podaj promien kola");
        t.zadanie1z6(scanner.nextDouble());
        t.komunikat("Podaj kwote");
        t.zadanie1z7(scanner.nextDouble());
        t.zadanie1z8();
        t.komunikat("podaj promien kola");
        t.zadanie1z9(scanner.nextDouble());
        t.komunikat("podaj dwie liczby calkowite");
        t.zadanie2z1(scanner.nextInt(), scanner.nextInt());
        t.komunikat("podaj procenty");
        t.zadanie2z2(scanner.nextInt());
        t.komunikat("podaj rok");
        t.zadanie2z3(scanner.nextInt()) ;
        t.zadanie2z4();
        t.zadnanie2z5() ;

    }
}


