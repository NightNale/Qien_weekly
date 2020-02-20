package mastermind;
import java.util.Scanner;

public class Spel {
    Scanner sc;
    Computer computer;
    String codePc;

    public Spel() {
        this.sc = new Scanner(System.in);
        this.computer = new Computer();
        this.codePc = Computer.codemaker();
    }

    void start() {
        int poging = 0;
        int winst = 0;
        Berichten.startenofq();

        while(poging < 20 || winst < 6) {
            String input = this.sc.next();
            if (input.charAt(0) == 'q') {
                break;
            }

            if (input.equals(this.codePc)) {
                ++winst;
                Berichten.winst();
                this.codePc = Computer.codemaker();
            } else {
                ++poging;
                char[] playercode = new char[]{input.charAt(0), input.charAt(1), input.charAt(2), input.charAt(3)};
                System.out.println(playercode);
                int dubbelCheck = 0;

                for(int j = 0; j < this.codePc.length(); ++j) {
                    if (playercode[j] == this.codePc.charAt(j)) {
                        System.out.println("De code op : " + j + " is juist");
                    }

                    if (playercode[j] == this.codePc.charAt(0) && playercode[j] != this.codePc.charAt(j)) {
                        System.out.println("De code op : " + j + " komt WEL voor");
                        ++dubbelCheck;
                    }

                    if (playercode[j] == this.codePc.charAt(1) && playercode[j] != this.codePc.charAt(j)) {
                        System.out.println("De code op : " + j + " komt WEL voor");
                        ++dubbelCheck;
                    }

                    if (playercode[j] == this.codePc.charAt(2) && playercode[j] != this.codePc.charAt(j)) {
                        System.out.println("De code op : " + j + " komt WEL voor");
                        ++dubbelCheck;
                    }

                    if (playercode[j] == this.codePc.charAt(3) && playercode[j] != this.codePc.charAt(j)) {
                        System.out.println("De code op : " + j + " komt WEL voor");
                        ++dubbelCheck;
                    }

                    if (playercode[j] != this.codePc.charAt(j) && playercode[j] != this.codePc.charAt(j)) {
                        System.out.println("De code op : " + j + " komt niet voor");
                    }
                }

                System.out.println("aantal pogingen: " + poging);
            }
        }

    }
}
