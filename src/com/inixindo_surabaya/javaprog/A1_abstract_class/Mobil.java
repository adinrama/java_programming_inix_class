package com.inixindo_surabaya.javaprog.A1_abstract_class;

public class Mobil extends Kendaraan {
    private String jenisBahanBakar;
    private int jumlahPintu;

    public Mobil(String merk, int tahunProduksi, double harga, String jenisBahanBakar, int jumlahPintu) {
        super(merk, tahunProduksi, harga);
        this.jenisBahanBakar = jenisBahanBakar;
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void nyalakan() {
        System.out.println("Mobil " + merk + " dinyalakan dengan kunci");
    }

    @Override
    public void matikan() {
        System.out.println("Mobil " + merk + " dimatikan");
    }

    @Override
    public double hitungPajakTahunan() {
        // Pajak mobil 2% dari harga
        return harga * 0.02;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis: Mobil");
        System.out.println("Bahan Bakar: " + jenisBahanBakar);
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
