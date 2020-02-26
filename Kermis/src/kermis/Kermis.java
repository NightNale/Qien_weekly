package kermis;

public class Kermis {
    public static void main(String[] args) {

        Berichten b = new Berichten();

        for (int st = 0; st < 30; st++){
            b.play();
            }

        Berichten.checkDrukte();


        System.out.println("De totale omzet van de kermis: "+ Kassa.totaleOmzet);
        System.out.println("De totale kaartjes van de kermis: "+ Kassa.totaleKaartjes);


    }
}
