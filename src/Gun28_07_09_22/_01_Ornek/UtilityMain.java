package Gun28_07_09_22._01_Ornek;

import java.util.Map;

public class UtilityMain {
    public static void main(String[] args) {
        MyUtility myUt=new MyUtility();
        String strSayi=myUt.getString(356);
        int sayi=myUt.getInt("345");
        // bu metodlar Class a mı nesne ye mi ait
        // evet Nesneye ait

        Math.random();// ben bunun gibi direk nesne tanımlamadan
                    // kendi metodlarımı kullanmak istiyorum
        String strSayi2=MyUtility.getString2(23);
        int sayi2=MyUtility.getInt2("34");
        // bu metodları nesne oluşturmaya ihtiyac duymayan
        // class a (tipe ait) ait metodlardır.
        // tipe ait olduğu için tip adıyla çağrılabilir.
        Integer.parseInt("34"); // bu metod tipe ait
        Integer rakam=5;
        // Nesneyi ilgilendiren metodları normal yazıyoruz.
        // Nesneyi ilgilendirmeyen , tipi ilgilendiren
        // metodları STATIC ile yazıyoruz.

    }
}
