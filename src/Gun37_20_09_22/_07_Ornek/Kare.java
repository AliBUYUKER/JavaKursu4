package Gun37_20_09_22._07_Ornek;

public class Kare implements IHesaplari {
    @Override
    public double cevresi(int... dizi) {
        return (dizi[0]+dizi[0])*2;
    }

    @Override
    public double alani(int... dizi) {
        return dizi[0]*dizi[0];
    }
}
