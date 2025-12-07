package com.inixindo_surabaya.javaprog.D2_constructor_overloading;

public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private double harga;

    public Buku() {
        this("Untitled", "Unknown", 2024, 0.0);
    }

    public Buku(String judul) {
        this(judul, "Unknown", 2024, 0.0);
    }

    public Buku(String judul, String penulis) {
        this(judul, penulis, 2024, 0.0);
    }

    public Buku(String judul, String penulis, int tahunTerbit) {
        this(judul, penulis, tahunTerbit, 0.0);
    }

    public Buku(String judul, String penulis, int tahunTerbit, double harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun: " + tahunTerbit);
        System.out.println("Harga: Rp" + harga);
        System.out.println();
    }
}
