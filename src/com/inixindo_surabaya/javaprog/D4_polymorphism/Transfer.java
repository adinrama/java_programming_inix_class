package com.inixindo_surabaya.javaprog.D4_polymorphism;

public class Transfer extends Pembayaran {
    private String nomorRekening;

    public Transfer(double jumlah, String nomorRekening) {
        super(jumlah);
        this.nomorRekening = nomorRekening;
    }

    @Override
    public void proses() {
        System.out.println("Memproses transfer bank");
        System.out.println("Ke rekening: " + nomorRekening);
        System.out.println("Jumlah: Rp " + jumlah);
    }
}
