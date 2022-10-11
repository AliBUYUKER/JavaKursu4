package Gun14_18_08_22;

import java.util.Scanner;

public class _12_ {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.
        Scanner oku=new Scanner(System.in);
        System.out.print("cümle giriniz = ");
        String orjinal,revize="";
        orjinal= oku.nextLine();
        orjinal=orjinal.replaceAll(" ","");
        int uzun=orjinal.length();
        for (int i=uzun-1;i>=0;i--){
            revize=revize+orjinal.charAt(i)+"\n";



        }System.out.print("revize = " + revize);

       /* System.out.print("cümle giriniz = ");
        String cumle= oku.nextLine();

        for (int i=0;i<cumle.length();i++)
            if (cumle.charAt(i)==" ")continue;
        System.out.println("cumle.charAt(i) = " + cumle.charAt(i));*/

    }
}
