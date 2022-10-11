package Gun21_29_08_22;

import java.util.Scanner;

public class _01_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıya aşağıdaki gibi bir menü çıkartarak, kullanıcı çıkış seçeneğini seçene kadar
        // sürekli işlemleri yapınız ve her bir menü için gerekli değerleri parametre alan fonksiyon olarak yazınız.
        /*  1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
        Bir işlem seçiniz */
        int secim;
        do {


        System.out.println("1-toplama\n" + "2-çıkarma\n" + "3-çarpma\n" + "4-bolme\n" + "5-Faktöryel\n" + "6-Çıkış");
        Scanner oku=new Scanner(System.in);
        System.out.print("Seçim yapınız =");
         secim= oku.nextInt();
         switc(secim);
        }while (secim!=6);// değil ise devam et
    }
    public static void switc(int secim){
        Scanner okuu=new Scanner(System.in);

        switch (secim){
            case 1:
                System.out.println("Seçim =  1-toplama");
                System.out.print("Sayı 1 giriniz =");
                int sayi1= okuu.nextInt();
                System.out.print("Sayı 2 giriniz =");
                int sayi2= okuu.nextInt();
                System.out.println((sayi1+sayi2));break;
            case 2:
                System.out.println("Seçim = 2-çıkarma");
                System.out.print("Sayı 1 giriniz =");
                int sayi3= okuu.nextInt();
                System.out.print("Sayı 2 giriniz =");
                int sayi4= okuu.nextInt();
                System.out.println((sayi3-sayi4));break;
            case 3:
                System.out.println("Seçim =  3-çarpma");
                System.out.print("Sayı 1 giriniz =");
                int sayi5= okuu.nextInt();
                System.out.print("Sayı 2 giriniz =");
                int sayi6= okuu.nextInt();
                System.out.println((sayi5*sayi6));break;
            case 4:
                System.out.println("Seçim = 4-bolme");
                System.out.print("Sayı 1 giriniz =");
                int sayi7= okuu.nextInt();
                System.out.print("Sayı 2 giriniz =");
                int sayi8= okuu.nextInt();
                System.out.println((sayi7/sayi8));break;
            case 5:
                System.out.println("Seçim =  5-Faktöryel");
                System.out.print("Sayı 1 giriniz =");
                int sayi9= okuu.nextInt();
                int a=1;
                for (int i = sayi9; i >0; i--) {
                    a = a * i;
                }break;
            case 6:
                System.out.println("Çıkış");break;
            default:
                System.out.println("Yanlış seçim");break;}
    }
}
