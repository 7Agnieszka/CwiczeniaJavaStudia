package projekt;

import com.sun.org.apache.xpath.internal.SourceTree;

public class TV {


    private int channel = 0;
    private boolean turnedOn = true;

    public int getChannel() {
        return channel;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    /*Zadanie - przykªad Na podstawie poni»szego diagramu UML stwórz klas¦ TV.
    TV
    channel: int
    turnedOn: boolean
    +TV() // tworzy obiekt z domy±nymi warto±ciami pól
    +turnOn(): void // zmienia stan na wª¡czony
    +turnOff(): void // zmienia stan na wyª¡czony
    +setChannel(c: int): void // ustawia dowolny kanaª
    +channelUp(): void // zmienia kanaª na kanaª o numerze o jeden wi¦kszy
    +channelDown(): void // zmienia kanaª na kanaª o numerze o jeden mniejszy
    Stwórz równie» klas¦ TestTV, w której zademonstrujesz dziaªanie poszczególnych metod.*/


    public TV(int channel, boolean turnedOn) {
        this.channel = channel;
        this.turnedOn = turnedOn;
    }

    public void turnOn() {
        turnedOn = true;
    }

    public void turnOff() {
        turnedOn = false;
        channel = 0;
    }

    public void setChannel(int c) {
        if (c < 0) {
            System.out.println("Channel must be non-negative");
            channel = 0;
        } else {
            channel = c;
        }
    }


    public void channelUp() {
        channel = +1;
    }

    public void channelDown() {
        channel = -1;
    }

    public void menu() {
        System.out.println("Witaj, telewizor zostal wlaczony");
        System.out.println("wybierz program 1 - 200");
        System.out.println("wybierz x zeby wylaczyc");

    }


    public void akcja(String x) {

        if (x.equals("x")) {
            turnOff();
        }
        else{
            channel=Integer.parseInt(x);
        }

    }


    public void stan() {
        if (turnedOn) {
            System.out.println("Telewizor jest wlaczony na kanale " + channel);
        } else {
            System.out.println("Telewizor jest wylaczony");
        }

    }

}
