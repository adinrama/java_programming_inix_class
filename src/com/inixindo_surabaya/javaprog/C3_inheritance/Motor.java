package com.inixindo_surabaya.javaprog.C3_inheritance;

public class Motor extends Kendaraan {
    private int jumlahRoda;

    public Motor(String merk, int tahunProduksi, int jumlahRoda) {
        super(merk, tahunProduksi);
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Jumlah roda: " + this.jumlahRoda);
    }

    public void wheelie() {
        System.out.println("Motor melakukan sheelie!");
    }
}
