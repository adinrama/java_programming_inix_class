package com.inixindo_surabaya.javaprog.A5_enum_types;

// Enum dengan abstract method
public enum OperasiMatematika {
    TAMBAH {
        @Override
        public double hitung(double a, double b) {
            return a + b;
        }
    },
    KURANG {
        @Override
        public double hitung(double a, double b) {
            return a - b;
        }
    },
    KALI {
        @Override
        public double hitung(double a, double b) {
            return a * b;
        }
    },
    BAGI {
        @Override
        public double hitung(double a, double b) {
            if (b == 0) throw new ArithmeticException("Tidak bisa dibagi nol");
            return a / b;
        }
    };

    // Abstract method yang harus diimplementasi setiap enum constant
    public abstract double hitung(double a, double b);
}
