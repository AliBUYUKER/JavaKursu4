package Gun14_18_08_22;

import java.util.Scanner;

public class _03_forLoop {
    public static void main(String[] args) {
        // kullanıcının gireceği bir rakam kadar olan sayıların toplamını bulunuz.
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int girilen= oku.nextInt();
        int toplam=0;
        for (int i=0;i<girilen;i++)
            toplam=toplam+i;
        System.out.println("toplam = " + toplam);

    }
}
