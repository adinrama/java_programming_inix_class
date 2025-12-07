# Java Classes - Tutorial Mobil

## Deskripsi

Repositori ini berisi contoh implementasi dasar dari konsep **Java Classes** menggunakan studi kasus objek `Mobil`. Project ini mendemonstrasikan bagaimana membuat class, constructor, attributes, methods, dan instansiasi objek dalam bahasa pemrograman Java.

## Struktur File

```
com.inixindo_surabaya.javaprog.B1_java_classes/
├── Mobil.java      # Class definition untuk objek Mobil
└── MobilApp.java   # Main application untuk menjalankan program
```

## Penjelasan Source Code

### 1. Mobil.java

File ini mendefinisikan class `Mobil` yang merepresentasikan objek mobil dengan berbagai properti dan perilaku.

#### Attributes (Properti)
Class `Mobil` memiliki 3 attributes:
- `String merk` - Menyimpan merek mobil (contoh: Toyota, Mitsubishi)
- `String warna` - Menyimpan warna mobil (contoh: Hitam, Putih)
- `int tahun` - Menyimpan tahun pembuatan mobil

#### Constructor
```java
public Mobil(String merk, String warna, int tahun)
```
Constructor ini digunakan untuk membuat objek `Mobil` baru dengan parameter yang diperlukan. Keyword `this` digunakan untuk membedakan antara parameter method dengan instance variable.

#### Methods
1. **info()** - Menampilkan informasi lengkap tentang mobil (merk, warna, dan tahun)
2. **klakson()** - Menampilkan suara klakson dari mobil tersebut

### 2. MobilApp.java

File ini adalah main application yang menggunakan class `Mobil`.

#### Cara Kerja
1. Import class `Mobil` dari package yang sama
2. Membuat 2 objek mobil dengan karakteristik berbeda:
   - `mobil1`: Toyota Hitam tahun 2010
   - `mobil2`: Mitsubishi Putih tahun 2018
3. Memanggil method `info()` dan `klakson()` untuk setiap objek

## Cara Menjalankan

### Prerequisites
- Java Development Kit (JDK) versi 8 atau lebih tinggi
- Text editor atau IDE (Eclipse, IntelliJ IDEA, VS Code, dll)

### Langkah-langkah

1. **Compile kedua file Java:**
```bash
javac com/inixindo_surabaya/javaprog/B1_java_classes/Mobil.java
javac com/inixindo_surabaya/javaprog/B1_java_classes/MobilApp.java
```

2. **Jalankan program:**
```bash
java com.inixindo_surabaya.javaprog.B1_java_classes.MobilApp
```

### Output yang Diharapkan
```
Merk: Toyota, Warna: Hitam, Tahun: 2010
Mobil Toyota, Tin tin!
Merk: Mitsubishi, Warna: Putih, Tahun: 2018
Mobil Mitsubishi, Tin tin!
```

## Konsep Java yang Dipelajari

### 1. **Class dan Object**
- Class adalah blueprint/template untuk membuat objek
- Object adalah instance dari class

### 2. **Encapsulation**
- Menggabungkan data (attributes) dan method dalam satu unit (class)

### 3. **Constructor**
- Method khusus yang dipanggil saat objek dibuat
- Nama constructor sama dengan nama class
- Digunakan untuk inisialisasi nilai awal objek

### 4. **Keyword `this`**
- Merujuk pada instance variable dari objek saat ini
- Membedakan antara parameter dan instance variable

### 5. **Method**
- Function yang didefinisikan dalam class
- Merepresentasikan perilaku/aksi yang bisa dilakukan objek

### 6. **Package**
- Cara mengorganisir class-class yang berhubungan
- Menggunakan namespace untuk menghindari konflik nama

## Modifikasi dan Eksperimen

Anda dapat mencoba modifikasi berikut untuk belajar lebih lanjut:

1. **Tambah Attribute Baru**
   - Tambahkan `int kecepatan` atau `String nomorPolisi`

2. **Tambah Method Baru**
   - Buat method `jalan()` untuk menampilkan mobil sedang berjalan
   - Buat method `berhenti()` untuk menampilkan mobil berhenti

3. **Buat Objek Lebih Banyak**
   - Coba buat 5-10 objek mobil dengan data berbeda

4. **Tambah Getter dan Setter**
   - Implementasikan encapsulation yang lebih baik dengan private attributes

## Referensi

- [Oracle Java Documentation](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [Java Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)

## Lisensi

Project ini dibuat untuk keperluan pembelajaran di Inixindo Surabaya.

---

**Catatan:** Pastikan struktur folder sesuai dengan package name untuk menghindari error saat compile dan run.