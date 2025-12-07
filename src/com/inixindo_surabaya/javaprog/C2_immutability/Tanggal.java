package com.inixindo_surabaya.javaprog.C2_immutability;

public class Tanggal {
    private final int hari;
    private final int bulan;
    private final int tahun;

    public Tanggal(int hari, int bulan, int tahun) {
        this.hari = hari;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public int getHari() {
        return this.hari;
    }

    public int getBulan() {
        return this.bulan;
    }

    public int getTahun() {
        return this.tahun;
    }

    public Tanggal tambahHari(int jumlah) {
        return new Tanggal(getHari() + jumlah, getBulan(), getTahun());
    }

    @Override
    public String toString() {
        return getHari() + "/" + getBulan() + "/" + getTahun();
    }
}
