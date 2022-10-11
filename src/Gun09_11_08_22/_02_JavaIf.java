package Gun09_11_08_22;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının negatif mi , pozitif mi olduğunu yazdırınız.
        // Sıfır ise sıfır yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("Sayı = ");
        int sayi= oku.nextInt();

        if (sayi==0){
            System.out.println("Sıfır");
        }
        if (sayi<0){
            System.out.println("Negatif");
        }
        if (sayi>0){
        System.out.println("Pozitif");}


    }
}
