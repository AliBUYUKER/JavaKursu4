package Gun24_01_09_22;

import java.util.HashSet;

public class _05_Sets {
    public static void main(String[] args) {
        HashSet<Integer> setA=new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);
        HashSet<Integer> setB=new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);
        HashSet<Integer> birlesikHali=new HashSet<>();
        birlesikHali.addAll(setA);
        birlesikHali.addAll(setB);// toplu ekleme
        System.out.println("birlesikHali = " + birlesikHali);
        /*** farkı ****/
        HashSet<Integer> farki=new HashSet<>();
        farki.addAll(setA);
        farki.removeAll(setB);
        System.out.println("farki = " + farki);
        /*** ortak elemanlar ***/
        HashSet<Integer> ortakElemanlar=new HashSet<>();
        ortakElemanlar.addAll(setA);
        ortakElemanlar.retainAll(setB);
        System.out.println("ortakElemanlar = " + ortakElemanlar);



    }
}
