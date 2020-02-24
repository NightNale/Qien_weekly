public class Ladderklimmen extends Attractie {

    String ladderNaam = "ladderklimmen";
    double ladderPrijs = 5.00;
    int ladderOppervlakte;
    void setLadder(String naam, double prijs, int oppervlakte){
        this.ladderNaam = naam;
        this.ladderPrijs = prijs;
        this.ladderOppervlakte = oppervlakte;
    }

    int start(){
        return 6;
    }

    void test() {
        System.out.println("Hallo ik zit in ladderklimmen");
    }
}
