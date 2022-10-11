package Gun41_26_09_22._01_Ornek;

public class AdanaKebap implements IFood{

    void grill (){
        System.out.print("Özel meşe kömüründe yavaş yavaş pişirildi");
    }

    void marinade() {
        System.out.print("Zırhlanarak inceltilen etler özel\nbaharatlarla harmanlanarak şişe diziliyor");
    }

    @Override
    public void name() {
        System.out.print("Adana kebap = ");
    }

    @Override
    public void taste() {
        System.out.println("Adana'nın  gururu etin en güzel hali :)");
    }

    @Override
    public double fee() {
        return 50;
    }

}
