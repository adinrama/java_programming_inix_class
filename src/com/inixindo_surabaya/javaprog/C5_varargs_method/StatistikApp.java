package com.inixindo_surabaya.javaprog.C5_varargs_method;

public class StatistikApp {
    public static void main(String[] args) {
        StatistikHelper statistik = new StatistikHelper();

        int jumlah = statistik.jumlahkan(1, 2, 3, 4, 5);
        System.out.println("Hasil penjumlahan adalah " + jumlah);

        int maksimal = statistik.maksimal(34, 12, 7, 4, 100, 82);
        System.out.println("Nilai maksimal adalah " + maksimal);
    }
}
