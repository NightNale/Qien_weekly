package kermis;

public class Spin extends Attractie {

    public Spin(){
        super.setTicketPrijs(2.25);
        super.setAttractieNaam("spin");
    }




    int start(){
        return 2;
    }

    void test() {
        System.out.println("Hallo ik zit in spin");
    }
}
