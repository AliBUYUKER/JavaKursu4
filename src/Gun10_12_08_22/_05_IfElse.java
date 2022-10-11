package Gun10_12_08_22;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // hayır yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("String giriniz = ");
        String c1 = oku.nextLine();

        int uzunluk = c1.length();

        boolean gec = c1.contains("study");
        System.out.println(gec? "geçiyor":"geçmiyor");
        if (uzunluk>10 && gec){
            System.out.println("evet");
        }
        else {
            System.out.println("hayır");
        }


    }
}
