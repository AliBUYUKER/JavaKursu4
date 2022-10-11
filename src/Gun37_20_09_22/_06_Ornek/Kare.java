package Gun37_20_09_22._06_Ornek;

public class Kare extends Dikdortgen implements IHesaplari {

    public Kare(int kisaKenar) {
        super(kisaKenar,kisaKenar);
    }

    @Override
    public int cevresi() {
        System.out.println("Kare cevresi ="+kisaKenar*kisaKenar);
        return kisaKenar*kisaKenar;
    }

    @Override
    public int alani() {
        System.out.println("Kare alanı ="+kisaKenar*4);
return kisaKenar*4;
    }
}
