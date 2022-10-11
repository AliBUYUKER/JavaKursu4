package Gun10_12_08_22;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner oku=new Scanner(System.in);
        System.out.print("Şifre giriniz = ");
        String sifre= oku.nextLine();

        int karakter=sifre.length();
        boolean kelime=sifre.contains("pass");

        if (karakter<=12 && karakter>=8 && !kelime){
            System.out.println("Doğru");
        }
        else {
            System.out.println("Yanlış");
        }





    }
}
