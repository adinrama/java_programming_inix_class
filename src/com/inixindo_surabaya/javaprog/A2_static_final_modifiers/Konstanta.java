package com.inixindo_surabaya.javaprog.A2_static_final_modifiers;

public final class Konstanta {
    // Final variable - nilai tidak bisa diubah
    public static final int DETIK_PER_MENIT = 60;
    public static final int MENIT_PER_JAM = 60;
    public static final int JAM_PER_HARI = 24;

    // Private constructor - mencegah instantiation
    private Konstanta() {
        throw new AssertionError("Tidak boleh membuat instance!");
    }

    // Final method - tidak bisa di-override
    public static final int hitungDetik(int jam, int menit, int detik) {
        return (jam * MENIT_PER_JAM * DETIK_PER_MENIT) + (menit * DETIK_PER_MENIT) + detik;
    }
}
