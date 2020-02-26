package kermis;

public interface RisicoRijkeAttracties {

    default int  opstellingsKeuring(int k) {
        return k;
    }

    default int setDraaiLimiet(int aa) {
        return aa;
    }

    int keuring();


}
