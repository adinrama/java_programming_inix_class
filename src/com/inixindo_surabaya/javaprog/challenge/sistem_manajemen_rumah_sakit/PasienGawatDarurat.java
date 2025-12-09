package com.inixindo_surabaya.javaprog.challenge.sistem_manajemen_rumah_sakit;

public class PasienGawatDarurat extends Pasien {
    private int tingkatKegawatan; // 1-5 (5 paling gawat)
    private String tindakan;
    private boolean ambulance;
    private String timMedis;

    private static final double BIAYA_BASE = 500000;
    private static final double BIAYA_PER_TINGKAT = 200000;
    private static final double BIAYA_AMBULANCE = 300000;

    public PasienGawatDarurat(String nomorRM, String nama, int umur, String jenisKelamin,
                              int tingkatKegawatan, String tindakan, boolean ambulance) {
        super(nomorRM, nama, umur, jenisKelamin);
        this.tingkatKegawatan = tingkatKegawatan;
        this.tindakan = tindakan;
        this.ambulance = ambulance;
        this.timMedis = "Tim IGD";
        this.diagnosa = "Kegawatan Tingkat " + tingkatKegawatan;
    }

    @Override
    public double hitungBiayaPengobatan() {
        double biaya = BIAYA_BASE;
        biaya += tingkatKegawatan * BIAYA_PER_TINGKAT;
        if (ambulance) {
            biaya += BIAYA_AMBULANCE;
        }
        return biaya;
    }

    @Override
    public String getDiagnosa() {
        return diagnosa;
    }

    @Override
    public String getKategoriPasien() {
        return "Gawat Darurat";
    }

    @Override
    public void tampilkanInfoPasien() {
        super.tampilkanInfoPasien();
        System.out.println("  Tingkat Kegawatan: Level " + tingkatKegawatan + "/5");
        System.out.println("  Tindakan       : " + tindakan);
        System.out.println("  Ambulance      : " + (ambulance ? "Ya" : "Tidak"));
        System.out.println("  Tim Medis      : " + timMedis);
        if (tingkatKegawatan >= 4) {
            System.out.println("  ⚠ CRITICAL: Tingkat kegawatan tinggi, perlu follow-up intensif");
        }
        System.out.println("╚════════════════════════════════════════════╝");
    }

    // Getters
    public int getTingkatKegawatan() { return tingkatKegawatan; }
    public String getTindakan() { return tindakan; }
    public boolean isAmbulance() { return ambulance; }
    public String getTimMedis() { return timMedis; }

    public boolean perluFollowUp() {
        return tingkatKegawatan >= 4;
    }
}
