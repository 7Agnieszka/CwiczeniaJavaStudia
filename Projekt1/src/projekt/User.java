package projekt;

/*
*
* Zadanie 7. Napisz dwie klasy: Forum, User. Klasa User powinna posiadać następujące atrybuty:
* name, sex, age; zaś klasa Forum powinna zawierać atrybut określający liczbę zalogowanych użytkowników.
* Proszę zaprojektować oraz zaimplementować tak klasy aby symulowały one działanie forum w internecie,
* tzn. przy tworzeniu obiektu z klasy User licznik
* zalogowanych użytkowników powinien się zwiększyć o 1. Napisz dodatkowe metody np. logout.
* Przetestuj działanie tych klas.
*
*
* */
public class User {
    static int noOfUsers = 0;
    static int noOfLoggedUsers = 0;



    private String name;
    private String sex;
    private int age;
    boolean loggedIn=false;

    public User(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;

        noOfUsers++;
    }

    public void liczbaUserow(){
        System.out.println(noOfUsers);
    }

    public void logIn(){
        if(!loggedIn) {
            noOfLoggedUsers++;
            loggedIn = true;
        }

    }

    public void logOut(){
        if(loggedIn){
            noOfLoggedUsers--;
            loggedIn = false;
        }
    }

    public void liczbaZalogowancyh(){
        System.out.println(noOfLoggedUsers);
    }
}

