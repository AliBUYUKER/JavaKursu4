package Gun10_12_08_22;

import java.util.Scanner;

public class _01_ifElse {
    public static void main(String[] args) {
        // girilen bir öğrencinin notuna göre 50'den büyük eşit ise geçtiniz.
        //50 den küçük ise tebrikler yaz okulu kazandınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Öğr notu = ");
        int not= oku.nextInt();

        //        1.Yöntem (önceki)
//        if (not>=50){  // hangi not girilirse girilsin kontrol edilir
//            System.out.println("tebrikler geçtiniz");
//        }
//
//        if (not < 50){ // hangi not girilirse girilsin kontrol edilir
//            System.out.println("tebrikler yaz kazandınız");
//        }

        // 2.Yöntem olması gereken
        // Yukarıdaki iflerde herzaman kontrol edilme durumu vardır.
        // halbuki aşağıdaki IF-ELSE yapısında IF şartı çalıştığında ELSE
        // kontrol edilmesine gerek kalmaz.
        if (not>=50){
            System.out.println("Tebrikler geçtiniz");
        }
        else {
            System.out.println("tebrikler yaz okulu kazandınız");
        }



























    }
}
