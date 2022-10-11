package Gun11_15_08_22;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        //  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı1 = ");
        int sayi1= oku.nextInt();
        System.out.print("Sayı2 = ");
        int sayi2= oku.nextInt();
        System.out.print("Sayı3 = ");
        int sayi3= oku.nextInt();

        System.out.println("en büyük sayı= "+Math.max(sayi1,Math.max(sayi2,sayi3)));





    }
}
