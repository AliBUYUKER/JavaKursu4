package Gun28_07_09_22._03_Ornek;

import java.util.AbstractList;
import java.util.ArrayList;

public class Student {
    String fullName;
    int maxCredit=0;
    AbstractList<Lesson> dersleri=new ArrayList<>();

    void dersEkle(Lesson ders){
        dersleri.add(ders);

    }
    void dersleriYazdir(){
        for (Lesson d:dersleri)
            System.out.println(d.name+" "+d.credit);
    }
}
