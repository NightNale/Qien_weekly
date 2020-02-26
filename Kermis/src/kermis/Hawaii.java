package kermis;

public class Hawaii extends Attractie {

    public Hawaii(){
        super.setTicketPrijs(2.90);
        super.setAttractieNaam("hawaii_swing");
    }


    int start(){
        return 5;
    }

    void test() {
        System.out.println("Hallo ik zit in hawaii");
    }
}
