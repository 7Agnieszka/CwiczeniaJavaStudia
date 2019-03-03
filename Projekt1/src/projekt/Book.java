package projekt;

import com.sun.org.apache.xpath.internal.SourceTree;
import java.util.Random;
import java.util.Arrays;

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



    /*1/3+3/5+...+97/99*/

    public void series(){
        double sum=0;
        for (double i = 1; i < 99; i=i+2) {
            sum=sum+ (i/(i+2.0));
        }
        System.out.println(sum);
        }


    public void liczbaPi(double k){
        double wynik =1.;
        double znak = 1.;
        for(double i=2; i<=k;i++)
        {
            znak=znak*(-1.);
            wynik=wynik + znak/(2*i-1.);

        }
        System.out.println(4.*wynik);

    }

    public void perfect(int k){
       int sum=0;
        for (int i=1; i< k; i++)
        {
            if(k%i==0)sum=sum+i;
        }

        if(sum==k) System.out.println("perfect");
        else System.out.println("no perfect");
    }
    private Random rr = new Random();

    public void moneta() {
        int head=0, tail=0, l =0;

        for (int i=1; i<=1000000; i++) {
            l = rr.nextInt(2);
            if(l==0) head++;
            else tail++;
        }
        System.out.println("heads: "+ head + ", tails: "+ tail );
    }


    public void wypiszComb(){
        int amount=0;
        for(int i=1; i<=7;i++)
            for(int j=1; j<i;j++)
            {
                System.out.printf("%-2d %-2d \n",i,j); amount++;

            }
        System.out.println(amount);
    }



    public void reverse(String p)
    { String r = p;

        for (int i=0; i < p.length(); i++) {
            r.replace(r.charAt(i),p.charAt(p.length() - 1 - i));
            System.out.print(p.charAt(p.length() - 1 - i));
        }


    }

}
