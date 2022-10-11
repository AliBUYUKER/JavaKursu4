package Gun37_20_09_22._03_Ornek;

public class Geometri {
    public static void main(String[] args) {
        Cember c=new Cember();
        c.ciz();

        Dikdortgen d=new Dikdortgen();
        d.ciz();

        //interface lerden nesne üretilme fakat referans tipi
        //oluşturulabilir. bu bize polymorphism sağladı.
        ICizdirir c2=new Cember();
       c2.ciz();//direk olarak sadece ınterface deki
       // ismi veilmiş olanlar metodlara erişebilirsin

        cizdirme(c);
        cizdirme(d);

    }
    public static void cizdirme(ICizdirir iciz){
        iciz.ciz();
    }

}
