package com.inixindo_surabaya.javaprog.challenge.sistem_manajemen_rumah_sakit;

public class PasienRawatInap extends Pasien {
    private String nomorKamar;
    private String jenisKamar; // VIP, Kelas 1, Kelas 2
    private int lamaMenginap; // dalam hari
    private String[] tindakanMedis;

    // Tarif kamar per hari
    private static final double TARIF_VIP = 1000000;
    private static final double TARIF_KELAS1 = 500000;
    private static final double TARIF_KELAS2 = 250000;

    public PasienRawatInap(String nomorRM, String nama, int umur, String jenisKelamin,
                           String nomorKamar, String jenisKamar, int lamaMenginap) {
        super(nomorRM, nama, umur, jenisKelamin);
        this.nomorKamar = nomorKamar;
        this.jenisKamar = jenisKamar;
        this.lamaMenginap = lamaMenginap;
        this.tindakanMedis = new String[0];
        this.diagnosa = "Perawatan Intensif";
    }

    @Override
    public double hitungBiayaPengobatan() {
        double biayaKamar = 0;

        switch (jenisKamar.toUpperCase()) {
            case "VIP":
                biayaKamar = TARIF_VIP * lamaMenginap;
                break;
            case "KELAS 1":
                biayaKamar = TARIF_KELAS1 * lamaMenginap;
                break;
            case "KELAS 2":
                biayaKamar = TARIF_KELAS2 * lamaMenginap;
                break;
            default:
                biayaKamar = TARIF_KELAS2 * lamaMenginap;
        }

        // Tambah biaya tindakan medis
        double biayaTindakan = tindakanMedis.length * 200000; // Rp 200.000 per tindakan

        return biayaKamar + biayaTindakan;
    }

    @Override
    public String getDiagnosa() {
        return diagnosa;
    }

    @Override
    public String getKategoriPasien() {
        return "Rawat Inap";
    }

    @Override
    public void tampilkanInfoPasien() {
        super.tampilkanInfoPasien();
        System.out.println("  Nomor Kamar    : " + nomorKamar);
        System.out.println("  Jenis Kamar    : " + jenisKamar);
        System.out.println("  Lama Menginap  : " + lamaMenginap + " hari");
        System.out.println("  Tindakan Medis : " + tindakanMedis.length + " tindakan");
        if (lamaMenginap > 7) {
            System.out.println("  ⚠ PERHATIAN: Pasien menginap > 7 hari, perlu follow-up");
        }
        System.out.println("╚════════════════════════════════════════════╝");
    }

    public void tambahTindakanMedis(String tindakan) {
        String[] newArray = new String[tindakanMedis.length + 1];
        System.arraycopy(tindakanMedis, 0, newArray, 0, tindakanMedis.length);
        newArray[tindakanMedis.length] = tindakan;
        tindakanMedis = newArray;
    }

    public void perpanjangMenginap(int tambahHari) {
        lamaMenginap += tambahHari;
    }

    // Getters
    public String getNomorKamar() { return nomorKamar; }
    public String getJenisKamar() { return jenisKamar; }
    public int getLamaMenginap() { return lamaMenginap; }
    public String[] getTindakanMedis() { return tindakanMedis; }

    public boolean perluFollowUp() {
        return lamaMenginap > 7;
    }
}
