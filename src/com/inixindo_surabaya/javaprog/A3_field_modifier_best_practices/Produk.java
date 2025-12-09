package com.inixindo_surabaya.javaprog.A3_field_modifier_best_practices;

public class Produk {
    // BEST PRACTICE: Fields private
    private String id;
    private String nama;
    private double harga;
    private int stok;

    // BEST PRACTICE: Konstanta static final public
    public static final double PAJAK_PPN = 0.11;
    public static final double DISKON_MAKSIMAL = 0.50;

    // BEST PRACTICE: Static variable private dengan getter
    private static int jumlahProduk = 0;

    // BEST PRACTICE: Constructor public
    public Produk(String id, String nama, double harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        jumlahProduk++;
    }

    // BEST PRACTICE: Getter public
    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // BEST PRACTICE: Setter dengan validasi
    public void setHarga(double harga) {
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif");
        }
        this.harga = harga;
    }

    public void setStok(int stok) {
        if (stok < 0) {
            throw new IllegalArgumentException("Stok tidak boleh negatif");
        }
        this.stok = stok;
    }

    // BEST PRACTICE: Business logic method public
    public double hitungHargaAkhir(double diskon) {
        if (diskon < 0 || diskon > DISKON_MAKSIMAL) {
            throw new IllegalArgumentException("Diskon tidak valid");
        }
        double hargaSetelahDiskon = harga * (1 - diskon);
        return hargaSetelahDiskon * (1 + PAJAK_PPN);
    }

    // BEST PRACTICE: Helper method private
    private boolean validasiStok(int jumlah) {
        return stok >= jumlah;
    }

    // BEST PRACTICE: Public method yang menggunakan helper private
    public boolean kurangiStok(int jumlah) {
        if (validasiStok(jumlah)) {
            stok -= jumlah;
            return true;
        }
        return false;
    }

    // BEST PRACTICE: Static getter
    public static int getJumlahProduk() {
        return jumlahProduk;
    }
}
