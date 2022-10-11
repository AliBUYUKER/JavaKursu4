package Gun19_25_08_22;

public class _03_Java2DArray {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz
        int[][] tablo=new int[2][3];
        for (int satir=0;satir<2;satir++){
            for (int sutun=0;sutun<3;sutun++)
                tablo[satir][sutun]=(int) (Math.random()*100);
        }int a=0;
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.print(tablo[i][j]+"\t");
                if (tablo[i][j]%2==1){
                    a++;
                }
            }
            System.out.println();
        }
        System.out.println("a = " + a);


    }
}
