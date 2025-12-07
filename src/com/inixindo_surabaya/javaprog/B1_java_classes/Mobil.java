package com.inixindo_surabaya.javaprog.B1_java_classes;

public class Mobil {
    String merk;
    String warna;
    int tahun;

    public Mobil(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    public void info() {
        System.out.println("Merk: " + merk + ", Warna: " + warna + ", Tahun: " + tahun);
    }

    public void klakson() {
        System.out.println("Mobil " + merk + ", Tin tin!");
    }
}
