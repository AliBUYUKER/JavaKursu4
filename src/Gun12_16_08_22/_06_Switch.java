package Gun12_16_08_22;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int sayi=oku.nextInt();
        int onlar=(sayi/10)%10;
        switch (onlar){
            case 0:System.out.println("Sıfır");break;
            case 1:System.out.println("Bir");break;
            case 2:System.out.println("İki");break;
            case 3:System.out.println("Üç");break;
            case 4:System.out.println("Dört");break;
            case 5:System.out.println("Beş");break;
            case 6:System.out.println("Altı");break;
            case 7:System.out.println("Yedi");break;
            case 8:System.out.println("Sekiz");break;
            case 9:System.out.println("Dokuz");break;
            default:
                System.out.println("Başka sayı yok ki :)");break;
        }

    }
}
