package Gun07_09_08_22;

import java.util.Scanner;

public class _11_Assignments {
    public static void main(String[] args) {
        /*1-)**paper** olan bir String oluşturun.
        String'i _büyük harfe_ çevirin ve yazdırın.
         örn: apple > APPLE*/
        String s1="paper";
        System.out.println("s1.toUpperCase() = " + s1.toUpperCase());
        /*2-) **OraNge** olan bir String oluşturun.
        String'i _küçük harfe_ çevirin ve yazdırın.
         örn: APPLE > apple*/
        String s2="OraNge";
        System.out.println("s2.toLowerCase() = " + s2.toLowerCase());
        /*3-) **New Jersey** olan bir String oluşturun.
        String'i _büyük harfe_ çevirin ve yazdırın
         */
        String s3="New Jersey";
        System.out.println("s3.toUpperCase() = " + s3.toUpperCase());
        /*4-) **New York** olan bir String oluşturun.
        String'i _küçük harfe_ çevirin ve yazdırın.
         */
        String s4="New York";
        System.out.println("s4.toLowerCase() = " + s4.toLowerCase());
        /*5-) **PADDLE** olan bir String oluşturun.
        String'i _küçük harfe_ çevirin ve yazdırın.
         */
        String s5="PADDLE";
        System.out.println("s5.toLowerCase() = " + s5.toLowerCase());
        /*6-) **apple** olan bir String oluşturun.
        String'in _içinde_ **app** olup olmadığını **doğrula**.
         */
        String s6="apple";
        System.out.println("app var mı? = " + s6.contains("app"));
        /*7-) Girilen bir cümlede kaç kelime olduğunuz bulunuz */
        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle giriniz= ");
        String Girilen=oku.nextLine();
        String Temiz=Girilen.trim();

        int Bosluklu=Temiz.length();
        int Bosluksuz=Temiz.replace(" ","").length();
        int kelimeSayisi=(Bosluklu-Bosluksuz)+1;
        System.out.println("Kelime Sayısı = " + kelimeSayisi);
        /*8-) Girilen bir cumledeki kelimelerin ilk harflerini yazdırınız*/
        System.out.print("Adınız ve Soyadınız = ");
        String tamAd=oku.nextLine();

        char ilkHarf=tamAd.charAt(0);
        int ilkBosluk=tamAd.indexOf(" ");
        char ikinciHarf=tamAd.charAt(ilkBosluk+1);
        int sonBosluk=tamAd.lastIndexOf(" ");
        char sonHarf=tamAd.charAt(sonBosluk+1);
        System.out.println("ilkHarf = " + ilkHarf+"."+ikinciHarf+"."+sonHarf+".");










    }
}
