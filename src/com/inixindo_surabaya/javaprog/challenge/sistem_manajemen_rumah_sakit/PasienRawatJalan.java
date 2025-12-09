package com.inixindo_surabaya.javaprog.challenge.sistem_manajemen_rumah_sakit;

public class PasienRawatJalan extends Pasien {
    private String poliklinik;
    private String dokterPenanggungjawab;
    private int jumlahKunjungan;
    private static final double BIAYA_PER_KUNJUNGAN = 150000;

    public PasienRawatJalan(String nomorRM, String nama, int umur, String jenisKelamin,
                            String poliklinik, String dokterPenanggungjawab) {
        super(nomorRM, nama, umur, jenisKelamin);
        this.poliklinik = poliklinik;
        this.dokterPenanggungjawab = dokterPenanggungjawab;
        this.jumlahKunjungan = 1;
        this.diagnosa = "Pemeriksaan " + poliklinik;
    }

    @Override
    public double hitungBiayaPengobatan() {
        return BIAYA_PER_KUNJUNGAN * jumlahKunjungan;
    }

    @Override
    public String getDiagnosa() {
        return diagnosa;
    }

    @Override
    public String getKategoriPasien() {
        return "Rawat Jalan";
    }

    @Override
    public void tampilkanInfoPasien() {
        super.tampilkanInfoPasien();
        System.out.println("  Poliklinik     : " + poliklinik);
        System.out.println("  Dokter         : " + dokterPenanggungjawab);
        System.out.println("  Jumlah Kunjungan: " + jumlahKunjungan + "x");
        System.out.println("╚════════════════════════════════════════════╝");
    }

    public void tambahKunjungan() {
        jumlahKunjungan++;
    }

    // Getters
    public String getPoliklinik() { return poliklinik; }
    public String getDokterPenanggungjawab() { return dokterPenanggungjawab; }
    public int getJumlahKunjungan() { return jumlahKunjungan; }
}
