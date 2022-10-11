package Gun13_17_08_22;

import java.util.Scanner;

public class _09_Assigments {
    public static void main(String[] args) {
       // 1- Girilen bir sayıya kadar olan sayıların çarpım sonucnu bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.print("Kaça kadar çarpılacak = ");
        int girilen=oku.nextInt();
        int sayac=1;
        int carpim=1;
        while (sayac<=girilen){
            System.out.print(sayac+".Sayı = ");
            int sayi= oku.nextInt();
            carpim=carpim*sayi;
            sayac++;
        }
        System.out.println("Çarpım sonuç = " + carpim);
        //2-  0-100 arasındaki sayılardan teklerin ayrı çiftleri ayrı toplamını bulunuz
        int sayacc=0;
        int tektoplam=0;
        int ciftToplam=0;
       do {
           if (sayacc%2!=0){
               tektoplam=tektoplam+sayacc;
           }else ciftToplam=ciftToplam+sayacc;
           sayacc++;
       }while (sayacc<100);

        System.out.println("ciftToplam = " + ciftToplam);
        System.out.println("tektoplam = " + tektoplam);
        //3-   100 den 0 a kadar olan tüm tek sayıları ekrana yazdırınız.
        int ssayac=1;
        while (ssayac<=100){
            if (ssayac%2!=0){
                System.out.println("ssayac = " + ssayac);
                ssayac=(ssayac+2);
            }
        }
        //4-  0 ile 100 arasındaki sayılardan hem 4 e hem de 5 tam bölünebilen sayıları ekrana yazdırınız.
        int sayiSayac=0;
        while (sayiSayac<100){
            if (sayiSayac%4==0 && sayiSayac%5==0){
                System.out.println("sayiSayac = " + sayiSayac);

            }sayiSayac++;
        }
        //5- Sayı bulmaca oyununu tam hali ile cözünüz. kullanıcıya 10 hak veriniz.
        int Gsayc=1;
        do {System.out.print("Sayı giriniz = ");
            int girillen=oku.nextInt();
            if (girillen==12){
                System.out.println("Tebrikler");
                Gsayc=10;
            }else System.out.println("Tekrar deneyiniz");
            Gsayc++;

        }while (Gsayc<=10);





    }
}
