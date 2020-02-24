public class Spiegelpaleis extends Attractie {

    String spiegelNaam = "spiegelpaleis";
    double spiegelPrijs = 2.75;
    int spiegelOppervlakte;
    void setSpiegelpaleis(String naam, double prijs, int oppervlakte){
        this.spiegelNaam = naam;
        this.spiegelPrijs = prijs;
        this.spiegelOppervlakte = oppervlakte;
    }

    int Start(){
        return 3;
    }

    void test() {
        System.out.println("Hallo ik zit in spiegelpaleis");
    }
}
