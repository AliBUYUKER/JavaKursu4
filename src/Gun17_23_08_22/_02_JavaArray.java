package Gun17_23_08_22;

public class _02_JavaArray {
    public static void main(String[] args) {
        // 100 Elemanlı bir diziyi random olarak 100 e kadar olan sayılarla doldurunuz.
        // Sonrasında en büyük elemanı ve indexini bulunuz.
        int[] dizi=new int[100];
        int enb=dizi[0];
        int enbindex=0;
        for (int i=0;i<dizi.length;i++) {
            dizi[i] = (int) (Math.random()*100);
            System.out.println(i+".dizi = " + dizi[i]);
            if (dizi[i]>enb){
                enb=dizi[i];
                enbindex=i;

            }
        }
        System.out.println("enbindex = " + enbindex);

        System.out.println("enb = " + enb);

    }
}
