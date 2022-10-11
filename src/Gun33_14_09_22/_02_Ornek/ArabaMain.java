package Gun33_14_09_22._02_Ornek;

public class ArabaMain {
    // bir araba nesnesi oluşturmak isteniyor. feields(Renk,Model,MotorHacmi,KapiSayisi)
    // Bu nesnenin verilen OOP kurallaına uygun olarak verip alınız.
    // Main de 1 tane nesne oluşturup bunu kontrol ediniz.

    // KURAL: genel yazılım kuralıdır.
    // bütün değişkenler private yapılır.
    // yani Kapsulleme ile kullanılır.
    // Eğer gerekiyorsa private kaldırılır.

    public static void main(String[] args) {
        Araba car=new Araba();
        car.setRenk("Kırmızı");
        car.setModel("2022");
        car.setKapiSayisi(8);
        car.setMotorHacmi(2001);
        System.out.println(car);
        Araba car2=new Araba("Mavi","2021",2000,5);
        System.out.println("car2 = " + car2);







    }
}
