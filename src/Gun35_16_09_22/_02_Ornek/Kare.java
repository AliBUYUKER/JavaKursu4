package Gun35_16_09_22._02_Ornek;

public class Kare extends Dikdortgen{
    public Kare(int kisaKenar) {
        super(kisaKenar,kisaKenar);
    }

    @Override
    public double alanHesabi() {
        return getKisaKenar()+getKisaKenar();
    }

    @Override
    public double cevreHesabi() {
        return getKisaKenar()*4;
    }
}
