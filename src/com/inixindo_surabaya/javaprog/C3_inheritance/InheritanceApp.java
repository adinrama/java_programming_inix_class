package com.inixindo_surabaya.javaprog.C3_inheritance;

import com.inixindo_surabaya.javaprog.C3_inheritance.Mobil;
import com.inixindo_surabaya.javaprog.C3_inheritance.Motor;

public class InheritanceApp {
    public static void main(String[] args) {
        Motor motor1 = new Motor("Honda CB 150 R", 2012, 2);
        motor1.info();
        motor1.wheelie();

        System.out.print("\n");

        Mobil mobil1 = new Mobil("Mitsubishi Expander", 2010, 4);
        mobil1.info();
        mobil1.nyalakan();
    }
}
