package Gun07_09_08_22;

public class _06_StrinToUpperCase {
    public static void main(String[] args) {
        // toUpperCase : Stringi büyük harfe çevirir.

        String text="Merhaba Dünya";
        System.out.println("Orjinal hali = " + text);// Merhaba Dünya
        System.out.println("text.toUpperCase() = " + text.toUpperCase());// MERHABA DÜNYA


        System.out.println("ME ile başlıyor mu? " + text.startsWith("ME"));
        System.out.println("ME ile başlıyor mu? " + text.toUpperCase().startsWith("ME"));

        System.out.println("YA ile bitiyor mu?  " + text.endsWith("YA"));
        System.out.println("YA ile bitiyor mu? " + text.toUpperCase().endsWith("YA"));







    }
}
