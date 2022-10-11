package Gun06_08_08_22;

import java.util.Scanner;

public class _13_Soru {
    public static void main(String[] args) {
        // Girilen bir string de bosluk olup olmadıgını bulunuz.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir string giriniz = ");
        String s1=oku.nextLine();

        boolean bosluk=s1.contains(" ");
        System.out.println("bosluk = " + bosluk);
        System.out.println("s1 = " + s1.contains(" "));









    }
}
