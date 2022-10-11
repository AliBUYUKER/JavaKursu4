package Gun20_26_08_22;

public class _06_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız
        int[]dizi=new int[5];
        _05_JavaMethod.dizi(dizi);
        int a=0;
        int b=dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]>a){
                a=dizi[i];
            } else if (dizi[i]<b) {b=dizi[i];

            }
        }
        System.out.println("En büyük "+a);
        System.out.println("En küçük "+b);

    }
}
