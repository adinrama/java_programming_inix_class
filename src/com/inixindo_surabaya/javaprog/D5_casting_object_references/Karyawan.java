package com.inixindo_surabaya.javaprog.D5_casting_object_references;

public class Karyawan {
    protected String nama;
    protected double gajiPokok;

    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public double hitungGaji() {
        return this.gajiPokok;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Gaji: Rp " + hitungGaji());
    }
}
