package kermis;

import java.util.*;

public class Berichten {



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
