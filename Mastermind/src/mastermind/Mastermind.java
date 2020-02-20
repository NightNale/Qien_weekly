package mastermind;

public class Mastermind {
    public static void main(String[] args){

        Spel spel = new Spel();
        Berichten.welkom();

        spel.start();

        Berichten.eind();
    }
}
