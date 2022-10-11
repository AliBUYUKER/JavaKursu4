package Gun12_16_08_22;

import java.util.Scanner;

public class _03_IfElseIF {
    public static void main(String[] args) {
        // Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Ders notu giriniz= ");
        String dersNotu = oku.nextLine();

        int not=Integer.parseInt(dersNotu.replaceAll("[^0-9]","")); // 0-9 dışında
        String dersadi=dersNotu.replaceAll("[0-9]","");
        System.out.println("not = " + not);
        System.out.println("dersadi = " + dersadi);

       /* int ikinokta = dersNotu.indexOf(":");
        int Index = dersNotu.length();
        String not = dersNotu.substring(ikinokta + 1, Index);
        int Not = Integer.parseInt(not);*/
        if (not < 40) {
            System.out.println("F");
        }
        if (not >= 40 && not < 60) {
            System.out.println("E");
        }
        if (not >= 60 && not < 70) {
            System.out.println("D");
        }
        if (not >= 70 && not < 80) {
            System.out.println("C");
        }
        if (not >= 80 && not < 90) {
            System.out.println("B");
        }
        if (not >= 90 && not <= 100) {
            System.out.println("A");
        }

    }
}
