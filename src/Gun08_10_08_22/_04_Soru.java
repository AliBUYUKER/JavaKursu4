package Gun08_10_08_22;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // girilen 3 basamaklı bir sayının basamaklarını bulunuz.
        Scanner oku=new Scanner(System.in);
        System.out.print("3 basamaklı sayı giriniz= ");
        int Sayi=oku.nextInt();

       int SayiY=(Sayi/100)%10;
        System.out.println("Sayı Yüzler basamağı = " + SayiY);
        int SayiO=(Sayi/10)%10;
        System.out.println("Sayı onlar basamağı = " + SayiO);
        int SayiB=Sayi%10;
        System.out.println("Sayı birler basamağı = " + SayiB);





    }
}
