# Nested Classes di Java

Repositori ini berisi contoh implementasi berbagai jenis nested classes (kelas bersarang) dalam Java, menggunakan studi kasus sistem Universitas.

## Daftar Isi

- [Pengenalan](#pengenalan)
- [Jenis-jenis Nested Classes](#jenis-jenis-nested-classes)
- [Struktur File](#struktur-file)
- [Penjelasan Detail](#penjelasan-detail)
- [Cara Menjalankan](#cara-menjalankan)
- [Output Program](#output-program)

## Pengenalan

Nested class adalah class yang didefinisikan di dalam class lain. Java mendukung empat jenis nested classes, yaitu:

1. **Inner Class** (Non-static nested class)
2. **Static Nested Class**
3. **Local Class**
4. **Anonymous Class**

Setiap jenis memiliki karakteristik dan use case yang berbeda.

## Jenis-jenis Nested Classes

### 1. Inner Class (Non-static Nested Class)

Inner class adalah class yang didefinisikan di dalam class lain tanpa modifier `static`. Inner class memiliki akses penuh ke semua member (termasuk private) dari outer class.

**Karakteristik:**
- Memiliki akses ke semua member outer class
- Harus dibuat melalui instance outer class
- Dapat memiliki inner class di dalamnya (nested inner class)

**Contoh dalam kode:**
```java
public class Fakultas {
    // Dapat mengakses namaUniversitas dari outer class
    public void tampilkanInfo() {
        System.out.println("Universitas: " + namaUniversitas);
    }
}
```

### 2. Static Nested Class

Static nested class adalah nested class yang dideklarasikan dengan modifier `static`. Class ini tidak memiliki akses ke member non-static dari outer class.

**Karakteristik:**
- Tidak dapat mengakses member non-static outer class
- Dapat dibuat tanpa instance outer class
- Mirip dengan class biasa, tetapi dikemas dalam outer class untuk organisasi kode

**Contoh dalam kode:**
```java
public static class Gedung {
    // Tidak bisa akses namaUniversitas (non-static member)
    public void tampilkanInfo() {
        System.out.println("Gedung: " + namaGedung);
    }
}
```

### 3. Local Class

Local class adalah class yang didefinisikan di dalam method atau scope tertentu. Class ini hanya dapat diakses di dalam method tersebut.

**Karakteristik:**
- Didefinisikan di dalam method
- Hanya dapat diakses dalam method tersebut
- Dapat mengakses local variable yang bersifat final atau effectively final
- Dapat mengakses member outer class

**Contoh dalam kode:**
```java
public void buatAcara(String namaAcara) {
    final String lokasi = alamat;
    
    class Acara {
        // Dapat mengakses namaAcara dan lokasi
        public void tampilkan() {
            System.out.println("Acara: " + nama);
            System.out.println("Lokasi: " + lokasi);
        }
    }
}
```

### 4. Anonymous Class

Anonymous class adalah class tanpa nama yang didefinisikan dan diinstansiasi dalam satu ekspresi. Biasanya digunakan untuk implementasi interface atau extends class secara langsung.

**Karakteristik:**
- Tidak memiliki nama
- Didefinisikan dan diinstansiasi sekaligus
- Cocok untuk implementasi yang hanya digunakan sekali
- Dapat mengimplementasikan interface atau meng-extend class

**Contoh dalam kode:**
```java
SayHello printer = new SayHello() {
    @Override
    void print(String message) {
        System.out.println(">>> " + message + " <<<");
    }
};
```

## Struktur File

```
com.inixindo_surabaya.javaprog.A4_nested_classes/
├── Universitas.java    # Outer class dengan Inner Class, Static Nested Class, dan Local Class
├── SayHello.java       # Abstract class untuk demonstrasi Anonymous Class
└── Main.java           # Class utama untuk menjalankan semua contoh
```

## Penjelasan Detail

### Universitas.java

File ini berisi outer class `Universitas` dengan tiga jenis nested classes:

**Inner Class - Fakultas:**
- Merepresentasikan fakultas dalam universitas
- Memiliki akses ke field `namaUniversitas` dan `alamat` dari outer class
- Berisi nested inner class `Jurusan` yang dapat mengakses member dari `Universitas` dan `Fakultas`

**Static Nested Class - Gedung:**
- Merepresentasikan gedung yang independen dari instance universitas tertentu
- Tidak dapat mengakses member non-static dari `Universitas`
- Cocok untuk konsep yang secara logis terkait dengan universitas tetapi tidak memerlukan akses ke data instance universitas

**Local Class - Acara:**
- Didefinisikan dalam method `buatAcara()`
- Dapat mengakses parameter method dan local variable yang final
- Hanya dapat digunakan dalam method tersebut

### SayHello.java

Abstract class sederhana yang digunakan untuk mendemonstrasikan anonymous class. Memiliki satu abstract method `print()` yang harus diimplementasikan.

### Main.java

Class utama yang mendemonstrasikan penggunaan semua jenis nested classes:

1. **Membuat Inner Class:** Memerlukan instance outer class terlebih dahulu
2. **Membuat Static Nested Class:** Dapat dibuat langsung tanpa instance outer class
3. **Memanggil method yang menggunakan Local Class:** Local class dibuat dan digunakan di dalam method
4. **Membuat Anonymous Class:** Implementasi langsung dari abstract class `SayHello`

## Cara Menjalankan

### Menggunakan Command Line

```bash
# Compile semua file
javac com/inixindo_surabaya/javaprog/A4_nested_classes/*.java

# Jalankan program
java com.inixindo_surabaya.javaprog.A4_nested_classes.Main
```

### Menggunakan IDE (IntelliJ IDEA, Eclipse, NetBeans)

1. Import project ke IDE
2. Buka file `Main.java`
3. Klik kanan dan pilih "Run Main.main()"

## Output Program

```
=== INNER CLASS ===
Universitas: Universitas Indonesia
Fakultas: Teknik
Dekan: Prof. Dr. Ahmad

Universitas: Universitas Indonesia
Fakultas: Teknik
Jurusan: Informatika

=== STATIC NESTED CLASS ===
Gedung: Gedung A
Jumlah Lantai: 5

=== LOCAL CLASS ===
Acara: Wisuda
Tanggal: 25 Desember 2024
Lokasi: Depok
Di: Universitas Indonesia

>>> Hello dari Anonymous Class <<<
```

## Kapan Menggunakan Masing-masing Jenis?

### Inner Class
Gunakan ketika class tersebut membutuhkan akses ke instance member dari outer class dan secara logis hanya masuk akal dalam konteks outer class.

**Contoh:** `Fakultas` tidak masuk akal tanpa `Universitas`

### Static Nested Class
Gunakan ketika class secara logis terkait dengan outer class tetapi tidak memerlukan akses ke instance member outer class.

**Contoh:** `Gedung` bisa berdiri sendiri, tetapi secara konsep terkait dengan universitas

### Local Class
Gunakan ketika membutuhkan class helper yang hanya digunakan dalam satu method dan memerlukan akses ke local variable.

**Contoh:** `Acara` hanya digunakan dalam method `buatAcara()`

### Anonymous Class
Gunakan untuk implementasi sederhana yang hanya digunakan sekali, terutama untuk interface atau callback.

**Contoh:** Implementasi sekali pakai dari `SayHello`

## Kesimpulan

Nested classes memberikan cara untuk:
- Mengorganisasi kode yang secara logis terkait
- Meningkatkan enkapsulasi
- Membuat kode lebih readable dan maintainable
- Mengakses member private dari outer class

Pemilihan jenis nested class yang tepat bergantung pada kebutuhan akses ke outer class member dan scope penggunaan class tersebut.

---

**Package:** `com.inixindo_surabaya.javaprog.A4_nested_classes`  
**Topik:** Java Nested Classes  
**Level:** Intermediate