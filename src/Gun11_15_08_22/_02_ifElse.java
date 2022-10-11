package Gun11_15_08_22;

import java.util.Scanner;

public class _02_ifElse {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Kaç saat kaldınız = ");
        int saat= oku.nextInt();

        if (saat<=3){
            System.out.println("ücret = 10 Tl");
        }
        else {
            if (saat<=5){
                System.out.println("Ücret = 15 Tl");
            }
            else {
                System.out.println("Ücret = 20 Tl");
            }
        }







    }
}
