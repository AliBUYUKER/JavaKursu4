package Gun10_12_08_22;

import java.util.Scanner;

public class _08_Assignments {
    public static void main(String[] args) {
        //1- Girilen bir sayının birler ve onlar basamağının hem tek hem de eşit olup oladığını kontrol ediniz.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");
        int sayi= oku.nextInt();
        int birler=sayi%10;
        int onlar=(sayi/10)%10;

        if (birler%2==1 && onlar%2==1 && onlar==birler ){
            System.out.println("Girilen sayının onlar ve birler basamağı hem eşit hem tekdir");
        }
        else {System.out.println("Girilen sayının onlar ve birler basamağı eşit veya tek değildir");}
        //2- Girilen bir kelimede bosluk veya A harfinin olup olmadığını kontrol ediniz.
        Scanner Stroku=new Scanner(System.in);
        System.out.print("Bir kelime giriniz = ");
        String kelime= Stroku.nextLine();

        if (kelime.contains(" ") && kelime.contains("A") ){
            System.out.println("Girilen kelimede boşluk ve A harfi vardır.");
        }
        else {
            System.out.println("Girilen kelimede boşluk veya A harfi yoktur.");
        }
        /*3- kullanıcıdan ondalıklı bir sayının ,   tam ve ondalıklı kısmını ayrı  ayrı alınız.
        bır sayıları  nokta ıle bırlestırerek tek bır ondalıklı sayı haline gitirip, sonra yazdırınız.*/
        System.out.print("Ondalıklı bir sayının tam sayısını giriniz = ");
        int tam= oku.nextInt();
        System.out.print("Ondalıklı bir sayının ondalıklı kısmını giriniz = ");
        int ondalik= oku.nextInt();
       String ondalikKisim=Integer.toString(ondalik);
       String Tam=Integer.toString(tam);
       String ondalikSayi=tam+"."+ondalikKisim;
        System.out.println("ondalikSayi = " + ondalikSayi);
        /*4- Girilen bir sayı Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.
            Eğer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.*/
        System.out.print("Bir tam sayı giriniz = ");
        int sayyi= oku.nextInt();
        if (sayyi%9==0 && sayyi%5==0){
            System.out.println("Able to divide by 9 and 5");
        }
        if (sayyi%4==0 && sayyi%5==0){
            System.out.println("Able to divide by 4 and 15");
        }
        else {
            System.out.println("9,5 or 15'in katı değildir = ");}
        /*5- Girilen 3 sayıdan en küçük olanını bulunuz.*/
        System.out.print("Sayi 1 = ");
        int sayi1=oku.nextInt();
        System.out.print("Sayi 2 = ");
        int sayi2= oku.nextInt();
        System.out.print("Sayi 3 = ");
        int sayi3=oku.nextInt();
        int ENK=sayi1;
        if (ENK>sayi2){
            ENK=sayi2;
        }
        if (ENK>sayi3){
            ENK=sayi3;
        }
        System.out.println("ENK = " + ENK);
        /*6-Girilen bir string
        Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.
        Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.
        Aksi halde (else) "no money" yazdırın.*/
        System.out.print("Bir para birimi giriniz = ");
        String para=Stroku.nextLine();
        boolean varMi€=para.contains("€");
        if (varMi€){
            System.out.println("This is euro");
        }
        boolean varMi$=para.contains("$");
        if (varMi$) {
            System.out.println("This is dollar");
        }
        boolean varMi₺=para.contains("₺");
         if (varMi₺) {
            System.out.println("https://www.youtube.com/watch?v=4P2kbm76REw");// :)
        }

         if (!varMi$ && !varMi₺ && !varMi€){
             System.out.println("No money");
         }

        /*7- Girilen Bir öğrencinin notunu belirleyen bir Java programı yazın.
        Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:
        Eğer ortalama not >=90 =>not=A
        Eğer ortalama not >= 70 ve<90 => not=B
        Eğer ortalama not >=50 ve <70 =>not=C
        Eğer ortalama not <50 =>note=F
        Aşağıdaki örnek çıktıya bakın:
        int Quiz_score: 80
        int mid_term_score: 68
        int Final_score: 90
        print (Your grade is B)
        (Notunuz B'dir) */
        System.out.print("Vize notunuz = ");
        int Vize= oku.nextInt();
        System.out.print("Ara sınav notunuz = ");
        int araSinav=oku.nextInt();
        System.out.print("Final = ");
        int Final= oku.nextInt();
        int ort=(Vize+araSinav+Final)/3;
        if (ort>90){
            System.out.println("Notunuz = A'dır");
        }
        if (ort>=70 && ort<90){
            System.out.println("Notunuz B'dir");
        }
        if (ort>=50 && ort<70){
            System.out.println("Notunuz C'dir");
        }
        if (ort<50){
            System.out.println("Notunuz F'dir");
        }
        //8- Girilen 2 basamaklı bir sayının tersi olan sayıyı bulunuz.
        System.out.print("iki basamaklı bir sayı giriniz = ");
        int ikiBasamak= oku.nextInt();
        int onlarBasamagi=(ikiBasamak/10)%10;
        int birlerBasamagi=ikiBasamak%10;
        System.out.println("Sayının tersi = " + birlerBasamagi+onlarBasamagi);
        //9- Girilen 3 basamaklı bir sayının tersi olan sayıyı bulunuz.
        System.out.print("Üç basamaklı bir sayı giriniz = ");
        int ucBasamak= oku.nextInt();
        int onlarrBasamagi=(ucBasamak/10)%10;
        int birlerrBasamagi=ucBasamak%10;
        int yuzlerBasamagi=(ucBasamak/100)%10;
        System.out.println("Sayının tersi = " + birlerrBasamagi+onlarrBasamagi+yuzlerBasamagi);


    }
}
