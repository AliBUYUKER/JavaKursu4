package Gun16_22_08_22;

import java.util.Scanner;

public class _06_JavaArray {
    public static void main(String[] args) {
        // gunun sorusu : bir döngü ile 5 tane buldurunuz
        //fakat bir bulduğunu tekrar bulmasın
        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra rndom olarak bir tanesini seçip ekrana seçileni yazıdırnız.
       /* Scanner oku=new Scanner(System.in);
        Scanner str=new Scanner(System.in);
        String[] kanal=new String[5];
        for (int i=0;i< kanal.length;i++){
            System.out.print(i+".kanal giriniz =");
            kanal[i]=oku.nextLine();
        }

        int secilen=(int)(Math.random()* kanal.length);
        System.out.println("secilen = " + secilen);
        int hangiKanal;
        for (int i=0;i<=2;i++){
            System.out.print("Kanal giriniz =");
            hangiKanal= str.nextInt();
        if (hangiKanal==secilen){
            System.out.println("Tebrikler");break;
        }else System.out.println("bilemediniz");{
                if (i==2){
                    System.out.println("Tahmin hakkınız doldu");}

            }

        }*/
        Scanner oku=new Scanner(System.in);
        Scanner str=new Scanner(System.in);
        String[] kanal={"atv","kanald","fox","trt","bbc"};
        for (int i=0;i< kanal.length;i++){

        int secilenn=(int)(Math.random()* kanal.length);
            System.out.println("kanal = " + kanal[secilenn]);
          }








    }
}
