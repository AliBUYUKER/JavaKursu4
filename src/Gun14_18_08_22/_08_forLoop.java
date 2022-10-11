package Gun14_18_08_22;

public class _08_forLoop {
    public static void main(String[] args) {
        // 2 ler çarpım tablosunu tablo olarak yazınız
        int artis=2;
        for (int i=1;i<=10;i++){
            if (i>=5&&i<=7)
                continue; // kendinden sonra gelenleri çalıştırmaz
            // döngüyü kırmaz, pas geçirir
            System.out.println( artis+"x"+i+"= " + (i*artis));
        }

        // break döngüyü kırar ve daha çalıştırmaz
        //continue çalıştığında pas geçirir dögüyü kırmaz.
    }
}
