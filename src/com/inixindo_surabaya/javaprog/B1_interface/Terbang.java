package com.inixindo_surabaya.javaprog.B1_interface;

// Interface sederhana
public interface Terbang {
    // Konstanta (public static final secara default)
    double KECEPATAN_MAKSIMAL = 1000.0;

    // Abstract method (public abstract secara default)
    void terbang();
    void mendarat();
    double getKetinggian();
}
