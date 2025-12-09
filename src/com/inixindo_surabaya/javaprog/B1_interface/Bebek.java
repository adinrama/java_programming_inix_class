package com.inixindo_surabaya.javaprog.B1_interface;

// Class mengimplementasi multiple interfaces
public class Bebek implements Terbang, Berenang, Berlari {
    private String nama;
    private double ketinggianSaatIni;

    public Bebek(String nama) {
        this.nama = nama;
        this.ketinggianSaatIni = 0;
    }

    // Implementasi dari Terbang
    @Override
    public void terbang() {
        ketinggianSaatIni = 50;
        System.out.println(nama + " terbang rendah");
    }

    @Override
    public void mendarat() {
        ketinggianSaatIni = 0;
        System.out.println(nama + " mendarat");
    }

    @Override
    public double getKetinggian() {
        return ketinggianSaatIni;
    }

    // Implementasi dari Berenang
    @Override
    public void berenang() {
        System.out.println(nama + " berenang di kolam");
    }

    @Override
    public void menyelam() {
        System.out.println(nama + " menyelam mencari makanan");
    }

    // Override default method
    @Override
    public void mengapung() {
        System.out.println(nama + " mengapung sambil mencari ikan");
    }

    // Implementasi dari Berlari
    @Override
    public void berlari() {
        System.out.println(nama + " berlari di darat");
    }

    @Override
    public void berjalan() {
        System.out.println(nama + " berjalan dengan kaki berselaput");
    }
}
