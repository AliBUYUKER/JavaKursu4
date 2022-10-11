package Gun08_10_08_22;

import java.util.Scanner;

public class _09_Soru {
    public static void main(String[] args) {
        // girilen bir cümledeki ilk kelimeyi yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle giriniz = ");
        String cumle= oku.nextLine();

        int boslukIndex=cumle.indexOf(" ");
        System.out.println("cumle = " + cumle.substring(0,boslukIndex));






    }
}
