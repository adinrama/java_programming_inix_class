package com.inixindosby.javaprog.final_challenge;

import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    private String namaPerpustakaan;
    private ArrayList<Buku> daftarBuku;

    public Perpustakaan(String namaPerpustakaan) {
        this.namaPerpustakaan = namaPerpustakaan;
        this.daftarBuku = new ArrayList<>();
    }

    // Overload 1: Tambah buku umum
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("✓ Buku berhasil ditambahkan: " + buku.getJudul());
    }

    // Overload 2: Tambah buku dengan parameter terpisah
    public void tambahBuku(String isbn, String judul, String pengarang, int tahunTerbit) {
        Buku buku = new Buku(isbn, judul, pengarang, tahunTerbit);
        daftarBuku.add(buku);
        System.out.println("✓ Buku berhasil ditambahkan: " + judul);
    }

    // Overload 3: Tambah buku fiksi langsung
    public void tambahBuku(String isbn, String judul, String pengarang, int tahunTerbit, String genre) {
        BukuFiksi buku = new BukuFiksi(isbn, judul, pengarang, tahunTerbit, genre);
        daftarBuku.add(buku);
        System.out.println("✓ Buku Fiksi berhasil ditambahkan: " + judul + " (Genre: " + genre + ")");
    }

    // Instanceof 1
    public Buku cariBuku(String isbn) {
        System.out.println("\nMencari buku dengan ISBN: " + isbn);

        for (Buku buku : daftarBuku) {
            if (buku.getIsbn().equals(isbn)) {
                if (buku instanceof BukuFiksi) {
                    BukuFiksi bukuFiksi = (BukuFiksi) buku;
                    System.out.println("✓ Ditemukan! Ini adalah Buku Fiksi");
                    System.out.println("  Genre: " + bukuFiksi.getGenre());
                }
                else if (buku instanceof BukuNonFiksi) {
                    BukuNonFiksi bukuNonFiksi = (BukuNonFiksi) buku;
                    System.out.println("✓ Ditemukan! Ini adalah Buku Non-Fiksi");
                    System.out.println("  Kategori: " + bukuNonFiksi.getKategori());
                }
                else if (buku instanceof Buku) {
                    System.out.println("✓ Ditemukan! Ini adalah Buku umum");
                }
                return buku;
            }
        }
        System.out.println("✗ Buku tidak ditemukan");
        return null;
    }

    // Instanceof 2
    public void tampilkanBukuBerdasarkanTipe() {
        System.out.println("\nKLASIFIKASI BUKU BERDASARKAN TIPE:");
        System.out.println("═══════════════════════════════════════");

        List<BukuFiksi> bukuFiksiList = new ArrayList<>();
        List<BukuNonFiksi> bukuNonFiksiList = new ArrayList<>();
        List<Buku> bukuUmumList = new ArrayList<>();

        for (Buku buku : daftarBuku) {
            // INSTANCEOF: Klasifikasi buku
            if (buku instanceof BukuFiksi) {
                bukuFiksiList.add((BukuFiksi) buku);
            } else if (buku instanceof BukuNonFiksi) {
                bukuNonFiksiList.add((BukuNonFiksi) buku);
            } else if (buku instanceof Buku) {
                bukuUmumList.add(buku);
            }
        }

        System.out.println("\nBuku Fiksi (" + bukuFiksiList.size() + " buku):");
        for (BukuFiksi bf : bukuFiksiList) {
            System.out.println("  - " + bf.getJudul() + " [" + bf.getGenre() + "]");
        }

        System.out.println("\nBuku Non-Fiksi (" + bukuNonFiksiList.size() + " buku):");
        for (BukuNonFiksi bnf : bukuNonFiksiList) {
            System.out.println("  - " + bnf.getJudul() + " [" + bnf.getKategori() + "]");
        }

        System.out.println("\nBuku Umum (" + bukuUmumList.size() + " buku):");
        for (Buku b : bukuUmumList) {
            System.out.println("  - " + b.getJudul());
        }
    }

    // Instanceof 3
    public void tampilkanStatistik() {
        System.out.println("\nSTATISTIK PERPUSTAKAAN");
        System.out.println("═══════════════════════════════════════");

        int totalBuku = daftarBuku.size();
        int jumlahFiksi = 0;
        int jumlahNonFiksi = 0;
        int jumlahUmum = 0;
        int jumlahTersedia = 0;
        int jumlahDipinjam = 0;

        for (Buku buku : daftarBuku) {
            // INSTANCEOF untuk menghitung tipe buku
            if (buku instanceof BukuFiksi) {
                jumlahFiksi++;
            } else if (buku instanceof BukuNonFiksi) {
                jumlahNonFiksi++;
            } else {
                jumlahUmum++;
            }

            // Hitung status ketersediaan
            if (buku.isTersedia()) {
                jumlahTersedia++;
            } else {
                jumlahDipinjam++;
            }
        }

        System.out.println("Total Buku       : " + totalBuku);
        System.out.println("Buku Fiksi       : " + jumlahFiksi);
        System.out.println("Buku Non-Fiksi   : " + jumlahNonFiksi);
        System.out.println("Buku Umum        : " + jumlahUmum);
        System.out.println("─────────────────────────────────────");
        System.out.println("Tersedia         : " + jumlahTersedia);
        System.out.println("Dipinjam         : " + jumlahDipinjam);
    }

    public void pinjamBuku(Buku buku) {
        if (buku.isTersedia()) {
            buku.setTersedia(false);
            System.out.println("✓ Buku berhasil dipinjam: " + buku.getJudul());

            // Polimorfisme: Perilaku berbeda berdasarkan tipe runtime
            if (buku instanceof BukuFiksi) {
                BukuFiksi bf = (BukuFiksi) buku;
                System.out.println("  Info: Ini adalah buku fiksi genre " + bf.getGenre());
            } else if (buku instanceof BukuNonFiksi) {
                BukuNonFiksi bnf = (BukuNonFiksi) buku;
                System.out.println("  Info: Ini adalah buku non-fiksi kategori " + bnf.getKategori());
            }
        } else {
            System.out.println("✗ Buku sedang dipinjam: " + buku.getJudul());
        }
    }
}
