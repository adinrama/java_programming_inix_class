package com.inixindo_surabaya.javaprog.D5_casting_object_references;

public class Programmer extends Karyawan {
    private String bahasaPemrograman;
    private int jumlahProyek;

    public Programmer(String nama, double gajiPokok, String bahasaPemrograman) {
        super(nama, gajiPokok);
        this.bahasaPemrograman = bahasaPemrograman;
    }

    @Override
    public double hitungGaji() {
        double bonus = this.jumlahProyek * 500000;
        return super.hitungGaji() + bonus;
    }

    public void setBahasaPemrograman(String bahasaPemrograman) {
        this.bahasaPemrograman = bahasaPemrograman;
    }

    public void tambahProyek() {
        jumlahProyek++;
    }
}
