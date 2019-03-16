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



public class Forum {
    static int noOfUsers = 0;

    public static void main(String[] args) {

       User u1 = new User("Jan", "M",25 );
       User u2 = new User("Jan", "M",25 );
       User u3 = new User("Jan", "M",25 );
       User u4 = new User("Jan", "M",25 );

       u1.liczbaUserow();
        u1.liczbaZalogowancyh();
        u1.logIn();
        u1.logIn();
        u4.liczbaZalogowancyh();
        u2.logIn();
        u3.logIn();
        u1.liczbaZalogowancyh();
        u2.logOut();
        u2.liczbaZalogowancyh();
        u2.liczbaUserow();

    }
}
