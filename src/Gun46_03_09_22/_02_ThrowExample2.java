package Gun46_03_09_22;

import java.util.Scanner;

public class _02_ThrowExample2 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("yeni şifre oluşturma");
        System.out.println("yeni şifrenizi oluşturunuz =");
        String password = oku.nextLine();
        if (password.length() < 8) {


            System.out.println("lütfen dikkat !");
            System.out.println("şifre 8 karaketrden küçük olamaz");


        }

        if (password.length() > 15) {


            System.out.println("lütfen dikkat !");
            System.out.println("Şifre 15 karakterden büyük olamaz");


        }

    }
}
