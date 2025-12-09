package com.inixindo_surabaya.javaprog.B3_multiple_interface;

public class MultiInterfaceApp {
    public static void main(String[] args) {
        System.out.println("=== DOKUMEN ===");
        Dokumen dok = new Dokumen("Laporan Tahunan",
                "Ini adalah laporan tahunan perusahaan untuk tahun 2024. " +
                        "Pendapatan meningkat 20% dibanding tahun lalu.");

        // Menggunakan semua interface
        System.out.println("Halaman: " + dok.getPageCount());
        System.out.println("Bisa edit: " + dok.canEdit());

        dok.write("Tambahan: Proyeksi tahun depan sangat positif.");

        if (dok.search("pendapatan")) {
            System.out.println("Kata 'pendapatan' ditemukan!");
        }

        dok.print();
        System.out.println("Format: " + dok.getFormat());

        System.out.println("\n=== SPREADSHEET ===");
        Spreadsheet sheet = new Spreadsheet("Data Penjualan", 3, 3);
        sheet.setCell(0, 0, "Bulan");
        sheet.setCell(0, 1, "Penjualan");
        sheet.setCell(0, 2, "Target");
        sheet.setCell(1, 0, "Jan");
        sheet.setCell(1, 1, "1000");
        sheet.setCell(1, 2, "900");
        sheet.setCell(2, 0, "Feb");
        sheet.setCell(2, 1, "1200");
        sheet.setCell(2, 2, "1000");

        sheet.print();

        // Polymorphism dengan interface
        System.out.println("\n=== POLYMORPHISM ===");
        Printable[] items = {dok, sheet};
        for (Printable item : items) {
            System.out.println("Format: " + item.getFormat());
        }
    }
}
