public class Spookhuis extends Attractie {

    String spookhuisNaam = "spookhuis";
    double spookhuisPrijs = 3.20;
    int spookhuisOppervlakte;
    void setSpookhuis(String naam, double prijs, int oppervlakte){
        this.spookhuisNaam = naam;
        this.spookhuisPrijs = prijs;
        this.spookhuisOppervlakte = oppervlakte;
    }


    int Start(){
        return 4;
    }

    void test() {
        System.out.println("Hallo ik zit in spookhuis");
    }
}
