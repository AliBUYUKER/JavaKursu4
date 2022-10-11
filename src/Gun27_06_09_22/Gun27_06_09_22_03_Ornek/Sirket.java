package Gun27_06_09_22.Gun27_06_09_22_03_Ornek;

public class Sirket {
    // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
    // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
    // 3- Adım : Bu degerlerı yazıdırınız.
    // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
    //           çalıştığında kişinin doğum yılını versin.
    // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
    //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.
    public static void main(String[] args) {
        Person calisan=new Person();
        calisan.personAge=25;
        calisan.personName="Ali";
        calisan.personSurname="BÜYÜKER";

        calisan.bilgiYazdir();
        System.out.println("calisan.getBirthYear() = " + calisan.getBirthYear());
        System.out.println("calisan.getInitials() = " + calisan.getInitials());
    }
}
