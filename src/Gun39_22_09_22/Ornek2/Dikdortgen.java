package Gun39_22_09_22.Ornek2;

public class Dikdortgen extends Sekil{
    private int kisaKenar;
    private int uzunKenar;

    public Dikdortgen(int kisaKenar, int uzunKenar,String name) {
        super(name);
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    @Override
    double alan() {
        return kisaKenar*uzunKenar;
    }

    @Override
    double cevre() {
        return (kisaKenar*uzunKenar)*2;
    }

    public int getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }
}
