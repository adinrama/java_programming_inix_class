package com.inixindo_surabaya.javaprog.C5_varargs_method;

public class StatistikHelper {
    public int jumlahkan(int... angka) {
        int total = 0;
        for (int nilai : angka) {
            total += nilai;
        }
        return total;
    }

    public int maksimal(int... angka) {
        int maks = angka[0];
        for (int nilai : angka) {
            if (maks < nilai) maks = nilai;
        }
        return maks;
    }
}
