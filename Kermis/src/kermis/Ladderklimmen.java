package kermis;

public class Ladderklimmen extends Attractie implements GokAttractie {



    public Ladderklimmen(){
        super.setTicketPrijs(5.00);
        super.setAttractieNaam("ladderklimmen");
    }


    void test() {
        System.out.println("Hallo ik zit in ladderklimmen");
    }

    void belastingBetalen() {
        double belasting = kansSpelBelastingBetalen(omzetAttr, 0.3);
        System.out.println("Kansspelbelasting is betaald: " + belasting);
    }
}

