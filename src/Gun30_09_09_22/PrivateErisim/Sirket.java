package Gun30_09_09_22.PrivateErisim;

public class Sirket {
    public static void main(String[] args) {
        Calisan cal1=new Calisan();
        cal1.id=1;
        cal1.name="Ali";
        cal1.surName="Büyüker";
        //cal1.password="123"; // direk erişiliyor,
        // hemde kontrolsüz atandı.
        // direk erişime kapalı olmalı
        cal1.sifreAta("1234567");
        cal1.sifreAta("wew654819684");
        cal1.sifreGoster();
        System.out.println(cal1.sifreGoster());


    }


}
