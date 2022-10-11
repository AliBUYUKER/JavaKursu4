package Gun09_11_08_22;

import java.util.Scanner;

public class _09_Assignments {
    public static void main(String[] args) {
        // 1- Girilen 1 sayının onlar basamağının tek olup olmadıüını yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");
        int sayi= oku.nextInt();
        int onlar=(sayi/10)%10;
        if ((onlar%2)==1){
            System.out.println("Tek");
        }
        if ((onlar%2)==0){
            System.out.println("Çift");
        }
        //2- Girilen bir şifrenin "Bayrak" kelimesine eşit olup olmadığını yazdırınız.
        Scanner Stroku=new Scanner(System.in);
        System.out.print("Şifre giriniz = ");
        String sifre= Stroku.nextLine();
        String Bayrak="Bayrak";
        boolean bayrek=sifre.equals(Bayrak);
        if (bayrek){
            System.out.println("Eşit");
        }
        if (!bayrek){
            System.out.println("Eşit değil");
        }
        //3- Girilen bir kelimenin ilk ve son harfinin aynı olup olmadığını yazdırınız.
        System.out.print("Bir kelime giriniz = ");
        String kelime=Stroku.nextLine();
        char ilk=kelime.charAt(0);
        int uzunluk=kelime.length();
        char son=kelime.charAt(uzunluk-1);
        boolean esit=ilk==son;
        if (esit){
            System.out.println("Eşit");
        }
        if (!esit){
            System.out.println("Eşit değil");
        }
        //4- Girilen bir kelimede A harfinin olup olmadığını yazdırınız.
        System.out.print("Kelime giriniz= ");
        String kellime= Stroku.nextLine();

        boolean varMi= kellime.contains("A");
        if (varMi){
            System.out.println("Var");
        }
        if (!varMi){
            System.out.println("Yok");
        }
        //5- Girilen 2 kelimenin aynı uzunlukta olup olmadığını yazdırınız.
        System.out.print("Kelime 1 = ");
        String kelime1=Stroku.nextLine();
        System.out.print("kelime 2 = ");
        String kelime2=Stroku.nextLine();
        int kelime1Uzunluk=kelime1.length();
        int kelime2Uzunluk=kelime2.length();

        if (kelime1Uzunluk==kelime2Uzunluk){
            System.out.println("Kelime 1 ile Kelime 2 aynı uzunlukta");
        }
        if (kelime1Uzunluk!=kelime2Uzunluk){
            System.out.println("Kelime 1 ile Kelime 2 aynı uzunlukta değil");
        }
        //6- Kullanıcının bir yeni şifre girmesini isteyiniz, şifrenin uzunluğu 8 den küçük ise, şifreniz kabul edilmedi yazsın.
        System.out.print("Yeni bir şifre giriniz = ");
        String siffre= Stroku.nextLine();
        int uzunnluk=siffre.length();
        if (uzunnluk<8){
            System.out.println("Şifreniz kabul edilmedi");
        }






    }
}
