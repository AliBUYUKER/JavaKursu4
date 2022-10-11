package Gun06_08_08_22;

public class _05_StringIndexOf {
    public static void main(String[] args) {
        // verilen karakterlerin stringin içindeki INDEX ini verir
        String cumle="Merhaba Dünya";

        System.out.println("cumle.indexof(r) = "+ cumle.indexOf("r"));
        System.out.println("cumle.indexof(ha) = "+cumle.indexOf("ha"));
        System.out.println("cumle.indexof(a) = "+cumle.indexOf("a"));
        System.out.println("cumle.indexof(ny) = "+cumle.indexOf("ny"));
        System.out.println("cumle.indexof(\" \") = "+cumle.indexOf(" "));
        System.out.println("cumle.indexof(A) = "+cumle.indexOf("A"));
        System.out.println("cumle.indexof(a,5) = "+cumle.indexOf("a",5));
        // a yı aramaya 5 (dahil) nolu index ten sonra başla



    }
}
