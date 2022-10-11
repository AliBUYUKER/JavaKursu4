package Gun37_20_09_22._07_Ornek;

public class Dikdortgen implements IHesaplari {
    public Dikdortgen(int... dizi) {
    }

    @Override
    public double cevresi(int... dizi) {
        return (dizi[0]+dizi[1])*2;
    }

    @Override
    public double alani(int... dizi) {
        return dizi[0]+dizi[1];
    }
}
