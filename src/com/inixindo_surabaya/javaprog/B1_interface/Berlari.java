package com.inixindo_surabaya.javaprog.B1_interface;

// Interface lainnya
public interface Berlari {
    void berlari();
    void berjalan();

    default void berlari(int kecepatan) {
        System.out.println("Berlari dengan kecepatan: " + kecepatan + " km/jam");
    }
}
