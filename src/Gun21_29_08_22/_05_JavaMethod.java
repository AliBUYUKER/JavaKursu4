package Gun21_29_08_22;

import java.util.Scanner;

public class _05_JavaMethod {
    public static void main(String[] args) {
        //Kullanıcının gireceği 2 sayının toplamını
        //bir fonksiyonda buldurup, bunun sonucunu main de yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.printf("Sayı giriniz =");
        int sayyi1= oku.nextInt();
        System.out.printf("Sayı giriniz =");
        int sayyi2= oku.nextInt();
        int toplamm=toplama(sayyi1,sayyi2);
        System.out.println("toplamm = " + toplamm);

    }

    public static int toplama(int sayi1,int sayi2)
    {int a=0;
        int toplam=(sayi1+sayi2);
        a=toplam;
        return a;
    }
}
