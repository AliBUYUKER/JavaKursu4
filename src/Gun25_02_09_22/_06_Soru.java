package Gun25_02_09_22;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _06_Soru {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        Map<String,String> sozluk=new TreeMap<>();
        sozluk(sozluk);
    }
    public static void sozluk(Map<String,String> sozluk){int secim;

        do {Scanner oku=new Scanner(System.in);
            Scanner str=new Scanner(System.in);
            Scanner cokluStr=new Scanner(System.in);
            System.out.println("1- Ekleme"+"\n"+"2- Düzeltme"+"\n"+"3- Listeleme"+"\n"+"4- Arama"+"\n"+"5- Silme"+"\n"+"6- Çıkış");
            System.out.print("Yapmak istediğiniz seçimi menüden seçerek tuşlayınız =");
            secim = oku.nextInt();
            switch (secim){
                case 1:
                    System.out.print("Kelime giriniz =");
                    String kelime=str.next();
                    System.out.print("Kelime Manasını giriniz =");
                    String mana=cokluStr.nextLine();
                    sozluk.put(kelime,mana);
                    System.out.println("Kelime kayıt edildi.");break;
                case 2:
                    System.out.print("Manasını düzeltmek istediğiniz kelimeyi giriniz =");
                    kelime=str.next();
                    System.out.print("Kelime Manasını giriniz =");
                    mana=cokluStr.nextLine();
                    sozluk.put(kelime,mana);
                    System.out.println("Kelime kayıt edildi.");break;
                case 3:
                    for (Map.Entry<String,String> kv:sozluk.entrySet()){
                        System.out.println(kv.getKey()+":= "+kv.getValue());
                    } System.out.println("\n");break;
                case 4:
                    System.out.print("Aranan kelimeyi giriniz =");
                    String aranan=str.next();
                    System.out.println("Manası :"+sozluk.get(aranan));break;
                case 5:
                    System.out.print("Kelime giriniz =");
                    kelime=str.next();
                    sozluk.remove(kelime);
                    System.out.println("Kelime silindi.");break;
                default:
                    System.out.println("Yanlış giriş yapdınız.");break;

            }}while (!(secim==6));
        System.out.println("Çıkış yapıldı.");
    }
}
