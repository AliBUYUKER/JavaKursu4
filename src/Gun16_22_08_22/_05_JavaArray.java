package Gun16_22_08_22;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.
        Scanner oku=new Scanner(System.in);
        int[] sayi=new int[7];
        int toplam=0;
        for (int i=0;i< sayi.length;i++){
            System.out.print((i+1)+".sayı giriniz =");
            sayi[i]=oku.nextInt();
            toplam=toplam+sayi[i];
        }int buyukVeTek=0;
        int ort=(toplam/ sayi.length);
        for (int i=0;i<sayi.length;i++){
            if (sayi[i]%2==1&& sayi[i]>ort){
                System.out.println("sayi = " + sayi[i]);
                buyukVeTek++;
            }
        }
        System.out.println("ort = " + ort);
        System.out.println("buyukVeTek = " + buyukVeTek);

    }
}
