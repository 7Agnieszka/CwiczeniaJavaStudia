package projekt;

public class Book {

/*podzielne przez 5 i 6, od 100 do 1000 po 10 w linii, oddzielone jednym miejscem*/

    public void podzielne() {
        int t = 0;

        for (int i = 100; i < 1000; i++) {
            if ((i % 5 == 0) && (i % 6 == 0)) {
                System.out.printf("%-4d", i);
                t++;
            }
            if (t == 10) {
                System.out.println("");
                t = 0;
            }
        }
    }

    public int najm(){
        int n=0;
        while(n*n<12000)
        {
          n=n+1;
        }
        return n;
    }

    /*factors of integer*/
    public Klasy k = new Klasy();

    public void factor(int x)
    {
        if(x<2) System.out.println("nie jest liczba zlozona");


        int p=2;
        for(p=2; p<=x; p++) {
            if(k.pierwsza(p)) {
                while (x % p == 0) {
                    if (x % p == 0) System.out.println(p);
                    x = x / p;
                }
            }

        }

    }

}
