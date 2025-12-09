package com.inixindo_surabaya.javaprog.B1_interface;

public class InterfaceApp {
    public static void main(String[] args) {
        System.out.println("=== BURUNG ===");
        Burung burung = new Burung("Elang");
        burung.terbang();
        System.out.println("Ketinggian: " + burung.getKetinggian() + " meter");
        burung.mendarat();

        System.out.println("\n=== BEBEK (Multiple Interfaces) ===");
        Bebek bebek = new Bebek("Donald");
        bebek.terbang();
        bebek.berenang();
        bebek.menyelam();
        bebek.mengapung();
        bebek.istirahat(); // Default method
        bebek.berlari();
        bebek.berjalan();

        // Static method dari interface
        System.out.println();
        Berenang.infoBerenang();
    }
}
