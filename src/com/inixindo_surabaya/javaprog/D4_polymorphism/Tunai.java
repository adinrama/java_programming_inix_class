package com.inixindo_surabaya.javaprog.D4_polymorphism;

public class Tunai extends Pembayaran {
    public Tunai(double jumlah) {
        super(jumlah);
    }

    @Override
    public void proses() {
        System.out.println("Memproses pembayaran tunai");
        System.out.println("Jumlah: Rp " + jumlah);
    }
}
