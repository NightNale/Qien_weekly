public class Botsauto extends Attractie {

    String baNaam = "botsauto";
    double baPrijs = 2.50;
    int baOppervlakte;
    void setBotsauto(String naam, double prijs, int oppervlakte){
        this.baNaam = naam;
        this.baPrijs = prijs;
        this.baOppervlakte = oppervlakte;
    }


    int Start(){
        return 1;
    }

    void test() {
        System.out.println("Hallo ik zit in botsauto");
    }
}
