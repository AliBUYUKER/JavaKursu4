package Gun33_14_09_22._01_Ornek;

public class Kisi {
    private String ad;
    private String soyad;
    private int yas;

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
    void yasAta(int yas){
        if (yas>0){
            this.yas=yas;
        }else System.out.printf("Hatalı giriş");
    }
    int yasVer(){
        return this.yas;
    }
    void setAd(String ad){
        if (ad.length()<25)
            this.ad=ad;
    }
    String adVer(){
        return this.ad;
    }
    void setSoyad(String soyad){
        if (soyad.length()<25)
            this.soyad=soyad;
    }
}
