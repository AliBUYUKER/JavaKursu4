package Gun43_28_09_22;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _04_Soru {
    public static void main(String[] args) throws InterruptedException {
        LocalTime saat=LocalTime.now();
        DateTimeFormatter t=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(saat.format(t));
        LocalTime saat2=LocalTime.of(saat.getHour(), saat.getMinute(), saat.getSecond());
        System.out.println(saat2);
        int dk=saat2.getMinute();
        int h= saat2.getHour();
        for (int sn=0;sn<61;sn++){
            if (sn==60){
                sn=0;
                dk++;
            }if (dk==60){
                h++;
                dk=0;
            }
            saat2=LocalTime.of(h,dk,sn);
            System.out.print("\r"+saat2.format(t));
            Thread.sleep(1000);
        }

    }
}
