# Abstract Class - Sistem Kendaraan

Proyek ini merupakan contoh implementasi **Abstract Class** dalam Java menggunakan studi kasus sistem manajemen kendaraan.

## 📋 Deskripsi

Aplikasi ini mendemonstrasikan konsep abstract class dengan membuat hierarki class untuk kendaraan. Abstract class `Kendaraan` menjadi blueprint yang mendefinisikan struktur dan perilaku umum, sedangkan class turunan `Mobil` dan `Motor` mengimplementasikan detail spesifik untuk masing-masing jenis kendaraan.

## 🎯 Konsep Abstract Class

**Abstract Class** adalah class yang tidak dapat diinstansiasi secara langsung dan berfungsi sebagai template untuk class turunannya. Abstract class dapat memiliki:
- Method abstract (tanpa implementasi) yang harus diimplementasikan oleh class turunan
- Method konkret (dengan implementasi) yang dapat digunakan langsung
- Constructor untuk inisialisasi atribut
- Atribut seperti class biasa

## 📁 Struktur File

```
com.inixindo_surabaya.javaprog.A1_abstract_class/
├── Kendaraan.java      # Abstract class utama
├── Mobil.java          # Class turunan untuk mobil
├── Motor.java          # Class turunan untuk motor
└── AbstractApp.java    # Class untuk menjalankan aplikasi
```

## 🔍 Penjelasan Source Code

### 1. Kendaraan.java (Abstract Class)

```java
public abstract class Kendaraan
```

Class abstract yang menjadi parent class dengan fitur:

**Atribut:**
- `merk`: Merk kendaraan
- `tahunProduksi`: Tahun pembuatan
- `harga`: Harga kendaraan

**Constructor:**
```java
public Kendaraan(String merk, int tahunProduksi, double harga)
```
Menginisialisasi atribut dasar kendaraan.

**Abstract Methods** (harus diimplementasikan oleh subclass):
- `nyalakan()`: Cara menyalakan kendaraan
- `matikan()`: Cara mematikan kendaraan
- `hitungPajakTahunan()`: Menghitung pajak tahunan

**Concrete Method** (sudah ada implementasinya):
- `tampilkanInfo()`: Menampilkan informasi dasar kendaraan
- `getHarga()`: Getter untuk harga

### 2. Mobil.java (Concrete Class)

Mengimplementasikan abstract class `Kendaraan` dengan karakteristik khusus mobil:

**Atribut Tambahan:**
- `jenisBahanBakar`: Jenis bahan bakar (Bensin/Solar)
- `jumlahPintu`: Jumlah pintu mobil

**Implementasi Method Abstract:**
- `nyalakan()`: Mobil dinyalakan dengan kunci
- `matikan()`: Mobil dimatikan
- `hitungPajakTahunan()`: Pajak 2% dari harga kendaraan

**Method Override:**
- `tampilkanInfo()`: Memanggil `super.tampilkanInfo()` dan menambahkan info spesifik mobil

### 3. Motor.java (Concrete Class)

Mengimplementasikan abstract class `Kendaraan` dengan karakteristik khusus motor:

**Atribut Tambahan:**
- `kapasitasMesin`: Kapasitas mesin dalam cc

**Implementasi Method Abstract:**
- `nyalakan()`: Motor dinyalakan dengan starter
- `matikan()`: Motor dimatikan
- `hitungPajakTahunan()`: Pajak 1.5% dari harga kendaraan

**Method Override:**
- `tampilkanInfo()`: Memanggil `super.tampilkanInfo()` dan menambahkan info spesifik motor

### 4. AbstractApp.java (Main Class)

Class untuk menjalankan aplikasi dan mendemonstrasikan polymorphism:

```java
Kendaraan mobil = new Mobil(...);
Kendaraan motor = new Motor(...);
```

Menggunakan reference type `Kendaraan` (abstract class) untuk menyimpan object `Mobil` dan `Motor`, mendemonstrasikan konsep polymorphism.

## 🚀 Cara Menjalankan

1. Compile semua file Java:
```bash
javac com/inixindo_surabaya/javaprog/A1_abstract_class/*.java
```

2. Jalankan aplikasi:
```bash
java com.inixindo_surabaya.javaprog.A1_abstract_class.AbstractApp
```

## 📊 Output Program

```
=== MOBIL ===
Merk: Toyota Avanza
Tahun: 2022
Harga: Rp250000000.0
Jenis: Mobil
Bahan Bakar: Bensin
Jumlah Pintu: 4
Mobil Toyota Avanza dinyalakan dengan kunci
Pajak Tahunan: Rp5000000.0
Mobil Toyota Avanza dimatikan

=== MOTOR ===
Merk: Honda Beat
Tahun: 2023
Harga: Rp18000000.0
Jenis: Motor
Kapasitas Mesin: 110 cc
Motor Honda Beat dinyalakan dengan starter
Pajak Tahunan: Rp270000.0
Motor Honda Beat dimatikan
```

## 💡 Konsep Penting yang Dipelajari

1. **Abstract Class**: Class yang tidak dapat diinstansiasi langsung
2. **Abstract Method**: Method tanpa implementasi yang harus di-override
3. **Method Override**: Mengimplementasikan method abstract di subclass
4. **Inheritance**: Mobil dan Motor mewarisi dari Kendaraan
5. **Polymorphism**: Reference type parent class untuk object subclass
6. **Keyword `super`**: Memanggil constructor dan method dari parent class
7. **Encapsulation**: Penggunaan access modifier `protected` dan `private`

## 🎓 Kapan Menggunakan Abstract Class?

Gunakan abstract class ketika:
- Ada kesamaan behavior dan atribut antar class
- Ingin memaksakan subclass mengimplementasikan method tertentu
- Perlu menyediakan implementasi default untuk beberapa method
- Membuat template/blueprint untuk class turunan

## 🔄 Perbedaan dengan Interface

| Abstract Class | Interface |
|----------------|-----------|
| Dapat memiliki method konkret | Semua method abstract (sebelum Java 8) |
| Dapat memiliki atribut instance | Hanya konstanta (public static final) |
| Dapat memiliki constructor | Tidak dapat memiliki constructor |
| Single inheritance | Multiple inheritance |
| Menggunakan keyword `extends` | Menggunakan keyword `implements` |

## 📝 Latihan

Coba tambahkan class baru:
1. **Truk** dengan atribut kapasitas muatan dan pajak 3%
2. **Sepeda** dengan atribut jenis (gunung/balap) dan pajak 0.5%
3. Tambahkan method abstract baru seperti `hitungBiayaPerawatan()`

## 📚 Referensi

- [Oracle Java Documentation - Abstract Classes](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)
- Java Programming Fundamentals

---

**Package**: `com.inixindo_surabaya.javaprog.A1_abstract_class`  
**Topik**: Abstract Class & Inheritance  
**Level**: Intermediate