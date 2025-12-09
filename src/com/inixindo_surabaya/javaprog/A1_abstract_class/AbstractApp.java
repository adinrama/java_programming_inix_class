package com.inixindo_surabaya.javaprog.A1_abstract_class;

public class AbstractApp {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Toyota Avanza", 2022, 250000000, "Bensin", 4);
        Kendaraan motor = new Motor("Honda Beat", 2023, 18000000, 110);

        System.out.println("=== MOBIL ===");
        mobil.tampilkanInfo();
        mobil.nyalakan();
        System.out.println("Pajak Tahunan: Rp" + mobil.hitungPajakTahunan());
        mobil.matikan();

        System.out.println("\n=== MOTOR ===");
        motor.tampilkanInfo();
        motor.nyalakan();
        System.out.println("Pajak Tahunan: Rp" + motor.hitungPajakTahunan());
        motor.matikan();
    }
}
