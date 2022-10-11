package Gun07_09_08_22;

public class _04_SrtringEndsWith {
    public static void main(String[] args) {
        // EndsWith : verilen karakterler ile bitiyor mu
        // sonuç true veya false yani boolean döner.
        String text="Merhaba Dünya";
        System.out.println("ya ile biyiyor mu = " + text.endsWith("ya"));// ture
        System.out.println("a ile biyiyor mu = " + text.endsWith("a"));// true
        System.out.println("A ile biyiyor mu = " + text.endsWith("A"));// false
        System.out.println("ny ile biyiyor mu = " + text.endsWith("ny"));// false
        System.out.println("m ile biyiyor mu = " + text.endsWith("m"));// false
        System.out.println("Dünya ile biyiyor mu = " + text.endsWith("Dünya"));// true
        System.out.println("dünya ile biyiyor mu = " + text.endsWith("dünya"));//false






    }
}
