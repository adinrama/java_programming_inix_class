# Dokumentasi Program Mahasiswa

## Deskripsi
Program ini merupakan contoh implementasi konsep **Object-Oriented Programming (OOP)** dalam Java yang mendemonstrasikan penggunaan **fields**, **constructor**, dan **methods**. Program ini mengelola data mahasiswa dan melakukan berbagai operasi terkait akademik.

## Struktur Program

### 1. Class Mahasiswa (`Mahasiswa.java`)

#### Fields (Atribut)
Class `Mahasiswa` memiliki tiga atribut private:
- `nama` (String) - menyimpan nama mahasiswa
- `nim` (String) - menyimpan Nomor Induk Mahasiswa
- `ipk` (double) - menyimpan Indeks Prestasi Kumulatif

```java
private String nama;
private String nim;
private double ipk;
```

#### Constructor

**1. Constructor Tanpa Parameter (Default Constructor)**
```java
public Mahasiswa()
```
- Menginisialisasi objek dengan nilai default
- `nama` = "Belum diisi"
- `nim` = "00000"
- `ipk` = 0.0

**2. Constructor Dengan Parameter**
```java
public Mahasiswa(String nama, String nim, double ipk)
```
- Menginisialisasi objek dengan nilai yang diberikan
- Menggunakan keyword `this` untuk membedakan parameter dengan field

#### Methods (Metode)

**1. `tampilkanInfo()`**
- **Return type**: void
- **Fungsi**: Menampilkan informasi lengkap mahasiswa ke console
- Mencetak nama, NIM, dan IPK

**2. `cekKelulusan()`**
- **Return type**: String
- **Fungsi**: Menentukan status kelulusan berdasarkan IPK
- **Kriteria**:
  - IPK ≥ 3.0 → "Lulus dengan baik"
  - IPK ≥ 2.0 → "Lulus"
  - IPK < 2.0 → "Tidak lulus"

**3. `hitungNilaiAkhir(double nilaiTugas, double nilaiUTS, double nilaiUAS)`**
- **Return type**: double
- **Fungsi**: Menghitung nilai akhir berdasarkan komponen nilai
- **Formula**: 
  - Nilai Akhir = (Tugas × 30%) + (UTS × 30%) + (UAS × 40%)

### 2. Class MahasiswaApp (`MahasiswaApp.java`)

Class ini merupakan **main class** yang berfungsi untuk menjalankan program dan mendemonstrasikan penggunaan class `Mahasiswa`.

#### Alur Program
1. Membuat objek `Mahasiswa` dengan nama "Rama", NIM "21505", dan IPK 3.75
2. Memanggil method `tampilkanInfo()` untuk menampilkan data mahasiswa
3. Memanggil method `cekKelulusan()` untuk mengecek status kelulusan
4. Memanggil method `hitungNilaiAkhir()` dengan nilai:
   - Tugas: 88
   - UTS: 79
   - UAS: 93
5. Menampilkan hasil perhitungan nilai akhir

## Output Program

```
Nama: Rama
NIM: 21505
IPK: 3.75
Lulus dengan baik
Nilai akhir = 86.7
```

**Penjelasan Output**:
- Nilai akhir = (88 × 0.3) + (79 × 0.3) + (93 × 0.4) = 26.4 + 23.7 + 37.2 = **86.7**

## Konsep OOP yang Diimplementasikan

### 1. **Encapsulation**
- Fields dideklarasikan sebagai `private` untuk menyembunyikan data
- Akses ke data dilakukan melalui constructor dan methods

### 2. **Constructor Overloading**
- Terdapat dua constructor dengan parameter yang berbeda
- Memberikan fleksibilitas dalam pembuatan objek

### 3. **Methods**
- Memisahkan logika bisnis ke dalam method-method terpisah
- Membuat kode lebih terorganisir dan reusable

## Cara Menjalankan Program

### Prasyarat
- Java Development Kit (JDK) terinstal
- IDE atau text editor (Eclipse, IntelliJ IDEA, VS Code, atau sejenisnya)

### Langkah-langkah

1. **Compile kedua file Java**:
```bash
javac com/inixindo_surabaya/javaprog/B2_field_constructor_method/Mahasiswa.java
javac com/inixindo_surabaya/javaprog/B2_field_constructor_method/MahasiswaApp.java
```

2. **Jalankan program**:
```bash
java com.inixindo_surabaya.javaprog.B2_field_constructor_method.MahasiswaApp
```

## Modifikasi dan Pengembangan

### Contoh Penggunaan Constructor Default
```java
Mahasiswa mhs2 = new Mahasiswa();
mhs2.tampilkanInfo(); // Output: Belum diisi, 00000, 0.0
```

### Contoh Perhitungan Nilai Berbeda
```java
Mahasiswa mhs3 = new Mahasiswa("Siti", "21506", 3.50);
double nilai = mhs3.hitungNilaiAkhir(90, 85, 88);
System.out.println("Nilai akhir: " + nilai); // Output: 87.5
```

## Catatan Penting

- Class menggunakan **access modifier** `private` untuk fields agar data terlindungi
- Penggunaan `this` dalam constructor penting untuk membedakan parameter dengan field
- Method dapat memiliki **return type** (String, double) atau **void** (tidak mengembalikan nilai)
- Penamaan package mengikuti konvensi Java: huruf kecil dengan underscore

## Lisensi
Program ini dibuat untuk tujuan pembelajaran di Inixindo Surabaya.

---
**Materi**: Fields, Constructor, dan Methods  
**Package**: `com.inixindo_surabaya.javaprog.B2_field_constructor_method`