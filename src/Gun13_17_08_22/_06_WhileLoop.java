package Gun13_17_08_22;

import java.util.Scanner;

public class _06_WhileLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar(girilen sayı dahil) olan sayıların
        // toplamını bularak yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Kaça kadar = ");
        int girilen= oku.nextInt();
        int sayac=1;
        int toplam=0;
        while (sayac<=girilen){
            System.out.print(sayac+".Sayi  = ");
            int sayi= oku.nextInt();

            toplam=toplam+sayi;
                    sayac++;

        }
        System.out.println("toplam = " + toplam);




    }
}
