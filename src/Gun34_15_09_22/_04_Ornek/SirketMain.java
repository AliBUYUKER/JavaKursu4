package Gun34_15_09_22._04_Ornek;

public class SirketMain {
    public static void main(String[] args) {
        Calisan work=new Calisan("Ali",1000,3);
        System.out.println(work.maasHesapla());
        System.out.println(work);
        GenelMudur gm=new GenelMudur("mudur",2000.1,4,2.5);
        System.out.println( gm.maasHesapla());
        System.out.println(gm);
        System.out.println(gm.yeniMaas());

    }
}
