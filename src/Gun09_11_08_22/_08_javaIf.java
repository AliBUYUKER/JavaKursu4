package Gun09_11_08_22;

import java.util.Scanner;

public class _08_javaIf {
    public static void main(String[] args) {
        // Girilen 3 sayıdan en büyük olanını bulunuz.
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı 1 = ");
        int sayi1= oku.nextInt();
        System.out.print("Sayı 2 = ");
        int sayi2= oku.nextInt();
        System.out.print("Sayi 3 = ");
        int sayi3= oku.nextInt();

        int enb=sayi1;
        if (sayi2>enb){
            enb=sayi2;
        }
        if (sayi3>enb){
            enb=sayi3;
        }
        System.out.println("enb = " + enb);




    }
}
