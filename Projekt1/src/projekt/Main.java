package projekt;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Tools t = new Tools();
        Scanner scanner = new Scanner(System.in);
        Loops l = new Loops();
        String dzialanie;
        Double x, y;
        Random r = new Random();
        int rr, d = 0;

        /*t.zadanie1();
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
        t.zadnanie2z5() ;*/

        // System.out.println(t.fahrenheit(scanner.nextDouble()));
        //System.out.println(t.celsius(scanner.nextDouble()));
        //t.przestepny();
        //System.out.println("Let's play a game. Pleas choose rock (0), scissors (1), paper (2):");
        //t.rockGame(scanner.nextInt());

       /* System.out.println(l.sumaKolejnych());
        rr = r.nextInt(10);

        while (d != rr) {
            System.out.println("wybierz liczbe 0 - 10");
            d = scanner.nextInt();
            System.out.println("wybrales " + d);
            if (d == rr) System.out.println("trafiles " + rr);
            else System.out.println("sprobuj jeszcze raz");

        }
*/

 /*       System.out.print("Podaj dzialanie + - * lub / : ");
        dzialanie = scanner.next();
        System.out.print(" Podaj x. x = ");
        x = scanner.nextDouble();
        System.out.print(" Podaj y. y = ");
        y = scanner.nextDouble();

      t.kalk(dzialanie, x, y);

        System.out.println("Policze twoje liczby. Wpisuj kolejne liczby, gdy wpiszesz 0 skoncze");
        double suma = 0, i=-1;
        while(i!=0)
        {
            i= scanner.nextDouble();
            suma = suma+ i;
           if(i!=0) System.out.print( "+");

        }
        System.out.println(" = " + suma);

        System.out.println("Policze twoje liczby. Wpisuj kolejne liczby, gdy wpiszesz 0 skoncze");
        suma = 0;
        i=-1;
        do
        {   i= scanner.nextDouble();
            suma = suma+ i;
            if(i!=0) System.out.print( "+");

        }while(i!=0);
        System.out.println(" = " + suma);

        int k, kk;
        System.out.println(" --------------------------------------------------------------");
        for (k = 1; k <= 9; k++) {
            for (kk = 1; kk <= 9; kk++) {
                System.out.printf("%-2s %-2d %-1s", "|", k * kk, "");
            }
            System.out.println("|");

            System.out.println(" --------------------------------------------------------------");
        }
        int p = 1;
        while (p <= 1000) {
            System.out.print(p + ", ");
            p = p * 3;
        }


        double suma = 0, z=1;

        for (k=0; k<=100; k++)
        {
            z=z/2;
            suma = suma + z;
        }
        System.out.println(suma);*/

      //  System.out.println(l.lengt(16));

        /*szesnastkowy*/
//        for( k=0 ; k<=)
       // l.szesnastkowy(28);
        System.out.println("Podaj mi liczbe to zamienie na szesnastkowy");
        System.out.print(Arrays.toString(l.szesnastkowy(scanner.nextInt())));
        System.out.println("");

        System.out.println(l.palindrom(scanner.next( )));


    }
}


