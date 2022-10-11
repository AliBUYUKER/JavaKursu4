package Gun29_08_09_22._03_Ornek;

public class Banka {
    String name;
    int numbeOfBranches;
    int foundationYear;

    @Override
    public String toString() {
        String donecek="Banka{" +
                "Adı='" + name + '\'' ;

        if (foundationYear>0)
            donecek+="kuruluş yılı"+foundationYear;
        if (numbeOfBranches>0)
            donecek+=", Şube Sayısı=" + numbeOfBranches;

        return donecek;
    }

    public Banka(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
    }

    public Banka(String name) {
        this.name = name;
    }

    public Banka(String name, int numbeOfBranches, int foundationYear) {
        this.name = name;
        this.numbeOfBranches = numbeOfBranches;
        this.foundationYear = foundationYear;
    }
    Banka(){

    }


}
