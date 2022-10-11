package Gun05_05_08_22;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını ayrı ayrı okutarak alıp
        // birlikte ekrana yazdırnız.
        Scanner okuyucu = new Scanner(System.in);
        System.out.print("Adı = ");
        String Adi = okuyucu.next();
        System.out.print("Soyadı = ");
        String Soyadi = okuyucu.next();

        System.out.println("Adı = " + Adi);
        System.out.println("Soyadı = " + Soyadi);
        System.out.println(Adi + Soyadi);


    }
}
