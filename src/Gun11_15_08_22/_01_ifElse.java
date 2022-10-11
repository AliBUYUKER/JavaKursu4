package Gun11_15_08_22;

import java.util.Scanner;

public class _01_ifElse {
    public static void main(String[] args) {
        // Girilen bir sayını pozitif, negatif veya sıfır olduğunu yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz= ");
        int sayi= oku.nextInt();

        if (sayi>0){
            System.out.println("pozitif");
        }
        else {
            if (sayi<0){
                System.out.println("Negarif");
            }
            else {
                System.out.println("Sıfır");
            }

        }





    }
}
