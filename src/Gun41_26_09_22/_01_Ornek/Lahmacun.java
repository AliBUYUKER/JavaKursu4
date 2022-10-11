package Gun41_26_09_22._01_Ornek;

public class Lahmacun implements IFood{

    void bake(){
        System.out.print("Özel meşe odununun ataşinde fırınlanarak çıtır çıtır pişiriliyor");
    }

    void addMeat(){
        System.out.print("Zırhlanarak hazırlanmış özel etler hazırlanıryor");
    }

    void dough(){
        System.out.print("Hamur yoğuruluyor");
    }


    @Override
    public void name() {
        System.out.print("lahmacun = ");
    }

    @Override
    public void taste() {
        System.out.println("Mükemmel yerli pizza :)");
    }

    @Override
    public double fee() {
        return 30;
    }
}
