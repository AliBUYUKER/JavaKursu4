package Gun25_02_09_22;

import java.util.HashMap;

public class _04_JavaMap {
    public static void main(String[] args) {
        // Bir kartvizit uygulamasının 2 kişi için yapınız.
        HashMap<String,String> vKartVizit=new HashMap<>();
        vKartVizit.put("isim","volkan Altıntaş");
        vKartVizit.put("email","volkan@gmail.com");
        vKartVizit.put("adres","çekmeköy/Türkiye");
        vKartVizit.put("telefon","0543816385");

        System.out.println("vKartVizit.get(\"isim\") = " + vKartVizit.get("isim"));
        System.out.println("vKartVizit.get(\"telefon\") = " + vKartVizit.get("telefon"));
        
        HashMap<String,String> eKartVizit=new HashMap<>();
        eKartVizit.put("isim","Ali Büyüker");
        eKartVizit.put("email","ali_42_<gmail.com");
        eKartVizit.put("adres","çumra/Gonya");
        eKartVizit.put("telefon","05543819345");
        
        // Kartvizitlerim diye bir defteri nasıl tanımlardım.
        // volkan'ın kartviziti
        //         elba'nın      kartviziti
        HashMap<String,HashMap<String,String>> kartVizitlerim=new HashMap<>();
        kartVizitlerim.put("volkan",eKartVizit);
        kartVizitlerim.put("Ali",eKartVizit);
        
        // volkanın telefonuna nasıl ulaşırım
        System.out.println("kartVizitlerim.get(\"volkan\") = " + kartVizitlerim.get("volkan").get("telefon"));
        System.out.println("kartVizitlerim.get(\"Ali\") = " + kartVizitlerim.get("Ali").get("telefon"));
        System.out.println("kartVizitlerim.get(\"Ali\").get(\"email\") = " + kartVizitlerim.get("Ali").get("email"));
        
        
    }
}
