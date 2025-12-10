# Interface pada Java

## Deskripsi
Repositori ini berisi contoh implementasi **Interface** dalam bahasa pemrograman Java. Proyek ini mendemonstrasikan berbagai konsep interface seperti abstract methods, default methods, static methods, dan implementasi multiple interfaces.

## Struktur Proyek

```
com.inixindo_surabaya.javaprog.B1_interface/
├── Terbang.java          # Interface untuk kemampuan terbang
├── Berlari.java          # Interface untuk kemampuan berlari
├── Berenang.java         # Interface untuk kemampuan berenang
├── Burung.java           # Class yang implementasi 1 interface
├── Bebek.java            # Class yang implementasi multiple interfaces
└── InterfaceApp.java     # Main class untuk menjalankan program
```

## Konsep yang Dipelajari

### 1. Interface Dasar (Terbang.java)
Interface sederhana yang mendemonstrasikan:
- **Konstanta**: `KECEPATAN_MAKSIMAL` (public static final secara default)
- **Abstract Methods**: `terbang()`, `mendarat()`, `getKetinggian()`

### 2. Interface dengan Default Method (Berenang.java)
Menunjukkan fitur Java 8+:
- **Abstract Methods**: `berenang()`, `menyelam()`
- **Default Methods**: `mengapung()`, `istirahat()` - bisa digunakan langsung atau di-override
- **Static Method**: `infoBerenang()` - dipanggil melalui nama interface

### 3. Interface dengan Method Overloading (Berlari.java)
- Abstract methods: `berlari()`, `berjalan()`
- Default method dengan parameter: `berlari(int kecepatan)`

### 4. Single Interface Implementation (Burung.java)
Class `Burung` mengimplementasikan interface `Terbang`:
- Wajib mengimplementasikan semua abstract methods
- Memiliki state internal (`ketinggianSaatIni`)

### 5. Multiple Interface Implementation (Bebek.java)
Class `Bebek` mengimplementasikan 3 interface sekaligus:
- `Terbang`: terbang(), mendarat(), getKetinggian()
- `Berenang`: berenang(), menyelam(), mengapung() (override)
- `Berlari`: berlari(), berjalan()

Mendemonstrasikan bahwa satu class bisa memiliki banyak kemampuan.

## Cara Menjalankan Program

### Menggunakan Command Line

```bash
# Compile semua file
javac com/inixindo_surabaya/javaprog/B1_interface/*.java

# Jalankan program
java com.inixindo_surabaya.javaprog.B1_interface.InterfaceApp
```

### Menggunakan IDE
1. Buka project di IDE (Eclipse, IntelliJ IDEA, NetBeans, VS Code)
2. Jalankan file `InterfaceApp.java`

## Output Program

```
=== BURUNG ===
Elang terbang ke ketinggian 100.0 meter
Ketinggian: 100.0 meter
Elang mendarat

=== BEBEK (Multiple Interfaces) ===
Donald terbang rendah
Donald berenang di kolam
Donald menyelam mencari makanan
Donald mengapung sambil mencari ikan
Beristirahat setelah berenang
Donald berlari di darat
Donald berjalan dengan kaki berselaput

Berenang adalah aktivitas di air
```

## Penjelasan Konsep

### Apa itu Interface?
Interface adalah kontrak yang mendefinisikan method-method yang harus diimplementasikan oleh class. Interface tidak bisa diinstansiasi langsung.

### Karakteristik Interface:
- Semua method secara default adalah `public abstract`
- Semua field secara default adalah `public static final`
- Class dapat mengimplementasikan multiple interfaces
- Mendukung default method (sejak Java 8)
- Mendukung static method (sejak Java 8)

### Keuntungan Menggunakan Interface:
1. **Abstraksi**: Menyembunyikan detail implementasi
2. **Multiple Inheritance**: Java tidak mendukung multiple inheritance untuk class, tapi mendukung untuk interface
3. **Loose Coupling**: Mengurangi ketergantungan antar class
4. **Polymorphism**: Objek bisa diperlakukan sebagai tipe interface-nya

### Default Method vs Abstract Method:
- **Abstract Method**: Harus diimplementasikan oleh class
- **Default Method**: Sudah memiliki implementasi, bisa digunakan langsung atau di-override

### Static Method pada Interface:
- Dipanggil menggunakan nama interface (contoh: `Berenang.infoBerenang()`)
- Tidak bisa di-override oleh class implementor
- Berguna untuk utility methods terkait interface

## Contoh Penggunaan dalam Real-World

Interface sangat berguna untuk:
- **Plugin System**: Mendefinisikan kontrak untuk plugin
- **Repository Pattern**: Interface untuk operasi database
- **Strategy Pattern**: Berbagai strategi dengan interface yang sama
- **API Design**: Mendefinisikan kontrak API

Contoh:
```java
public interface PaymentMethod {
    boolean processPayment(double amount);
    String getPaymentType();
}

// Implementasi berbeda
public class CreditCard implements PaymentMethod { ... }
public class BankTransfer implements PaymentMethod { ... }
public class EWallet implements PaymentMethod { ... }
```

## Kesimpulan

Project ini mendemonstrasikan penggunaan interface dalam Java dengan berbagai fitur:
- Interface sederhana dengan abstract methods
- Default methods untuk backward compatibility
- Static methods untuk utility functions
- Single dan multiple interface implementation
- Konstanta dalam interface

Interface adalah salah satu fitur penting dalam OOP yang memungkinkan kita membuat kode yang lebih modular, fleksibel, dan mudah dimaintain.

## Referensi
- [Oracle Java Documentation - Interfaces](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)
- [Java Interface Tutorial](https://docs.oracle.com/javase/tutorial/java/concepts/interface.html)

## Lisensi
Project ini dibuat untuk tujuan pembelajaran di Inixindo Surabaya.

---
**Author**: Inixindo Surabaya  
**Package**: `com.inixindo_surabaya.javaprog.B1_interface`