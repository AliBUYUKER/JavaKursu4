package Gun19_25_08_22;

import java.util.Scanner;

public class _01_Java2DArray {
    public static void main(String[] args) {
        int sayi=0; // 1 tane sayı tutuyor
        int[] ders1Notlari=new int[40];// 40 sayı saklayabilir
        int[] ders2Notlari=new int[40];
        int[] ders3Notlari=new int[40];

        int[][]tumDersNotlari=new int[3][40]; // 3 ders 40 öğrenci // 3 satır 40 sütun
        ders1Notlari[0]=80; // tek boyutlu dizide ilk elemana 80 atandı.
        tumDersNotlari[0][0]=80; // 2 boyutlu dizide ilk satırın ilk sütununa 80 atandı.

        System.out.println(tumDersNotlari[0][0]);
        Scanner oku=new Scanner(System.in);
        System.out.print("Not giriniz =");
        tumDersNotlari[0][0]= oku.nextInt();





    }
}
