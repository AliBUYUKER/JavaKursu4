package Gun29_08_09_22._02_Ornek;

public class Book {
    String name;
    int publishYear;
    String author;

    public Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    Book(){

    }
    Book(String name,String author){
        this.name=name;
        this.author=author;
    }
    Book(String name){
        this.name=name;
    }
    void yazdir(){
        System.out.println(name+" "+author+" "+publishYear);
    }



}
