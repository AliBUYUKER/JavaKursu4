package Gun31_12_09_22._03_Soru;

import java.util.Scanner;

public class Sabitlerr {
   final int saat=24;
   final int dakika=60;
   final int saniye=60;
  final void sayiHesabi(){
       Scanner oku=new Scanner(System.in);
       System.out.print("Gün =");
       int gun= oku.nextInt();
       System.out.print("Saat =");
       int saat= oku.nextInt();
       System.out.print("Dakika =");
       int dakika= oku.nextInt();
       int toplam=0;
       toplam=(((gun*24)*60)*60)+((saat*60)*60)+(dakika*60);
       System.out.println("Saniye = " + toplam);
   }
}
