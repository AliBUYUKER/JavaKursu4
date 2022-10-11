package Gun15_19_08_22;

public class _05_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *
        //**
        //***
        //****
        //*****
        //*****
        //****
        //***
        //**
        //*

        for (int l = 1; l <= 5; l++) {
            for (int k = 0; k < l; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 5; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
