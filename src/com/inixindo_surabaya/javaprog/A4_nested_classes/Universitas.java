package com.inixindo_surabaya.javaprog.A4_nested_classes;

public class Universitas {
    private String namaUniversitas;
    private String alamat;

    public Universitas(String namaUniversitas, String alamat) {
        this.namaUniversitas = namaUniversitas;
        this.alamat = alamat;
    }

    // 1. INNER CLASS (Non-static nested class)
    public class Fakultas {
        private String namaFakultas;
        private String dekan;

        public Fakultas(String namaFakultas, String dekan) {
            this.namaFakultas = namaFakultas;
            this.dekan = dekan;
        }

        public void tampilkanInfo() {
            // Bisa akses member outer class
            System.out.println("Universitas: " + namaUniversitas);
            System.out.println("Fakultas: " + namaFakultas);
            System.out.println("Dekan: " + dekan);
        }

        // Inner class dalam inner class
        public class Jurusan {
            private String namaJurusan;

            public Jurusan(String namaJurusan) {
                this.namaJurusan = namaJurusan;
            }

            public void tampilkanInfo() {
                // Bisa akses member outer class dan inner class
                System.out.println("Universitas: " + namaUniversitas);
                System.out.println("Fakultas: " + namaFakultas);
                System.out.println("Jurusan: " + namaJurusan);
            }
        }
    }

    // 2. STATIC NESTED CLASS
    public static class Gedung {
        private String namaGedung;
        private int jumlahLantai;

        public Gedung(String namaGedung, int jumlahLantai) {
            this.namaGedung = namaGedung;
            this.jumlahLantai = jumlahLantai;
        }

        public void tampilkanInfo() {
            // Tidak bisa akses member non-static outer class
            // System.out.println(namaUniversitas); // ERROR
            System.out.println("Gedung: " + namaGedung);
            System.out.println("Jumlah Lantai: " + jumlahLantai);
        }
    }

    // 3. LOCAL CLASS (dalam method)
    public void buatAcara(String namaAcara) {
        // Local variable harus final atau effectively final
        final String lokasi = alamat;

        // Local class
        class Acara {
            private String nama;
            private String tanggal;

            public Acara(String tanggal) {
                this.nama = namaAcara;
                this.tanggal = tanggal;
            }

            public void tampilkan() {
                System.out.println("Acara: " + nama);
                System.out.println("Tanggal: " + tanggal);
                System.out.println("Lokasi: " + lokasi);
                System.out.println("Di: " + namaUniversitas);
            }
        }

        Acara acara = new Acara("25 Desember 2024");
        acara.tampilkan();
    }
}
