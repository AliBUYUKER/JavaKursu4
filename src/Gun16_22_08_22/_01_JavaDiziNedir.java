package Gun16_22_08_22;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {
        /*yazılımın amacı : veriyi işlemek
        verinin yazılımın içinde UYGUN TIP te
        değişkene atılması ZORUNLU.

                bir 10 kişilik sınıfın not ortalamasını
        bulunuz.*/

        /*for(i=0;i<10;i++)
        {
            int not=oku.nextInt();
            toplam=toplam+not;
        }
        ort = toplam/10;

        ortlamayı geçen notlar nerde

        int not1;
        int not2;
        int not3;
        int not4;
.....
        int not100;


        int not1=oku.nextInt();
        int not2=oku.nextInt();
        int not3=oku.nextInt();
....
        int not100=oku.nextInt();

        toplam = not1+not2+not3+ .... +not100

        ort = toplam/100;
        if (not1>ort)
            yaz not1*/
        // bana bir tanımlamada BİRDEN FAZLA DEĞER tutabilecek bir değişkene ihtiyacım var.
        //ÇÖZÜM :
        int not=0;
        int[] notlar=new int[250]; // 250 tane not tutabilen INT tipinde değişken
        notlar[0]=60; // 0.kutudaki değer 60 ıgrNot1
        notlar[1]=70; // 1.kutudaki değer 70
        //....
        //.....
        notlar[249]=80; // 249.kutudaki değer 80;
        System.out.println("notlar = " + notlar[0]);
        Scanner oku=new Scanner(System.in);
        for (int i=0;i<250;i++){
            System.out.println("not giriniz = ");
            notlar[i]=oku.nextInt();
        }
        for (int i=0;i<250;i++){
            System.out.println(notlar[i]);
        }




    }
}
