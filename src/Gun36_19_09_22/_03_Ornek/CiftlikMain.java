package Gun36_19_09_22._03_Ornek;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek k=new Kopek( "karabas");
        k.ses();
        k.kokladi();

        Kedi kedi1=new Kedi("kopük");
        kedi1.ses();
        kedi1.tirmaladi();
        hayvanSesi(kedi1);
        // polymorphism - çok çeşitlilik

        Hayvan hayvan1=new Hayvan("ördek");
        Hayvan hayvan2=new Kopek("kangal");
        Hayvan hayvan3=new Kedi("boncuk");
        // referans         nesne türü
        System.out.println("********************");
        hayvan1.ses();// genel hayvan sesi
        hayvan2.ses();// kopek hayvan havladı
        hayvan3.ses();// kedi hayvan miyavladı
        System.out.println("********************");
        hayvan2.ses();// kopek de olsa hayvan referansı sebebiyle metodlar
        // ksıtlı
        //peki bu hayvanı kopek formunu nasıl ortaya çıkartırım
        // tip döünüşümü acaba işime yarar mı
        ((Kopek)hayvan2).kokladi();// artık diğer metodları kullanıbilirim.
        //(int) Math.random(); casting buradakş gibi, tip dönüşümü


    }
    public static void hayvanSesi(Hayvan hayvan){
        hayvan.ses();
    }
    public static void hay(Kopek kopek,Kedi kedi){
        kopek.ses();
        kedi.ses();
    }

}
