package com.inixindo_surabaya.javaprog.A2_static_final_modifiers;

public class MatematikaHelper {
    // Static variable - shared oleh semua instance
    public static final double PI = 3.14159265359;
    public static final double E = 2.71828182846;
    private static int jumlahPerhitungan = 0;

    // Static method - bisa dipanggil tanpa instance
    public static double luasLingkaran(double radius) {
        jumlahPerhitungan++;
        return PI * radius * radius;
    }

    public static double luasPersegiPanjang(double panjang, double lebar) {
        jumlahPerhitungan++;
        return panjang * lebar;
    }

    public static int pangkat(int bilangan, int eksponen) {
        jumlahPerhitungan++;
        return (int) Math.pow(bilangan, eksponen);
    }

    public static int getJumlahPerhitungan() {
        return jumlahPerhitungan;
    }

    // Static block - dijalankan saat class dimuat
    static {
        System.out.println("MatematikaHelper class dimuat!");
        jumlahPerhitungan = 0;
    }
}
