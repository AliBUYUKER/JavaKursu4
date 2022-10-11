package Gun10_12_08_22;

import java.util.Scanner;

public class _02_ifElse {
    public static void main(String[] args) {
        // Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("vize notunuz = ");
        int vize= oku.nextInt();
        System.out.print("Final notunuz= ");
        int Final= oku.nextInt();
        int ort= (int) ((vize*0.4)+(Final*0.6));

        if (ort>=60){
            System.out.println("Tebrikler geçtiniz");
        }
        else {
            System.out.println("Tebrikler uzatmalara kalndınız");
        }






    }
}
