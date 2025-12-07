package com.inixindo_surabaya.javaprog.C1_encapsulation;

public class RekeningBank {
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public String getNomorRekening() {
        return this.nomorRekening;
    }

    public String getNamaPemilik() {
        return this.namaPemilik;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo tidak boleh negatif!");
        }
    }

    public void setor(double jumlah) {
        if (jumlah > 0) {
            this.saldo += jumlah;
            System.out.println("Setor berhasil. Saldo: Rp " + getSaldo() + ",00");
        } else {
            System.out.println("Jumlah harus positif!");
        }
    }

    public boolean tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= this.saldo) {
            this.saldo -= jumlah;
            System.out.println("Tarik berhasil. Saldo: Rp " + getSaldo() + ",00");
            return true;
        } else {
            System.out.println("Saldo tidak mencukupi atau jumlah tidak valid!");
            return false;
        }
    }
}
