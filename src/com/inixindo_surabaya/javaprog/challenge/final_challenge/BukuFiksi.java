package com.inixindosby.javaprog.final_challenge;

public class BukuFiksi extends Buku {
    private String genre;

    public BukuFiksi(String isbn, String judul, String pengarang, int tahunTerbit, String genre) {
        super(isbn, judul, pengarang, tahunTerbit);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // OVERRIDE toString()
    @Override
    public String toString() {
        return "BukuFiksi{" +
                "isbn='" + getIsbn() + '\'' +
                ", judul='" + getJudul() + '\'' +
                ", pengarang='" + getPengarang() + '\'' +
                ", tahunTerbit=" + getTahunTerbit() +
                ", genre='" + genre + '\'' +
                ", tersedia=" + isTersedia() +
                '}';
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Genre        : " + genre);
        System.out.println("Kategori     : Fiksi");
    }
}
