package Gun36_19_09_22._03_Ornek;

public class Hayvan {
    private String name;
    public Hayvan(String name){
        setName(name);
    }
    public void ses(){
        System.out.println("ses çıkart");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
