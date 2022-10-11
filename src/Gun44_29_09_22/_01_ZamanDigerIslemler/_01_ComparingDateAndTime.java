package Gun44_29_09_22._01_ZamanDigerIslemler;

import java.time.LocalDate;

public class _01_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate buGun=LocalDate.now();
        LocalDate dun=buGun.minusDays(1);

        boolean sonraMi=buGun.isAfter(dun);// bugün dün den sonra mı?
        System.out.println("sonraMi = " + sonraMi);
        
        boolean onceMi=buGun.isBefore(dun);// bugün dünden önce mi?
        System.out.println("onceMi = " + onceMi);
        
        boolean esitMi=buGun.isEqual(dun);// bugün düne eşit mi?
        System.out.println("esitMi = " + esitMi);
        
        boolean artikYil=buGun.isLeapYear();// bugün artık yıl mı?
        System.out.println("artikYil = " + artikYil);
        
        
        
        
    }
   
}
