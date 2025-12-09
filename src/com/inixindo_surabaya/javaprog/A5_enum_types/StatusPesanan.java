package com.inixindo_surabaya.javaprog.A5_enum_types;

// Enum dengan constructor dan method
public enum StatusPesanan {
    PENDING("Menunggu", 1),
    DIKONFIRMASI("Dikonfirmasi", 2),
    DIPROSES("Sedang Diproses", 3),
    DIKIRIM("Dalam Pengiriman", 4),
    SELESAI("Selesai", 5),
    DIBATALKAN("Dibatalkan", 0);

    private final String deskripsi;
    private final int prioritas;

    // Constructor enum harus private atau default
    StatusPesanan(String deskripsi, int prioritas) {
        this.deskripsi = deskripsi;
        this.prioritas = prioritas;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getPrioritas() {
        return prioritas;
    }

    public boolean isAktif() {
        return this != DIBATALKAN && this != SELESAI;
    }
}
