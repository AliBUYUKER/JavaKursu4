package Gun14_18_08_22;

import java.util.Scanner;

public class _09_continue {
    public static void main(String[] args) {
        // kullanıcıdan 5 sayı isteyiniz.
        // bu sayılardan 6 ile 10 arasındakiler hariç, diğerlerini toplasın.
        Scanner oku=new Scanner(System.in);
        int toplama=0;
        for (int i=1;i<=5;i++){
            System.out.print(i+".sayı giriniz = ");
            int girilen=oku.nextInt();
            if (girilen>6&&girilen<10)
                continue;
            toplama=toplama+girilen;
        }
        System.out.println("toplama = " + toplama);



    }
}
