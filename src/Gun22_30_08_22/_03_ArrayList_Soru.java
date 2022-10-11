package Gun22_30_08_22;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList_Soru {
    public static void main(String[] args) {
// Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye atayarak
        // yazdırınız.
        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[6];
        for (int i = 0; i < dizi.length; i++) {
            System.out.printf("Sayı giriniz =");
            dizi[i] = oku.nextInt();
        }
        AbstractList<Integer> tekler=new ArrayList<>();
        // for (int i = 0; i < dizi.length; i++) {
        ///      if (dizi[i]%2==1){
        //        tekler.add(dizi[i]);

        //}}
        tekler = tekElemanlarAta(dizi);
        System.out.println("tekler = " + tekler);
        // todo: Ödev : tek elemanlarını ayrı biz diziye bir metodda atayarak mainde yazdırınız.
    }

    public static ArrayList<Integer> tekElemanlarAta(int[] dizi) {
        ArrayList<Integer> tekler = new ArrayList<>();
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 1) {
                tekler.add(dizi[i]);
            }
        }return tekler;
    }










}
