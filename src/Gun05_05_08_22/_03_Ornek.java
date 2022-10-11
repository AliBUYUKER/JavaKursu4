package Gun05_05_08_22;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        // kullanıcı adı ve soyadını ekrana yardır
        Scanner Okuyucu = new Scanner(System.in); // okuma işlemini yaoacak olan değişken tanımlandı
        System.out.println("Adı Soyadı = ");// ekrana neyin girileceğini yazdık bilgilendirme
        String adiSoyadi = Okuyucu.nextLine();// okuma işlemi bu noktada yapılıyor
        System.out.println("adiSoyadi = " + adiSoyadi); // verinin tekrar okunabildiğini tekrak ekrana yazarak kontrol ettim.


    }
}
