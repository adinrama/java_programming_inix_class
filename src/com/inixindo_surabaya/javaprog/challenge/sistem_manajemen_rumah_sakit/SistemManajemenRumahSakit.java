package com.inixindo_surabaya.javaprog.challenge.sistem_manajemen_rumah_sakit;

import java.util.List;

public class SistemManajemenRumahSakit {
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║          SISTEM MANAJEMEN RUMAH SAKIT                      ║");
        System.out.println("║              RS SEHAT SENTOSA                              ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝\n");

        // Inisialisasi rumah sakit
        RumahSakit hospital = new RumahSakit("RS Sehat Sentosa");

        // ===== DEMONSTRASI METHOD OVERLOADING =====
        System.out.println("════════════════════════════════════════════════════════════");
        System.out.println("           DEMONSTRASI METHOD OVERLOADING                   ");
        System.out.println("════════════════════════════════════════════════════════════\n");

        // Overload 1: Daftar dengan object Pasien
        System.out.println("【1】 Daftar pasien dengan object Pasien:");
        System.out.println("─────────────────────────────────────────────────────────────");
        PasienRawatJalan pasien1 = new PasienRawatJalan(
                "RJ0001", "Budi Santoso", 35, "Laki-laki",
                "Poli Umum", "Dr. Ahmad Hidayat"
        );
        pasien1.setDiagnosa("Demam dan batuk");
        hospital.daftarPasien(pasien1);

        PasienRawatInap pasien2 = new PasienRawatInap(
                "RI0001", "Siti Nurhaliza", 42, "Perempuan",
                "201", "VIP", 5
        );
        pasien2.setDiagnosa("Post operasi usus buntu");
        pasien2.tambahTindakanMedis("Operasi appendektomi");
        pasien2.tambahTindakanMedis("Perawatan luka");
        hospital.daftarPasien(pasien2);

        PasienGawatDarurat pasien3 = new PasienGawatDarurat(
                "GD0001", "Andi Wijaya", 28, "Laki-laki",
                5, "Resusitasi jantung", true
        );
        pasien3.setDiagnosa("Serangan jantung akut");
        hospital.daftarPasien(pasien3);

        // Overload 2: Daftar pasien baru langsung dengan parameter
        System.out.println("【2】 Daftar pasien dengan parameter terpisah:");
        System.out.println("─────────────────────────────────────────────────────────────");
        hospital.daftarPasien("Dewi Lestari", 30, "Perempuan", "Rawat Jalan");
        hospital.daftarPasien("Rudi Hartono", 55, "Laki-laki", "Rawat Inap");

        // Overload 3: Daftar multiple pasien dari array
        System.out.println("【3】 Daftar multiple pasien dengan array:");
        System.out.println("─────────────────────────────────────────────────────────────");
        Pasien[] pasienBaru = {
                new PasienRawatJalan("RJ0004", "Fitri Handayani", 25, "Perempuan",
                        "Poli Gigi", "Dr. Ratna Sari"),
                new PasienRawatJalan("RJ0005", "Hadi Gunawan", 40, "Laki-laki",
                        "Poli Mata", "Dr. Bambang Sutejo"),
                new PasienGawatDarurat("GD0002", "Rina Kusuma", 33, "Perempuan",
                        2, "Patah tulang tangan", false)
        };
        hospital.daftarPasien(pasienBaru);

        // Overload 4: Daftar dengan prioritas
        System.out.println("【4】 Daftar pasien dengan prioritas:");
        System.out.println("─────────────────────────────────────────────────────────────");
        PasienGawatDarurat pasienPrioritas = new PasienGawatDarurat(
                "GD0003", "Joko Susilo", 60, "Laki-laki",
                4, "Stroke iskemik", true
        );
        pasienPrioritas.setDiagnosa("Stroke iskemik akut");
        hospital.daftarPasien(pasienPrioritas, true); // Prioritas tinggi

        PasienRawatInap pasienBiasa = new PasienRawatInap(
                "RI0003", "Maya Anggraini", 38, "Perempuan",
                "105", "Kelas 1", 3
        );
        pasienBiasa.setDiagnosa("Diabetes melitus");
        hospital.daftarPasien(pasienBiasa, false); // Prioritas normal

        // Tambah beberapa pasien lagi untuk statistik
        PasienRawatInap pasien4 = new PasienRawatInap(
                "RI0004", "Agus Salim", 50, "Laki-laki",
                "301", "Kelas 2", 10
        );
        pasien4.setDiagnosa("Pneumonia");
        pasien4.tambahTindakanMedis("Terapi oksigen");
        pasien4.tambahTindakanMedis("Antibiotik IV");
        pasien4.tambahTindakanMedis("Fisioterapi");
        hospital.daftarPasien(pasien4);

        PasienGawatDarurat pasien5 = new PasienGawatDarurat(
                "GD0004", "Linda Wijaya", 45, "Perempuan",
                3, "Kecelakaan lalu lintas", true
        );
        pasien5.setDiagnosa("Trauma multipel");
        hospital.daftarPasien(pasien5);

        // Tambah kunjungan untuk pasien rawat jalan
        pasien1.tambahKunjungan();
        pasien1.tambahKunjungan();

        // ===== DEMONSTRASI POLIMORFISME =====
        System.out.println("\n\n════════════════════════════════════════════════════════════");
        System.out.println("              DEMONSTRASI POLIMORFISME                      ");
        System.out.println("════════════════════════════════════════════════════════════\n");

        // Polimorfisme 1: Array dengan tipe parent berisi berbagai child
        System.out.println("【1】 Array polimorfisme (tipe parent, isi berbagai child):");
        System.out.println("─────────────────────────────────────────────────────────────");
        Pasien[] daftarPasienArray = {
                new PasienRawatJalan("RJ9999", "Test RJ", 30, "Laki-laki", "Poli Umum", "Dr. Test"),
                new PasienRawatInap("RI9999", "Test RI", 40, "Perempuan", "999", "VIP", 2),
                new PasienGawatDarurat("GD9999", "Test GD", 35, "Laki-laki", 3, "Test Emergency", false)
        };

        System.out.println("Memproses berbagai tipe pasien dengan polimorfisme:\n");
        for (Pasien p : daftarPasienArray) {
            // Polimorfisme: method yang dipanggil sesuai tipe runtime object
            System.out.println("→ " + p.getNama() + " (" + p.getKategoriPasien() + ")");
            System.out.println("  Biaya: Rp " + String.format("%,.0f", p.hitungBiayaPengobatan()));
            System.out.println("  Diagnosa: " + p.getDiagnosa());
            System.out.println();
        }

        // Polimorfisme 2: Method dengan parameter tipe parent
        System.out.println("\n【2】 Method dengan parameter tipe parent (Proses Pembayaran):");
        System.out.println("─────────────────────────────────────────────────────────────");

        // Proses pembayaran untuk berbagai tipe pasien
        hospital.prosesPembayaran(pasien1);  // PasienRawatJalan
        hospital.prosesPembayaran(pasien2);  // PasienRawatInap
        hospital.prosesPembayaran(pasien3);  // PasienGawatDarurat

        // Polimorfisme 3: Virtual method invocation
        System.out.println("\n【3】 Virtual method invocation (tampilkanInfoPasien):");
        System.out.println("─────────────────────────────────────────────────────────────");
        System.out.println("Method tampilkanInfoPasien() dipanggil untuk berbagai tipe:");
        System.out.println();

        // Method yang di-override dipanggil sesuai tipe runtime
        pasien1.tampilkanInfoPasien();
        System.out.println();
        pasien2.tampilkanInfoPasien();
        System.out.println();
        pasien3.tampilkanInfoPasien();

        // ===== DEMONSTRASI INSTANCEOF =====
        System.out.println("\n\n════════════════════════════════════════════════════════════");
        System.out.println("              DEMONSTRASI INSTANCEOF                        ");
        System.out.println("════════════════════════════════════════════════════════════\n");

        // instanceof 1: Generate laporan utama (di dalam method)
        System.out.println("【1】 Generate laporan dengan instanceof:");
        System.out.println("─────────────────────────────────────────────────────────────");
        hospital.generateLaporan();

        // instanceof 2: Analisis detail per kategori
        System.out.println("\n【2】 Analisis detail per kategori:");
        System.out.println("─────────────────────────────────────────────────────────────");
        hospital.analisisPerKategori();

        // instanceof 3: Custom analysis dengan instanceof
        System.out.println("\n【3】 Custom analysis dengan instanceof:");
        System.out.println("─────────────────────────────────────────────────────────────");
        customAnalysis(hospital.getDaftarPasien());

        // ===== TAMPILKAN SEMUA PASIEN =====
        System.out.println("\n\n════════════════════════════════════════════════════════════");
        System.out.println("           DAFTAR LENGKAP SEMUA PASIEN                      ");
        System.out.println("════════════════════════════════════════════════════════════");
        hospital.tampilkanSemuaPasien();

        // ===== STATISTIK AKHIR =====
        System.out.println("════════════════════════════════════════════════════════════");
        System.out.println("              STATISTIK AKHIR                               ");
        System.out.println("════════════════════════════════════════════════════════════");
        hospital.generateLaporan();

        // ===== UJI PENCARIAN PASIEN =====
        System.out.println("\n════════════════════════════════════════════════════════════");
        System.out.println("              UJI PENCARIAN PASIEN                          ");
        System.out.println("════════════════════════════════════════════════════════════\n");

        String[] nomorRMCari = {"RJ0001", "RI0001", "GD0001", "XX9999"};
        for (String nomorRM : nomorRMCari) {
            System.out.println("Mencari pasien dengan No. RM: " + nomorRM);
            Pasien found = hospital.cariPasien(nomorRM);
            if (found != null) {
                System.out.println("✓ Ditemukan: " + found.getNama() + " - " + found.getKategoriPasien());
            } else {
                System.out.println("✗ Tidak ditemukan");
            }
            System.out.println();
        }

        System.out.println("\n╔════════════════════════════════════════════════════════════╗");
        System.out.println("║            PROGRAM SELESAI - TERIMA KASIH!                 ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
    }

    // Custom analysis method untuk demonstrasi instanceof tambahan
    private static void customAnalysis(List<Pasien> daftarPasien) {
        System.out.println("\n[ANALISIS KHUSUS DENGAN INSTANCEOF]\n");

        // Hitung rata-rata biaya per kategori
        double totalBiayaRJ = 0, totalBiayaRI = 0, totalBiayaGD = 0;
        int countRJ = 0, countRI = 0, countGD = 0;

        // Cari pasien termuda dan tertua per kategori
        PasienRawatJalan rjTermuda = null, rjTertua = null;
        PasienRawatInap riTermuda = null, riTertua = null;
        PasienGawatDarurat gdTermuda = null, gdTertua = null;

        for (Pasien pasien : daftarPasien) {
            // instanceof untuk klasifikasi
            if (pasien instanceof PasienRawatJalan) {
                PasienRawatJalan prj = (PasienRawatJalan) pasien;
                totalBiayaRJ += prj.hitungBiayaPengobatan();
                countRJ++;

                if (rjTermuda == null || prj.getUmur() < rjTermuda.getUmur()) {
                    rjTermuda = prj;
                }
                if (rjTertua == null || prj.getUmur() > rjTertua.getUmur()) {
                    rjTertua = prj;
                }

            } else if (pasien instanceof PasienRawatInap) {
                PasienRawatInap pri = (PasienRawatInap) pasien;
                totalBiayaRI += pri.hitungBiayaPengobatan();
                countRI++;

                if (riTermuda == null || pri.getUmur() < riTermuda.getUmur()) {
                    riTermuda = pri;
                }
                if (riTertua == null || pri.getUmur() > riTertua.getUmur()) {
                    riTertua = pri;
                }

            } else if (pasien instanceof PasienGawatDarurat) {
                PasienGawatDarurat pgd = (PasienGawatDarurat) pasien;
                totalBiayaGD += pgd.hitungBiayaPengobatan();
                countGD++;

                if (gdTermuda == null || pgd.getUmur() < gdTermuda.getUmur()) {
                    gdTermuda = pgd;
                }
                if (gdTertua == null || pgd.getUmur() > gdTertua.getUmur()) {
                    gdTertua = pgd;
                }
            }
        }

        // Tampilkan hasil
        System.out.println("Rata-rata Biaya per Kategori:");
        if (countRJ > 0) {
            System.out.printf("  • Rawat Jalan     : Rp %,.0f\n", totalBiayaRJ / countRJ);
        }
        if (countRI > 0) {
            System.out.printf("  • Rawat Inap      : Rp %,.0f\n", totalBiayaRI / countRI);
        }
        if (countGD > 0) {
            System.out.printf("  • Gawat Darurat   : Rp %,.0f\n", totalBiayaGD / countGD);
        }

        System.out.println("\nRentang Umur Pasien per Kategori:");
        if (rjTermuda != null && rjTertua != null) {
            System.out.println("  • Rawat Jalan     : " + rjTermuda.getUmur() + " - " + rjTertua.getUmur() + " tahun");
        }
        if (riTermuda != null && riTertua != null) {
            System.out.println("  • Rawat Inap      : " + riTermuda.getUmur() + " - " + riTertua.getUmur() + " tahun");
        }
        if (gdTermuda != null && gdTertua != null) {
            System.out.println("  • Gawat Darurat   : " + gdTermuda.getUmur() + " - " + gdTertua.getUmur() + " tahun");
        }

        // Analisis gender distribution dengan instanceof
        System.out.println("\nDistribusi Gender per Kategori:");
        int rjMale = 0, rjFemale = 0;
        int riMale = 0, riFemale = 0;
        int gdMale = 0, gdFemale = 0;

        for (Pasien pasien : daftarPasien) {
            boolean isMale = pasien.getJenisKelamin().equalsIgnoreCase("Laki-laki");

            if (pasien instanceof PasienRawatJalan) {
                if (isMale) rjMale++; else rjFemale++;
            } else if (pasien instanceof PasienRawatInap) {
                if (isMale) riMale++; else riFemale++;
            } else if (pasien instanceof PasienGawatDarurat) {
                if (isMale) gdMale++; else gdFemale++;
            }
        }

        if (countRJ > 0) {
            System.out.println("  • Rawat Jalan     : L=" + rjMale + ", P=" + rjFemale);
        }
        if (countRI > 0) {
            System.out.println("  • Rawat Inap      : L=" + riMale + ", P=" + riFemale);
        }
        if (countGD > 0) {
            System.out.println("  • Gawat Darurat   : L=" + gdMale + ", P=" + gdFemale);
        }

        System.out.println();
    }
}
