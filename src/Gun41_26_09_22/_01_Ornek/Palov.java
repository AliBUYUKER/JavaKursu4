package Gun41_26_09_22._01_Ornek;

public class Palov implements IFood{

    void boil(){
        System.out.print("Pilav nemini alması için dinlendiriliyor");
    }

    void fry(){
        System.out.print("Tereyağı ile kavurlularak pirinçler tane tane hazırlanıyor");}


    @Override
    public void name() {
        System.out.print("Palov = ");
    }

    @Override
    public void taste() {
        System.out.println("Tane tane tereyağlı sporcu pilav Esnaf işi:)");
    }

    @Override
    public double fee() {
        return 20;
    }
}
