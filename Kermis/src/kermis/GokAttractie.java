package kermis;

public interface GokAttractie  {



    default double kansSpelBelastingBetalen(double omzet, double vat) {
        return omzet * vat;
        }
}
