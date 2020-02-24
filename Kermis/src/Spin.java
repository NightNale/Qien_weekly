public class Spin extends Attractie {

    String spinNaam = "spin";
    double spinPrijs = 2.25;
    int spinOppervlakte;
    void setSpin(String naam, double prijs, int oppervlakte){
        this.spinNaam = naam;
        this.spinPrijs = prijs;
        this.spinOppervlakte = oppervlakte;
    }


    int Start(){
        return 2;
    }

    void test() {
        System.out.println("Hallo ik zit in spin");
    }
}
