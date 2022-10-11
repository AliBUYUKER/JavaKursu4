package Gun27_06_09_22.Gun27_06_09_22_01_Ornek;



public class Kampus {
    // Bir kampus programı için asagıdaki özellikte bilgilerin
    // kaydedileceği clasları yazınız.
    // Okul :  adı, mudurAdi, ucreti(double)
    // Ogrenci : okulNo, tamAd, okulu

    // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz atayıp
    // yazdırınız.

    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci();
        ogr1.okulNo=1;
        ogr1.tamAd="Ali Büyüker";
        ogr1.okulu=new Okul();
        ogr1.okulu.adi="Atatürk";
        ogr1.okulu.mudurAdi="İsmet Temur";
        ogr1.okulu.ucreti=1000;

        System.out.println("ogr1.tamAd = " + ogr1.tamAd);
        System.out.println("ogr1.okulNo = " + ogr1.okulNo);
        System.out.println("ogr1.okulu = " + ogr1.okulu.adi);
        System.out.println("ogr1.okulu.mudurAdi = " + ogr1.okulu.mudurAdi);
        System.out.println("ogr1.okulu.ucreti = " + ogr1.okulu.ucreti);
        
        
    }
    
    
    
    
    
    
}
