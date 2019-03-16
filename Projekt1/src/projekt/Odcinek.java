package projekt;

public class Odcinek {

    private Punkt punktA = new Punkt(0,0);
    private Punkt punktB = new Punkt(0,0);


    public Odcinek(Punkt p1, Punkt p2) {
        this.punktA=punktA;
        this.punktB=punktB;
    }

    public Odcinek() {
        this.punktA=null;
        this.punktB=null;
    }

    public double odlegosc(){
        return Math.hypot((punktA.getX()-punktB.getX()),(punktA.getY()-punktB.getY()));
    }

    public double najwieksza(int a, int b, int c) {
        if (a > b) {
            if (a > c) return a;
            return c;
        } else if (b > c) return b;
        return c;
    }


    public boolean jestTrojkat(Odcinek b, Odcinek c){

        if((odlegosc()+b.odlegosc()) > c.odlegosc() &&
                (odlegosc()+c.odlegosc()) > b.odlegosc() &&
                (c.odlegosc()+b.odlegosc()) > odlegosc() )
        {return true;}
     return false;

        //TODO
    }

    public static void main(String[] args) {
        Punkt p1 = new Punkt(1.,3.);
        Punkt p2 = new Punkt(5.,6.);
        Punkt p3 = new Punkt(1.,-1.);
        Odcinek a = new Odcinek(p1,p2);
        Odcinek b = new Odcinek(p2,p3);
        Odcinek c = new Odcinek(p1,p3);


        System.out.println(a.jestTrojkat(b,c));
    }



}



