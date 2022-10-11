package Gun21_29_08_22;

public class _07_JavaMethod {
    public static void main(String[] args) {
        int s1 =45;
        int s2=4;
        int s3=67;
        int s4=23;
        int sonuc1=toplam(s1,s2);
        int sonuc2=toplam(s1,s2,s3);
        int sonuc3=toplam(s1,s2,s3,s4);
        // parametreler aynı tip sadece miktarları farklı
        // bu tip durumlar için bir kolaylık sağlanmış.
        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);
    }
    public static int toplam(int...sayilar){
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam=toplam+sayilar[i];
        }
        return toplam;
    }




}
