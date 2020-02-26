package kermis;

public class Hawaii extends Attractie implements RisicoRijkeAttracties {

    protected int draaiLimiet;
    protected int startKeuring;
    protected int draaiHuidig;

    public void opstellingsKeuring(){
        if(kaartjes == 0) {
            System.out.println("De hawaii krijgt zijn eerste keuring");
        }
    }


    public Hawaii() {
        super.setTicketPrijs(2.25);
        super.setAttractieNaam("hawaii");
        draaiLimiet = setDraaiLimiet(10);
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
        System.out.println("De hawaii heeft een nieuwe keuring gehad.");
        return draaiHuidig = draaiHuidig - draaiLimiet;
    }

}

