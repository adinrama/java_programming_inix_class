package com.inixindo_surabaya.javaprog.D3_instanceof_operator;

public class Lingkaran extends Bentuk {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    @Override
    public void gambar() {
        System.out.println("Menggambar lingkaran dengan radius: " + this.radius);
    }

    public double hitungLuas() {
        return Math.PI * this.radius * this.radius;
    }
}
