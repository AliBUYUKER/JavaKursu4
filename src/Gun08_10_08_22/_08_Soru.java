package Gun08_10_08_22;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        // girilen bir sayının tek sayı olup olmadığını yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int Sayi= oku.nextInt();

        System.out.println("Sayı tek mi ? = " + (Sayi%2==1));

       /* System.out.println("Tek = " + ((Sayi%2)>0));
        System.out.println("Çift = " + ((Sayi%2)<1));*/






    }
}
