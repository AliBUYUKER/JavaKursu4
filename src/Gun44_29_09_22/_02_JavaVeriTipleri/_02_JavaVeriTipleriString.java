package Gun44_29_09_22._02_JavaVeriTipleri;

public class _02_JavaVeriTipleriString {
    public static void main(String[] args) {
        int[] dizi2=new int[2];
        
        // Nesne tipleri
        // Sring ınteger, Double, Long
        int sayi=5;
        Integer rakam=4;
        String kelime="merhaba";
        //Null değer alabilen ilkel tipler.
        // referans a yakın , ilkel gibi davranırlar.
        String ad1="mehmet";
        String ad2="ali";
        ad1=ad2;
        ad2="ayşe";
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);
        
    }
}
