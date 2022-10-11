package Gun05_05_08_22;

import java.util.Scanner;

public class _08_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını double, boyunu int olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)

        Scanner oku = new Scanner(System.in);
        System.out.print("Kilo = ");
        double kilo = oku.nextDouble();
        System.out.print("Boy = ");
        double Boy = oku.nextDouble();
        double kitleindex = kilo / (Boy * Boy);
        System.out.println("kitleindex = " + kitleindex);


    }
}
