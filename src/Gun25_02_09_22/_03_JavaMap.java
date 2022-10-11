package Gun25_02_09_22;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1001,"İsmet Temur");
        hm.put(1002,"Birkan Filiz");
        hm.put(2001,"Hasan Aşık");
        hm.put(5001,"Hatice");
        hm.put(2001,"Eyüpcan Bilgin");

        System.out.println("hm = " + hm.values());
        System.out.println("hm.keySet() = " + hm.keySet());
        
        for (Integer k : hm.keySet() )
            System.out.println("k = " + k);

        for (String v : hm.values())
            System.out.println("v = " + v);
        
        for (Map.Entry<Integer,String> kv :hm.entrySet()){
            System.out.println("kv.getKey() = " + kv.getKey());
            System.out.println("kv.getValue() = " + kv.getValue());
        }
        for (Map.Entry<Integer,String> kv:hm.entrySet())
            System.out.println("Anahtar ve Değer = " + kv.getKey()+"-"+kv.getValue());

    }
}
