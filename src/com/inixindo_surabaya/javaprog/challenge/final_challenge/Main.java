package com.inixindosby.javaprog.final_challenge;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║   SISTEM MANAJEMEN PERPUSTAKAAN             ║");
        System.out.println("╚═══════════════════════════════════════════════╝");

        Perpustakaan perpus = new Perpustakaan("Perpustakaan Inixindo Surabaya");

        // ===== DEMONSTRASI METHOD OVERLOADING =====
        System.out.println("\n\n══════ DEMONSTRASI METHOD OVERLOADING ══════");

        // Overload 1: Tambah dengan object Buku
        System.out.println("\n1. Tambah buku dengan object Buku:");
        Buku buku1 = new Buku("001", "Pemrograman Java Dasar", "Budi Raharjo", 2020);
        perpus.tambahBuku(buku1);

        // Overload 2: Tambah dengan parameter terpisah
        System.out.println("\n2. Tambah buku dengan parameter terpisah:");
        perpus.tambahBuku("002", "Struktur Data", "Ani Wijaya", 2021);

        // Overload 3: Tambah buku fiksi langsung
        System.out.println("\n3. Tambah buku fiksi dengan genre:");
        perpus.tambahBuku("003", "Laskar Pelangi", "Andrea Hirata", 2005, "Drama");
        perpus.tambahBuku("004", "Bumi Manusia", "Pramoedya Ananta Toer", 1980, "Sejarah");

        // Tambah buku non-fiksi
        BukuNonFiksi buku5 = new BukuNonFiksi("005", "Sejarah Indonesia", "Dr. Taufik Abdullah", 2015, "Sejarah");
        perpus.tambahBuku(buku5);

        BukuNonFiksi buku6 = new BukuNonFiksi("006", "Ensiklopedia Sains", "Tim Penulis", 2022, "Sains");
        perpus.tambahBuku(buku6);

        BukuFiksi buku7 = new BukuFiksi("007", "Harry Potter", "J.K. Rowling", 1997, "Fantasy");
        perpus.tambahBuku(buku7);

        // ===== DEMONSTRASI INSTANCEOF =====
        System.out.println("\n\n══════ DEMONSTRASI INSTANCEOF ══════");

        // instanceof 1, 2, 3: Dalam method cariBuku()
        System.out.println("\n1. Pencarian dengan instanceof (cek tipe buku):");
        perpus.cariBuku("003");
        perpus.cariBuku("005");
        perpus.cariBuku("002");

        // instanceof: Klasifikasi buku
        System.out.println("\n2. Klasifikasi buku berdasarkan tipe:");
        perpus.tampilkanBukuBerdasarkanTipe();

        // instanceof: Statistik
        System.out.println("\n3. Statistik menggunakan instanceof:");
        perpus.tampilkanStatistik();

        // ===== DEMONSTRASI POLIMORFISME =====
        System.out.println("\n\n══════ DEMONSTRASI POLIMORFISME ══════");

        System.out.println("\n1. Array polimorfisme (tipe parent, isi berbagai child):");
        Buku[] koleksiBuku = {
                new BukuFiksi("010", "Percy Jackson", "Rick Riordan", 2005, "Mythology"),
                new BukuNonFiksi("011", "Biologi Modern", "Dr. Campbell", 2019, "Biologi"),
                new Buku("012", "Kamus Bahasa Indonesia", "Balai Pustaka", 2016)
        };

        System.out.println("\n3. Peminjaman buku (polimorfisme dalam method):");
        perpus.pinjamBuku(buku7);
        perpus.pinjamBuku(buku5);
        perpus.pinjamBuku(buku1);
    }
}
