package Gun13_17_08_22;

import java.util.Scanner;

public class _08_DoWhile  {
    public static void main(String[] args) {
        // kullanıcı x girene kada ekrana "progran çalışıyor" yazan ve
        // x girildiğinde ise "program bitti" yazan programı yazınız.
       /* Scanner oku=new Scanner(System.in);
        int x=1;
        do {
            System.out.print("String giriniz = ");
            String str= oku.nextLine();
            if (str.equalsIgnoreCase("x")){
                System.out.println("Program bitti");
              x=0;
            }else  System.out.println("program çalışıyor");
        }while (x!=0);*/

        /********************************************************/
        Scanner oku=new Scanner(System.in);
        String okunan="";
        do { System.out.println("program çalışıyor");
            System.out.print("String giriniz = ");
           okunan= oku.nextLine();

        }while (!okunan.equalsIgnoreCase("x"));
        System.out.println("Program bitti");





    }
}
