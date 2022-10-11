package Gun36_19_09_22._04__03_Poly_Soru;

public class Worker extends Human {
    public Worker(String name, String surName, String mission) {
        super(name, surName, mission);
    }

    @Override
    public void IdentityCard() {
        System.out.println("Worker = "+name+" "+surName+" "+mission);
    }
}
