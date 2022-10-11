package Gun07_09_08_22;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // girilen bi ad soyadın(tam ad) adını ve soyadını ayırıp, ayrı ayrı yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Adınız ve Soyadınız = ");
        String s1=oku.nextLine();


        System.out.println("s1.indexOf(\" \") = " + s1.indexOf(" "));
        String ad=s1.substring(0,s1.indexOf(" "));
        System.out.println("ad = " + ad);

        System.out.println("s1 = " + s1.substring(s1.indexOf(" ")));





    }
}
