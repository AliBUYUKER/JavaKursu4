package Gun36_19_09_22._04__03_Poly_Soru;

public class Human {
    String name;
    String surName;
    String mission;

    public void IdentityCard(){
        System.out.println(name+" "+surName+" "+mission);
    }

    public Human(String name, String surName, String mission) {
        setName(name);
        setSurName(surName);
        setMission(mission);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }
}
