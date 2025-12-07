package com.inixindo_surabaya.javaprog.C2_immutability;

import com.inixindo_surabaya.javaprog.C2_immutability.Tanggal;

public class TanggalApp {
    public static void main(String[] args) {
        Tanggal tanggal1 = new Tanggal(15, 8, 2025);
        System.out.println(tanggal1.toString());

        Tanggal tanggal2 = tanggal1.tambahHari(2);
        System.out.println(tanggal2.toString());
    }
}
