package Gun30_09_09_22.Protected.Iki;

import Gun30_09_09_22.Protected.Bir.Doktor;

public class HastaneIstanbul {
    public static void main(String[] args) {
        Doktor dr=new Doktor("Mehmet");
        //Doktor dr1=new Doktor(); default sadece
        // kendi paketi ulasır
        dr.hastaneAdi="İstanbul";
    }
}
