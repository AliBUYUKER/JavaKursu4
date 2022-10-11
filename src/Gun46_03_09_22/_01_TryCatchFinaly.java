package Gun46_03_09_22;

public class _01_TryCatchFinaly {
    public static void main(String[] args) {
        long startTime=0;
        String str ="";
        try {
            startTime=System.currentTimeMillis();
            System.out.println("hatadan önceki nokta");
            char ilkHarf=str.charAt(0); // hata noktası
            System.out.println("hatadan sonraki nokta");
        }catch (Exception ex){

            System.out.println("catch blogu çalıştı");
        }finally {
            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println(gecenSure);
            System.out.println("trr-catch bloğuyla ilgili son yapılacaklar");
            //hata olsun veya olmasın çalışan kısım
            // her zaman çalışır
            // işlemlerde geriye kalan yapılacaklar bu bölümde yapılır.
            // kullanım sebebi her iki durum sonrası geriye kalan yapılacaklar
            // birlikte olsun diyedir.
        }
        System.out.println("diğer çalışan kodlar");
        System.out.println("program sonu");
    }
}
