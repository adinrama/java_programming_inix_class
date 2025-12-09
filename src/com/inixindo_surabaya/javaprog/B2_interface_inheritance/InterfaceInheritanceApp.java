package com.inixindo_surabaya.javaprog.B2_interface_inheritance;

public class InterfaceInheritanceApp {
    public static void main(String[] args) {
        System.out.println("\n=== ANJING PEKERJA ===");
        AnjingPekerja anjing = new AnjingPekerja("Rexi");
        anjing.beriMakan();
        anjing.ajakBermain();
        anjing.bekerja();
        anjing.bekerja();
        anjing.berlari();
        System.out.println("Total jam kerja: " + anjing.getJamKerja());
    }
}
