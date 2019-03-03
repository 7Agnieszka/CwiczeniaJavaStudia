package projekt;


import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
import java.util.Random;

public class Tools {

    public Random rr = new Random();


    public void zadanie1() {
        System.out.println("**** Zadanie 1 **** ");
        System.out.println("Welcome to Java,\n" +
                "Welcome to Computer Science\n" + "Programming is fun.");
        System.out.println(" ");
    }

    public void zadanie2() {
        System.out.println("**** Zadanie 2 **** ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Welcome to Java");
        }
    }

    public void zadanie3() {
        System.out.println("**** Zadanie 3 **** ");
        System.out.println("   J    A    V     V    A   ");
        System.out.println("   J   A A    V   V    A A  ");
        System.out.println("J  J  AAAAA    V V    AAAAA ");
        System.out.println(" JJ  A     A    V    A     A");
    }

    public void zadanie4() {
        System.out.println("**** Zadanie 4 **** ");
        System.out.println(" ");
        System.out.printf("%-10s%-10s%-10s", "a", "a^2", "a^3");
        System.out.println(" ");
        System.out.printf("%-10d%-10d%-10d", 1, 1, 1);
        System.out.println(" ");
        System.out.printf("%-10d%-10d%-10d", 2, 4, 8);
        System.out.println(" ");
        System.out.printf("%-10d%-10d%-10d", 3, 9, 27);
        System.out.println(" ");
        System.out.printf("%-10d%-10d%-10d", 4, 16, 64);
        System.out.println(" ");
        System.out.println(" ");
    }

    public void zadanie6() {
        System.out.println("**** Zadanie 6 **** ");
        System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9");
        //System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s",
        //      "1","+","2","+","3","+","4","+","5","+","6","+","7","+","8","+","9");

        System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s",
                "1", "+", "2", "+", "3", "+", "4", "+", "5", "+", "6", "+", "7", "+", "8", "+", "9");
    }

    public void zadanie7() {

        System.out.println(" ");
        System.out.println("**** Zadanie 7 **** ");
        System.out.println(4 * (1. - 1. / 3 + 1. / 5 - 1. / 7 + 1. / 9 - 1. / 11));
        System.out.println(4 * (1. - 1. / 3 + 1. / 5 - 1. / 7 + 1. / 9 - 1. / 11 + 1. / 13));
        System.out.println(4 * (1. - 1. / 3 + 1. / 5 - 1. / 7 + 1. / 9 - 1. / 11 + 1. / 13 - 1. / 15 + 1. / 17));
        System.out.println("");
    }

    public void zadanie12() {
        System.out.println("**** Zadanie 12 **** ");
        System.out.println("24miles per 1hour 40 minutes 35 seconds = " + (24.0 * 1.6) / (1.0 + 40.0 / 60.0 + 35.0 / 3600.0) + " km/h");
    }

    public void postipreinkrementacja() {
        System.out.println("**** ********* **** ");
        System.out.println("Post i pre inkrementacja x=0");
        int x = 0;
        System.out.println("poczatkowa wartosc " + x);
        System.out.println("postincrementacja: x++ " + x++);
        System.out.println("wartosc po postincrementacji " + x);

        x = 0;
        System.out.println("zerowanie " + x);
        System.out.println("preinkrementachja : ++x " + ++x);
        System.out.println("wartosc po preknkrementacji " + x);
    }

    public void zadanie1z1() {
        System.out.println("**** Zadanie 1 **** ");
        byte a = 1;
        short b = 25;
        int c = 10044;
        long d = 458877777;
        float e = 4;
        double f = 477.785;
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
    }

    public void zadanie1z2() {
        System.out.println("**** Zadanie 2 **** ");
        final double pi = 3.14159;
        double r = 5;
        System.out.printf("obwod: %f \n", 2 * pi * r);
        System.out.printf("pole:  %f \n", pi * r * r);
    }

    public void zadanie1z3() {
        System.out.println("**** Zadanie 3 **** ");
        int seconds = 10000000;
        int sekundy = seconds % 60;
        System.out.println(sekundy);
        int minuty = ((seconds - sekundy) / 60) % 60;
        System.out.println(minuty);
        int godziny = ((seconds - sekundy - 60 * minuty) / 60) % 24;
        System.out.println(godziny);
        int dni = ((seconds - sekundy - 60 * minuty - 3600 * godziny) / 24);
        System.out.println(dni);

        System.out.println("w " + seconds + " sekund jest  " +
                seconds / 60 / 60 / 24 + " dni, " + seconds % (60 * 60 * 24) / (60 * 60) + " godzin, " +
                seconds % (60 * 60) / 60 + " minut i " + seconds % 60 + " sekund");

        System.out.println("w " + seconds + " sekund jest " + seconds / 60 + " minut");
        System.out.println("w " + seconds + " sekund jest " + seconds / 3600 + " godzin");
        System.out.println("w " + seconds + " sekund jest " + (seconds / 3600) / 24 + " dni");
    }

    public void zadanie1z4() {
        System.out.println("**** Zadanie 4 **** ");
        int c1 = 2, c2 = 5;
        double d1 = 2.25, d2 = -4.51;
        System.out.println("int/double " + c1 / d1);
        System.out.println("double / int " + d2 / c2);
        System.out.println("int/int " + c2 / c1);
        System.out.println("double/double " + d2 / d1);
    }

    public void zadanie1z5(String name) {

        name = "Aga";
        System.out.println("Hello " + name + " !");
    }

    public void zadanie1z6(double pr) {
        pr = 4.5;
        double pi = 3.14159;
        System.out.printf("obwod: %f \n", 2 * pi * pr);
        System.out.printf("pole:  %f \n", pi * pr * pr);
    }

    public void komunikat(String tekst) {
        System.out.println(tekst);
    }

    public void zadanie1z7(double calaKwota) {
        calaKwota = 54.45;
        int kwota = (int) calaKwota;
        System.out.println("pieciozloatowki: " + kwota / 5);
        System.out.println("dwozlotowki: " + (kwota % 5) / 2);
        System.out.println("zlotowki: " + ((kwota % 5) % 2));
        double grosze1 = calaKwota - (double) kwota;
        int grosze = (int) (grosze1 * 100);
        System.out.println("piedziesiat groszy: " + grosze / 50);
        System.out.println("dwadziescia groszy: " + (grosze % 50) / 20);
        System.out.println("dziesiec groszy: " + ((grosze % 50) % 20) / 10);
        System.out.println("piec groszy: " + (grosze % 10) / 5);
        System.out.println("dwa grosze: " + (grosze % 5) / 2);
        System.out.println("grosz: " + ((grosze % 5) % 2));
    }

    public void zadanie1z8() {

        int aaa = (rr.nextInt(100)) % 16 + 35;
        double bbb = (1.5 * rr.nextDouble() + 1.4);

        System.out.println(aaa);
        System.out.println(bbb);
        System.out.println(rr.nextGaussian());
    }

    public void zadanie1z9(double prK) {
        double pi = 3.14159;
        if (prK <= 0) {
            System.out.println("liczba musi byc dodatnia");
        } else {
            System.out.printf("obwod: %f \n", 2 * pi * prK);
            System.out.printf("pole:  %f \n", pi * prK * prK);
        }
    }

    public void zadanie2z1(int liczba1, int liczba2) {
        if (liczba1 > liczba2) System.out.println("wieksza " + liczba1);
        else if (liczba1 < liczba2) System.out.println("wieksza " + liczba2);
        else System.out.println("Rowne");
    }

    public void zadanie2z2(int procenty) {

        if (procenty < 50) System.out.println("Ocena: 2");
        else if (procenty >= 50 && procenty < 60) System.out.println("Ocena: 3");
        else if (procenty >= 60 && procenty < 70) System.out.println("Ocena: 3+");
        else if (procenty >= 70 && procenty < 80) System.out.println("Ocena: 4");
        else if (procenty >= 80 && procenty < 90) System.out.println("Ocena: 4+");
        else if (procenty >= 90 && procenty < 100) System.out.println("Ocena: 5");
        else System.out.println("niepoprawne dane");
    }

    public void zadanie2z3(int rok) {
        if (rok > 0) {
            if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)) System.out.println("Przestepny");
            else System.out.println("nie przestepny");
        } else System.out.println("niepprawny rok");
    }

    public void zadanie2z4() {

        int dzien = rr.nextInt(6);
        switch (dzien) {
            case 0:
                System.out.println("niedziela");
                break;
            case 1:
                System.out.println("poniedzialek");
                break;
            case 2:
                System.out.println("wtorek");
                break;
            case 3:
                System.out.println("sroda");
                break;
            case 4:
                System.out.println("czwartek");
                break;
            case 5:
                System.out.println("piatek");
                break;
            case 6:
                System.out.println("sobota");
                break;
            default:
                System.out.println("inny");
        }

    }

    public void przestepny() {
        int rokLosowy = rr.nextInt(1000) + 1000;
        System.out.println("rok: " + rokLosowy);
        String text =
                (((rokLosowy % 4 == 0 && rokLosowy % 100 != 0) || (rokLosowy % 400 == 0)) ? "przestepny" : "nie przestepny");
        System.out.println(text);
    }


    public double fahrenheit(double celsius) {
        return (9. / 5) * celsius + 32.;
    }


    public double celsius(double fahrenheit) {
        return (fahrenheit - 32.) * 5 / 9;
    }


    public double area(double radious) {
        return radious * radious * 3.14159;
    }

    public double volume(double radious, double length) {
        return area(radious) * length;
    }


    public int sumOfDigits(int liczba) {
        if (liczba < 1000 || liczba > 999) {
            System.out.println("liczba nor jest 3 cyfrowa");
            return 0;
        }

        return (liczba / 100 + (liczba % 100) / 10 + liczba % 10);
    }


    public double bmi(double weight, double height) {
        return weight / (height * height);
    }

    public double distance(double x1, double x2, double y1, double y2) {
        return Math.sqrt((x1 - y1) * (x1 - y1) + (x2 - y2) * (x2 - y2));
    }


    public void losowyMiesiac(int month) {
        switch (month) {
            case 0:
                System.out.println("January");
                break;
            case 1:
                System.out.println("February");
                break;
            case 2:
                System.out.println("March");
                break;
            case 3:
                System.out.println("April");
                break;
            case 4:
                System.out.println("May");
                break;
            case 5:
                System.out.println("June");
                break;
            case 6:
                System.out.println("July");
                break;
            case 7:
                System.out.println("August");
                break;
            case 8:
                System.out.println("September");
                break;
            case 9:
                System.out.println("October");
                break;
            case 10:
                System.out.println("November");
                break;
            case 11:
                System.out.println("December");
                break;
            default:
                System.out.println("other");
        }
    }


    public int najwieksza(int a, int b, int c) {
        if (a > b) {
            if (a > c) return a;
            return c;
        } else if (b > c) return b;
        return c;
    }


    public void moneta(int m) {
        int l = rr.nextInt(1);
        if (l == 1 && l == m)
            System.out.printf("wylosowany orzel, zgadles");

        else if (l == 1 && l != m)
            System.out.printf("wylosowany orzel, nie zgadles");

        else if (l == 0 && l == m)
            System.out.printf("wylosowana reszka, zgadles");

        else if (l == 0 && l != m)
            System.out.printf("wylosowana reszka, nie zgadles");

        else System.out.printf("nieoczekiwane zakończenie gry");
    }


    public void rockGame(int u) {
        int c = rr.nextInt(2);
        String user = "paper";
        String computer = "rock";
        String result = "won";

        switch (u) {
            case 0:
                user = "rock";
                break;
            case 1:
                user = "scissors";
                break;
            case 2:
                user = "paper";
                break;
            default:
                ;
        }

        switch (c) {
            case 0:
                computer = "rock";
                break;
            case 1:
                computer = "scissors";
                break;
            case 2:
                computer = "paper";
                break;
            default:
                ;
        }

        if (c == u)
            System.out.print("both of you choose " + user + ". It's a draw");
        else {
            if (c == 0 && u == 1) result = "lost";
            else if (c == 0 && u == 2) result = "won";
            else if (c == 1 && u == 0) result = "won";
            else if (c == 1 && u == 2) result = "lost";
            else if (c == 2 && u == 0) result = "lost";
            else if (c == 2 && u == 1) result = "win";

            System.out.println("The computer is " + computer + " You are " + user + ". You " + result);

        }

    }


    public void kalk(String dzialanie, Double x, Double y) {
        switch (dzialanie) {
            case "+":
                System.out.println("x = " + x + " y = " + y + " x + y = " + (x + y));
                break;
            case "-":
                System.out.println("x = " + x + " y = " + y + " x - y = " + (x - y));
                break;
            case "*":
                System.out.println("x = " + x + " y = " + y + " x * y = " + (x * y));
                break;
            case "/":
                System.out.println("x = " + x + " y = " + y + " x / y = " + (x / y));
                break;
            default:
                System.out.println("dzialanie zle zdefiniowane");
        }

    }


}
