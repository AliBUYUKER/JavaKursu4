package Gun29_08_09_22._02_Ornek;

public class Kitapci {
    // Book class yazınız.fields: name,publishYear,author.
    // 3 adet Consructor ekleyiniz.
    // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
    // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.
    public static void main(String[] args) {
        Book ktap1=new Book();
        ktap1.name="Harry Potter";
        ktap1.author="j.K Rowling";
        ktap1.publishYear=1997;
        Book kitap2=new Book("yüzük","JRR Tolkien");
        Book kitap3=new Book("sefiller");
        ktap1.yazdir();
        kitap2.yazdir();
        kitap3.yazdir();
        System.out.println("ktap1 = " + ktap1);
        System.out.println("kitap2 = " + kitap2);
        System.out.println("kitap3 = " + kitap3);

    }
}
