package Gun45_30_09_22._02_ExceptionHandling;

import java.util.Scanner;

public class _01_JavaRuntimeException {
    public static void main(String[] args) {

        System.out.println("Program calismaya başladı");
        String kelime="";// " ; " olmasa hata verir.
        //char ilkHarf=kelime.charAt(0); rRunTime Error
        System.out.println("Program bitti ");

        // daha çalışmadan önce oluşmuş eksikliklerden kaynaklı hatalara
// Derleme zamanı yani COMPILE ERROR, Exception diyoruz.

//program çalıştıktan sonra çalışma zamanı içerisindeki hatalara
//çalışma zamanı yani RUNTIME ERROR, Exception diyoruz.
        Scanner oku=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            try {
                System.out.print("sayi1 =");
                int sayi1 = oku.nextInt();
                System.out.print("sayi2 =");
                int sayi2 = oku.nextInt();
                System.out.println(sayi1 / sayi2);
            }catch (Exception hata){// hata mesajlarını hata isimli Exception cinsinden değişkene attı
                System.out.println("hata var la "+hata.getMessage());i--;
            }
        }
        System.out.println("program bitti");

    }
}
