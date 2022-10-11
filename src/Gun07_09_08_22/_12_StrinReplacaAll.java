package Gun07_09_08_22;

public class _12_StrinReplacaAll {
    public static void main(String[] args) {
        // ReplaceAll : replace gibi çalışır. farklı Kriter(regex) verilebilir
        // refex : regular expression / düzenli ifadeler
        // TODO (yapıacak) : regex olarak neler yazılabiliyor google'dan araştırılacak

        String text="Merhaba Dünya123";

        System.out.println("orjinali = " + text);//Merhaba Dünya123
        System.out.println("abn -> _ = " + text.replaceAll("[abn]","_"));//Merh___ Dü_y_123
        System.out.println("A-Z -> _ = " + text.replaceAll("[A-Z]","_"));// _erhaba _ünya123
        System.out.println("text.replaceAll(\"[0-9]\",\"\") = " + text.replaceAll("[0-9]", ""));// Merhaba Dünya
        System.out.println("text.replaceAll(\"[^0-9]\",\"\") = " + text.replaceAll("[^0-9]", ""));// 123
        





    }
}
