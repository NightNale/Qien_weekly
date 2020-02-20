package mastermind;
import java.util.Random;

public class Computer {
    static Random r = new Random();
    static char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f'};
    static char[] computerKeuze = new char[4];

    public Computer() {
    }

    public static String codemaker() {
        String tijdelijkeCode = "";

        for(int i = 0; i < computerKeuze.length; ++i) {
            int rNum = r.nextInt(6);
            computerKeuze[i] = alphabet[rNum];
        }

        tijdelijkeCode = String.valueOf(computerKeuze);
        return tijdelijkeCode;
    }
}
