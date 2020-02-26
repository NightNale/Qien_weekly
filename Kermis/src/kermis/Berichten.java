package kermis;

import java.util.*;

public class Berichten {


        Botsauto botsauto = new Botsauto();
        Spin spin = new Spin();
        Spiegelpaleis spiegel = new Spiegelpaleis();
        Spookhuis spookhuis = new Spookhuis();
        Hawaii hawaii = new Hawaii();
        Ladderklimmen ladder = new Ladderklimmen();


    public void play(){



        System.out.println(
                "------------------------------------\n"+
                " Welkom op de Kermis van NightNale\n"+
                " Kies voor één van de volgende opties\n"+
                "1 voor botsauto's, \n" +
                "2 voor spin, \n" +
                "3 voor spiegelpaleis, \n" +
                "4 voor spookhuis, \n" +
                "5 voor hawaii, \n" +
                "6 voor ladderklimmen.\n"+
                "7 voor stoppen\n"+
                "------------------------------------");

        Scanner sc = new Scanner(System.in);
        String welkomB = sc.next();
        int wb = welkomB.charAt(0);

        if(wb  == 49) { // 49 = 1 in char
            System.out.println("Enjoy de botsauto's");
            botsauto.draaien();
        }
        if(wb == 50){

            if(spin.draaiLimiet >= spin.draaiHuidig) {
                spin.draaien();
                System.out.println("Enjoy de spin");
            }
            else{
                spin.keuring();
                spin.draaien();
                System.out.println("Enjoy de spin");
            }
        }
        if(wb == 51) {
            System.out.println("Enjoy het spiegelpaleis");
            spiegel.draaien();
        }
        if(wb == 52) {
            System.out.println("Enjoy het spookhuis");
            spookhuis.draaien();
        }
        if(wb == 53) {
            if(hawaii.draaiLimiet >= hawaii.draaiHuidig) {
                hawaii.draaien();
                System.out.println("Enjoy de hawaii swing");
            }
            else{
                hawaii.keuring();
                hawaii.draaien();
                System.out.println("Enjoy de hawaii swing");
            }
        }
        if(wb == 54) {
            System.out.println("Enjoy het ladderklimmen");
           ladder.draaien();
        }
        if(wb == 55) {
            System.out.println("Tot ziens");
        }
    }

    static void checkDrukte(){
        System.out.println("Met de invoer van de letter \"o\" zien we de omzet. Met de invoer van de letter \"k\" zien we het aantal kaartjes.\n");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

            if (input.charAt(0) == 'o'){
                System.out.println(Kassa.totaleOmzet);
            }
            if (input.charAt(0) == 'k'){
                System.out.println(Kassa.totaleKaartjes);
            }

            else{
                System.out.println("Error wrong input \n Please enter [ o ] or [ k ]");
            }
    }

}
