package com.inixindo_surabaya.javaprog.challenge.sistem_manajemen_rumah_sakit;

import java.util.List;
import java.util.ArrayList;

public class RumahSakit {
    private String namaRumahSakit;
    private List<Pasien> daftarPasien;
    private int counterRJ = 1;  // Counter untuk Rawat Jalan
    private int counterRI = 1;  // Counter untuk Rawat Inap
    private int counterGD = 1;  // Counter untuk Gawat Darurat

    public RumahSakit(String namaRumahSakit) {
        this.namaRumahSakit = namaRumahSakit;
        this.daftarPasien = new ArrayList<>();
    }

    // ===== METHOD OVERLOADING: daftarPasien() =====

    // Overload 1: Daftar pasien dengan object Pasien
    public void daftarPasien(Pasien pasien) {
        daftarPasien.add(pasien);
        System.out.println("✓ Pasien berhasil terdaftar:");
        System.out.println("  Nama: " + pasien.getNama());
        System.out.println("  No. RM: " + pasien.getNomorRM());
        System.out.println("  Kategori: " + pasien.getKategoriPasien());
        System.out.println();
    }

    // Overload 2: Daftar pasien baru langsung dengan parameter
    public void daftarPasien(String nama, int umur, String jenisKelamin, String tipePasien) {
        String nomorRM = generateNomorRM(tipePasien);
        Pasien pasien = null;

        switch (tipePasien.toUpperCase()) {
            case "RAWAT JALAN":
            case "RJ":
                pasien = new PasienRawatJalan(nomorRM, nama, umur, jenisKelamin,
                        "Umum", "Dr. On Duty");
                break;
            case "RAWAT INAP":
            case "RI":
                pasien = new PasienRawatInap(nomorRM, nama, umur, jenisKelamin,
                        "101", "Kelas 2", 1);
                break;
            case "GAWAT DARURAT":
            case "GD":
                pasien = new PasienGawatDarurat(nomorRM, nama, umur, jenisKelamin,
                        3, "Stabilisasi", false);
                break;
            default:
                System.out.println("✗ Tipe pasien tidak valid!");
                return;
        }

        daftarPasien(pasien);
    }

    // Overload 3: Daftar multiple pasien dari array
    public void daftarPasien(Pasien[] arrayPasien) {
        System.out.println("═══ PENDAFTARAN MASSAL " + arrayPasien.length + " PASIEN ═══");
        for (Pasien pasien : arrayPasien) {
            daftarPasien.add(pasien);
            System.out.println("✓ " + pasien.getNama() + " - " + pasien.getKategoriPasien());
        }
        System.out.println("Total " + arrayPasien.length + " pasien berhasil terdaftar\n");
    }

    // Overload 4: Daftar dengan prioritas
    public void daftarPasien(Pasien pasien, boolean prioritas) {
        if (prioritas) {
            // Tambah di awal list (prioritas)
            daftarPasien.add(0, pasien);
            System.out.println("✓ Pasien PRIORITAS terdaftar:");
        } else {
            daftarPasien.add(pasien);
            System.out.println("✓ Pasien terdaftar:");
        }
        System.out.println("  Nama: " + pasien.getNama());
        System.out.println("  No. RM: " + pasien.getNomorRM());
        System.out.println("  Kategori: " + pasien.getKategoriPasien());
        System.out.println();
    }

    // Helper method untuk generate nomor RM
    private String generateNomorRM(String tipePasien) {
        String prefix = "";
        int counter = 0;

        switch (tipePasien.toUpperCase()) {
            case "RAWAT JALAN":
            case "RJ":
                prefix = "RJ";
                counter = counterRJ++;
                break;
            case "RAWAT INAP":
            case "RI":
                prefix = "RI";
                counter = counterRI++;
                break;
            case "GAWAT DARURAT":
            case "GD":
                prefix = "GD";
                counter = counterGD++;
                break;
        }

        return prefix + String.format("%04d", counter);
    }

    // ===== METHOD DENGAN INSTANCEOF: generateLaporan() =====

    public void generateLaporan() {
        System.out.println("\n");
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║           LAPORAN RUMAH SAKIT - " + namaRumahSakit.toUpperCase() + "          ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");

        // Variabel untuk statistik
        int totalRJ = 0, totalRI = 0, totalGD = 0;
        double pendapatanRJ = 0, pendapatanRI = 0, pendapatanGD = 0;
        List<Pasien> pasienFollowUp = new ArrayList<>();
        Pasien pasienTermahal = null;
        double biayaTertinggi = 0;

        // INSTANCEOF 1: Hitung total pasien per kategori dan pendapatan
        for (Pasien pasien : daftarPasien) {
            double biaya = pasien.hitungBiayaPengobatan();

            if (pasien instanceof PasienRawatJalan) {
                totalRJ++;
                pendapatanRJ += biaya;
            } else if (pasien instanceof PasienRawatInap) {
                totalRI++;
                pendapatanRI += biaya;
            } else if (pasien instanceof PasienGawatDarurat) {
                totalGD++;
                pendapatanGD += biaya;
            }

            // Cari pasien dengan biaya tertinggi
            if (biaya > biayaTertinggi) {
                biayaTertinggi = biaya;
                pasienTermahal = pasien;
            }
        }

        // INSTANCEOF 2: Identifikasi pasien yang perlu follow-up
        for (Pasien pasien : daftarPasien) {
            if (pasien instanceof PasienRawatInap) {
                PasienRawatInap pri = (PasienRawatInap) pasien;
                if (pri.perluFollowUp()) {
                    pasienFollowUp.add(pasien);
                }
            } else if (pasien instanceof PasienGawatDarurat) {
                PasienGawatDarurat pgd = (PasienGawatDarurat) pasien;
                if (pgd.perluFollowUp()) {
                    pasienFollowUp.add(pasien);
                }
            }
        }

        // Tampilkan statistik
        System.out.println("\n[STATISTIK PASIEN]");
        System.out.println("─────────────────────────────────────────────────────────────");
        System.out.println("Total Pasien         : " + daftarPasien.size() + " pasien");
        System.out.println("  • Rawat Jalan      : " + totalRJ + " pasien");
        System.out.println("  • Rawat Inap       : " + totalRI + " pasien");
        System.out.println("  • Gawat Darurat    : " + totalGD + " pasien");

        System.out.println("\n[PENDAPATAN]");
        System.out.println("─────────────────────────────────────────────────────────────");
        System.out.println("Total Pendapatan     : Rp " + String.format("%,.0f", pendapatanRJ + pendapatanRI + pendapatanGD));
        System.out.println("  • Rawat Jalan      : Rp " + String.format("%,.0f", pendapatanRJ));
        System.out.println("  • Rawat Inap       : Rp " + String.format("%,.0f", pendapatanRI));
        System.out.println("  • Gawat Darurat    : Rp " + String.format("%,.0f", pendapatanGD));

        if (pasienTermahal != null) {
            System.out.println("\n[PASIEN BIAYA TERTINGGI]");
            System.out.println("─────────────────────────────────────────────────────────────");
            System.out.println("  Nama             : " + pasienTermahal.getNama());
            System.out.println("  No. RM           : " + pasienTermahal.getNomorRM());
            System.out.println("  Kategori         : " + pasienTermahal.getKategoriPasien());
            System.out.println("  Biaya            : Rp " + String.format("%,.0f", biayaTertinggi));
        }

        // INSTANCEOF 3: Tampilkan pasien yang perlu follow-up
        if (!pasienFollowUp.isEmpty()) {
            System.out.println("\n[PASIEN PERLU FOLLOW-UP]");
            System.out.println("─────────────────────────────────────────────────────────────");
            int no = 1;
            for (Pasien pasien : pasienFollowUp) {
                System.out.print(no++ + ". " + pasien.getNama() + " (" + pasien.getNomorRM() + ") - ");

                if (pasien instanceof PasienRawatInap) {
                    PasienRawatInap pri = (PasienRawatInap) pasien;
                    System.out.println("Rawat Inap " + pri.getLamaMenginap() + " hari");
                } else if (pasien instanceof PasienGawatDarurat) {
                    PasienGawatDarurat pgd = (PasienGawatDarurat) pasien;
                    System.out.println("Gawat Darurat Tingkat " + pgd.getTingkatKegawatan());
                }
            }
        }

        System.out.println("\n╚════════════════════════════════════════════════════════════╝\n");
    }

    // Method tambahan: Analisis detail per kategori
    public void analisisPerKategori() {
        System.out.println("\n╔════════════════════════════════════════════════════════════╗");
        System.out.println("║              ANALISIS DETAIL PER KATEGORI                  ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");

        // Analisis Rawat Jalan
        System.out.println("\n[RAWAT JALAN]");
        System.out.println("─────────────────────────────────────────────────────────────");
        int countRJ = 0;
        for (Pasien pasien : daftarPasien) {
            if (pasien instanceof PasienRawatJalan) {
                PasienRawatJalan prj = (PasienRawatJalan) pasien;
                countRJ++;
                System.out.println(countRJ + ". " + prj.getNama() + " - " + prj.getPoliklinik() +
                        " (" + prj.getJumlahKunjungan() + "x kunjungan)");
            }
        }
        if (countRJ == 0) System.out.println("  Tidak ada pasien rawat jalan");

        // Analisis Rawat Inap
        System.out.println("\n[RAWAT INAP]");
        System.out.println("─────────────────────────────────────────────────────────────");
        int countRI = 0;
        for (Pasien pasien : daftarPasien) {
            if (pasien instanceof PasienRawatInap) {
                PasienRawatInap pri = (PasienRawatInap) pasien;
                countRI++;
                System.out.println(countRI + ". " + pri.getNama() + " - Kamar " + pri.getNomorKamar() +
                        " (" + pri.getJenisKamar() + ", " + pri.getLamaMenginap() + " hari)");
            }
        }
        if (countRI == 0) System.out.println("  Tidak ada pasien rawat inap");

        // Analisis Gawat Darurat
        System.out.println("\n[GAWAT DARURAT]");
        System.out.println("─────────────────────────────────────────────────────────────");
        int countGD = 0;
        for (Pasien pasien : daftarPasien) {
            if (pasien instanceof PasienGawatDarurat) {
                PasienGawatDarurat pgd = (PasienGawatDarurat) pasien;
                countGD++;
                System.out.println(countGD + ". " + pgd.getNama() + " - Tingkat " + pgd.getTingkatKegawatan() +
                        " (" + pgd.getTindakan() + ")");
            }
        }
        if (countGD == 0) System.out.println("  Tidak ada pasien gawat darurat");

        System.out.println("\n╚════════════════════════════════════════════════════════════╝\n");
    }

    // ===== POLIMORFISME: Method dengan parameter tipe parent =====

    public void prosesPembayaran(Pasien pasien) {
        System.out.println("\n═══ PROSES PEMBAYARAN ═══");
        System.out.println("Pasien    : " + pasien.getNama());
        System.out.println("No. RM    : " + pasien.getNomorRM());
        System.out.println("Kategori  : " + pasien.getKategoriPasien());

        // Polimorfisme: hitungBiayaPengobatan() akan memanggil method yang tepat
        double biaya = pasien.hitungBiayaPengobatan();
        System.out.println("Total Biaya: Rp " + String.format("%,.0f", biaya));

        // instanceof untuk informasi tambahan
        if (pasien instanceof PasienRawatInap) {
            PasienRawatInap pri = (PasienRawatInap) pasien;
            System.out.println("Detail: " + pri.getJenisKamar() + " - " + pri.getLamaMenginap() + " hari");
        } else if (pasien instanceof PasienGawatDarurat) {
            PasienGawatDarurat pgd = (PasienGawatDarurat) pasien;
            System.out.println("Detail: Tingkat Kegawatan " + pgd.getTingkatKegawatan());
        }

        pasien.setSudahBayar(true);
        System.out.println("✓ Pembayaran berhasil diproses");
    }

    public void tampilkanSemuaPasien() {
        System.out.println("\n╔════════════════════════════════════════════════════════════╗");
        System.out.println("║              DAFTAR SEMUA PASIEN                           ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝\n");

        if (daftarPasien.isEmpty()) {
            System.out.println("  Tidak ada pasien terdaftar\n");
            return;
        }

        int no = 1;
        for (Pasien pasien : daftarPasien) {
            System.out.println("[PASIEN " + no++ + "]");
            pasien.tampilkanInfoPasien(); // Polimorfisme: method dipanggil sesuai tipe runtime
            System.out.println();
        }
    }

    public Pasien cariPasien(String nomorRM) {
        for (Pasien pasien : daftarPasien) {
            if (pasien.getNomorRM().equals(nomorRM)) {
                return pasien;
            }
        }
        return null;
    }

    public List<Pasien> getDaftarPasien() {
        return daftarPasien;
    }
}
