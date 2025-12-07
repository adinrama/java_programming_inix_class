package com.inixindo_surabaya.javaprog.D5_casting_object_references;

public class Sales extends Karyawan {
    private double komisi;
    private double targetPenjualan;

    public Sales(String nama, double gajiPokok, double komisi) {
        super(nama, gajiPokok);
        this.komisi = komisi;
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + this.komisi;
    }

    public void setTargetPenjualan(double targetPenjualan) {
        this.targetPenjualan = targetPenjualan;
    }

    public double getKomisi() {
        return this.komisi;
    }
}
