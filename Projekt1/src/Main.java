import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
/*Zadanie1*/
        System.out.println("**** Zadanie 1 **** ");
        System.out.println("Welcome to Java,\n" +
                "Welcome to Computer Science\n" + "Programming is fun.");
        System.out.println(" ");

/*Zadanie2*/
        System.out.println("**** Zadanie 2 **** ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Welcome to Java");
        }

          /*Zadanie3*/
        System.out.println("**** Zadanie 3 **** ");
        System.out.println("   J    A    V     V    A   ");
        System.out.println("   J   A A    V   V    A A  ");
        System.out.println("J  J  AAAAA    V V    AAAAA ");
        System.out.println(" JJ  A     A    V    A     A");
/*zadanie4
1.4 (Print a table) Write a program that displays the following table:
a a^2 a^3
1 1 1
2 4 8
3 9 27
4 16 64
 */

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



/*zadaanie 6*/
        System.out.println("**** Zadanie 6 **** ");
        System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9");
        //System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s",
        //      "1","+","2","+","3","+","4","+","5","+","6","+","7","+","8","+","9");

        System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s",
                "1", "+", "2", "+", "3", "+", "4", "+", "5", "+", "6", "+", "7", "+", "8", "+", "9");


        System.out.println(" ");


/*Zadabie 7*/
        System.out.println(" ");
        System.out.println("**** Zadanie 7 **** ");
        //double l= 4 * (1.0-1.0/3.0+1.0/5.0-1.0/7.0+1.0/9.0-1.0/11.0);
        System.out.println(4 * (1. - 1. / 3 + 1. / 5 - 1. / 7 + 1. / 9 - 1. / 11));
        System.out.println(4 * (1. - 1. / 3 + 1. / 5 - 1. / 7 + 1. / 9 - 1. / 11 + 1. / 13));
        System.out.println(4 * (1. - 1. / 3 + 1. / 5 - 1. / 7 + 1. / 9 - 1. / 11 + 1. / 13 - 1. / 15 + 1. / 17));
        System.out.println("");


/*Zaddanie 12*/
        System.out.println("**** Zadanie 12 **** ");
        System.out.println("24miles per 1hour 40 minutes 35 seconds = " + (24.0 * 1.6) / (1.0 + 40.0 / 60.0 + 35.0 / 3600.0) + " km/h");


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

    /*1. Napisz program, w którym zadeklarujesz i zainicjalizujesz zmienne wszystkich omówionych
        typów i wypiszesz ich warto±ci na ekran.*/


        System.out.println("**** Zadanie 1 **** ");
        byte a = 1;
        short b = 25;
        int c = 10044;
        long d = 458877777;
        float e = 4;
        double f = 477.785;
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);


/*2. Napisz program, w którym zdeniujesz staª¡ z przybli»on¡ warto±ci¡ liczby , w którym zde-
niujesz zmienn¡ w której b¦dziesz przechowywaª dªugo±¢ promienia. Nast¦pnie stwórz dwie
        zmienne, w których b¦dzie si¦ znajdowaªo pole koªa i dªugo±¢ okr¦gu o zadanym promieniu.
        Na samym ko«cu wypisz warto±ci dwóch ostatnich (pole i dªugo±¢) na ekran (z odpowiednim
        komunikatem)*/
        System.out.println("**** Zadanie 2 **** ");
        final double pi = 3.14159;
        double r = 5;
        System.out.printf("obwod: %f \n", 2 * pi * r);
        System.out.printf("pole:  %f \n", pi * r * r);



/*3. Napisz program, w którym zdeniujesz zmienn¡ Program ma napisa¢, ile dni, ile godzin, ile minut i ile sekund znajduje si¦ w tej liczbie sekund.*/
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


/* 4. Napisz program, w którym zdeniujesz dwie zmienne caªkowite i dwie zmienne zmiennoprzecinkowe
        i sprawd¹ co b¦dzie wynikiem dzielenia:
 Dwóch liczb caªkowitych
 Dwóch liczb zmiennoprzecinkowej
 Liczby caªkowitej przez zmiennoprzecinkow¡
 Liczby zmiennoprzecinkowej przez liczb¦ caªkowit¡*/
        System.out.println("**** Zadanie 4 **** ");
        int c1 = 2, c2 = 5;
        double d1 = 2.25, d2 = -4.51;
        System.out.println("int/double " + c1 / d1);
        System.out.println("double / int " + d2 / c2);
        System.out.println("int/int " + c2 / c1);
        System.out.println("double/double " + d2 / d1);



       /* 5. Popraw kod, aby kompilowaª si¦:
        int a = 1;
        double b = 4.5;
        int c = b;
        double d = a;*/

        System.out.println("**** Zadanie 5 **** ");
        int aa = 1;
        double bb = 4.5;
        int cc = (int) bb;
        double dd = aa;

/***********************/


        Scanner scanner = new Scanner(System.in);
        //String name = scanner.next();
        String name = "Aga";
        System.out.println("Hello " + name + " !");


        // String promien = scanner.next();
        //double pr = Double.parseDouble(promien);
        double pr = 4.5;
        System.out.printf("obwod: %f \n", 2 * pi * pr);
        System.out.printf("pole:  %f \n", pi * pr * pr);

        System.out.println("\n\n");

        System.out.println("Podaj kwote");
        //String kwotaPodana = scanner.next();
        //double calaKwota=Double.parseDouble(kwotaPodana);
        double calaKwota = 54.45;
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


        Random rr = new Random();
        int aaa = (rr.nextInt(100)) % 16 + 35;
        double bbb = (1.5 * rr.nextDouble() + 1.4);

        System.out.println(aaa);
        System.out.println(bbb);
        System.out.println(rr.nextGaussian());


        double prK = Double.parseDouble(scanner.next());
        if (prK <= 0) {
            System.out.println("liczba musi byc dodatnia");
        } else {
            System.out.printf("obwod: %f \n", 2 * pi * prK);
            System.out.printf("pole:  %f \n", pi * prK * prK);
        }

        int liczba1 = scanner.nextInt();
        int liczba2 = scanner.nextInt();
        if (liczba1 > liczba2) System.out.println("wieksza " + liczba1);
        else if (liczba1 < liczba2) System.out.println("wieksza " + liczba2);
        else System.out.println("Rowne");


        int procenty = scanner.nextInt();
        if (procenty < 50) System.out.println("Ocena: 2");
        else if (procenty >= 50 && procenty < 60) System.out.println("Ocena: 3");
        else if (procenty >= 60 && procenty < 70) System.out.println("Ocena: 3+");
        else if (procenty >= 70 && procenty < 80) System.out.println("Ocena: 4");
        else if (procenty >= 80 && procenty < 90) System.out.println("Ocena: 4+");
        else if (procenty >= 90 && procenty < 100) System.out.println("Ocena: 5");
        else System.out.println("niepoprawne dane");


        int rok = scanner.nextInt();
        if (rok > 0) {
            if (rok % 4 == 0 && rok % 100 != 0) System.out.println("Przestepny");
            else System.out.println("nie przestepny");
        } else System.out.println("niepprawny rok");


        int dzien = rr.nextInt(6);
        switch (dzien)
        {
            case 0: System.out.println("niedziela"); break;
            case 1: System.out.println("poniedzialek"); break;
            case 2: System.out.println("wtorek"); break;
            case 3: System.out.println("sroda"); break;
            case 4: System.out.println("czwartek"); break;
            case 5: System.out.println("piatek"); break;
            case 6: System.out.println("sobota"); break;
            default:
                System.out.println("inny");
        }
        int rokLosowy = rr.nextInt(1000)+1000;
        String text =
        ((rokLosowy % 4 == 0 && rokLosowy % 100 != 0) ? "przestepny" : "nie przestepny");
        System.out.println(text);
    }
}


