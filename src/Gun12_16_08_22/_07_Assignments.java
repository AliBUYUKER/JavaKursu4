package Gun12_16_08_22;

import java.util.Scanner;

public class _07_Assignments {
    public static void main(String[] args) {
       // 1- Girilen bir ay numarasına göre , ayın hem adını hem de kaç gün olduğunu sayı ile yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Kaçıncı ay= ");
        int ay= oku.nextInt();
        switch (ay){
            case 1: System.out.println("Ocak 31 Gün");break;
            case 2: System.out.println("Şubat 29 Gün");break;
            case 3: System.out.println("Mart 31 Gün");break;
            case 4: System.out.println("Nisan 30 Gün");break;
            case 5: System.out.println("Mayıs 31 Gün");break;
            case 6: System.out.println("Haziran 30 Gün");break;
            case 7: System.out.println("Temmuz 31 Gün");break;
            case 8: System.out.println("Ağustos 31 Gün");break;
            case 9: System.out.println("Eylül 30 Gün");break;
            case 10: System.out.println("Ekim 31 Gün");break;
            case 11: System.out.println("Kasım 30 Gün");break;
            case 12: System.out.println("Aralık 31 Gün");break;
            default:
                System.out.println("Yanlış girdiniz!");
        }

       // 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız.
        System.out.print("Üç basamaklı bir sayı giriniz = ");
        int sayi= oku.nextInt();
        int yuzler=(sayi/100)%10;
        int onlar=(sayi/10)%10;
        int birler=sayi%10;

        switch (yuzler){
            case 1:System.out.print("Yüz");break;
            case 2:System.out.print("İkiyüz");break;
            case 3:System.out.print("Üçyüz");break;
            case 4:System.out.print("Dörtyüz");break;
            case 5:System.out.print("BeşyüZ");break;
            case 6:System.out.print("Altıyüz");break;
            case 7:System.out.print("Yediyüz");break;
            case 8:System.out.print("Sekizyüz");break;
            case 9:System.out.print("Dokuzyüz");break;

        }
        switch (onlar){
            case 1:System.out.print("On");break;
            case 2:System.out.print("Yirmi");break;
            case 3:System.out.print("Otuz");break;
            case 4:System.out.print("Kırk");break;
            case 5:System.out.print("Elli");break;
            case 6:System.out.print("Altmış");break;
            case 7:System.out.print("Yetmiş");break;
            case 8:System.out.print("Seksen");break;
            case 9:System.out.print("Doksan");break;

        }
        switch (birler){
            case 1:System.out.println("Bir");break;
            case 2:System.out.println("İki");break;
            case 3:System.out.println("Üç");break;
            case 4:System.out.println("Dört");break;
            case 5:System.out.println("Beş");break;
            case 6:System.out.println("Altı");break;
            case 7:System.out.println("Yedi");break;
            case 8:System.out.println("Sekiz");break;
            case 9:System.out.println("Dokuz");break;
        }
        //3- 20-80 arasında üretilen bir sayının birler basamağını yazı ile yazdırınız.
        int max=80;
        int min=20;
        int random= (int) ((Math.random())*(max-min)+min);
        int onlarr=(random/10)%10;
        int birlerr=random%10;
        System.out.println("random = " + random);

        switch (onlarr){
            case 1:System.out.print("On");break;
            case 2:System.out.print("Yirmi");break;
            case 3:System.out.print("Otuz");break;
            case 4:System.out.print("Kırk");break;
            case 5:System.out.print("Elli");break;
            case 6:System.out.print("Altmış");break;
            case 7:System.out.print("Yetmiş");break;
            case 8:System.out.print("Seksen");break;
            case 9:System.out.print("Doksan");break;

        }
        switch (birlerr){
            case 1:System.out.print("Bir");break;
            case 2:System.out.print("İki");break;
            case 3:System.out.print("Üç");break;
            case 4:System.out.print("Dört");break;
            case 5:System.out.print("Beş");break;
            case 6:System.out.print("Altı");break;
            case 7:System.out.print("Yedi");break;
            case 8:System.out.print("Sekiz");break;
            case 9:System.out.print("Dokuz");break;}


    }
}
