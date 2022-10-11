package Gun21_29_08_22;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.printf("Sayı Giriniz =");
        int sayyi= oku.nextInt();
        int carpim=faktoriyel(sayyi);
        System.out.println("carpim = " + carpim);
    }
    public static int faktoriyel(int sayi)
    {int a=1;
        for (int i = sayi; i >0 ; i--) {
            a=a*i;
        }

        return a;

    }
    public static void faktor(int sayi)
    {
        int b=1;
        for (int i = sayi; i >0 ; i--) {
            b=b*i;
        }
        System.out.println("b = " + b);
    }
}
