package com.inixindo_surabaya.javaprog.C3_inheritance;

public class Kendaraan {
    protected String merk;
    protected int tahunProduksi;

    public Kendaraan(String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    public void info() {
        System.out.println("Kendaraan: " + this.merk + ", Tahun produksi: " + this.tahunProduksi);
    }

    public void nyalakan() {
        System.out.println("Kendaraan dinyalakan..");
    }
}
