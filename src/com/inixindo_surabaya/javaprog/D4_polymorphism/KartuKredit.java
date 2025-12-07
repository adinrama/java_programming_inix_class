package com.inixindo_surabaya.javaprog.D4_polymorphism;

public class KartuKredit extends Pembayaran {
    private String nomorKartu;

    public KartuKredit(double jumlah, String nomorKartu) {
        super(jumlah);
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void proses() {
        System.out.println("Memproses pembayaran dengan Kartu Kredit");
        System.out.println("Nomor Kartu: " + nomorKartu);
        System.out.println("Jumlah: Rp " + jumlah);
    }


}
