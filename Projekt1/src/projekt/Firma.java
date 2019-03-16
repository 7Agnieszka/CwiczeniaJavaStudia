package projekt;

public class Firma {


    public static void main(String[] args) {

        Pracownik p1 = new Pracownik("Aga");
        Pracownik p2 = new Pracownik("Aga","Wojcik");
        Pracownik p3 = new Pracownik("Aga","Kowalska",25);

        p1.przedstawSie();
        p2.przedstawSie();
        p3.przedstawSie();


    }

}
