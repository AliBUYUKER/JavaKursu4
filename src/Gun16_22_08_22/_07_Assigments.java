package Gun16_22_08_22;

import java.util.Scanner;

public class _07_Assigments {
    public static void main(String[] args) {
       /* 1- String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
       Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.*/
        String[] array = {"Apple , Orange , Banana , Pineapple"};
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("Apple")) {
                System.out.println("true = " + true);
            }
        }
       /* 2-int Array oluşturun ve elemanları : 12,2,5,15,8,
        En büyük değeri yazdırınız.*/
        int[] Array = {12, 2, 5, 15, 8};
        int enb = Array[0];


        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > enb) {
                enb = Array[i];
            }
        }
        System.out.println("enb = " + enb);
       /* 3- int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.*/
        int[] ARray = {14, 19, 5, 21};
        int enk = ARray[0];
        for (int i = 0; i < ARray.length; i++) {
            if (ARray[i] < enk) {
                enk = ARray[i];
            }
        }
        System.out.println("enk = " + enk);
        /*4-int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.*/
        int[] ARRAY = {15, 25, 22, 18, 30, 45, 98, 102, 58, 68, 99, 79,101};
        int wichArray=0;
        int eNb = ARRAY[0];
        int ikincB = ARRAY[0];
        for (int i = 0; i < ARRAY.length; i++) {
            if (ARRAY[i] > eNb) {
                eNb = ARRAY[i];
                wichArray=i;
            }
        }ARRAY[wichArray]=0;
        for (int i = 0; i <ARRAY.length ; i++) {
            if (ARRAY[i]>ikincB){
                ikincB=ARRAY[i];
            }
        }
        System.out.println("ikincB = " + ikincB);


        /*5-int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
                **Örneğin:**
 **-5 + 6 + 8 + 12 + 14 - 19 = 16**
        Toplamlarını yazdırın.*/
        int[] sayilar={5,6,8,12,14,19};
        int toplamTek=0;
        int toplamCift=0;
        for (int i=0;i<sayilar.length;i++){
            if (sayilar[i]%2==0){
                toplamCift=toplamCift+sayilar[i];

            }else toplamTek=toplamTek+sayilar[i];
        }
        System.out.println("toplamCift = " + toplamCift);
        System.out.println("toplamTek = " + toplamTek);
       /* 7-Oluşturacağınız int array'ini,
       length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array) ilk ve son elementlerini kapsayan yeni array'e return edin.
         Oluşturacağınız int array'i =   ([1, 2, 3, 4])
        Sonuç bu şekilde olmalıdır. [1, 4]*/
        int[] ArRay={1,2,3,4,5,6,7,8,9};
        int uzunluk=ArRay.length;
        int[] yeniarray={ArRay[0],ArRay[ArRay.length-1]};
        System.out.println("yeniarray = " + yeniarray[0]+","+yeniarray[1]);
        /*8-int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.*/
        int[] sayi={ 12, 14 , 21 ,23 , 10 ,4};
        int toplamm=0;
        int ort;
        for (int i=0;i<sayi.length;i++){
            toplamm=toplamm+sayi[i];
        }ort=toplamm/ sayi.length;
        System.out.println("ort = " + ort);
        /*9-String Array (Dizi) oluşturunuz.
            elemanları : Apple, Orange , Babana, Kiwi
        Array'leri tüm elemanları yazdırınız.*/
        String[] Dizi={"Apple, Orange , Babana, Kiwi"};
        for (int i=0;i< Dizi.length;i++){
            System.out.println("Dizi = " + Dizi[i]);
        }
        /*10-String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
        Array'daki eleman sayısını yazdırınız.
        Cevap 4 olmalı.*/
        String[] sehir={"new jersey" , "new york", "boston","California"};
        System.out.println("sehir.length = " + sehir.length);
        /*11-İnt Array oluştur ve elemanları   : 25,30,30,35,100
        Array in elemanlarının toplamını yazdır.
                Cevap 220 olmalı.*/
        int[] toplam={25,30,30,35,100};
        int toplami=0;
        for (int i=0;i<toplam.length;i++){
            toplami=toplami+toplam[i];
        }
        System.out.println("toplami = " + toplami);
       /* 12-- Kullanıcıdan alacağınız 5 ayrı kelimeyi bir diziye atayınız,
/Kelimelerden en uzun olanının ilk ve son harfininin yerlerini değiştiriniz.*/
        Scanner oku=new Scanner(System.in);
        String[]dizi=new String[5];

        for (int i = 0; i < dizi.length ; i++) {
            System.out.print(i+1+".kelime giriniz =");
            dizi[i]= oku.nextLine();
        }int uzun=dizi[0].length();
        int wichDizi=0;
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i].length()>uzun){
                uzun= dizi[i].length();
                wichDizi=i;
            }
        }String diger=dizi[wichDizi].substring(1,uzun-1);
        char ilkhard=dizi[wichDizi].charAt(0);
        char sonharf=dizi[wichDizi].charAt(uzun-1);
        System.out.println("diger = " +sonharf+ diger+ilkhard);
        /*13: Kullanıcıdan alacağınız 10 elemanlı bir diziyi doldurduktan sonra,
                ayrı bir döngüde en büyük ve en küçük rakamın farkını bulunuz.*/
        Scanner iNt=new Scanner(System.in);
        int[]rakam=new int[10];
        for (int i = 0; i < rakam.length ; i++) {
            System.out.print("Rakam giriniz =");
            rakam[i]=iNt.nextInt();

        }int enbb=rakam[0];
        int enkk=rakam[0];
        for (int i = 0; i <rakam.length; i++) {
            if (rakam[i]>enbb){
                enbb=rakam[i];
            } else if (rakam[i]<enkk) {
                enkk=rakam[i];

            }
        }
        System.out.println("Fark= " + (enbb-enkk));
        /*14: Kullanıcıdan alacağınız 10 elemanlı bir diziyi doldurduktan sonra,
                ayrı bir döngüde çift rakam sayısını bulunuz ve yazdırınız*/
        int[]dizzi=new int[10];
        for (int i = 0; i < dizzi.length; i++) {
            System.out.print(i+1+".Rakam girinz =");
            dizzi[i]=iNt.nextInt();
        }int cift=0;
        for (int i = 0; i < dizzi.length; i++) {
            if (dizzi[i]%2==0){
                cift++;
            }
        }
        System.out.println("cift = " + cift);


    }
}
