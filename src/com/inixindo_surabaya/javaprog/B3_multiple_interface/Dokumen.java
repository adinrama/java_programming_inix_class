package com.inixindo_surabaya.javaprog.B3_multiple_interface;

public class Dokumen implements Readable, Writable, Searchable, Printable {
    private String judul;
    private String konten;
    private int halamanTotal;
    private boolean editable;

    public Dokumen(String judul, String konten) {
        this.judul = judul;
        this.konten = konten;
        this.halamanTotal = konten.length() / 500 + 1;
        this.editable = true;
    }

    // Implementasi Readable
    @Override
    public String read() {
        return "Membaca dokumen: " + judul + "\n" + konten;
    }

    @Override
    public int getPageCount() {
        return halamanTotal;
    }

    // Implementasi Writable
    @Override
    public void write(String content) {
        if (editable) {
            this.konten += "\n" + content;
            this.halamanTotal = this.konten.length() / 500 + 1;
            System.out.println("Konten ditambahkan");
        } else {
            System.out.println("Dokumen tidak bisa diedit");
        }
    }

    @Override
    public boolean canEdit() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    // Implementasi Searchable
    @Override
    public boolean search(String keyword) {
        return konten.toLowerCase().contains(keyword.toLowerCase());
    }

    @Override
    public int getSearchResults() {
        return konten.split(" ").length;
    }

    // Implementasi Printable
    @Override
    public void print() {
        System.out.println("=== MENCETAK DOKUMEN ===");
        System.out.println("Judul: " + judul);
        System.out.println("Halaman: " + halamanTotal);
        System.out.println("Konten:\n" + konten);
        System.out.println("========================");
    }

    @Override
    public String getFormat() {
        return "PDF";
    }
}
