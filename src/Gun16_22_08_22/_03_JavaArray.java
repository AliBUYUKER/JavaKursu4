package Gun16_22_08_22;

public class _03_JavaArray {
    public static void main(String[] args) {
        int [] dizi1=new int[5]; // 0,1,2,3,4
        int[] dizi2={5,77,56,7,88,99,1021,33};// hem uzunlunu ve değerlerini verdin.
        System.out.println("dizi2.length = " + dizi2.length);
        String[] kelimeler=new String[5]; // 5 tane kelime saklayabilen bir dizi değişkeni
        boolean[] dizi3=new boolean[5];// 5 tane boolean saklayabilen bir dizi değişkeni
        double[] oranlar=new double[5]; // 5 tane double cinsi değer saklayabilen bir dizi

        for (int i=0;i< dizi1.length;i++)
            System.out.println("dizi1 = " + dizi1[i]);
        for (int i=0;i< dizi2.length;i++)
            System.out.println("dizi2[i] = " + dizi2[i]);
        for (int i=0;i< kelimeler.length;i++)
            System.out.println("dizi1 = " + kelimeler[i]);
        for (int i=0;i< dizi3.length;i++)
            System.out.println("dizi1 = " + dizi3[i]);
        for (int i=0;i< oranlar.length;i++)
            System.out.println("dizi1 = " + oranlar[i]);

    }
}
