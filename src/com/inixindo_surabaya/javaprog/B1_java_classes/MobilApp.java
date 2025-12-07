package com.inixindo_surabaya.javaprog.B1_java_classes;

import com.inixindo_surabaya.javaprog.B1_java_classes.Mobil;

public class MobilApp {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Hitam", 2010);
        Mobil mobil2 = new Mobil("Mitsubishi", "Putih", 2018);

        mobil1.info();
        mobil1.klakson();

        mobil2.info();
        mobil2.klakson();
    }
}
