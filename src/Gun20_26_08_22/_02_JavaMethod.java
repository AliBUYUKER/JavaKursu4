package Gun20_26_08_22;

public class _02_JavaMethod {
    public static void main(String[] args) {
        Math.max(5,6);// bi şeyler gönderiliyor, geriye değer alınıyor
        Math.random();// bi şeyler gönderilmiyor, geriye değer alınıyor

        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
        merhabaYaz();// kullanımı kolay, çağırması kolay, tekrar tekrar kullanabilirsin
        merhabaYaz();// mainin daha kolay anlaşılabilir olur.
        merhabaYaz();

    }// mainin bitişi

    // buraya metodların yazılabileceği yerler
    public static void merhabaYaz(){
        System.out.println("fonksiyonda/ metodda Merhaba Dünya");

    }

    // metodlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
    // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
    // temiz kod için
}
