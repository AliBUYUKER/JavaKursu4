package Gun39_22_09_22.Ornek2;

public class Daire extends Sekil{
    private int r;

    public Daire(int r,String name) {
        super(name);
        setR(r);
    }

    @Override
    double alan() {
        return Math.PI*r*r;
    }

    @Override
    double cevre() {
        return Math.PI*2*r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
