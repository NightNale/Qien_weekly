package kermis;

public class Spookhuis extends Attractie {

    public Spookhuis(){
        super.setTicketPrijs(3.20);
        super.setAttractieNaam("spookhuis");
    }

    int start(){
        return 4;
    }
}
