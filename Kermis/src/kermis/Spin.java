package kermis;

public class Spin extends Attractie implements RisicoRijkeAttracties {

    protected int draaiLimiet;
    protected int startKeuring;
    protected int draaiHuidig;

    public void opstellingsKeuring(){
        if(kaartjes == 0) {
            System.out.println("De spin krijgt zijn eerste keuring");
        }
    }


    public Spin() {
        super.setTicketPrijs(2.25);
        super.setAttractieNaam("spin");
        draaiLimiet = setDraaiLimiet(5);
        startKeuring = opstellingsKeuring(0);
    }

    @Override
    public void draaien(){
        opstellingsKeuring();
        kaartjes++;
        draaiHuidig++;
        omzet = omzet + ticketPrijs;
        Kassa.totaleOmzet = Kassa.totaleOmzet + ticketPrijs;
        Kassa.totaleKaartjes++;
    }



    public int keuring(){
        System.out.println("De spin heeft een nieuwe keuring gehad.");
       return draaiHuidig = draaiHuidig - draaiLimiet;
    }

}
