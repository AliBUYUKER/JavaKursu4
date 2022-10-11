package Gun05_05_08_22;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {

        int sayi = 5;
        // tipi adı değeri ; işlem tamam

        Scanner okuyucu = new Scanner(System.in);
        // tipi adı yeni bir okuyucu (klavyeden - konsoldan)
        System.out.println("Sayı giriniz =");
        sayi = okuyucu.nextInt();
        // okuyucu.nextInt() -> ekrandan 1 tam sayı (int cinsinden) oku
        System.out.println("sayi = " + sayi);


    }
}
