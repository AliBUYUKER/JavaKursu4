package Gun03;

public class _04_Ornek1 {
    public static void main(String[] args) {

        // iki kenarı tanımlı olarak verilen bir dikdörgenin çevresini ve alanını bulunuz.
        int uzunKenar = 3;
        int kısaKenar = 5;

        int Cevre = uzunKenar + uzunKenar + kısaKenar + kısaKenar;
        int alan = uzunKenar * kısaKenar;

        System.out.println("Alan=" + alan);
        System.out.println("Cevre = " + Cevre);


    }
}
