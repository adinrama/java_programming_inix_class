package com.inixindo_surabaya.javaprog.D2_constructor_overloading;

public class BukuApp {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        Buku buku2 = new Buku("Java Programming");
        Buku buku3 = new Buku("Clean Code", "Robert Martin");
        Buku buku4 = new Buku("Effective Java", "Joshua Bloch", 2018);
        Buku buku5 = new Buku("Head First Java", "Kathy Sierra", 2022, 150000);

        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        buku3.tampilkanInfo();
        buku4.tampilkanInfo();
        buku5.tampilkanInfo();
    }
}
