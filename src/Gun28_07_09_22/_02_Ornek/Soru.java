package Gun28_07_09_22._02_Ornek;

public class Soru {
    // Math sınıfndaki metodlarıdan 5 tanesini
// kendi isimlendirmenizle ayrı bir sınıfta yazarak,
// (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
// mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
// kullanımlarını yazınız.
    public static void main(String[] args) {
    int sayi2=myMath.getMin(9,3);
        System.out.println("sayi2 = " + sayi2);
    int sayi3=myMath.getMax(9,3);
        System.out.println("sayi3 = " + sayi3);
    int sayi4=myMath.getRandom();
        System.out.println("sayi4 = " + sayi4);
    double sayi1= myMath.getRandomm();
        System.out.println("sayi1 = " + sayi1);

    }
}
