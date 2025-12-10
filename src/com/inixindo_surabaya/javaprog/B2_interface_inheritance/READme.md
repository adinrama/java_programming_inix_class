# Interface Inheritance - Java Programming

## Deskripsi
Proyek ini mendemonstrasikan konsep **Interface Inheritance** (pewarisan interface) dan **Multiple Interface Implementation** dalam Java. Program ini menggunakan contoh kasus hewan peliharaan yang bekerja untuk menjelaskan bagaimana sebuah class dapat mengimplementasikan beberapa interface sekaligus dan bagaimana interface dapat mewarisi interface lainnya.

## Struktur Package
```
com.inixindo_surabaya.javaprog.B2_interface_inheritance
```

## File-file dalam Proyek

### 1. HewanPeliharaan.java (Interface Dasar)
Interface dasar yang mendefinisikan perilaku umum untuk hewan peliharaan.

**Method:**
- `void beriMakan()` - Method untuk memberi makan hewan
- `void ajakBermain()` - Method untuk mengajak hewan bermain
- `String getNama()` - Method untuk mendapatkan nama hewan

### 2. HewanKerja.java (Interface Turunan)
Interface yang **mewarisi** dari `HewanPeliharaan` dan menambahkan fungsionalitas kerja.

**Method tambahan:**
- `void bekerja()` - Method untuk membuat hewan bekerja
- `int getJamKerja()` - Method untuk mendapatkan total jam kerja

**Konsep Penting:** Interface `HewanKerja` secara otomatis mewarisi semua method dari `HewanPeliharaan`, sehingga class yang mengimplementasikan `HewanKerja` harus mengimplementasikan semua method dari kedua interface tersebut.

### 3. Berlari.java (Interface Terpisah)
Interface independen yang mendefinisikan kemampuan bergerak.

**Method:**
- `void berlari()` - Method abstract untuk berlari
- `void berjalan()` - Method abstract untuk berjalan
- `default void berlari(int kecepatan)` - Method default dengan parameter kecepatan

**Konsep Penting:** Method `default` sudah memiliki implementasi di dalam interface, sehingga class yang mengimplementasikan interface ini tidak wajib meng-override method default tersebut.

### 4. AnjingPekerja.java (Class Implementasi)
Class konkret yang mengimplementasikan **multiple interfaces** sekaligus: `HewanKerja` dan `Berlari`.

**Atribut:**
- `String nama` - Nama anjing
- `int jamKerja` - Total jam kerja anjing

**Constructor:**
- `AnjingPekerja(String nama)` - Inisialisasi anjing dengan nama dan jam kerja = 0

**Implementasi Method:**
- Mengimplementasikan semua method dari `HewanPeliharaan` (via `HewanKerja`)
- Mengimplementasikan method tambahan dari `HewanKerja`
- Mengimplementasikan method dari `Berlari`

### 5. InterfaceInheritanceApp.java (Main Program)
Program utama yang mendemonstrasikan penggunaan class `AnjingPekerja`.

**Demonstrasi:**
- Membuat objek anjing bernama "Rexi"
- Memanggil method dari interface `HewanPeliharaan` (beriMakan, ajakBermain)
- Memanggil method dari interface `HewanKerja` (bekerja)
- Memanggil method dari interface `Berlari` (berlari)
- Menampilkan total jam kerja

## Konsep yang Dipelajari

### 1. Interface Inheritance
Interface dapat mewarisi interface lain menggunakan keyword `extends`:
```java
public interface HewanKerja extends HewanPeliharaan
```

### 2. Multiple Interface Implementation
Sebuah class dapat mengimplementasikan beberapa interface sekaligus:
```java
public class AnjingPekerja implements HewanKerja, Berlari
```

### 3. Default Method
Interface dapat memiliki method dengan implementasi default (sejak Java 8):
```java
default void berlari(int kecepatan) {
    System.out.println("Berlari dengan kecepatan: " + kecepatan + " km/jam");
}
```

### 4. Method Overriding
Class harus mengimplementasikan semua abstract method dari interface yang diimplementasikan menggunakan annotation `@Override`.

## Cara Menjalankan Program

### Kompilasi
```bash
javac com/inixindo_surabaya/javaprog/B2_interface_inheritance/*.java
```

### Eksekusi
```bash
java com.inixindo_surabaya.javaprog.B2_interface_inheritance.InterfaceInheritanceApp
```

## Output Program
```
=== ANJING PEKERJA ===
Memberi makan Rexi
Bermain lempar tangkap dengan Rexi
Rexi bekerja sebagai anjing penjaga
Rexi bekerja sebagai anjing penjaga
Rexi berlari cepat
Total jam kerja: 2
```

## Diagram Hierarki Interface

```
    HewanPeliharaan (Interface)
           ↑
           |
           | extends
           |
      HewanKerja (Interface)
           ↑
           |
           | implements
           |
    AnjingPekerja (Class) ← implements → Berlari (Interface)
```

## Keuntungan Menggunakan Interface Inheritance

1. **Reusability** - Interface dapat digunakan kembali dan diperluas
2. **Flexibility** - Class dapat mengimplementasikan multiple interfaces
3. **Polymorphism** - Objek dapat diperlakukan sebagai tipe interface yang berbeda
4. **Contract Enforcement** - Memastikan class mengimplementasikan method yang diperlukan
5. **Code Organization** - Memisahkan kontrak (interface) dari implementasi (class)

## Catatan Penting

- Interface tidak dapat diinstansiasi secara langsung
- Class yang mengimplementasikan interface **harus** mengimplementasikan semua abstract method
- Interface dapat mewarisi multiple interfaces lain
- Method default di interface dapat di-override oleh class implementasi
- Semua method di interface secara implisit bersifat `public` dan `abstract` (kecuali default method)

## Lisensi
Materi pembelajaran dari Inixindo Surabaya - Java Programming Course

---
**Dibuat untuk tujuan pembelajaran Interface Inheritance di Java**