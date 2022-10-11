package Gun11_15_08_22;

public class _08_JavaRandom {
    public static void main(String[] args) {
        // Soru : 0 ile 6 arasında random sayı üreten programı yazınız.
        double doubleRandomSayi=Math.random();// 0.0 - 0.999999 arası sayı üretiyor.
        System.out.println("doubleRandomSayi = " + doubleRandomSayi);
        //0 ile 6 arasında random sayı
        int intRandomSayi= (int) (doubleRandomSayi * 6); // 0-5.9999 - (int) -> 0-5
        // direkt yöntem
        System.out.println((int) (Math.random() *6 )+1);// 0-5 arası verir

    }
}
