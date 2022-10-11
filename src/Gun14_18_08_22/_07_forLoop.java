package Gun14_18_08_22;

import java.util.Scanner;

public class _07_forLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        // çarpımın değeri 100'ü geçtiğinde işleme sonlansım
        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz = ");
        int girilen = oku.nextInt();
        int carpim = 1;
        for (int i = 1; i <=girilen; i++){
            carpim = (carpim * i);

        if (carpim>100){
        break;}} System.out.println("carpim = " + carpim);


    }
}
