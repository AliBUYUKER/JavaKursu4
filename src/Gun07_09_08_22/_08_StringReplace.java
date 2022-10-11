package Gun07_09_08_22;

public class _08_StringReplace {
    public static void main(String[] args) {
        // replace : bir stringin içindeki karakter(leri) verilenle değiştirir. hepsini
        String text="Merhaba Dünya";
        String dolar="$20";

        System.out.println("orjinali = " + text);//Merhaba Dünya
        System.out.println("text.replace(\"a\",\"e\") = " + text.replace("a","e"));//Merhebe Dünye
        System.out.println("ba -> de : "+ text.replace("ba","de"));//Merhade Dünya
        System.out.println("Dünya -> java : "+text.replace("Dünya","Java"));//Merhaba Java
        System.out.println("a ları silelim " + text.replace("a",""));// Merhb Düny
        System.out.println("boşlukları temizle " + text.replace(" ",""));//MerhabaDünya

        System.out.println("dolar.replace(\"$\") = " + dolar.replace("$",""));
        int Dolar=Integer.parseInt(dolar.replace("$",""));
        int Toplam=Dolar+20;
        System.out.println("Toplam = " + Toplam);

        
        
    }
}
