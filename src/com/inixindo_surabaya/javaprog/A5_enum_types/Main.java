package com.inixindo_surabaya.javaprog.A5_enum_types;

public class Main {
    public static void main(String[] args) {
        // Enum sederhana
        System.out.println("=== HARI DALAM MINGGU ===");
        Hari hari = Hari.SENIN;
        System.out.println("Hari: " + hari);
        System.out.println("Ordinal: " + hari.ordinal()); // Posisi di enum (0-based)

        // Loop semua nilai enum
        System.out.println("\nSemua hari:");
        for (Hari h : Hari.values()) {
            System.out.println(h);
        }

        // Switch dengan enum
        System.out.println("\n=== SWITCH ENUM ===");
        switch (hari) {
            case SENIN:
            case SELASA:
            case RABU:
            case KAMIS:
            case JUMAT:
                System.out.println("Hari kerja");
                break;
            case SABTU:
            case MINGGU:
                System.out.println("Akhir pekan");
                break;
        }

        // Enum dengan constructor dan method
        System.out.println("\n=== STATUS PESANAN ===");
        Pesanan pesanan = new Pesanan("ORD001");
        pesanan.tampilkanInfo();

        System.out.println();
        pesanan.ubahStatus(StatusPesanan.DIKONFIRMASI);
        pesanan.ubahStatus(StatusPesanan.DIKIRIM);
        pesanan.ubahStatus(StatusPesanan.SELESAI);

        // Enum dengan abstract method
        System.out.println("\n=== OPERASI MATEMATIKA ===");
        double a = 10, b = 5;
        System.out.println(a + " + " + b + " = " + OperasiMatematika.TAMBAH.hitung(a, b));
        System.out.println(a + " - " + b + " = " + OperasiMatematika.KURANG.hitung(a, b));
        System.out.println(a + " * " + b + " = " + OperasiMatematika.KALI.hitung(a, b));
        System.out.println(a + " / " + b + " = " + OperasiMatematika.BAGI.hitung(a, b));

        // Enum ukuran baju
        System.out.println("\n=== UKURAN BAJU ===");
        UkuranBaju ukuran = UkuranBaju.M;
        System.out.println("Ukuran: " + ukuran.getNama());
        System.out.println("Lingkar Dada: " + ukuran.getLingkarDada() + " cm");
        System.out.println("Panjang: " + ukuran.getPanjang() + " cm");

        // Mencari ukuran yang cocok
        int lingkarDadaPembeli = 92;
        UkuranBaju ukuranCocok = UkuranBaju.cariUkuran(lingkarDadaPembeli);
        System.out.println("\nUntuk lingkar dada " + lingkarDadaPembeli + " cm, " + "ukuran yang cocok: " + ukuranCocok.getNama());
    }
}
