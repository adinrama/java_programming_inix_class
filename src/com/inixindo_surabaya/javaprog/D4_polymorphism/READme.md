# Polymorphism - Sistem Pembayaran

## 📋 Deskripsi
Repositori ini berisi implementasi konsep **Polymorphism** dalam Java menggunakan studi kasus sistem pembayaran. Project ini mendemonstrasikan bagaimana polymorphism memungkinkan objek dari berbagai kelas turunan diperlakukan sebagai objek dari kelas induknya.

## 🎯 Tujuan Pembelajaran
- Memahami konsep polymorphism dalam pemrograman berorientasi objek
- Mengerti penggunaan abstract class dan abstract method
- Mempelajari method overriding
- Memahami dynamic binding (late binding) dalam Java

## 📁 Struktur File

```
com/inixindo_surabaya/javaprog/D4_polymorphism/
├── Pembayaran.java          # Abstract class (parent)
├── KartuKredit.java         # Child class - pembayaran kartu kredit
├── Transfer.java            # Child class - pembayaran transfer bank
├── Tunai.java               # Child class - pembayaran tunai
└── PolymorphismApp.java     # Main class untuk menjalankan aplikasi
```

## 🔍 Penjelasan Kode

### 1. Pembayaran.java (Abstract Class)
```java
public abstract class Pembayaran {
    protected double jumlah;
    
    public abstract void proses();
    public void tampilkanJumlah() { ... }
}
```

**Konsep Utama:**
- `abstract class` tidak dapat diinstansiasi secara langsung
- `abstract method proses()` harus diimplementasikan oleh semua child class
- `protected double jumlah` dapat diakses oleh child class
- `tampilkanJumlah()` adalah concrete method yang dapat digunakan semua child class

### 2. KartuKredit.java
```java
public class KartuKredit extends Pembayaran {
    private String nomorKartu;
    
    @Override
    public void proses() {
        // Implementasi spesifik untuk kartu kredit
    }
}
```

**Fitur:**
- Extends dari class `Pembayaran`
- Memiliki atribut tambahan: `nomorKartu`
- Override method `proses()` dengan implementasi khusus untuk kartu kredit

### 3. Transfer.java
```java
public class Transfer extends Pembayaran {
    private String nomorRekening;
    
    @Override
    public void proses() {
        // Implementasi spesifik untuk transfer bank
    }
}
```

**Fitur:**
- Extends dari class `Pembayaran`
- Memiliki atribut tambahan: `nomorRekening`
- Override method `proses()` dengan implementasi khusus untuk transfer

### 4. Tunai.java
```java
public class Tunai extends Pembayaran {
    @Override
    public void proses() {
        // Implementasi spesifik untuk pembayaran tunai
    }
}
```

**Fitur:**
- Extends dari class `Pembayaran`
- Tidak memiliki atribut tambahan
- Override method `proses()` dengan implementasi khusus untuk tunai

### 5. PolymorphismApp.java (Main Class)
```java
public class PolymorphismApp {
    public static void main(String[] args) {
        Pembayaran[] daftarPembayaran = new Pembayaran[3];
        daftarPembayaran[0] = new KartuKredit(500000, "1234-5678-9012");
        daftarPembayaran[1] = new Transfer(750000, "9876543210");
        daftarPembayaran[2] = new Tunai(200000);
        
        prosesTransaksi(daftarPembayaran[0]);
        // ...
    }
    
    public static void prosesTransaksi(Pembayaran pembayaran) {
        pembayaran.proses(); // Polymorphism in action!
    }
}
```

**Polymorphism dalam Aksi:**
- Array bertipe `Pembayaran[]` menampung berbagai jenis pembayaran
- Method `prosesTransaksi()` menerima parameter `Pembayaran`
- Saat runtime, Java menjalankan method `proses()` sesuai tipe objek sebenarnya (KartuKredit, Transfer, atau Tunai)
- Ini adalah **dynamic binding** atau **late binding**

## ▶️ Cara Menjalankan

1. Compile semua file Java:
```bash
javac com/inixindo_surabaya/javaprog/D4_polymorphism/*.java
```

2. Jalankan aplikasi:
```bash
java com.inixindo_surabaya.javaprog.D4_polymorphism.PolymorphismApp
```

## 📤 Output yang Diharapkan

```
=== Proses Transaksi ===
Memulai transaksi...
Memproses pembayaran dengan Kartu Kredit
Nomor Kartu: 1234-5678-9012
Jumlah: Rp 500000.0
Transaksi selesai

Memulai transaksi...
Memproses transfer bank
Ke rekening: 9876543210
Jumlah: Rp 750000.0
Transaksi selesai

Memulai transaksi...
Memproses pembayaran tunai
Jumlah: Rp 200000.0
Transaksi selesai
```

## 💡 Konsep Polymorphism yang Diterapkan

### 1. **Compile-time Polymorphism (Method Overloading)**
Tidak digunakan dalam contoh ini.

### 2. **Runtime Polymorphism (Method Overriding)**
✅ Digunakan dalam contoh ini:
- Method `proses()` di-override oleh setiap child class
- JVM menentukan method mana yang dipanggil berdasarkan tipe objek saat runtime
- Ini memungkinkan kode yang lebih fleksibel dan mudah dipelihara

## 🎓 Keuntungan Polymorphism

1. **Code Reusability**: Method `prosesTransaksi()` dapat bekerja dengan semua jenis pembayaran
2. **Flexibility**: Mudah menambahkan jenis pembayaran baru tanpa mengubah kode yang ada
3. **Maintainability**: Kode lebih terorganisir dan mudah dipelihara
4. **Extensibility**: Sistem dapat diperluas dengan mudah

## 🔧 Modifikasi dan Pengembangan

### Menambah Jenis Pembayaran Baru
Untuk menambah metode pembayaran baru (misalnya E-Wallet):

```java
public class EWallet extends Pembayaran {
    private String nomorHp;
    
    public EWallet(double jumlah, String nomorHp) {
        super(jumlah);
        this.nomorHp = nomorHp;
    }
    
    @Override
    public void proses() {
        System.out.println("Memproses pembayaran E-Wallet");
        System.out.println("Nomor HP: " + nomorHp);
        System.out.println("Jumlah: Rp " + jumlah);
    }
}
```

Kemudian tambahkan ke array di `PolymorphismApp.java`:
```java
daftarPembayaran[3] = new EWallet(300000, "081234567890");
```

## 📚 Referensi
- Java Polymorphism Documentation
- Object-Oriented Programming Concepts
- Java Abstract Classes and Interfaces

## 👨‍💻 Author
Inixindo Surabaya - Java Programming Course

## 📝 Lisensi
Educational purposes - Inixindo Surabaya Training Center

---
**Note:** Pastikan Java Development Kit (JDK) sudah terinstall di sistem Anda sebelum menjalankan program ini.