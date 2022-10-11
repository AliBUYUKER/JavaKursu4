package Gun14_18_08_22;

import java.util.Scanner;

public class _11_Assigments {
    public static void main(String[] args) {
       /* 1-# 0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız.
        _Not: 0 ve 100 dahildir._*/
        for (int i=0;i<=100;i++){
            if (i%2==0)
            System.out.println(i);
        }
       /* 2-# 0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız.
    `Sonuç bu şekilde olmalıdır.````
        0
        20
        40
        60
        80
        100*/
        for (int i=0;i<=100;i++){
            if (i%4==0&&i%5==0){
                System.out.println(i);
            }
        }
        //3-Kullanıcıdan 10 adet sayı isteyiniz, eğer sayı çift ise toplasın, tek ise girdiğinde ise döngü sonlansın.
        Scanner oku=new Scanner(System.in);
        int toplam=0;
        for (int i=1;i<=10;i++){
            System.out.print("Sayı giriniz = ");
            int girilen= oku.nextInt();
            if (girilen%2==0){toplam=toplam+girilen;}
            else if (girilen%2==1) {
                break;
            }
        }System.out.println("toplam = " + toplam);
        //4-Kullanıcın gireceği bir sayının kaç basamak olduğunu bulunuz
        Scanner str=new Scanner(System.in);
        System.out.print("Sayi giriniz = ");
        String sayi=str.nextLine();
        String rep=sayi.replaceAll(" ","");
        int basamak=rep.length();
        System.out.println("basamak = " + basamak);
        //5-Kullanıcın girdiği bir sayının ilk ve son basamaklarının eşit olup olmadığınız bulunuz
        System.out.print("Sayi giriniz 2 = ");
        String sayi2=str.nextLine();
        String rep2=sayi2.replaceAll(" ","");
        int basamaklar=rep2.length();
        char ilkbasamak=sayi2.charAt(0);
        char sonbasamak=rep2.charAt(basamaklar-1);
        boolean esitmi=ilkbasamak==sonbasamak;
        System.out.println(esitmi ? "Eşit":"Eşit değil");
        //6-Kullanıcnın gireceği bir sayının basamaklarına göre tersi olan sayıyı bulunuz.
        String orjinal,revize="";
        System.out.print("ters çevrilecek stringi yazınız = ");
        orjinal=str.nextLine();
        int legnt=orjinal.length();
        for (int i=legnt -1;i>=0;i--){
           revize=revize+orjinal.charAt(i);
        }System.out.println("revize = " + revize);
        //7-Kullanıcından 10 sayı isteyiniz, ve ekrana yazdırınız,  eğer sonra girilen sayı önce girilenden büyük ise dikkate almasın(pass geçsin).
        System.out.print("Sayı girinz = ");
        String ilk= str.nextLine();
        System.out.println("sayı = " + ilk);
        Scanner okkU=new Scanner(System.in);
        int ilkk=Integer.parseInt(ilk);
        for (int i=2;i<=10;i++){
            System.out.print("Sayı giriniz = ");
            int girilen= okkU.nextInt();
            if (ilkk<girilen){continue;


            }else System.out.println("girilen = " + girilen);
        }



    }
}
