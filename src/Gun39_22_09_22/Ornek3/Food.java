package Gun39_22_09_22.Ornek3;

public abstract class Food {
    private String name;
    abstract void madeln();
    abstract void taste();

    public void yaz(String name){
        System.out.println(name);
    }

}
