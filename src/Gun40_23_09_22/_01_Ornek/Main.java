package Gun40_23_09_22._01_Ornek;

public class Main {
    public static void main(String[] args) {
        Kartal k=new Kartal("kartal",true,"2020");
        Kedi ke=new Kedi("pamuk",false,"2021");
        System.out.println(k);
        k.again(k);
        System.out.println("****************");
        System.out.println(ke);
        k.again(ke);
        String word="Merhaba Dünya";


    }
}
