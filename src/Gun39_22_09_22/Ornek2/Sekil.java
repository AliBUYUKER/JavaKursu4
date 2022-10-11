package Gun39_22_09_22.Ornek2;

public abstract class Sekil {
    private String name;
abstract double alan();
abstract  double cevre();

    public Sekil(String name) {
        this.name = name;
    }

    public void ciz(){
    System.out.println(this.name=name+" isimli bir şekil cizildi");
}

    @Override
    public String toString() {
        return "Sekil{" +"Alan = "+Math.round(alan())+" Çevre = "+Math.round(cevre())+
                " Name= " + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
