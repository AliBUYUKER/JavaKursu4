package Gun29_08_09_22._01_Ornek;

public class Student {
    int id;
    String name;
    String surName;
    int classroom;
    Student(){// Constructor - Yapıcı Metodlar
        System.out.println("nesne oluştur");

    }
    Student(int id,String name,String surName,int classroom){
        this.id=id;
        this.name=name;
        this.surName=surName;
        this.classroom=classroom;
    }
    Student(int id,String name,String surName){
        this.id=id;
        this.name=name;
        this.surName=surName;
        this.classroom=classroom;
    }
    Student(int id,String name){
        this(id,name,"",0);
    }
}
