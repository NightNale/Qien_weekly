package kermis;

public class Ladderklimmen extends Attractie {

    public Ladderklimmen(){
        super.setTicketPrijs(5.00);
        super.setAttractieNaam("ladderklimmen");
    }

    int start(){
        return 6;
    }

    void test() {
        System.out.println("Hallo ik zit in ladderklimmen");
    }
}
