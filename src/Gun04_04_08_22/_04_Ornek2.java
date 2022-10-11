package Gun04_04_08_22;

public class _04_Ornek2 {
    public static void main(String[] args) {
        // 1 tane double ve 1 tane short değişken tanımlayınız,
        // değer atayınız , sonra double değişkeni short değişkene çevirerek,
        // bütün değerleri ekrana yazdırınız.
        double oran=3.2;
        short Kisa=2;
        System.out.println("OnceKisa = " + Kisa);
         Kisa=(short) oran;
        System.out.println("SonraKisa = " + Kisa);
        oran=30000000.2;
        Kisa = (short) oran;
        System.out.println("SonraKisa2 = " + Kisa);
        // hem tam sayı kısmı sığmuyor, hemde ondalıklı kısım atılmıyor tamamen değer kayboluyor.







    }
}
