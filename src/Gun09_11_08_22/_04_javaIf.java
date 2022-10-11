package Gun09_11_08_22;

import java.util.Scanner;

public class _04_javaIf {
    public static void main(String[] args) {
        // girilen bir sayının tek mi çift mi olduğunu yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.println("Sayı giriniz = ");
        int Sayi= oku.nextInt();

        if ((Sayi%2)>0){
            System.out.println("Tek Sayı");
        }
        if ((Sayi%2)==0){
            System.out.println("Çift");
        }




    }}
