package mastermind;
public class Berichten {
    public Berichten() {
    }

    public static void welkom() {
        System.out.println(" ------------------------------------");
        System.out.println(" -----  Welkom bij NightNale'   -----");
        System.out.println(" ---------    MasterMind   ----------");
        System.out.println(" ------------------------------------");
        System.out.println(" -----   Raad de code en win   ------");
        System.out.println(" ----   De code bevat 0 tot 4   -----");
        System.out.println(" ---    a - b - c - d - e - f   -----");
        System.out.println(" ------------------------------------");
        System.out.println(" ----------   20 pogingen   ---------");
        System.out.println(" ------------------------------------");
        System.out.println(" ------------   SUCCES   ------------");
        System.out.println(" ------------------------------------");
    }

    public static void startenofq() {
        System.out.println(" -------   waag een poging  ---------");
        System.out.println(" -------------   of   ---------------");
        System.out.println(" ---    druk - q - om te stoppen   --");
        System.out.println(" ------------------------------------");
    }

    public static void winst() {
        System.out.println(" ------------------------------------");
        System.out.println("--------------   WINST   ------------");
        System.out.println(" ---------   GEFELICITEERD   --------");
        System.out.println(" ------------------------------------");
        System.out.println(" -----   waag nog een poging  -------");
        System.out.println(" -------------   of   ---------------");
        System.out.println(" ---    druk - q - om te stoppen   --");
        System.out.println(" ------------------------------------");
    }

    public static void eind() {
        System.out.println(" ------------------------------------");
        System.out.println(" -------------  BEDANKT   -----------");
        System.out.println(" -----------   TOT ZIENS  -----------");
        System.out.println(" --------------------------------NN--");
    }
}
