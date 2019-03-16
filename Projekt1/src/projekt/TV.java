package projekt;

public class TV {

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
    int channel = 0;
    boolean turnedOn = true;


    public TV(int channel, boolean turnedOn) {
        this.channel = channel;
        this.turnedOn = turnedOn;
    }

    public void turnOn()
    {
        this.turnedOn=true;
    }
    public void turnOff()
    {
        this.turnedOn=false;
    }

    public void setChannel(int c)
    {
        this.channel=c;
    }


    public void channelUp()
    {
        this.channel =+ 1;
    }

    public void channelDown()
    {
        this.channel =- 1;
    }

}
