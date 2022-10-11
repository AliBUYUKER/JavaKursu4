package Gun37_20_09_22._07_Ornek.Utility;

import java.util.Scanner;

public class MyFunc {
    public static double yuvarla(double gelenSayi){
        Scanner input=new Scanner(System.in);
        System.out.print("Sonuç kaç basamaklı olsun = ");
        int cohice= input.nextInt();
        int multiplier=1;
        for (int i = 0; i < cohice; i++) {
           multiplier=multiplier*10;
        }
        gelenSayi=gelenSayi*multiplier;
        gelenSayi=Math.round(gelenSayi);
        gelenSayi=gelenSayi/multiplier;
        return gelenSayi;
    }
}
