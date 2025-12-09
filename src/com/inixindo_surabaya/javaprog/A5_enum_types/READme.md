# Enum Types di Java

Repository ini berisi contoh-contoh penggunaan Enum Types di Java, dari yang sederhana hingga yang kompleks dengan constructor, method, dan abstract method.

## 📚 Daftar Isi

- [Pengenalan Enum](#pengenalan-enum)
- [Struktur Project](#struktur-project)
- [Penjelasan Setiap File](#penjelasan-setiap-file)
- [Cara Menjalankan](#cara-menjalankan)
- [Konsep Penting](#konsep-penting)

## Pengenalan Enum

Enum (Enumeration) adalah tipe data khusus di Java yang merepresentasikan sekumpulan konstanta yang telah ditentukan. Enum membuat code lebih readable, type-safe, dan mudah di-maintain.

### Keuntungan Menggunakan Enum:
- **Type Safety**: Compiler akan memberikan error jika menggunakan nilai yang tidak valid
- **Namespace**: Semua konstanta terkumpul dalam satu namespace
- **Readable**: Code lebih mudah dibaca dan dipahami
- **Maintainable**: Mudah menambah atau mengubah nilai konstanta

## Struktur Project

```
com.inixindo_surabaya.javaprog.A5_enum_types/
├── Hari.java                    # Enum sederhana
├── StatusPesanan.java           # Enum dengan constructor dan method
├── OperasiMatematika.java       # Enum dengan abstract method
├── UkuranBaju.java              # Enum dengan logic bisnis
├── Pesanan.java                 # Class yang menggunakan enum
└── Main.java                    # Main class untuk demo
```

## Penjelasan Setiap File

### 1. Hari.java - Enum Sederhana

```java
public enum Hari {
    SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGU
}
```

Ini adalah bentuk paling sederhana dari enum. Hanya berisi daftar konstanta tanpa field atau method tambahan.

**Penggunaan:**
- Merepresentasikan hari dalam seminggu
- Digunakan dalam switch statement
- Dapat di-loop menggunakan `values()`

### 2. StatusPesanan.java - Enum dengan Constructor dan Method

Enum ini mendemonstrasikan fitur-fitur lanjutan:

**Features:**
- **Private Fields**: `deskripsi` dan `prioritas`
- **Constructor**: Menginisialisasi field untuk setiap konstanta
- **Getter Methods**: Mengakses field private
- **Custom Method**: `isAktif()` untuk logic bisnis

**Contoh Konstanta:**
```java
PENDING("Menunggu", 1),
DIKONFIRMASI("Dikonfirmasi", 2),
DIKIRIM("Dalam Pengiriman", 4)
```

Setiap konstanta memiliki deskripsi dan prioritas yang berbeda.

### 3. OperasiMatematika.java - Enum dengan Abstract Method

Enum yang sangat powerful dengan abstract method yang harus diimplementasikan oleh setiap konstanta.

**Struktur:**
```java
public enum OperasiMatematika {
    TAMBAH {
        @Override
        public double hitung(double a, double b) {
            return a + b;
        }
    },
    // ... konstanta lainnya
    
    public abstract double hitung(double a, double b);
}
```

**Keuntungan:**
- Setiap operasi memiliki implementasi yang berbeda
- Menghindari penggunaan if-else atau switch yang kompleks
- Polymorphism dengan enum

### 4. UkuranBaju.java - Enum dengan Logic Bisnis

Enum yang merepresentasikan ukuran baju dengan logic untuk mencari ukuran yang cocok.

**Features:**
- Field: `nama`, `lingkarDada`, `panjang`
- Method `cocokUntuk()`: Mengecek apakah ukuran cocok dengan pembeli
- Static method `cariUkuran()`: Mencari ukuran terbaik berdasarkan lingkar dada

**Contoh:**
```java
XS("Extra Small", 80, 60),
S("Small", 85, 65),
M("Medium", 90, 70)
```

### 5. Pesanan.java - Class yang Menggunakan Enum

Class domain model yang menggunakan enum `StatusPesanan` dan `Hari`.

**Features:**
- Field `status` dengan tipe `StatusPesanan`
- Method `ubahStatus()` untuk update status
- Method `tampilkanInfo()` untuk menampilkan informasi pesanan

### 6. Main.java - Demo Program

File ini mendemonstrasikan semua penggunaan enum:

1. **Enum Sederhana**: Loop dan switch statement
2. **Method Enum Bawaan**:
   - `ordinal()`: Mendapatkan posisi enum (0-based)
   - `values()`: Mendapatkan array semua konstanta
   - `name()`: Mendapatkan nama konstanta sebagai String
3. **Enum dengan Constructor**: Menggunakan StatusPesanan
4. **Enum dengan Abstract Method**: Operasi matematika
5. **Enum dengan Logic Bisnis**: Mencari ukuran baju yang cocok

## Cara Menjalankan

### Menggunakan Command Line:

1. Compile semua file:
```bash
javac com/inixindo_surabaya/javaprog/A5_enum_types/*.java
```

2. Jalankan Main class:
```bash
java com.inixindo_surabaya.javaprog.A5_enum_types.Main
```

### Menggunakan IDE (IntelliJ IDEA / Eclipse):

1. Import project ke IDE
2. Buka file `Main.java`
3. Klik kanan dan pilih "Run Main.main()"

## Konsep Penting

### 1. Method Bawaan Enum

Setiap enum secara otomatis memiliki method:

| Method | Deskripsi |
|--------|-----------|
| `values()` | Mengembalikan array semua konstanta enum |
| `valueOf(String)` | Mengkonversi String menjadi enum |
| `ordinal()` | Mengembalikan posisi enum (0-based) |
| `name()` | Mengembalikan nama konstanta sebagai String |
| `compareTo()` | Membandingkan urutan enum |

### 2. Constructor Enum

- Constructor enum **harus private** atau default (package-private)
- Constructor dipanggil sekali untuk setiap konstanta
- Tidak bisa membuat instance enum dengan `new`

### 3. Enum dalam Switch Statement

```java
switch (hari) {
    case SENIN:  // Tidak perlu Hari.SENIN
        System.out.println("Hari kerja");
        break;
    case SABTU:
        System.out.println("Akhir pekan");
        break;
}
```

### 4. Enum dan Inheritance

- Enum **tidak bisa** meng-extend class lain
- Enum **tidak bisa** di-extend oleh class lain
- Enum **bisa** mengimplementasikan interface

### 5. Best Practices

1. **Gunakan enum untuk nilai yang tetap**: Hari, bulan, status, kategori, dll.
2. **Tambahkan method jika diperlukan**: Untuk logic bisnis terkait enum
3. **Hindari menggunakan ordinal() untuk logic**: Gunakan field khusus
4. **Gunakan EnumSet dan EnumMap**: Untuk koleksi enum yang efisien
5. **Dokumentasikan enum**: Jelaskan maksud setiap konstanta

## Output Program

Ketika menjalankan `Main.java`, output yang dihasilkan:

```
=== HARI DALAM MINGGU ===
Hari: SENIN
Ordinal: 0

Semua hari:
SENIN
SELASA
RABU
KAMIS
JUMAT
SABTU
MINGGU

=== SWITCH ENUM ===
Hari kerja

=== STATUS PESANAN ===
ID Pesanan: ORD001
Status: Menunggu
Prioritas: 1
Aktif: Ya

Status pesanan ORD001 diubah menjadi: Dikonfirmasi
Status pesanan ORD001 diubah menjadi: Dalam Pengiriman
Status pesanan ORD001 diubah menjadi: Selesai

=== OPERASI MATEMATIKA ===
10.0 + 5.0 = 15.0
10.0 - 5.0 = 5.0
10.0 * 5.0 = 50.0
10.0 / 5.0 = 2.0

=== UKURAN BAJU ===
Ukuran: Medium
Lingkar Dada: 90 cm
Panjang: 70 cm

Untuk lingkar dada 92 cm, ukuran yang cocok: Medium
```

## Latihan

1. Tambahkan enum baru `Level` (BEGINNER, INTERMEDIATE, ADVANCED) dengan field `minimumPoin`
2. Buat enum `Warna` dengan method `getKodeHex()` yang mengembalikan kode warna hex
3. Implementasikan enum `Priority` dengan abstract method `getBobot()`
4. Buat class `Tugas` yang menggunakan enum `Status` dan `Priority`

## Referensi

- [Oracle Java Documentation - Enum Types](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html)
- [Effective Java by Joshua Bloch - Item 34: Use enums instead of int constants](https://www.oreilly.com/library/view/effective-java/9780134686097/)

---

**Package**: `com.inixindo_surabaya.javaprog.A5_enum_types`  
**Java Version**: Java 8+  
**Lisensi**: Educational Purpose