package Gun24_01_09_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class _06_Soru {
    public static void main(String[] args) {
        // Soru : 20 dan  60 kadar olan random sayılarla 10 elemanlı normal
        // bir diziyi doldurunuz. Sonrasında farklı olan rakamları , bir başka diziye
        // atayınız.(aynı rakamlar atılmayacak)
        // 2.Aşama - bir başka diziye atma işlemini bu sefer SET ile yapınız.
        int[] random=new int[10];
        int b=0;
        int a=0;
        ArrayList<Integer> copy=new ArrayList<>();
        for (int i = 0; i < random.length; i++) {
            random[i]=(int) ((Math.random()*40)+20);
        }Arrays.sort(random);
        System.out.println("Arrays.toString(random) = " + Arrays.toString(random));
        for (int i = 0; i < random.length; i++) {
            if (b==random[i]){
                continue;
            }
            else copy.add(random[i]);
            a++;
            b=random[i];
        }
        System.out.println("copy = " + copy);
        TreeSet<Integer> atama=new TreeSet<>();
        for (int i = 0; i < random.length; i++) {
            atama.add(random[i]);
        }
        System.out.println("atama = " + atama);
        
        
        
    }
}
