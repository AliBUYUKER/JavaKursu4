package Gun43_28_09_22;

import java.time.LocalDate;
import java.time.Period;

public class _02_Period {
    public static void main(String[] args) {
        // 2 tarih arasındaki zaman farkı gösterir
        // LocakDate ler için kullanılır.
        LocalDate dogumtarihi=LocalDate.of(1996,3,12);
        LocalDate bugun=LocalDate.now();
        Period fark=Period.between(dogumtarihi,bugun);
        System.out.println(fark);
        System.out.println(fark.getYears()+"-"+fark.getMonths()+"-"+fark.getDays());
        Period period3Gun=Period.ofDays(3);
        Period period3ay=Period.ofMonths(3);

        LocalDate ucGunSonra=bugun.plus(period3Gun);// zaman aralığı ekleme
        LocalDate ucAySonra=bugun.plus(period3ay);

        System.out.println(ucGunSonra);
        System.out.println(ucAySonra);
        /***************************************************/
        // öernek kursun süresini ve bitiş gününü bulunuz (6 ay)
        LocalDate baslangic=LocalDate.of(2022,7,25);
        System.out.println("baslangic = " + baslangic);
        Period altiAySonra=Period.ofMonths(6);
        Period altiAySonnra=Period.of(1,3,5);
        LocalDate bitis=baslangic.plus(altiAySonnra);
        System.out.println("bitis = " + bitis);


    }
}
