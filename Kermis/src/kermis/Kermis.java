package kermis;

public class Kermis {
    public static void main(String[] args) {

        Botsauto botsA = new Botsauto();
        Spin spinA = new Spin();
        Spiegelpaleis spiegelA = new Spiegelpaleis();
        Spookhuis spookA = new Spookhuis();
        Hawaii hawaiiA = new Hawaii();
        Ladderklimmen ladderA = new Ladderklimmen();

        botsA.draaien();
        spinA.draaien();
        spiegelA.draaien();
        spookA.draaien();
        hawaiiA.draaien();
        ladderA.draaien();

        System.out.println(botsA.omzet);
    }
}
