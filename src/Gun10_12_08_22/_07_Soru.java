package Gun10_12_08_22;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        String Sayi= oku.nextLine();

        int index=Sayi.length();
        int bosluk=Sayi.indexOf(" ");

        String ilkSayi=Sayi.substring(0,bosluk);
        String ikinciSayi=Sayi.substring(bosluk,index);
        System.out.println("ilkSayi = " + ilkSayi);
        System.out.println("ikinciSayi = " + ikinciSayi);
        int sayi2=Integer.parseInt(ikinciSayi);
        System.out.println("sayi2 = " + sayi2);














    }
}
