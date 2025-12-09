package com.inixindo_surabaya.javaprog.B1_interface;

// Class mengimplementasi satu interface
public class Burung implements Terbang {
    private String jenis;
    private double ketinggianSaatIni;

    public Burung(String jenis) {
        this.jenis = jenis;
        this.ketinggianSaatIni = 0;
    }

    @Override
    public void terbang() {
        ketinggianSaatIni = 100;
        System.out.println(jenis + " terbang ke ketinggian " + ketinggianSaatIni + " meter");
    }

    @Override
    public void mendarat() {
        ketinggianSaatIni = 0;
        System.out.println(jenis + " mendarat");
    }

    @Override
    public double getKetinggian() {
        return ketinggianSaatIni;
    }
}
