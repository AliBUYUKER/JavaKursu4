package Gun26_05_09_22;

import java.util.Scanner;

public class _01_JavaClassAndObject {
    // metodların yazılabildiği yer
    public static void main(String[] args) {
        // programın başladığı yer , ilk bu noktadan sonra çalışmaya başlar.
        int sayi=5;
        Scanner oku=new Scanner(System.in);
        Araba benimArabam=new Araba();
        
        benimArabam.renk="Beyaz";
        benimArabam.modelYili=2022;
        benimArabam.motorhacmi=1999.99;
        benimArabam.plaka="42 BTC 42";
        System.out.println("benimArabam.plaka = " + benimArabam.plaka);
        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.motorhacmi = " + benimArabam.motorhacmi);
        System.out.println("benimArabam.modelYili = " + benimArabam.modelYili);
        
    }
    // metodların yazılabildiği yer
}
class Araba{
    int modelYili;
    String renk;
    double motorhacmi;
    String plaka;
    
    
    
}