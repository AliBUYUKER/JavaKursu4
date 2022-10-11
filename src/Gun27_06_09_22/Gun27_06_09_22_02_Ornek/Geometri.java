package Gun27_06_09_22.Gun27_06_09_22_02_Ornek;

public class Geometri {
    public static void main(String[] args) {

        Dikdortgen sekil=new Dikdortgen();
        sekil.kikasKenar=5;
        sekil.uzunKenar=10;
        int alan= sekil.alan();
        int cevre= sekil.cevre();
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);


    }



}
