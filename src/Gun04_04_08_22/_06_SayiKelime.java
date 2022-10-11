package Gun04_04_08_22;

public class _06_SayiKelime {
    public static void main(String[] args) {
        /*** Stringi sayıya çevirmek ****/
        String ad="Ali";
        String kelimeSayi="65"; // şu anda bu aynı ad gibi simge yani rakam değil fakat rakam , sayi görünümlü ise sayıya dönüştürebilirim.
        int intDeger= Integer.parseInt(kelimeSayi); // sayi görünümlü simgeyi , sayıya(int) dönüştürdü
        System.out.println("intDeğer = " + intDeger);
        int toplam =intDeger+5;
        byte byteDeger = Byte.parseByte(kelimeSayi); // sayi görünümlü simgeyi , sayıya(byte) dönüştürdü
        System.out.println("byteDeger = " + byteDeger);
        /***** sayıları Stringe çevirmek *****/
        int sicaklik=18;
        // bugün hava sicakliği 18 derece
        System.out.println("bugün hava sicakliğı = " + sicaklik + " derece");
        String sicaklikKelimeHali= Integer.toString(sicaklik); // Toplanamaz
        // int toplama2 = sicaklikKelimeHali + 5; yapılamaz çünkü artık string
        System.out.println("Bugün hava sıcaklığı = " + sicaklikKelimeHali + " derece");




    }
}
