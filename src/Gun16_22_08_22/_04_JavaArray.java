package Gun16_22_08_22;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // 100 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırnız
        Scanner oku=new Scanner(System.in);
        int[] not=new int[5];
        int toplam=0;
        for (int i=0;i<not.length;i++){
            System.out.print(i+".not giriniz= ");
            not[i]=oku.nextInt();
            toplam=toplam+not[i];

        }int ort=toplam/ not.length;
        int gecensayisi=0;
        for (int i=0;i< not.length;i++){
            if (not[i]>ort){
                System.out.println("not = " + not[i]);
                gecensayisi++;

            }
        }
        System.out.println();
        System.out.println("ort = " + ort);
        System.out.println("gecensayisi = " + gecensayisi);


    }
}
