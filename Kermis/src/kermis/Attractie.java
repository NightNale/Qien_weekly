package kermis;

public  class Attractie {



    protected double omzetAttr = 0.0;
    protected int kaartjes = 0;
    int startpunt =0;
    protected double ticketPrijs;
    private String attractieNaam ="";

    public void setTicketPrijs(double attractiePrijs) {
        this.ticketPrijs = attractiePrijs;
    }
    public void setAttractieNaam(String naam){
        this.attractieNaam=naam;
    }

   public void draaien(){
        kaartjes++;
        omzetAttr = omzetAttr + ticketPrijs;
        Kassa.totaleOmzet = Kassa.totaleOmzet + ticketPrijs;
        Kassa.totaleKaartjes++;
    }




}
