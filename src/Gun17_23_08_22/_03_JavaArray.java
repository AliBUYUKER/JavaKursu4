package Gun17_23_08_22;

public class _03_JavaArray {
    public static void main(String[] args) {
        // 100 Elemanlı bir diziyi random olarak 100 e kadar olan sayılarla doldurunuz.
        // Sonrasında tek ve çift eleman sayılarını bulunuz.
        int[] dizi=new int[100];
        int cift=0;
        int tek=0;
        for (int i=0;i< dizi.length;i++){
            dizi[i]=(int) (Math.random()*100);
            if (dizi[i]%2==0){
                cift++;
            }else tek++;
        }
        System.out.println("cift = " + cift);
        System.out.println("tek = " + tek);
    }
}
