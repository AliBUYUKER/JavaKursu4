package Gun06_08_08_22;

public class _08_StringContains {
    public static void main(String[] args) {
        // contains : bir stringin içerisinde karakter(lerin) var olup
        // olmadığını boolean cinsinen söyle true veya false
        String cumle = "Merhaba Dünya";
        boolean varMi = cumle.contains("a");
        System.out.println(varMi ? "Var":"Yok");
        // 2. yontem
        System.out.println("varmı2 = " + cumle.contains("a"));
        System.out.println("cumle.contains(ya)" + cumle.contains("ya"));
        System.out.println("cumle.contains(k)" + cumle.contains("k"));
        System.out.println("cumle.contains(c)"+cumle.contains("c"));
        System.out.println("cumle = " + cumle);

}
}