package Gun37_20_09_22._06_Ornek;

public class Dikdortgen implements IHesaplari{
    int uzunKenar;
    int kisaKenar;

    public Dikdortgen(int uzunKenar, int kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    public int getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    @Override
    public int cevresi() {
        System.out.println("Dikdörtgen cevresi = "+uzunKenar*kisaKenar);
        return  uzunKenar*kisaKenar;
    }

    @Override
    public int alani() {
        System.out.println("Dikdötgen alanı = "+2*(uzunKenar*kisaKenar));
    return 2*(uzunKenar*kisaKenar);
    }
}
