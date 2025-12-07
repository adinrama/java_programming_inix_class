package com.inixindo_surabaya.javaprog.D3_instanceof_operator;

public class Persegi extends Bentuk {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void gambar() {
        System.out.println("Menggambar persegi dengan sisi: " + this.sisi);
    }

    public double hitungLuas() {
        return this.sisi * this.sisi;
    }
}
