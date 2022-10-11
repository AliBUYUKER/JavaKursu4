package Gun24_01_09_22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");
        // Ekrana yazdırma
        System.out.println("renkler = " + renkler);
        //Ekrana yazdırma tek tek
        for (String eleman:renkler){
            System.out.println("eleman = " + eleman);
        }
        // içindeki sıranın  garanti edildiği yöntem
        Iterator gosterge=renkler.iterator(); // Hafızadaki ilk kutucuğun yerini aldım,
        // ben adım adım gitcem , böylece içindeki sırayı takip edeceğim

        // adım adım gitme , bir sonraki bir sonraki
        while (gosterge.hasNext()) // bir sonraki var mı?
        {
            System.out.println("gosterge.next() = " + gosterge.next());
            // if (böyleyse gosterge.remove(); // o andaki kutucuğu siler
        }



    }
}
