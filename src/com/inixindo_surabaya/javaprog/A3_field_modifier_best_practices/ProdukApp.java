package com.inixindo_surabaya.javaprog.A3_field_modifier_best_practices;

public class ProdukApp {
    public static void main(String[] args) {
        Produk produk1 = new Produk("P001", "Laptop", 10000000, 5);
        Produk produk2 = new Produk("P002", "Mouse", 150000, 20);

        System.out.println("Jumlah produk: " + Produk.getJumlahProduk());
        System.out.println("PPN: " + (Produk.PAJAK_PPN * 100) + "%");

        // Menggunakan getter
        System.out.println("\nProduk: " + produk1.getNama());
        System.out.println("Harga: Rp" + produk1.getHarga());

        // Menghitung harga akhir dengan diskon 10%
        double hargaAkhir = produk1.hitungHargaAkhir(0.10);
        System.out.println("Harga akhir (setelah diskon 10% + PPN): Rp" + hargaAkhir);

        // Mengurangi stok
        if (produk1.kurangiStok(2)) {
            System.out.println("Stok berkurang. Sisa: " + produk1.getStok());
        }
    }
}
