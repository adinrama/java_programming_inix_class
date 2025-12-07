package com.inixindo_surabaya.javaprog.B2_field_constructor_method;

public class Mahasiswa {
    private String nama;
    private String nim;
    private double ipk;

    // Constructor tanpa parameter (default)
    public Mahasiswa() {
        this.nama = "Belum diisi";
        this.nim = "00000";
        this.ipk = 0.0;
    }

    // Constructor dengan parameter
    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
    }

    public String cekKelulusan() {
        if (ipk >= 3.0) {
            return "Lulus dengan baik";
        } else if (ipk >= 2.0) {
            return "Lulus";
        } else {
            return "Tidak lulus";
        }
    }

    public double hitungNilaiAkhir(double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        return (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }
}
