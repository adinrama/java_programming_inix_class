package com.inixindo_surabaya.javaprog.D6_overriding_object_methods;

public class Mahasiswa {
    private String nim;
    private String nama;
    private double ipk;

    public Mahasiswa(String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Mahasiswa{" +
                "NIM='" + nim + '\'' +
                ", Nama='" + nama + '\'' +
                ", IPK=" + ipk +
                '}';
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {
        // Cek apakah objek sama (referensi yang sama)
        if (this == obj) return true;

        // Cek apakah obj null atau class berbeda
        if (obj == null || getClass() != obj.getClass()) return false;

        // Cast dan bandingkan field
        Mahasiswa mahasiswa = (Mahasiswa) obj;
        return nim.equals(mahasiswa.nim);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return nim.hashCode();
    }

    // Getter methods
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public double getIpk() {
        return ipk;
    }
}
