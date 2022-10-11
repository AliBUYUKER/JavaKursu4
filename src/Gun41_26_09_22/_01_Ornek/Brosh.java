package Gun41_26_09_22._01_Ornek;

public class Brosh implements IFood{

    void service(){
        System.out.print("Sıcak bir servisle tık modunu yakalayan çorba :)");
    }

    void boil(){
        System.out.print("Özel haşlama suyundan Brosh çorbası hazırlanıyor");
    }

    @Override
    public void name() {
        System.out.print("Brosh =");
    }

    @Override
    public void taste() {
        System.out.println("denişik bişiy işte gonyada ilk :)");
    }

    @Override
    public double fee() {
        return 20;
    }
}
