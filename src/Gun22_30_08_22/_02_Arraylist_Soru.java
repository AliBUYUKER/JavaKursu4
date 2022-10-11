package Gun22_30_08_22;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_Arraylist_Soru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        Scanner oku=new Scanner(System.in);
        ArrayList<Integer> notlar=new ArrayList<>();
        int devamMi=0;
        int i=0;
        int ort,toplam=0;
      do {System.out.printf("Not giriniz =");
          int girilecek= oku.nextInt();
          notlar.add(i,girilecek);i++;
          toplam=toplam+girilecek;
          ort=(toplam/i);
          System.out.printf("Devam etmek istiyor musunuz?\n1-Evet\n2-Hayır\nCevap =");
           devamMi= oku.nextInt();
      }while (devamMi!=2);
        System.out.println("notlar = " + notlar);
        System.out.println("ort = " + ort);
        System.out.println("toplam = " + toplam);
        System.out.println("notlar = " + notlar.size());
        int a=0;
        for (int j = 0; j < notlar.size(); j++) {
            if (notlar.get(j)>ort){
                a++;
            }
        }
        System.out.println("Geçen öğrenci sayısı = " + a);


    }
}
