package com.inixindo_surabaya.javaprog.C3_inheritance;

public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merk, int tahunProduksi, int jumlahPintu) {
        super(merk, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Jumlah pintu: " + this.jumlahPintu);
    }
}
