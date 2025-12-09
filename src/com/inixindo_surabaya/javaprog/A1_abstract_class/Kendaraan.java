package com.inixindo_surabaya.javaprog.A1_abstract_class;

public abstract class Kendaraan {
    protected String merk;
    protected int tahunProduksi;
    protected double harga;

    public Kendaraan(String merk, int tahunProduksi, double harga) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
    }

    public abstract void nyalakan();
    public abstract void matikan();
    public abstract double hitungPajakTahunan();

    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahunProduksi);
        System.out.println("Harga: Rp" + harga);
    }

    public double getHarga() {
        return harga;
    }
}
