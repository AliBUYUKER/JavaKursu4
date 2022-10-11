package Gun20_26_08_22;

import java.util.Arrays;
import java.util.Scanner;

public class _05_JavaMethod {
    public static void main(String[] args) {
        // 20 elemanlı bir dizinin elemanlarını 100 kadar random sayılarla
        // bir fonksiyonda doldurunuz ve aynı fonksiyonda yazdırınız.

        degersizDizi();
    }
    public static void dizi(int[] dizi)
    {

        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int) (Math.random()*100);
        }System.out.println(Arrays.toString(dizi));

    }
    public static void degersizDizi()
    {
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz =");
       int dizi= oku.nextInt();
        int[]dizzi=new int[dizi];
        for (int i = 0; i < dizzi.length; i++) {
            dizzi[i]=(int) (Math.random()*100);
        }System.out.println(Arrays.toString(dizzi));


    }


}



