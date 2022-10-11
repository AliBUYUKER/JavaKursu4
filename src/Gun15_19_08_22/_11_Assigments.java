package Gun15_19_08_22;

import java.util.Scanner;

public class _11_Assigments {
    public static void main(String[] args) {
        /*1- Girilen bir sayının simetrik sayı (12321, 55555, 45554, 11611,77377)
        sayı olup olmadığını bulunuz*/
       Scanner str = new Scanner(System.in);
       /* String orjinal = " ";
        String revize = " ";
        System.out.print("Sayı giriniz = ");
        orjinal = str.nextLine();
        int length = orjinal.length();
        for (int i = length - 1; i >= 0; i--) {
            revize = revize + orjinal.charAt(i);
        }revize=revize.trim();
        int sayiO = Integer.parseInt(orjinal);
        int sayiR=Integer.parseInt(revize);
        boolean esit=sayiR==sayiO;
        System.out.println(esit ? "Eşit":"Eşit değil");*/
       /* 2- Aşağıdaki do-while döngüsüne denk  while döngüsü hangisidir?*/


       /* do {
            x = x + y;
        } while (x < z);*/
       /* Scanner oku=new Scanner(System.in);
        int x,y,z;
        System.out.print("x için sayı giriniz =");
        x=oku.nextInt();
        System.out.print("y için sayı giriniz =");
        y= oku.nextInt();
        System.out.print("z için sayı giriniz =");
        z= oku.nextInt();

        while (z>x){

           x=x+y;
        }
        System.out.println("x = " + x);*/
       /* 3. Aşağıdaki for döngüsüne denk while döngüsü hangisidir?  (başlangıçta toplam=0 varsayın)

        for (i = 1; i <= 100; i = i + 1)
            toplam = toplam + i;*/
       /* int sayac=1;
        int toplam=0;
        while (sayac<=100){
            toplam=toplam+sayac;
            sayac++;
        }
        System.out.println("toplam = " + toplam);*/

        /*4- Aşağıdaki çıktıyı veren programı yazınız
         *****
          ****
           ***
            **
             *
         */
       /* for (int j=5;j>=0;j--){
            for (int s=5;s>j;s--)
                System.out.print(" ");
        for (int i=1;i<=j;i++){
            System.out.print("*");
        }
            System.out.println();}*/



        /*  5- Aşağıdaki çıktıyı veren programı yazınız
         **********
          ********
           ******
            ****
             **
      */
        /*for (int j=10;j>0;j-=2){
            System.out.print(" ");
        for (int i=0;i<j;i++){
            System.out.print("*");
        }
            System.out.println();}*/

        for (int j=10;j>0;j-=2){
            System.out.print(" ");
            for (int i=0;i<j;i++){
                System.out.print("*");
            }
            System.out.println();}



    }
}
