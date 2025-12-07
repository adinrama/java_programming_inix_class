package com.inixindo_surabaya.javaprog.D4_polymorphism;

public abstract class Pembayaran {
    protected double jumlah;

    public Pembayaran(double jumlah) {
        this.jumlah = jumlah;
    }

    // Method yang akan di-override
    public abstract void proses();

    public void tampilkanJumlah() {
        System.out.println("Jumlah pembayaran: Rp " + this.jumlah);
    }
}
