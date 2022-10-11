package Gun30_09_09_22.Soru;

import java.util.Scanner;

public class Hesap {
    int yatan;
    int cekilen;
    private int bakiye;
    public void bakiyeYatirma(){
        Scanner oku=new Scanner(System.in);
        System.out.print("Yatılacak Miktar  =");
        yatan=oku.nextInt();
        bakiye=bakiye+yatan;
        System.out.println("bakiye = " + bakiye+"₺");
    }
    public void bakiyeCekme(){
        Scanner oku=new Scanner(System.in);
        System.out.print("Çekilecek Miktar =");
        cekilen=oku.nextInt();
        if (cekilen>bakiye){
            System.out.println("Yetersiz Bakiye");
        }else {
        bakiye=bakiye-cekilen;
        System.out.println("Mevcut Bakiyeniz = " + bakiye+"₺");}
    }
    public void hesapHareketleri(){
        System.out.println("yatan = " + yatan);
        System.out.println("cekilen = " + cekilen);
        System.out.println("bakiye = " + bakiye+"₺");
    }
   public void bakiyeYazdir(){
       System.out.println("bakiye = " + bakiye+"₺");
    }

}
