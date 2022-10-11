package Gun20_26_08_22;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        tekMiCiftMi(55);

        tekMiCiftmi();



    }
    public static void tekMiCiftMi(int sayi)
    {

        if (sayi%2==0){
            System.out.println("Çift");
        }else System.out.println("Tek");
    }

public static void tekMiCiftmi()
{
    Scanner oku=new Scanner(System.in);
    System.out.print("Sayı giriniz =");
    int sayi= oku.nextInt();
   tekMiCiftMi(sayi);
}


}
