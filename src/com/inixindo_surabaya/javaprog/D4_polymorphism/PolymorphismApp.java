package com.inixindo_surabaya.javaprog.D4_polymorphism;

public class PolymorphismApp {
    public static void main(String[] args) {
        Pembayaran[] daftarPembayaran = new Pembayaran[3];
        daftarPembayaran[0] = new KartuKredit(500000, "1234-5678-9012");
        daftarPembayaran[1] = new Transfer(750000, "9876543210");
        daftarPembayaran[2] = new Tunai(200000);

        System.out.println("\n=== Proses Transaksi ===");
        prosesTransaksi(daftarPembayaran[0]);
        prosesTransaksi(daftarPembayaran[1]);
        prosesTransaksi(daftarPembayaran[2]);
    }

    public static void prosesTransaksi(Pembayaran pembayaran) {
        System.out.println("Memulai transaksi...");
        pembayaran.proses(); // Polymorphism in action
        System.out.println("Transaksi selesai\n");
    }
}
