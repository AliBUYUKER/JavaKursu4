package Gun05_05_08_22;

import java.util.Scanner;

public class ODEV {
    public static void main(String[] args) {
        /*1- Bir String oluşturun. Konsol'a isminizi girin.İsminizi yazdırın.
        2- Bir int oluşturun.Konsol'a herhangi bir sayı giriniz.Bu sayıyı yazdırın.
        3- Bir String oluşturun.Konsol'a sevdiğiniz bir meyveyi yazın.O meyveyi yazdırınız.
        4- Bir int oluştur.Konsol'a arabanızdaki kapı sayısını girin.Bu int'i yazdırın.
        5- Bir String oluştur.Konsol'a 10 sene önceki yaşadığın şehri yazın.Bu String'i yazdırın.
        6- Bir string oluşturunuz.Doğum gününüzü konsola giriniz.String'i yazdırınız.
        7- Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
                Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.
        8- Bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.Byte'ı yazdırınız.
        9- Bir float oluşturunuz.Konsola boyunuzu giriniz.Float'ı yazdırınız. */

        /* 1-) */
        Scanner oku = new Scanner(System.in);
        System.out.print("Adınız = ");
        String Adiniz = oku.next();
        System.out.println("Adınız = " + Adiniz);
        /* 2-) */
        System.out.print("Sayı = ");
        int Sayi = oku.nextInt();
        System.out.println("Sayı = " + Sayi);
        /* 3-) */
        System.out.print("Meyve = ");
        String Meyve = oku.next();
        System.out.println("Meyve = " + Meyve);
        /* 4-) */
        System.out.print("Araba Kapısı = ");
        int ArabaKapisi = oku.nextInt();
        System.out.println("Araba Kapısı = " + ArabaKapisi);
        /* 5-) */
        System.out.print("Şehir = ");
        String Sehir = oku.next();
        System.out.println("Şehir = " + Sehir);
        /* 6-) */
        System.out.print("Doğum Gününüz = ");
        String DogumGunu = oku.next();
        System.out.println("Doğum Günü = " + DogumGunu);
        /* 7-) */
        System.out.print("Bir Banka Hesabınız Var mı? = ");
        boolean banka = oku.nextBoolean();
        System.out.println(banka ?  "Banka hesabınız var" : " Banka hesabınız yok");
        /* 8-) */
        System.out.print("Kilonuz = ");
        byte kg = oku.nextByte();
        System.out.println("Kilo = " + kg);
        /* 9-) */
        System.out.print("Boyunuz = ");
        float Boy = oku.nextFloat();
        System.out.println("Boy = " + Boy);
        /* Sonuçlar */
        System.out.println("Adınız = " + Adiniz + " Sayı = " + Sayi + " Meyve = " + Meyve + " Araba Kapısı = " + ArabaKapisi + " Şehir = " + Sehir +
                " Doğum Günü = " + DogumGunu  + " Kilo = " + kg + " Boy = " + Boy);




    }
}
