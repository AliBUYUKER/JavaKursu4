package Gun07_09_08_22;

public class _09_StringReplaceFirst {
    public static void main(String[] args) {

        // replaceFirst : bir string içindeki karakteri(leri) verilenle değiştirir. sadece ilkini

        String text="Herkese Merhaba Dünya";

        System.out.println("orjinali = " + text);
        System.out.println("text.replaceFirst(\"a\",\"e\") = " + text.replaceFirst("a","e"));
        System.out.println("text.replaceFirst(\"Dünya\",\"Java\") = " + text.replaceFirst("Dünya","Java"));
        System.out.println("text.replaceFirst(\"a\",\"\") = " + text.replaceFirst("a",""));
        System.out.println("text.replaceFirst(\" \",\"\") = " + text.replaceFirst(" ", ""));



    }
}
