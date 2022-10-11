package Gun34_15_09_22._01_Ornek;

public class YoneticiYeni extends Personel {
    // inheritance konu başlığı
    private double yoneticiTazminati;
    // 1 dükkan daha ekledin
    public void zamYap(){
        System.out.printf("Zam yapıldı");
    }
    public double getYoneticiTazminati(){
        return yoneticiTazminati;
    }
}
