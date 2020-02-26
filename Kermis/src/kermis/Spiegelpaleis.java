package kermis;

public class Spiegelpaleis extends Attractie {

    public Spiegelpaleis(){
        super.setTicketPrijs(2.75);
        super.setAttractieNaam("spiegelpaleis");
    }


    int start(){
        return 3;
    }

    void test() {
        System.out.println("Hallo ik zit in spiegelpaleis");
    }
}
