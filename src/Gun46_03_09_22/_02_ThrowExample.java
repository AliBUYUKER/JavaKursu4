package Gun46_03_09_22;

import java.util.Scanner;

public class _02_ThrowExample {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("yeni şifre oluşturma");
        System.out.println("yeni şifrenizi oluşturunuz =");
        String password = oku.nextLine();
        try {
            if (password.length() < 8) {
                System.out.println("şifre 8 karaketrden küçük olamaz");
                // bu mesaj ile hata oluştur
            }
            if (password.length() > 15) {
                System.out.println("Şifre 15 karakterden büyük olamaz");

            }
        } catch (Exception ex) {

            // hatalar bir yere toplanıp, hepsi için yapılası gereken işlemler
            // birarada burada yapılabilir. mesela log tutma gibi
            System.out.println("lütfen dikkat !");
            System.out.println("uyarı" + ex.getMessage());
            // log tutma işlemi
        }
    }
}
