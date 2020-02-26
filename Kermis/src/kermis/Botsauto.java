package kermis;

public class Botsauto extends Attractie {

    public Botsauto(){
        super.setTicketPrijs(2.50);
        super.setAttractieNaam("botsauto");
    }

    public double ticketPrijs = 2.50;

    int start(){
        return 1;
    }


}
