package Gun35_16_09_22._02_Ornek;

import com.sun.java.swing.plaf.windows.WindowsTextUI;

public class Dikdortgen extends Sekil{
    private int kisaKenar;
    private int uzunKenar;

    public Dikdortgen(int kisaKenar,int uzunKenar) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    @Override
    public double alanHesabi() {
        return 2*(uzunKenar*kisaKenar);
    }

    @Override
    public double cevreHesabi() {
        return uzunKenar*kisaKenar;
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +super.toString()+
                "kisaKenar=" + kisaKenar +
                ", uzunKenar=" + uzunKenar +
                '}';
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
