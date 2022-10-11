package Gun04_04_08_22;

public class _01_WideningCasting {
    public static void main(String[] args) {
        // byte -> short -> char -> int -> long -> float -> double
        int sayi=9;
        long toplam=678;
        double oran = 3.2;
        oran = sayi; // oran= 9 , kayıp olmadı
        // bu tip dönüşümlere genişletilme yönünde dönüşüm deneir
        System.out.println("oran = " + oran);
        toplam = sayi;
        System.out.println("toplam = " + toplam);
        oran= toplam;
        System.out.println("oran = " + oran);


    }
}
