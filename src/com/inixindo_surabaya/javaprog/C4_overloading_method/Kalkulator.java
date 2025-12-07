package com.inixindo_surabaya.javaprog.C4_overloading_method;

public class Kalkulator {
    public int tambah(int a, int b) {
        return a + b;
    }

    public int tambah(int a, int b, int c) {
        return a + b + c;
    }

    public double tambah(double a, double b) {
        return a + b;
    }

    public int tambah(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}
