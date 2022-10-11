package Gun19_25_08_22;

import java.util.Scanner;

public class _04_Java2DArray {
    public static void main(String[] args) {
       // 2 ye 3 lük bir tabloyu kullanıcıdan sayı olarak doldurunuz
        // daha sonra ayrı bir döngü da en büyük sayıyı bulunuz.
        Scanner oku=new Scanner(System.in);
        int[][]sayi=new int[2][3];
        for (int i=0;i<2;i++){
            for (int j = 0; j <3 ; j++) {
                System.out.print(i+","+j+".Sayı giriniz =");
                sayi[i][j]= oku.nextInt();
            }
        }int a=0;
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if (sayi[i][j]>a){
                    a=sayi[i][j];
                }
            }
        }
        System.out.println("a = " + a);
    }
}
