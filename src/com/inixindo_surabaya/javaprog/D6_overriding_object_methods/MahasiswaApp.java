package com.inixindo_surabaya.javaprog.D6_overriding_object_methods;

import java.util.HashSet;
import java.util.Set;

public class MahasiswaApp {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("12345", "Budi", 3.5);
        Mahasiswa mhs2 = new Mahasiswa("67890", "Ani", 3.8);
        Mahasiswa mhs3 = new Mahasiswa("12345", "Budi Santoso", 3.6);

        // toString() secara otomatis dipanggil saat print
        System.out.println("=== toString() ===");
        System.out.println(mhs1);
        System.out.println(mhs2);

        // equals() untuk membandingkan
        System.out.println("\n=== equals() ===");
        System.out.println("mhs1 equals mhs2: " + mhs1.equals(mhs2));
        System.out.println("mhs1 equals mhs3: " + mhs1.equals(mhs3)); // true (NIM sama)

        // hashCode() digunakan dalam collection seperti HashSet
        System.out.println("\n=== hashCode() ===");
        System.out.println("HashCode mhs1: " + mhs1.hashCode());
        System.out.println("HashCode mhs2: " + mhs2.hashCode());
        System.out.println("HashCode mhs3: " + mhs3.hashCode()); // Sama dengan mhs1

        // Demonstrasi di HashSet
        System.out.println("\n=== HashSet Demo ===");
        Set<Mahasiswa> setMahasiswa = new HashSet<>();
        setMahasiswa.add(mhs1);
        setMahasiswa.add(mhs2);
        setMahasiswa.add(mhs3); // Tidak akan ditambah karena equals dengan mhs1

        System.out.println("Jumlah mahasiswa di set: " + setMahasiswa.size());
        for (Mahasiswa mhs : setMahasiswa) {
            System.out.println(mhs);
        }
    }
}
