package Gun31_12_09_22._02_FinalModifier.Ornek2;

public class Vatandas {
    String isim;
     private final int tc;

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tc=" + tc +
                '}';
    }

    static int sayac=1;

    public Vatandas(String isim) {
        this.isim = isim;
        this.tc = sayac++;
    }

}
