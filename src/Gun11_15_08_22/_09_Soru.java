package Gun11_15_08_22;

import java.util.Scanner;

public class _09_Soru {
    public static void main(String[] args) {
        // girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışınız.
        // kullanıcı bilirse tebrikler yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int girilen= oku.nextInt();
        System.out.println(girilen<10 ? "https://www.youtube.com/watch?v=kehLBDjxNpY":"10'dan küçük sayı giriniz");

        int randomSayi= (int) (Math.random()*11);
        System.out.println("randomSayi = " + randomSayi);
        if (girilen==randomSayi){
            System.out.println("Tebrikler");
        }
        else {
            System.out.println("Tekrar deneyiniz");
        }


    }
}
