package com.inixindo_surabaya.javaprog.D3_instanceof_operator;

public class InstanceOfApp {
    public static void main(String[] args) {
        Bentuk bentuk1 = new Lingkaran(5.0);
        Bentuk bentuk2 = new Persegi(4.0);
        Bentuk bentuk3 = new Bentuk();

        System.out.println("bentuk1 instanceof Lingkaran: " + (bentuk1 instanceof Lingkaran));
        System.out.println("bentuk1 instanceof Bentuk: " + (bentuk1 instanceof Bentuk));
        System.out.println("bentuk2 instanceof Persegi: " + (bentuk2 instanceof Persegi));
        System.out.println("bentuk2 instanceof Lingkaran: " + (bentuk2 instanceof Lingkaran));

        prosesBentuk(bentuk1);
        prosesBentuk(bentuk2);
        prosesBentuk(bentuk3);
    }

    public static void prosesBentuk(Bentuk bentuk) {
        bentuk.gambar();

        if (bentuk instanceof Lingkaran) {
            Lingkaran lingkaran = (Lingkaran) bentuk;
            System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
        } else if (bentuk instanceof Persegi) {
            Persegi persegi = (Persegi) bentuk;
            System.out.println("Luas persegi: " + persegi.hitungLuas());
        }
    }
}
