package com.inixindo_surabaya.javaprog.A5_enum_types;

public class Pesanan {
    private String idPesanan;
    private StatusPesanan status;
    private Hari hariPesan;

    public Pesanan(String idPesanan) {
        this.idPesanan = idPesanan;
        this.status = StatusPesanan.PENDING;
    }

    public void ubahStatus(StatusPesanan statusBaru) {
        this.status = statusBaru;
        System.out.println("Status pesanan " + idPesanan + " diubah menjadi: " +
                status.getDeskripsi());
    }

    public void tampilkanInfo() {
        System.out.println("ID Pesanan: " + idPesanan);
        System.out.println("Status: " + status.getDeskripsi());
        System.out.println("Prioritas: " + status.getPrioritas());
        System.out.println("Aktif: " + (status.isAktif() ? "Ya" : "Tidak"));
    }
}
