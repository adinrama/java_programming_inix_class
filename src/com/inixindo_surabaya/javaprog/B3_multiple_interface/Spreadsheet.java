package com.inixindo_surabaya.javaprog.B3_multiple_interface;

public class Spreadsheet implements Readable, Writable, Printable {
    private String nama;
    private String[][] data;
    private int baris;
    private int kolom;

    public Spreadsheet(String nama, int baris, int kolom) {
        this.nama = nama;
        this.baris = baris;
        this.kolom = kolom;
        this.data = new String[baris][kolom];

        // Inisialisasi dengan data kosong
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                data[i][j] = "";
            }
        }
    }

    @Override
    public String read() {
        StringBuilder sb = new StringBuilder("Membaca spreadsheet: " + nama + "\n");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                sb.append(data[i][j]).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public int getPageCount() {
        return 1;
    }

    @Override
    public void write(String content) {
        System.out.println("Menulis ke spreadsheet: " + content);
    }

    public void setCell(int baris, int kolom, String nilai) {
        if (baris < this.baris && kolom < this.kolom) {
            data[baris][kolom] = nilai;
        }
    }

    @Override
    public boolean canEdit() {
        return true;
    }

    @Override
    public void print() {
        System.out.println("=== MENCETAK SPREADSHEET ===");
        System.out.println("Nama: " + nama);
        System.out.println(read());
        System.out.println("============================");
    }

    @Override
    public String getFormat() {
        return "XLSX";
    }
}
