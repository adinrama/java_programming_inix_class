package com.inixindo_surabaya.javaprog.A2_static_final_modifiers;

public class Pengguna {
    // Final instance variable - harus diinisialisasi
    private final String id;
    private final long waktuPendaftaran;
    private String nama; // Non-final - bisa diubah

    public Pengguna(String id, String nama) {
        this.id = id;
        this.nama = nama;
        this.waktuPendaftaran = System.currentTimeMillis();
    }

    // Final method
    public final String getId() {
        return id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Tidak bisa:
    // public void setId(String id) { this.id = id; } // ERROR - final variable
}
