package projekt;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;


/*public class Main {

    public static void main(String[] args) {

        Tools t = new Tools();
        Scanner scanner = new Scanner(System.in);
        Loops l = new Loops();
        Klasy q = new Klasy();
        Book b = new Book();
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
        System.out.println(" ---------------------------------------------------------------------");
        System.out.printf("%-2s %-2s %-1s", "|", "*" , "|");
        for (k = 1; k <= 9; k++) {System.out.printf("%-2s %-2d %-1s", "|", k , "");}
        System.out.println("|");
        System.out.println(" ---------------------------------------------------------------------");
                for (k = 1; k <= 9; k++) {
            System.out.printf("%-2s %-2d %-1s", "|", k , "|");
            for (kk = 1; kk <= 9; kk++) {
                System.out.printf("%-2s %-2d %-1s", "|", k * kk, "");
            }
            System.out.println("|");

            System.out.println(" ---------------------------------------------------------------------");
        }*/
       /* int p = 1;
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
     /*  System.out.println("Podaj mi liczbe to zamienie na szesnastkowy");
        System.out.print(Arrays.toString(l.szesnastkowy(scanner.nextInt())));
        System.out.println("");
*/
       /* System.out.println(l.palindrom(scanner.next( )));

        System.out.println(q.suma(5,5));

        System.out.println(q.pierwsza(1));
        q.wypiszPierwsze(10,20);*/

      /*  q.max(4,5);
        q.max(4.0,5.0);
        q.max(4.5,4);
*/

        /*Cats cat1 = new Cats("Puszek", 2);
        Cats cat2 = new Cats("Pusia", 4);
        Cats cat3 = new Cats("Szczesciarz", 7);
        cat1.printCatInfo();
        cat2.printCatInfo();
        cat3.printCatInfo();


        for (int i = 1; i <= 10; i++) {
            Factorial f = new Factorial(i);
            System.out.println(i + "! = " + f.countFactorial());
        }
*/
       /* b.podzielne();
        b.factor(scanner.nextInt());
        b.series();
        b.liczbaPi(100000);
        b.perfect(28);
        b.moneta();
        b.wypiszComb();
        b.reverse("asfadsa");
*/

     /*   Student s = new Student();
        System.out.println(s.imie);
        System.out.println(s.nazwisko);
        System.out.println(s.height);
        System.out.println(s.age);

        Circle c = new Circle((1 / Math.PI));
        Circle c1 = new Circle(1.0);
        Circle c2 = new Circle(2.0);
        Circle c3 = new Circle();
        System.out.println(c.getArea());
        System.out.println(c.getParimeter());


        System.out.println(Circle.noOfObjects);

        zmiana(c1,c2);
        System.out.println(c1.getRadius());
        System.out.println(c2.getRadius());

        zmiana1(c1);
        System.out.println(c1.getRadius());

        c1.setRadius(5);
        c2.setRadius(2);
        System.out.println(c1.equals(c2));




        StringBuilder builder = new StringBuilder();
        builder.append("napis1 ");
        builder.append("napis2 ");
        builder.append("napis3 ");
        builder.append(3);
        System.out.println(builder.toString());

*/


  /* Rectangle rect = new Rectangle(2,5);

        System.out.println(rect.getWidth() + " " + rect.getHeight()  + " " + rect.getArea()  + " " +  rect.getParimeter());






            TV tt = new TV(1,true);

            while(true) {
                tt.menu();
                //tt.stan();
                tt.akcja(scanner.next());
                tt.stan();
                if(tt.isTurnedOn()==false) {break;}
            }

  /*          StopWatch s = new StopWatch();

            System.out.println(s.getStartTime());
            s.start();
            for(int i=1; i<=100000; i++);
            s.stop();
        System.out.println(s.getElapsedTime());*/


/*
        int n = 10;
        Telefon[] telefony = new Telefon[n];
        for (int i = 0; i < n; i++) {
            telefony[i].zadzwon("112");
        }
        */

/*


      Lista list = new Lista(10);

      list.dodajElement(5);
      list.dodajElement(1);
      list.dodajElement(3);
      list.dodajElement(2);
      list.dodajElement(3);
      list.dodajElement(6);
      list.dodajElement(3);
      list.dodajElement(6);
      list.dodajElement(6);

        System.out.println(list.znajdz(3));
        list.pisz();
       /* list.usunPierwszy(3);
        list.pisz();*/
       /* list.usunPowtorzenia();
        list.pisz();









    }
    }*/

  /*  public static void zmiana(Circle x, Circle y) {
        double r= x.getRadius();
        x.setRadius(y.getRadius());
        y.setRadius(r);
    }

    public static void zmiana1(Circle x) {
        x.setRadius(5);*/



