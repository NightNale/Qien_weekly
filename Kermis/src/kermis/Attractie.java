package kermis;

public  class Attractie {


    public double omzet = 0.0;
    public int kaartjes = 5;
    private double ticketPrijs;
    private String attractieNaam ="";

    public void setTicketPrijs(double attractiePrijs) {
        this.ticketPrijs = attractiePrijs;
    }
    public void setAttractieNaam(String naam){
        this.attractieNaam=naam;
    }

   public void draaien(){
        kaartjes++;
        omzet = omzet + ticketPrijs;
    }




}
