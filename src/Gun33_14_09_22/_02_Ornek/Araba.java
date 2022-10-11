package Gun33_14_09_22._02_Ornek;

public class Araba {
    private String renk;
    private String model;
    private int motorHacmi;
    private int kapiSayisi;

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model='" + model + '\'' +
                ", motorHacmi=" + motorHacmi +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }

    public Araba(String renk, String model, int motorHacmi, int kapiSayisi) {
       /* this.renk = renk;
        this.model = model;
        this.motorHacmi = motorHacmi;
        this.kapiSayisi = kapiSayisi;*/
        setRenk(renk);
        setModel(model);
        setKapiSayisi(kapiSayisi);
        setMotorHacmi(motorHacmi);
    }
    Araba(){

    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMotorHacmi(int motorHacmi) {
        if (motorHacmi<=2000)
        this.motorHacmi = motorHacmi;
        else System.out.println("Burası Türkiye");
    }

    public void setKapiSayisi(int kapiSayisi) {
        if (kapiSayisi<6)
        this.kapiSayisi = kapiSayisi;
        else System.out.println("Hatalı giriş");
    }

    public String getRenk() {
        return renk;
    }

    public String getModel() {
        return model;
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

}
