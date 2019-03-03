package projekt;

public class Klasy {

    public int suma(int a, int b) {
        int w = 0;

        if (b < a) {
            System.out.println("nie mozna tego policzyc");
        }
        for (int i = a; i <= b; i++) {
            w = w + i;
        }
        return w;
    }


    public boolean pierwsza(int x) {
        int s = 0;
        if (x < 2) return false;

        for (int i = 2; i <= (x / 2); i++) {
            if (x % i == 0) s = s + 1;
        }
        if (s > 0) return false;
        return true;
    }

    public void wypiszPierwsze(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (pierwsza(i)) System.out.println(i);
        }
    }


    public int max(int a, int b) {
        System.out.println("int");
        if (a > b) return a;
        return b;
    }

    public double max(double a, double b) {
        System.out.println("double");
        if (a > b) return a;
        return b;
    }




}
