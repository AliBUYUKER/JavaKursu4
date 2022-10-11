 package Gun02;

public class _06_Değiskenler {
    public static void main(String[] args)
    {


        // Değişkenler - Variable
        int sayi; // int : tam sayı saklayacak kadar hazırda yer ayırıyor ve onun adına sayi diyor
        // değişkenin adı sayı, tipi int : tam sayı
        int saYi; // bir harf farklı olsa farklı değişkendir
        int SAYI; // büyük küçük harf  tamamen farklı değişken demektir.
        // Java büyük küçük harf duyarlı (case sensitive) dildir.
        sayi=5; // sayının değeri 5 oldu
        System.out.println("sayi");// çift tırnak arasındaki her şey ekrana direk yazılır.
        System.out.println(sayi);// değişkenin adını direkt yazarak DEĞERİNİ yazar
        System.out.println("sayi="+sayi);// sayi=5

        int kisaKenar=5;
        int UzunKenar=7;

        int cevre=kisaKenar+kisaKenar+UzunKenar+UzunKenar;


        System.out.println("Çevresi="+cevre);

    }
}
