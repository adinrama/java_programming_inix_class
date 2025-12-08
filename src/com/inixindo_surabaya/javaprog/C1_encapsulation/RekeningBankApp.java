package com.inixindo_surabaya.javaprog.C1_encapsulation;

public class RekeningBankApp {
    public static void main(String[] args) {
        RekeningBank rekeningBank = new RekeningBank("123456789", "Budi Speed", 1000000);
        rekeningBank.setor(500000);
    }
}
