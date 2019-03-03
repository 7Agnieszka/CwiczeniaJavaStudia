package projekt;

import java.util.Arrays;

public class Loops {

    public int sumaKolejnych() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma = suma + i;
        }

        return suma;
    }


    public int lengt(int x) {
        int k = 1;
        int l = 0, d = 1;
        while (x / d != 0) {
            l = l + 1;
            d *= 10;
        }
        return l;
    }

    public int lengtszen(int x) {
        int k = 1;
        int l = 0, d = 1;
        while (x / d != 0) {
            l = l + 1;
            d *= 16;
        }
        return l;
    }


    public int[] szesnastkowy(int x) {
        int l = lengtszen(x);
        int[] wynik = new int[l];

        for (int k = 1; k <= l; k++) {

            wynik[l - k] = (x % 16);
            x = x / 16;

        }
        return wynik;
    }


    public boolean palindrom(String p)
    { boolean w = true;

            for (int i=0; i < p.length(); i++)
            {
                System.out.println("Char " + i + " is " + p.charAt(i) +" "+ p.charAt(p.length()-1-i));
                if(p.charAt(i) != p.charAt(p.length()-1-i)) w=false;
            }

        return w;
    }



}



