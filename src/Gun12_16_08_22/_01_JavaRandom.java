package Gun12_16_08_22;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {
        // 0-5 arası gibi ürettik, hep sıfırdan başladı
        //4-9 arası üretsin nasıl deriz
        // önce aralık kadar ürettirip sonra minimum kısmı eklesem
        // 4-9 için : önce 0-5 üret : sonra çıkan sayıya 4 ekle.
        Scanner oku=new Scanner(System.in);

        System.out.print("min =");
        int min= oku.nextInt();

        System.out.print("max = ");
        int max= oku.nextInt();

        int belirliAraliktaUretilenSayi= (int) (Math.random()*(max-min)+min);
        System.out.println("belirliAraliktaUretilenSayi = " + belirliAraliktaUretilenSayi);





    }
}
