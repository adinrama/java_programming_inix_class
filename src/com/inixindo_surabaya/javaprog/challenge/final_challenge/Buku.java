package com.inixindosby.javaprog.final_challenge;

public class Buku {
    private String isbn;
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    private boolean tersedia;

    public Buku(String isbn, String judul, String pengarang, int tahunTerbit) {
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.tersedia = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    // OVERRIDE toString()
    @Override
    public String toString() {
        return "Buku{" +
                "isbn='" + isbn + '\'' +
                ", judul='" + judul + '\'' +
                ", pengarang='" + pengarang + '\'' +
                ", tahunTerbit=" + tahunTerbit +
                ", tersedia=" + tersedia +
                '}';
    }

    // OVERRIDE equals()
    @Override
    public boolean equals(Object obj) {
        // Cek apakah objek sama (referensi yang sama)
        if (this == obj) {
            return true;
        }

        // Cek apakah obj null atau class berbeda
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cast dan bandingkan berdasarkan ISBN
        Buku buku = (Buku) obj;
        return isbn.equals(buku.isbn);
    }

    // OVERRIDE hashCode()
    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    public void tampilkanInfo() {
        System.out.println("═══════════════════════════════════════");
        System.out.println("ISBN         : " + isbn);
        System.out.println("Judul        : " + judul);
        System.out.println("Pengarang    : " + pengarang);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Status       : " + (tersedia ? "Tersedia" : "Dipinjam"));
    }
}
