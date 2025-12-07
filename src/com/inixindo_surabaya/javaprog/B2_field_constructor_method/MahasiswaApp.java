package com.inixindo_surabaya.javaprog.B2_field_constructor_method;

import com.inixindo_surabaya.javaprog.B2_field_constructor_method.Mahasiswa;

public class MahasiswaApp {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Rama", "21505", 3.75);
        mhs.tampilkanInfo();
        System.out.println(mhs.cekKelulusan());

        double nilai_akhir = mhs.hitungNilaiAkhir(88,79,93);
        System.out.println("Nilai akhir = " + nilai_akhir);
    }
}
