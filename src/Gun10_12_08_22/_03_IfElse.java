package Gun10_12_08_22;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // girilen bir sayının tek mi çift mi olduğunu yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı = ");
        int sayi= oku.nextInt();

        if ((sayi%2)==0){
            System.out.println("Çift");
        }
        else {// -1 olsa 1 de olsa elseye düşecek
            System.out.println("Tek");
        }



    }
}
