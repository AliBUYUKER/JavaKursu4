package Gun44_29_09_22._02_JavaVeriTipleri;

public class _01_StringBuffetAndStringBuiler {
    public static void main(String[] args) {
        String cumle="";
        cumle=cumle + "Bugün ";
        cumle=cumle + "hava ";
        cumle=cumle + "soğuk";
        System.out.println(cumle);
        System.out.println("Yan yana hali ="+cumle.concat("dünn daha sıcaktı"));
        System.out.println("cumle = " + cumle);

        cumle=cumle.concat("dün daha sıcaktı.");// atama gerektirir
        System.out.println("cumle = " + cumle);
        /******StrinBuilder******/
        StringBuilder cumle2=new StringBuilder();
        cumle2.append("Bugün ");
        cumle2.append("hava ");
        cumle2.append("güzel. ");
        System.out.println("cumle2 = " + cumle2);

        /**** String eklem işlemelerinde performans testi *****/
        //1. yöntem + ile ekleme
        Long starTime=System.currentTimeMillis();
        String test1="";
        for (int i = 0; i < 1000; i++) {
            test1=test1+ "merhaba";
        }
        System.out.println("Süre = " + (System.currentTimeMillis()-starTime)+" ms");
        //2. yöntem concat  ile ekleme
         starTime=System.currentTimeMillis();
        String test2="";
        for (int i = 0; i < 1000; i++) {
            test2=test2.concat("merhaba");
        }
        System.out.println("Süre = " + (System.currentTimeMillis()-starTime)+" ms");
        //3. yöntem StringBuilder ile ekleme
         starTime=System.currentTimeMillis();
         StringBuilder test3=new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            test3.append("merhaba");
        }
        System.out.println("Süre = " + (System.currentTimeMillis()-starTime)+" ms");
// Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

        /****** StringBuilderi biraz daha inceleyelim *****/
        StringBuilder s=new StringBuilder();
        s.append("Bugün ");// tekrar kendine atama gerektirmez concat den farklı.
        s.append("hava ");
        s.append("güzel.");
        System.out.println("s = " + s);

        System.out.println("s.length() = " + s.length());
        s.append(4);
        System.out.println("s = " + s);
        
        s.reverse();// tersine çevirir.
        System.out.println("s = " + s);
        s.reverse();
        
        s.delete(0,5);// 0 dahil 5 hariç indexe göre siler.
        System.out.println("s = " + s);

        s.deleteCharAt(3);// sadece belirtilen indexdeki karakteri siler
        System.out.println("s = " + s);
        
        s.insert(5,"kelime");// 5 nolu indexe araya ekleme yaptı.
        System.out.println("s = " + s);
        
        s=new StringBuilder("Bugün hava güzel");// sıfırlandı yeni değer atandı.
        System.out.println("s = " + s);
        
        s.replace(3,8,"bu");// verilen aralığı verilenle değiştir.
        System.out.println("s = " + s);


        StringBuffer sbuffer=new StringBuffer(); // tamamen StringBuilder ile aynı
        // tek farkı, paralel


    }
}
