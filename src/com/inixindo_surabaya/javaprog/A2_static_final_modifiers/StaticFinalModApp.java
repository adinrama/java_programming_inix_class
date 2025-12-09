package com.inixindo_surabaya.javaprog.A2_static_final_modifiers;

public class StaticFinalModApp {
    public static void main(String[] args) {
        // Static method - dipanggil tanpa instance
        System.out.println("Luas lingkaran r=5: " + MatematikaHelper.luasLingkaran(5));
        System.out.println("Luas persegi 4x6: " + MatematikaHelper.luasPersegiPanjang(4, 6));
        System.out.println("2^3 = " + MatematikaHelper.pangkat(2, 3));
        System.out.println("Jumlah perhitungan: " + MatematikaHelper.getJumlahPerhitungan());

        // Static constant
        System.out.println("\nPI = " + MatematikaHelper.PI);

        // Final variable
        final int MAKSIMAL_PERCOBAAN = 3;
        // MAKSIMAL_PERCOBAAN = 5; // ERROR - tidak bisa diubah

        // Final class dan method
        int totalDetik = Konstanta.hitungDetik(2, 30, 45);
        System.out.println("Total detik: " + totalDetik);

        // Pengguna dengan final field
        Pengguna user = new Pengguna("USER001", "Budi");
        user.setNama("Budi Santoso"); // OK
        // user.setId("USER002"); // ERROR - tidak ada method karena id final
    }
}
