package Gun08_10_08_22;

import java.util.Scanner;

public class _11_Assignments {
    public static void main(String[] args) {
        /*1-) Verilen iki int hakkında (num1,  num2),
        İlk int'i ikinci int'e bölün.
         ,Sonucu yazdırın.*/
        Scanner oku = new Scanner(System.in);
        System.out.print("Num1 = ");
        int num1 = oku.nextInt();
        System.out.print("Num2 = ");
        int num2 = oku.nextInt();
        System.out.println("Sonuç = " + (num1 / num2));
        /*2-) Verilen 3 double hakkında, (num1 , num2, num3),
        Bu üç double'ı birbiriyle çarpın ve cevabı  **sonuca** eşitleyin.
         Sonucu yazdırın.*/
        System.out.print("Dnum1 =");
        double dnum1 = oku.nextDouble();
        System.out.print("Dnum2 = ");
        double dnum2 = oku.nextDouble();
        System.out.print("Dnum3 = ");
        double dnum3 = oku.nextDouble();
        System.out.println("Sonuç = " + (dnum1 * dnum2 * dnum3));
        /*3-) Oluşturulmuş olan double'lar hakkında,
        Bu 4 doubleyi  birbiriyle çarpın ve **sonuca**  eşitleyin.
         Double sonucu yazdırın.*/
        System.out.print("Dnum4 = ");
        double dnum4 = oku.nextDouble();
        System.out.println("Sonuç = " + (dnum1 * dnum2 * dnum3 * dnum4));
        /*4-) Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        Bu int'leri birbiriyle çarpın ve **sonuca** eşitleyin.
         **int sonuc** u yazdırın*/
        System.out.print("Num3 = ");
        int num3 = oku.nextInt();
        System.out.print("Num4 = ");
        int num4 = oku.nextInt();
        System.out.println("Sonuç = " + (num1 * num2 * num3 * num4));
        /*5-) Verilen int ler hakkında (num1, num2),
        num1 'in   num2'ye bölümünden **kalanı, int sonuc'a**  eşitleyin.
         int sonucu yazdırın.*/
        int Sonuc = num1 % num2;
        System.out.println("Kalan Sonuç = " + Sonuc);
        /*6-)Verilen 2 tane int (num1, num2),
        Int'lerin farkını yazdırın.*/
        System.out.println("Sonuç = " + (num1 - num2));
        /*7-) Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
         Sonucu yazdırın.Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.*/
        System.out.println("Sonuç = " + (num1 - num2 - num3 - num4));
        //8-)   Girilen bir sayının birler basamağını ekrana yazdırınız.
        System.out.print("Sayı Giriniz = ");
        int girilen = oku.nextInt();
        int Bir = girilen % 10;
        System.out.println("Birler Basamağı = " + Bir);
        //9-)   Girilen bir sayının onlar basamağını ekrana yazdırınız.
        int on = (girilen / 10) % 10;
        System.out.println("Onlar Basamağı = " + on);
        // 10-) Girilen bir sayının yüzler basamağını ekrana yazdırınız.
        int yuz = (girilen / 100) % 10;
        System.out.println("Yüzler basamağı = " + yuz);
        // 11-) Kullanıcıdan vize ve final notunu alınız. ort = 0.4 * vize + 0.6 * final olarak bulunuz.
        System.out.print("Vize Notunuz = ");
        int vize = oku.nextInt();
        System.out.print("Final Notunuz = ");
        int Final = oku.nextInt();
        int Ortalama= (int) ((vize * 0.4) + (Final * 0.6));
        System.out.println("Ortalama = " + Ortalama);
        // 12-) Girilen 3 basamaklı bir sayının tersini ekrana yazdırınız. 524 -> 425 gibi
        System.out.print("3 Basamaklı bir sayı giriniz= ");
        int girilenSayi= oku.nextInt();
        int bir=girilenSayi%10;
        int On=(girilenSayi/10)%10;
        int Yuz=(girilenSayi/100)%10;
        System.out.println("Girilen sayının tersi = " + bir+On+Yuz);




    }
}
