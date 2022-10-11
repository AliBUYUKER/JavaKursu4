package Gun13_17_08_22;

import java.util.Scanner;

public class _00 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int sayi= oku.nextInt();
        int toplam =0;
        while (sayi !=1){
            toplam=toplam+sayi;
            System.out.print("sayı giriniz");
            sayi= oku.nextInt();
        }
        System.out.println("toplam = " + toplam);
    }
}
