package Gun46_03_09_22;

public class _05_mainArgument {
    public static void main(String[] args) {
        // program çalışmadan önce parametre olarak verilen sayıları toplayan programı yazınız.
        int toplam = 0;
        for (String s : args) {
            System.out.println("s = " + s);
            int sayi=Integer.parseInt(s);
            toplam = toplam + sayi;
        }
        System.out.println("toplam = " + toplam);
    }
}
