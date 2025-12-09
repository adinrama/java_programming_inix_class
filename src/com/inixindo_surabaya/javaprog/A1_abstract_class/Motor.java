package com.inixindo_surabaya.javaprog.A1_abstract_class;

public class Motor extends Kendaraan {
    private int kapasitasMesin;

    public Motor(String merk, int tahunProduksi, double harga, int kapasitasMesin) {
        super(merk, tahunProduksi, harga);
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public void nyalakan() {
        System.out.println("Motor " + merk + " dinyalakan dengan starter");
    }

    @Override
    public void matikan() {
        System.out.println("Motor " + merk + " dimatikan");
    }

    @Override
    public double hitungPajakTahunan() {
        // Pajak motor 1.5% dari harga
        return harga * 0.015;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis: Motor");
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " cc");
    }
}
