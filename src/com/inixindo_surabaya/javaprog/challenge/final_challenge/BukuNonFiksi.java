package com.inixindosby.javaprog.final_challenge;

public class BukuNonFiksi extends Buku {
    private String kategori;

    public BukuNonFiksi(String isbn, String judul, String pengarang, int tahunTerbit, String kategori) {
        super(isbn, judul, pengarang, tahunTerbit);
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    // OVERRIDE toString()
    @Override
    public String toString() {
        return "BukuNonFiksi{" +
                "isbn='" + getIsbn() + '\'' +
                ", judul='" + getJudul() + '\'' +
                ", pengarang='" + getPengarang() + '\'' +
                ", tahunTerbit=" + getTahunTerbit() +
                ", kategori='" + kategori + '\'' +
                ", tersedia=" + isTersedia() +
                '}';
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kategori     : " + kategori);
        System.out.println("Tipe         : Non-Fiksi");
    }
}
