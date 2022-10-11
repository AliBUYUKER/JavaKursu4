package Gun06_08_08_22;

import java.util.Scanner;

public class _14_assignments {
    public static void main(String[] args) {


        /*1-) **I love java** olan bir String oluşturun.
         Bu cümlenin toplam karakter sayısını yazdırın.*/
        String s1 = "I love java";
        System.out.println(s1.length());
        /*2-) **Sprint planning** olan bir String oluşturun.
        Bu dizenin _toplam karakter sayısını_ yazdırın.*/
        String s2 = "Sprint planning";
        System.out.println("s2 karakter sayısı = " + s2.length());
        /*3-) **apple** olan bir String oluşturun.
        String'in _içinde_ **app** olup olmadığını **doğrula**.*/
        String s3 = "apple";
        boolean app = s3.contains("app");
        System.out.println("app = " + app);
        /*4-) **orange** kelimesinden oluşan bir String oluşturun.
        String'in **Apple**'a _eşit_ olup olmadığını doğrulayın. */
        String s4 = "orange";
        String s5 = "Apple";
        boolean Esit = s4.equals(s5);
        System.out.println("Esit = " + Esit);
        /*5-)**apple**  olan  bir String oluşturun.
        String'in **apple**'a _eşit_ olup olmadığını doğrulayın.
         _Büyük harf veya küçük harf önemli değildir._*/
        String s6="apple";
        String s7="apple";
        boolean esit=s6.equalsIgnoreCase(s7);
        System.out.println("esit = " + esit);
        /*6-)**Florida** kelimesinden bir String oluşturun.
        Florida kelimesinin içindeki, sadece  **'o'**  harfinin bulunduğu indexini yazdırın. */
        String s8="Florida";
        System.out.println("s8.indexOf(\"o\") = " + s8.indexOf("o"));
        /*7-)**Thank you** olan bir String oluşturun.
        Thank you içindeki, sadece  **'y'** harfinin bulunduğu _konumu_ yazdırın.*/
        String s9="Thank you";
        System.out.println("s9.indexOf(\"y\") = " + s9.indexOf("y"));
        /*8-) **Main method** oluşturun.
        **Mouse** değerinde bir String oluştur.
         Mouse String'inin 3_. sırasındaki karakteri_ yazdırın.*/
        String s10="Mouse";
        System.out.println("s10.charAt() = " + s10.charAt(3));
        /*9-)3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.*/
        Scanner oku=new Scanner(System.in);
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
