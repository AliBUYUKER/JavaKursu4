package Gun21_29_08_22;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class _06_Assignments {
    public static void main(String[] args) {
        /*1-Ismi **randomNum** olan bir method oluşturun.
        Parametre olarak **int max** almalı.
        Bu method, 0 ile max arasında random bir değer döndürmelidir.
        Random numarayı döndürünüz.*/

        Scanner oku = new Scanner(System.in);
        System.out.printf("Sayı giriniz =");
        int max= oku.nextInt();
         randomNum(max);

        /*2-"OrtaKelime" isminden bir method oluşturun.
        Bu method String'i parametre olarak almalı.
        Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
       Ortadaki kelimeyi return yapınız.
        Örnek: Ben Java'yı seviyorum.
        print : Java'yı
        Örnek2:
        Java'yı kolayca öğreniyorum.
        print: kolayca*/

        Scanner str = new Scanner(System.in);
        System.out.printf("Cümle giriniz =");
        String ortaKelime= str.nextLine();
        OrtakKelime(ortaKelime);

       /* 3-reverseString isminde bir method oluşturun.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten yazsın.
        Terste yazılmış halini yazdırınız.
        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ*/

        System.out.printf("String giriniz =");
        String revize=str.nextLine();
        reverseString(revize);

       /* 4-adı  reverseWord olan bir method oluşturun
        Bu methodun String olarak bir parametresi olmalıdır
        Ve bu cümledeki kelimelerle tersine çevirmeli
        Ters halini yazdırın.
        Örnek 1 :
        Dize: Java yazın
        dönüş şöyle olmalıdır:  yazın Java
        Örnek 2:
        Dize: Sakin olun ve evde kalın
        dönüş olmalı: kalın evde ve olun sakin*/

        System.out.printf("String cümle =");
        String cumle = str.nextLine();
        reverseWord(cumle);

        /*5-getSum isminde bir method oluşturun.
        Parametresi ArrayList'tir.
        Dizideki tüm $ ları kaldır ve tüm sayıları topla
        return yaptğımız veri tipi 'int' olmalıdır.
        sonuç 0'dan küçükse, -1 yazdırın.
        Örnek1:
        ArrayList = $13, $15, $20
        Cevap = 48 olmalı
        Örnek 2 :
        ArrayList= $-13, $0, $0
        Cevap = -1 olmalı.*/

     String[] array={"$-13","$0","$0"};
      getSum(array);

       /*6-EvenOddNums isminde bir method oluşturun.
        Bu yöntem String olan bir parametreyi kabul etsin.
        Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
        Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
        toplam sonucu yazdırın.
**İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.**
        For example Örnek:
        String =  "6678421312"
        6+6-7+8+4+2-1-3-1+2
        sonuç 16 olmalı*/

       String onHaneli="6678421312";
        long sayi=Long.parseLong(onHaneli);
        EvenOddNums(sayi);

       /* 7-addDigits isminde bir method oluşturun.
        Parametresi int
        Return tipi de int
        Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
        Tek basamaklı çıktığında, döndürün
        **Örnek1:**
        **Girdi** `38`
        **Çıktı:** 2
        **Açıklama: İşlemler şöyle olacak**: `3 + 8 = 11`, `1 + 1 = 2`.
        2 , tek basamaklı olduğundan, bunu döndürün*/

        int sayi2=4321;
        addDigits(sayi2);

       /* 8-powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
       **Örnek 1:**
       **Girdi:** 27
       **Çıktı:** true
        Açıklama: 3*3*3 =27
        Sonuç= true
        **Örnek 2:**
        **Girdi:** 0
        **Çıktı:** false
        **Örnek 3:**
        **Girdi:** 9
        **Çıktı:** true*/

        int sayi3=81;
       boolean kati=sayi3%3==0;
        powerOfThree(kati);

       /* 9-Write a method called `append`
        `append adında bir method oluşturun.`
        `Parametre olarak iki int array  oluşturun.`
        ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
        Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
        Bunu döndürmelidir:
        {2, 4, 6, 1, 2, 3, 4, 5}.*/

        int[] array5={2,4,6,7};
        int[] arrray2={1,2,3,9,4,5};
        append(array5,arrray2);

        /*10-**isUnique** adında bir method oluşturun.
       Parametre olarak int array alır.
       ve bu dizideki değerlerin benzersiz olup olmadığını gösteren bir boolean değeri döndürür (benzerlik yoksa true, var ise false).
       örneğin, list isminde bir array'imiz varsa,
        int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
        Bu listede yinelenen eleman olmadığı için sonuç true dönmelidir.
        int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
        Bu listede eleman 3, iki tane olduğu için sonuç false dönmelidir.*/

        int[] list={4, 7, 2, 3, 9, 12, -47, -19, 308 ,3, 74};
        isUnique(list);

        /*11- 4 elemanlı bir dizi tanımlayınız değerlei kullanıcan alınız. Dizideki en küçük ve enbüyük elemanları bir fonksiyonda buldurup maın de arasındaki farkı bulunuz.*/

        int[] array4=new int[4];
        for (int i = 0; i < array4.length; i++) {
            System.out.printf("Sayı Giriniz =");
            array4[i]= oku.nextInt();
        }enbk(array4);

        /*12-  2x3 lük String bir tablo tanımlayınız, kullanıcıdan $22 veya $65  şeklinde para simgesi ve rakam olan değerlerle doldurunuz.
        sonrasında bir fonksiyonda  bütün RAKAMLARI toplayıp toplam para değerini bulunuz, toplam parayı main de yazdırınız.*/

        String[][] tablo=new String[2][3];
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.printf("Para birimi giriniz =");
                tablo[i][j]=str.nextLine();
            }
        }toplam(tablo);
    }

    public static void randomNum(int max) {
        int random = (int) (Math.random() * max);
        System.out.println("random = " + random);

    }

    public static String OrtakKelime(String ortaKelime) {
        ortaKelime.trim();
        int uzunluk = ortaKelime.length();
        String revize = ortaKelime.replaceAll(" ", "");
        int bosluksuz = revize.length();
        int boslukSayisi = (uzunluk - bosluksuz);
        for (int i = 0; i < (boslukSayisi / 2); i++) {
            ortaKelime = ortaKelime.replaceFirst(" ", "\r");
        }
        int ilkBosluk = ortaKelime.indexOf(" ");
        System.out.println("rev.substring(0,ilkBosluk) = " + ortaKelime.substring(0, ilkBosluk));

        return ortaKelime;
    }

    public static String reverseString(String orjinal) {
        String revize = "";
        for (int i = orjinal.length() - 1; i >= 0; i--) {
            revize = revize + orjinal.charAt(i);
        }
        System.out.println("revize = " + revize);
        return orjinal;
    }

    public static String[] reverseWord(String cumle) {
        String[] tersi = cumle.split(" ");
        for (int i = tersi.length - 1; i >= 0; i--) {
            System.out.print(tersi[i] + " ");
        }
        System.out.println();


        return tersi;
    }

    public static String[] getSum(String[] array) {
        String[] yeni = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            yeni[i] = array[i].replaceAll("[^0-9,-]", "");
        }
        int[] yeniArray = new int[array.length];
        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            yeniArray[i] = parseInt(yeni[i]);
            toplam = toplam + yeniArray[i];
        }
        if (toplam < 0) {
            System.out.println("Cevap =" + -1);
        } else System.out.println("toplam = " + toplam);

        return array;
    }

    public static long EvenOddNums(long sayi) {
        long basamak, toplam = 0;
        for (long i = sayi; i > 0; i /= 10) {
            basamak = i % 10;
            if (basamak % 2 == 0)
                toplam = (toplam + basamak);
            else toplam = (toplam - basamak);
        }
        System.out.println("toplam = " + toplam);
        return sayi;
    }

    public static int addDigits(int sayi2) {
        int basmak = 0;
        int a = 0;
        int b = 0;
        do {
            if (b > 0) {
                sayi2 = a;
                a = 0;
            }
            for (int i = sayi2; i > 0; i /= 10) {
                basmak = i % 10;
                a = (a + basmak);
            }
            b++;

        } while (!(a / 10 == 0));
        System.out.println("a = " + a);

        return sayi2;
    }

    public static boolean powerOfThree(boolean kati) {
        System.out.println(kati ? "3'ün katıdır" : "3'ün katı değildir");
        return kati;
    }

    public static int[] append(int[] array, int[] array2) {
        int uzunluk = array.length + array2.length;
        int[] newArray = new int[uzunluk];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        int a = 0;
        for (int i = 3; i < (array2.length + 3); i++) {
            newArray[i] = array2[a];
            a++;
        }
        System.out.println(" = " + Arrays.toString(newArray));
        return newArray;
    }

    public static boolean isUnique(int[] list) {
        Arrays.sort(list);
        int copy = -1;
        boolean tekrar = Boolean.parseBoolean(null);
        for (int i = 0; i < list.length; i++) {
            tekrar = !(copy == list[i]);
            if (tekrar == false) {
                break;

            } else copy = list[i];


        }
        System.out.println("tekrar = " + tekrar);
        return tekrar;
    }

    public static int[] enbk(int[] array4) {
        Arrays.sort(array4);
        int enb = array4[array4.length - 1];
        int enk = array4[0];
        System.out.println("En büyük = " + enb);
        System.out.println("En küçük = " + enk);
        return array4;
    }

    public static int toplam(String[][] tablo) {
        String[] strtablo = new String[6];
        int a = 0;
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                strtablo[a] = tablo[i][j];
                strtablo[a] = strtablo[a].replaceAll("[^0-9]", "");
                a++;
            }
        }
        int[] sayilar = new int[strtablo.length];
        int toplam = 0;
        for (int i = 0; i < strtablo.length; i++) {
            sayilar[i] = Integer.parseInt(strtablo[i]);
            toplam = sayilar[i] + toplam;
        }
        System.out.println("toplam = " + toplam);
        return toplam;
    }


}
