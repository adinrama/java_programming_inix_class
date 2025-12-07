package com.inixindo_surabaya.javaprog.D1_access_modifier;

public class Manager extends Pegawai {
    private double tunjangan;

    public Manager(String nip, String nama, double gaji, double tunjangan) {
        super(nip, nama, gaji);
        this.tunjangan = tunjangan;

        this.nama = nama + " (Manager)";
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + this.nama);
        naikGaji(10);
        tampilkanGaji();
    }
}
