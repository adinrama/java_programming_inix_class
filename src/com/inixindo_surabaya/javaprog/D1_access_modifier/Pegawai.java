package com.inixindo_surabaya.javaprog.D1_access_modifier;

public class Pegawai {
    // Private - hanya bisa diakses dalam class ini
    private String nip;
    private double gaji;

    // Protected - bisa diakses di subclass dan package yang sama
    protected String nama;
    protected int umur;

    // Public - bisa diakses dari mana saja
    public String departemen;

    // Default - bisa diakses dalam package yang sama
    String alamat;

    public Pegawai(String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    private void hitungPajak() {
        double pajak = gaji * 0.05;
        System.out.println("Pajak: " + pajak);
    }

    public void tampilkanGaji() {
        System.out.println("Gaji: " + this.gaji);
        hitungPajak();
    }

    protected void naikGaji(double persentase) {
        gaji += gaji * (persentase / 100);
    }
}
