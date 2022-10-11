package Gun08_10_08_22;

import java.util.Scanner;

public class _10_Assignments {
    public static void main(String[] args) {
        //1-Girilen bir cümlenin ilk ve son harfini bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle giriniz = ");
        String Cumle=oku.nextLine();

        char ilkHarff=Cumle.charAt(0);
        int uzunlukk=Cumle.length();
        char SonHarf=Cumle.charAt(uzunlukk-1);
        System.out.println("ilkHarff = " + ilkHarff+"."+SonHarf+".");
        //2-Girilen 3 kelimelik bir cumleyi kelimelerine ayırınız
        System.out.print("Cümle giriniz = ");
        String C1=oku.nextLine();

        System.out.println("Cumle = " + Cumle.replace(" ","\n"));
        //3-Girilen 3 kelimelik bir cümlenin kelimelrinin ilk karakterlerini bulunuz
        System.out.print("Cümler giriniz = ");
        String c2= oku.nextLine();

        char ilkHarf=c2.charAt(0);
        int ikinciharf=c2.indexOf(" ");
        char ikinci=c2.charAt(ikinciharf+1);
        int uc=c2.lastIndexOf(" ");
        char ucuncu=c2.charAt(uc+1);
        System.out.println("ilk karakterler = " + ilkHarf+"."+ikinci+"."+ucuncu+".");
        //4-Girilen bir kelimenin içerisinde B harifnin geçip geçnmediğini bulunuz.
        System.out.print("Cümler giriniz = ");
        String c3=oku.nextLine();

        System.out.println("B bulunuyor mu?  = " + c3.contains("B"));
        //5-Girilen bir kredi kartı bilgisini yandaki şekilde gösteriniz.  **** **** **** 4567
        System.out.print("Kredi kartı numaranızı giriniz = ");
        String kartNo= oku.nextLine();
        System.out.println("kartNo.replaceAll([0-9]{4 \"*\"}) = " + kartNo.replaceAll("[0-9]{4} ", "****"));
        //6-Girilen bir cümledeki son kelimeyi bulunuz
        System.out.print("Cümle giriniz= ");
        String c4= oku.nextLine();

        int uzunluk=c4.length();
        int sonBosluk=c4.lastIndexOf(" ");
        System.out.println("Son kelime = " + c4.substring(sonBosluk,uzunluk));






    }
}
