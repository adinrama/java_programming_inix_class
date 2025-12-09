package com.inixindo_surabaya.javaprog.A4_nested_classes;

public class Main {
    public static void main(String[] args) {
        // Inner Class
        System.out.println("=== INNER CLASS ===");
        Universitas univ = new Universitas("Universitas Indonesia", "Depok");
        Universitas.Fakultas fakultas = univ.new Fakultas("Teknik", "Prof. Dr. Ahmad");
        fakultas.tampilkanInfo();

        System.out.println();

        // Nested inner class
        Universitas.Fakultas.Jurusan jurusan = fakultas.new Jurusan("Informatika");
        jurusan.tampilkanInfo();

        // Static Nested Class
        System.out.println("\n=== STATIC NESTED CLASS ===");
        Universitas.Gedung gedung = new Universitas.Gedung("Gedung A", 5);
        gedung.tampilkanInfo();

        // Local Class
        System.out.println("\n=== LOCAL CLASS ===");
        univ.buatAcara("Wisuda");

        // Anonymous class dari abstract class
        SayHello printer = new SayHello() {
            @Override
            void print(String message) {
                System.out.println(">>> " + message + " <<<");
            }
        };

        printer.print("Hello dari Anonymous Class");
    }
}
