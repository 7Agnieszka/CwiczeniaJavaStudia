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
        System.out.printf("%-10s%-10s%-10s","a","a^2","a^3");
        System.out.println(" ");
        System.out.printf("%-10d%-10d%-10d",1,1,1);
        System.out.println(" ");
        System.out.printf("%-10d%-10d%-10d",2,4,8);
        System.out.println(" ");
        System.out.printf("%-10d%-10d%-10d",3,9,27);
        System.out.println(" ");
        System.out.printf("%-10d%-10d%-10d",4,16,64);
        System.out.println(" ");
        System.out.println(" ");



/*zadaanie 6*/
        System.out.println("**** Zadanie 6 **** ");
        System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9");
        //System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s",
          //      "1","+","2","+","3","+","4","+","5","+","6","+","7","+","8","+","9");

        System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s",
                "1","+","2","+","3","+","4","+","5","+","6","+","7","+","8","+","9");


        System.out.println(" ");


/*Zadabie 7*/
        System.out.println(" ");
        System.out.println("**** Zadanie 7 **** ");
        //double l= 4 * (1.0-1.0/3.0+1.0/5.0-1.0/7.0+1.0/9.0-1.0/11.0);
        System.out.println(4 * (1. - 1. / 3 + 1. / 5 - 1. / 7 + 1. / 9 - 1. / 11));
        System.out.println(4 * (1. - 1. / 3 + 1. / 5 - 1. / 7 + 1. / 9 - 1. / 11 + 1. / 13));
        System.out.println(4 * (1. - 1. / 3 + 1. / 5 - 1. / 7 + 1. / 9 - 1. / 11 + 1. / 13 - 1./15 + 1./17));
        System.out.println("");


/*Zaddanie 12*/
        System.out.println("**** Zadanie 12 **** ");
        System.out.println("24miles per 1hour 40 minutes 35 seconds = " + (24.0*1.6)/(1.0+40.0/60.0+35.0/3600.0) + " km/h");



    }
}
