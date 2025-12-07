package com.inixindo_surabaya.javaprog.D5_casting_object_references;

public class CastObjectApp {
    public static void main(String[] args) {
        // UPCASTING (Implicit/Otomatis)
        Karyawan karyawan1 = new Sales("Budi", 5000000, 2000000); // Upcasting
        Karyawan karyawan2 = new Programmer("Ani", 8000000, "Java"); // Upcasting

        // Bisa memanggil method dari parent
        karyawan1.tampilkanInfo();
        karyawan2.tampilkanInfo();

        // DOWNCASTING (Explicit/Manual)
        // Harus mengecek dulu dengan instanceof
        if (karyawan1 instanceof Sales) {
            Sales sales = (Sales) karyawan1; // Downcasting
            System.out.println("Komisi: Rp" + sales.getKomisi());
            sales.setTargetPenjualan(50000000);
        }

        if (karyawan2 instanceof Programmer) {
            Programmer programmer = (Programmer) karyawan2; // Downcasting
            programmer.tambahProyek();
            programmer.tambahProyek();
            programmer.setBahasaPemrograman("Python");
            System.out.println("Gaji dengan bonus: Rp" + programmer.hitungGaji());
        }

        // CONTOH ERROR - downcasting yang salah
        try {
            // karyawan1 sebenarnya Sales, bukan Programmer
            Programmer prog = (Programmer) karyawan1; // ClassCastException!
        } catch (ClassCastException e) {
            System.out.println("\nError: Tidak bisa cast Sales ke Programmer!");
        }

        // Cara aman melakukan casting
        System.out.println("\n=== Cara Aman Casting ===");
        prosesKaryawan(karyawan1);
        prosesKaryawan(karyawan2);
    }

    public static void prosesKaryawan(Karyawan karyawan) {
        System.out.println("\nMemproses karyawan: " + karyawan.nama);

        // Downcasting yang aman dengan instanceof
        if (karyawan instanceof Sales) {
            Sales sales = (Sales) karyawan;
            System.out.println("Tipe: Sales");
            System.out.println("Komisi: Rp" + sales.getKomisi());
        } else if (karyawan instanceof Programmer) {
            Programmer programmer = (Programmer) karyawan;
            System.out.println("Tipe: Programmer");
            programmer.tambahProyek();
        }

        System.out.println("Gaji total: Rp" + karyawan.hitungGaji());
    }
}
