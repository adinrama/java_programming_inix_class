package com.inixindo_surabaya.javaprog.challenge.sistem_manajemen_rumah_sakit;

import java.util.*;
import java.text.SimpleDateFormat;

public abstract class Pasien {
    // Atribut protected agar bisa diakses child class
    protected String nomorRM;
    protected String nama;
    protected int umur;
    protected String jenisKelamin;
    protected Date tanggalMasuk;
    protected String diagnosa;
    protected boolean sudahBayar;

    // Constructor
    public Pasien(String nomorRM, String nama, int umur, String jenisKelamin) {
        this.nomorRM = nomorRM;
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.tanggalMasuk = new Date();
        this.sudahBayar = false;
    }

    // Abstract methods - harus diimplementasi di child class
    public abstract double hitungBiayaPengobatan();
    public abstract String getDiagnosa();
    public abstract String getKategoriPasien();

    // Concrete method
    public void tampilkanInfoPasien() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║         INFORMASI PASIEN                   ║");
        System.out.println("╚════════════════════════════════════════════╝");
        System.out.println("  Nomor RM       : " + nomorRM);
        System.out.println("  Nama           : " + nama);
        System.out.println("  Umur           : " + umur + " tahun");
        System.out.println("  Jenis Kelamin  : " + jenisKelamin);
        System.out.println("  Tanggal Masuk  : " + sdf.format(tanggalMasuk));
        System.out.println("  Kategori       : " + getKategoriPasien());
        System.out.println("  Diagnosa       : " + getDiagnosa());
        System.out.println("  Biaya          : Rp " + String.format("%,.0f", hitungBiayaPengobatan()));
        System.out.println("  Status Bayar   : " + (sudahBayar ? "✓ Lunas" : "✗ Belum Bayar"));
    }

    // Getters
    public String getNomorRM() { return nomorRM; }
    public String getNama() { return nama; }
    public int getUmur() { return umur; }
    public String getJenisKelamin() { return jenisKelamin; }
    public boolean isSudahBayar() { return sudahBayar; }

    // Setters
    public void setDiagnosa(String diagnosa) { this.diagnosa = diagnosa; }
    public void setSudahBayar(boolean sudahBayar) { this.sudahBayar = sudahBayar; }
}
