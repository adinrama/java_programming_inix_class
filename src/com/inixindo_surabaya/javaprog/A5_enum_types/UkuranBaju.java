package com.inixindo_surabaya.javaprog.A5_enum_types;

public enum UkuranBaju {
    XS("Extra Small", 80, 60),
    S("Small", 85, 65),
    M("Medium", 90, 70),
    L("Large", 95, 75),
    XL("Extra Large", 100, 80),
    XXL("Double Extra Large", 105, 85);

    private final String nama;
    private final int lingkarDada;
    private final int panjang;

    UkuranBaju(String nama, int lingkarDada, int panjang) {
        this.nama = nama;
        this.lingkarDada = lingkarDada;
        this.panjang = panjang;
    }

    public String getNama() {
        return nama;
    }

    public int getLingkarDada() {
        return lingkarDada;
    }

    public int getPanjang() {
        return panjang;
    }

    public boolean cocokUntuk(int lingkarDadaPembeli) {
        // Toleransi +/- 5 cm
        return Math.abs(lingkarDadaPembeli - lingkarDada) <= 5;
    }

    public static UkuranBaju cariUkuran(int lingkarDadaPembeli) {
        for (UkuranBaju ukuran : values()) {
            if (ukuran.cocokUntuk(lingkarDadaPembeli)) {
                return ukuran;
            }
        }
        return XL; // Default
    }
}
