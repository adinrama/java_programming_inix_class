package com.inixindo_surabaya.javaprog.B2_interface_inheritance;

public class AnjingPekerja implements HewanKerja, Berlari {
    private String nama;
    private int jamKerja;

    public AnjingPekerja(String nama) {
        this.nama = nama;
        this.jamKerja = 0;
    }

    @Override
    public void beriMakan() {
        System.out.println("Memberi makan " + nama);
    }

    @Override
    public void ajakBermain() {
        System.out.println("Bermain lempar tangkap dengan " + nama);
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void bekerja() {
        jamKerja++;
        System.out.println(nama + " bekerja sebagai anjing penjaga");
    }

    @Override
    public int getJamKerja() {
        return jamKerja;
    }

    @Override
    public void berlari() {
        System.out.println(nama + " berlari cepat");
    }

    @Override
    public void berjalan() {
        System.out.println(nama + " berjalan patroli");
    }
}
