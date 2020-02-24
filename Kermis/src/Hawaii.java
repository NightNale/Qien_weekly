public class Hawaii extends Attractie {

    String hawaiiNaam = "hawaii";
    double hawaiiPrijs = 2.50;
    int hawaiiOppervlakte;
    void setHawaii(String naam, double prijs, int oppervlakte){
        this.hawaiiNaam = naam;
        this.hawaiiPrijs = prijs;
        this.hawaiiOppervlakte = oppervlakte;
    }


    int start(){
        return 5;
    }

    void test() {
        System.out.println("Hallo ik zit in hawaii");
    }
}
