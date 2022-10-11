package Gun05_05_08_22;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {

        //Bir karenin kenarını kullanıcıdan isteyip çevresini ve alanını bulunuz.
        // cevre=a+a+a+a    alan =a*a
        Scanner oku = new Scanner(System.in);
        System.out.print("Kenar =");
        int Kenar = oku.nextInt();
        int cevre = 4 * Kenar;
        int alan = Kenar * Kenar;
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);


    }
}
