package Gun25_02_09_22;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _05_JavaMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(9,"tilki");
        hm.put(2,"kedi");
        hm.put(30,"köpek");
        hm.put(11,"kuş");
        hm.put(4,"kurt");
        System.out.println("hm = " + hm);

        Map<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"köpek");
        lhm.put(11,"kuş");
        lhm.put(4,"kurt");
        System.out.println("hm = " + lhm);

        Map<Integer,String> tm=new TreeMap<>();
        tm.put(9,"tilki");
        tm.put(2,"kedi");
        tm.put(30,"köpek");
        tm.put(11,"kuş");
        tm.put(4,"kurt");
        System.out.println("hm = " + tm);

    }
}
