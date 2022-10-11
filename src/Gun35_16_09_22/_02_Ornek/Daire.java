package Gun35_16_09_22._02_Ornek;

public class Daire extends Sekil{
    private int r;
    public Daire(int r) {
        setR(r);
    }

    @Override
    public double alanHesabi() {
        return Math.PI*r*r;
    }

    @Override
    public double cevreHesabi() {
        return Math.PI*2*r;
    }

    @Override
    public String toString() {
        return "Daire{" +
                super.toString()+
                "r=" + r +
                '}';
    }



    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
