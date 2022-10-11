package Gun07_09_08_22;

public class _03_StringStartsWith {
    public static void main(String[] args) {
        // StartsWith : bununla başlıyor mu?
        // sonuç true veya false
        String text="HCL Teknoloji";
        System.out.println("HC ile başlıyor mu = " + text.startsWith("HC"));// Ture
        System.out.println("Te ile başlıyor mu = " + text.startsWith("Te"));// false
        System.out.println("H ile başlıyor mu = " + text.startsWith("H"));
        System.out.println("hc ile başlıyor mu = " + text.startsWith("hc"));
        System.out.println("h ile başlıyor mu =  " + text.startsWith("h"));
        System.out.println("a ile başlıyor mu =  = " + text.startsWith("a"));


        
        
    }
}
