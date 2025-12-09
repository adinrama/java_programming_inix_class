# Static and Final Modifiers - Java Tutorial

## 📋 Deskripsi

Repository ini berisi contoh implementasi penggunaan **static** dan **final modifiers** dalam Java. Materi ini mendemonstrasikan bagaimana modifier-modifier ini bekerja dan kapan harus menggunakannya dalam pengembangan aplikasi Java.

## 📂 Struktur File

```
com.inixindo_surabaya.javaprog.A2_static_final_modifiers/
├── MatematikaHelper.java      # Contoh static methods dan variables
├── Konstanta.java              # Contoh final class dan constants
├── Pengguna.java               # Contoh final instance variables
└── StaticFinalModApp.java      # Main application untuk demo
```

## 🎯 Konsep yang Dipelajari

### 1. Static Modifier

**Static** digunakan untuk membuat anggota class yang dapat diakses tanpa membuat instance dari class tersebut.

#### Static Variable
```java
public static final double PI = 3.14159265359;
private static int jumlahPerhitungan = 0;
```
- Shared oleh semua instance class
- Dapat diakses langsung melalui nama class
- Cocok untuk konstanta atau data yang dibagi bersama

#### Static Method
```java
public static double luasLingkaran(double radius) {
    return PI * radius * radius;
}
```
- Dapat dipanggil tanpa membuat instance: `MatematikaHelper.luasLingkaran(5)`
- Hanya bisa mengakses static members
- Cocok untuk utility methods

#### Static Block
```java
static {
    System.out.println("MatematikaHelper class dimuat!");
    jumlahPerhitungan = 0;
}
```
- Dijalankan sekali saat class pertama kali dimuat ke memory
- Digunakan untuk inisialisasi static variables

### 2. Final Modifier

**Final** digunakan untuk membuat elemen yang tidak dapat diubah atau di-override.

#### Final Variable
```java
public static final int DETIK_PER_MENIT = 60;  // Constant
private final String id;                        // Instance variable
final int MAKSIMAL_PERCOBAAN = 3;              // Local variable
```
- Nilainya tidak dapat diubah setelah inisialisasi
- Untuk instance variable: harus diinisialisasi di constructor
- Biasanya ditulis dengan UPPER_CASE untuk konstanta

#### Final Method
```java
public final String getId() {
    return id;
}
```
- Tidak dapat di-override oleh subclass
- Menjamin behavior method tetap konsisten

#### Final Class
```java
public final class Konstanta {
    // ...
}
```
- Tidak dapat di-extend (tidak bisa dibuat subclass)
- Digunakan untuk utility class atau class yang harus immutable

## 💡 Penjelasan Setiap File

### MatematikaHelper.java
Class utility yang berisi method-method matematika dengan konsep:
- **Static constants** (`PI`, `E`): Nilai yang tidak berubah dan dibagi semua instance
- **Static variable** (`jumlahPerhitungan`): Counter yang melacak total perhitungan
- **Static methods**: Method utility yang dapat dipanggil tanpa instance
- **Static block**: Inisialisasi awal saat class dimuat

**Kegunaan**: Pattern ini cocok untuk utility class yang tidak memerlukan state per-instance.

### Konstanta.java
Final class yang berisi konstanta-konstanta dengan konsep:
- **Final class**: Mencegah inheritance
- **Static final variables**: Konstanta yang tidak dapat diubah
- **Private constructor**: Mencegah instantiation
- **Final method**: Method yang tidak bisa di-override

**Kegunaan**: Pattern ini ideal untuk class yang hanya menyimpan konstanta (seperti `Math` atau `Collections` di Java standard library).

### Pengguna.java
Class yang mendemonstrasikan final instance variables:
- **Final instance variable** (`id`, `waktuPendaftaran`): Data yang tidak boleh berubah setelah object dibuat
- **Non-final variable** (`nama`): Data yang bisa diubah
- **Final method**: Getter yang tidak bisa di-override

**Kegunaan**: Menjaga data integrity dengan memastikan beberapa field tidak dapat dimodifikasi setelah object dibuat.

### StaticFinalModApp.java
Main application yang mendemonstrasikan penggunaan semua konsep di atas.

## 🚀 Cara Menjalankan

1. Pastikan Java Development Kit (JDK) terinstall
2. Compile semua file:
   ```bash
   javac com/inixindo_surabaya/javaprog/A2_static_final_modifiers/*.java
   ```
3. Jalankan aplikasi:
   ```bash
   java com.inixindo_surabaya.javaprog.A2_static_final_modifiers.StaticFinalModApp
   ```

## 📊 Output yang Diharapkan

```
MatematikaHelper class dimuat!
Luas lingkaran r=5: 78.53981633975
Luas persegi 4x6: 24.0
2^3 = 8
Jumlah perhitungan: 3

PI = 3.14159265359
Total detik: 9045
```

## ✅ Best Practices

### Kapan Menggunakan Static:
- ✔️ Utility methods yang tidak memerlukan instance state
- ✔️ Constants yang dibagi semua instance
- ✔️ Factory methods
- ✔️ Counter atau tracking data global

### Kapan Menggunakan Final:
- ✔️ Constants (selalu gunakan `static final` bersamaan)
- ✔️ Instance variables yang tidak boleh berubah (immutability)
- ✔️ Method yang tidak boleh di-override (security/consistency)
- ✔️ Class yang tidak boleh di-extend (utility class, security)

### Kombinasi Static Final:
```java
public static final double PI = 3.14159265359;
```
- `static`: Shared oleh semua instance
- `final`: Nilai tidak dapat diubah
- Kombinasi ini perfect untuk konstanta

## ⚠️ Kesalahan Umum

```java
// ❌ SALAH - mencoba mengubah final variable
final int MAX = 10;
MAX = 20; // Compile error!

// ❌ SALAH - static method mengakses non-static variable
private int value = 10;
public static void printValue() {
    System.out.println(value); // Compile error!
}

// ❌ SALAH - mencoba membuat instance dari final class dengan private constructor
Konstanta k = new Konstanta(); // Compile error!
```

## 🎓 Poin Penting

1. **Static members** belong to the class, not to instances
2. **Final variables** must be initialized and cannot be reassigned
3. **Final methods** cannot be overridden in subclasses
4. **Final classes** cannot be extended
5. Static blocks run once when class is first loaded
6. Static methods can only access static members directly

## 📚 Referensi Lebih Lanjut

- [Oracle Java Tutorials - Class Variables](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html)
- [Oracle Java Tutorials - Final Keyword](https://docs.oracle.com/javase/tutorial/java/IandI/final.html)
- [Effective Java by Joshua Bloch](https://www.pearson.com/store/p/effective-java/P100000177438) - Best practices untuk penggunaan static dan final

## 👨‍💻 Author

**Inixindo Surabaya - Java Programming Course**

---

*Happy Coding! 🚀*