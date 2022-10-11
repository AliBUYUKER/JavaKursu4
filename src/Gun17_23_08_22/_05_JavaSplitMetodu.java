package Gun17_23_08_22;

import java.util.Arrays;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {
        // Split : bir stringi parçalara ayırır , verilen kriterlere göre
        String cumle="bugün hava oldukça soğuk"; // bunu kelimelerine ayırmak istiyorum
        //bugü
        //hava
        //oldukça
        //soğuk
        String[] kelimeler=cumle.split(" ");
        // bir şey verilmezse karakterlerine ayırır
        for (int i=0;i< kelimeler.length;i++){
            System.out.print(kelimeler[i]+" ");
            
        }
        
        
        // kısa yazdırma yolu 
        //System.out.println("Arrays.toString(kelimeler) = " + Arrays.toString(kelimeler));
    }
}
