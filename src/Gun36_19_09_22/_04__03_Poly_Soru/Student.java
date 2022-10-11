package Gun36_19_09_22._04__03_Poly_Soru;

public class Student extends Human {
    public Student(String name, String surName, String mission) {
        super(name, surName, mission);
    }


    @Override
    public void IdentityCard() {
        System.out.println("Student = "+name+" "+surName+" "+mission);
    }
}
