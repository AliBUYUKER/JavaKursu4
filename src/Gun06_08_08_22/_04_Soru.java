package Gun06_08_08_22;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // girilen bir Stringin sadece son harfini yazdırınız
        Scanner oku=new Scanner(System.in);

        System.out.print("Cümle giriniz =");
        String Cumle=oku.nextLine();


        int Uzunluk=Cumle.length();
        char Sonharf=Cumle.charAt(Uzunluk-1);
        System.out.println("Son harf = " + Cumle.charAt(Cumle.length()-1));





    }
}
