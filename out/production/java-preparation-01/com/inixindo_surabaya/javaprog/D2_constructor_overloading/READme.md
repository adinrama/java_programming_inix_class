# Constructor Overloading pada Java

## Deskripsi

Repositori ini berisi contoh implementasi **Constructor Overloading** dalam pemrograman Java. Constructor overloading adalah teknik di mana sebuah class memiliki lebih dari satu constructor dengan jumlah atau tipe parameter yang berbeda.

## Struktur Project

```
com.inixindo_surabaya.javaprog.D2_constructor_overloading/
├── Buku.java
└── BukuApp.java
```

## Penjelasan Kode

### 1. Class Buku (Buku.java)

Class `Buku` memiliki 4 atribut private yang menyimpan informasi tentang sebuah buku:

- `judul` (String): Judul buku
- `penulis` (String): Nama penulis
- `tahunTerbit` (int): Tahun terbit buku
- `harga` (double): Harga buku dalam Rupiah

#### Constructor Overloading

Class ini mendemonstrasikan 5 constructor yang berbeda, memungkinkan pembuatan objek `Buku` dengan berbagai kombinasi parameter:

**1. Constructor tanpa parameter (default)**
```java
public Buku()
```
Membuat objek buku dengan nilai default: "Untitled", "Unknown", 2024, 0.0

**2. Constructor dengan 1 parameter (judul)**
```java
public Buku(String judul)
```
Menerima judul, parameter lain menggunakan nilai default

**3. Constructor dengan 2 parameter (judul, penulis)**
```java
public Buku(String judul, String penulis)
```
Menerima judul dan penulis, parameter lain menggunakan nilai default

**4. Constructor dengan 3 parameter (judul, penulis, tahunTerbit)**
```java
public Buku(String judul, String penulis, int tahunTerbit)
```
Menerima judul, penulis, dan tahun terbit, harga menggunakan nilai default

**5. Constructor dengan 4 parameter (lengkap)**
```java
public Buku(String judul, String penulis, int tahunTerbit, double harga)
```
Constructor utama yang menerima semua parameter dan menginisialisasi semua atribut

#### Constructor Chaining

Perhatikan bahwa constructor 1-4 menggunakan keyword `this()` untuk memanggil constructor lain. Ini disebut **constructor chaining**, yang membantu menghindari duplikasi kode. Semua constructor pada akhirnya memanggil constructor dengan 4 parameter yang melakukan inisialisasi sebenarnya.

#### Method tampilkanInfo()

Method ini menampilkan semua informasi buku ke console dalam format yang terstruktur.

### 2. Class BukuApp (BukuApp.java)

Class ini berisi method `main` yang mendemonstrasikan penggunaan semua constructor yang tersedia:

- `buku1`: Dibuat tanpa parameter (menggunakan nilai default)
- `buku2`: Dibuat dengan judul saja
- `buku3`: Dibuat dengan judul dan penulis
- `buku4`: Dibuat dengan judul, penulis, dan tahun terbit
- `buku5`: Dibuat dengan semua parameter lengkap

## Output Program

Ketika program dijalankan, akan menampilkan informasi dari 5 objek buku:

```
Judul: Untitled
Penulis: Unknown
Tahun: 2024
Harga: Rp0.0

Judul: Java Programming
Penulis: Unknown
Tahun: 2024
Harga: Rp0.0

Judul: Clean Code
Penulis: Robert Martin
Tahun: 2024
Harga: Rp0.0

Judul: Effective Java
Penulis: Joshua Bloch
Tahun: 2018
Harga: Rp0.0

Judul: Head First Java
Penulis: Kathy Sierra
Tahun: 2022
Harga: Rp150000.0
```

## Cara Menjalankan

1. Pastikan Java Development Kit (JDK) telah terinstall
2. Compile kedua file:
   ```bash
   javac com/inixindo_surabaya/javaprog/D2_constructor_overloading/*.java
   ```
3. Jalankan program:
   ```bash
   java com.inixindo_surabaya.javaprog.D2_constructor_overloading.BukuApp
   ```

## Konsep yang Dipelajari

1. **Constructor Overloading**: Membuat multiple constructor dengan signature berbeda
2. **Constructor Chaining**: Menggunakan `this()` untuk memanggil constructor lain
3. **Encapsulation**: Menggunakan private attributes dan public methods
4. **Default Values**: Memberikan nilai default untuk parameter yang tidak disediakan
5. **Code Reusability**: Menghindari duplikasi kode dengan constructor chaining

## Keuntungan Constructor Overloading

- Fleksibilitas dalam membuat objek dengan berbagai kombinasi data
- Kode lebih mudah dibaca dan dipelihara
- Mengurangi duplikasi kode melalui constructor chaining
- User-friendly untuk pengembang yang menggunakan class

## Catatan

Constructor overloading sangat berguna ketika Anda ingin memberikan berbagai cara untuk menginisialisasi objek, tergantung pada data yang tersedia pada saat pembuatan objek.