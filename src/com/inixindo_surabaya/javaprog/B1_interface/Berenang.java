package com.inixindo_surabaya.javaprog.B1_interface;

// Interface dengan default method
public interface Berenang {
    // Abstract methods
    void berenang();
    void menyelam();

    // Default method - bisa di-override atau tidak
    default void mengapung() {
        System.out.println("Mengapung di permukaan air");
    }

    default void istirahat() {
        System.out.println("Beristirahat setelah berenang");
    }

    // Static method
    static void infoBerenang() {
        System.out.println("Berenang adalah aktivitas di air");
    }
}
