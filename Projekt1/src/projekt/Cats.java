package projekt;

public class Cats {


    private String name;
    private int age;

    public Cats(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printCatInfo(){

       System.out.println(name + " ma " + age + " lata.");
    }


}
