package Gun14_18_08_22;

import java.util.Scanner;

public class _06_forLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayı giriniz = ");
        int girilen= oku.nextInt();
        int carpim=1;
        for (int i=1;i<=girilen;i++)
            carpim=(carpim*i);
        System.out.println("carpim = " + carpim);

    }
}
