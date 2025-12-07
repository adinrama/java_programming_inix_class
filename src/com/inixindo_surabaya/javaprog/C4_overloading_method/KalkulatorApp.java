package com.inixindo_surabaya.javaprog.C4_overloading_method;

import com.inixindo_surabaya.javaprog.C4_overloading_method.Kalkulator;

public class KalkulatorApp {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        System.out.println("5 + 8 = " + kalkulator.tambah(5, 8));
        System.out.println("3 + 5 + 12 = " + kalkulator.tambah(3, 5, 12));
        System.out.println("12 + 16 = " + kalkulator.tambah("12", "16"));
    }
}
