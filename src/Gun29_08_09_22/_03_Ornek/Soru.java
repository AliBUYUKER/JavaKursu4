package Gun29_08_09_22._03_Ornek;

public class Soru {
    // Bir banka class ı tanımlayınız.
    // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
    // 3 adet constructor ekleyin.
    // toString metodu oluşturun.
    // 3 tane nesne oluşturup mainde yazdırınız.
    public static void main(String[] args) {
        Banka bank=new Banka();
        bank.name="A bankası";
        bank.numbeOfBranches=20;
        bank.foundationYear=2003;

        Banka bank2=new Banka("B bankası",25,2000);
        Banka bank3=new Banka("C Bankası");
        Banka bank4=new Banka("D Bankası",2001);
        System.out.println("bank = " + bank);
        System.out.println("bank2 = " + bank2);
        System.out.println("bank3 = " + bank3);
        System.out.println("bank4 = " + bank4);




    }
}
