# Casting Object References di Java

## Deskripsi
Project ini mendemonstrasikan konsep **casting object references** dalam Java, khususnya mengenai **upcasting** dan **downcasting** dalam konteks inheritance (pewarisan). Menggunakan studi kasus sistem manajemen karyawan dengan hierarki class `Karyawan`, `Sales`, dan `Programmer`.

## Struktur Class

```
Karyawan (Parent Class)
    ├── Sales (Child Class)
    └── Programmer (Child Class)
```

### 1. Class Karyawan (Parent)
Class dasar yang merepresentasikan karyawan umum.

**Atribut:**
- `nama`: String - nama karyawan
- `gajiPokok`: double - gaji pokok karyawan

**Method:**
- `hitungGaji()`: menghitung total gaji (di parent hanya return gaji pokok)
- `tampilkanInfo()`: menampilkan informasi karyawan

### 2. Class Sales (Child)
Mewarisi dari `Karyawan`, menambahkan fitur khusus untuk sales.

**Atribut Tambahan:**
- `komisi`: double - komisi yang diterima
- `targetPenjualan`: double - target penjualan

**Method:**
- `hitungGaji()`: override untuk menambahkan komisi ke gaji pokok
- `setTargetPenjualan()`: set target penjualan
- `getKomisi()`: mengambil nilai komisi

### 3. Class Programmer (Child)
Mewarisi dari `Karyawan`, menambahkan fitur khusus untuk programmer.

**Atribut Tambahan:**
- `bahasaPemrograman`: String - bahasa pemrograman yang dikuasai
- `jumlahProyek`: int - jumlah proyek yang dikerjakan

**Method:**
- `hitungGaji()`: override untuk menambahkan bonus proyek (Rp 500.000 per proyek)
- `setBahasaPemrograman()`: set bahasa pemrograman
- `tambahProyek()`: increment jumlah proyek

## Konsep Casting

### 1. Upcasting (Implicit/Otomatis)
Proses mengkonversi reference dari child class ke parent class. Dilakukan secara otomatis oleh Java.

```java
Karyawan karyawan1 = new Sales("Budi", 5000000, 2000000); // Upcasting
```

**Karakteristik:**
- Aman dan tidak memerlukan casting eksplisit
- Hanya bisa mengakses method dari parent class
- Polymorphism tetap bekerja (method overridden tetap dipanggil dari child)

### 2. Downcasting (Explicit/Manual)
Proses mengkonversi reference dari parent class ke child class. Harus dilakukan secara eksplisit.

```java
if (karyawan1 instanceof Sales) {
    Sales sales = (Sales) karyawan1; // Downcasting
    sales.getKomisi(); // Sekarang bisa akses method Sales
}
```

**Karakteristik:**
- Memerlukan casting eksplisit dengan tanda kurung
- Berisiko `ClassCastException` jika object sebenarnya bukan tipe yang di-cast
- Harus dicek dengan `instanceof` untuk keamanan

## Operator instanceof
Operator untuk mengecek apakah suatu object merupakan instance dari class tertentu.

```java
if (karyawan instanceof Sales) {
    // Aman untuk di-cast ke Sales
}
```

## Contoh Penggunaan

### Output Program:
```
Nama: Budi
Gaji: Rp 7000000.0
Nama: Ani
Gaji: Rp 8000000.0
Komisi: Rp2000000.0
Gaji dengan bonus: Rp 9000000.0

Error: Tidak bisa cast Sales ke Programmer!

=== Cara Aman Casting ===

Memproses karyawan: Budi
Tipe: Sales
Komisi: Rp2000000.0
Gaji total: Rp 7000000.0

Memproses karyawan: Ani
Tipe: Programmer
Gaji total: Rp 8500000.0
```

## Best Practices

### ✅ DO (Yang Benar):
1. **Selalu gunakan `instanceof` sebelum downcasting**
   ```java
   if (obj instanceof Sales) {
       Sales sales = (Sales) obj;
   }
   ```

2. **Gunakan polymorphism daripada casting berlebihan**
   ```java
   // Lebih baik
   karyawan.hitungGaji(); // Polymorphism bekerja otomatis
   ```

3. **Handle exception dengan try-catch**
   ```java
   try {
       Sales sales = (Sales) karyawan;
   } catch (ClassCastException e) {
       System.out.println("Casting gagal!");
   }
   ```

### ❌ DON'T (Yang Salah):
1. **Jangan downcasting tanpa cek instanceof**
   ```java
   // BERBAHAYA!
   Sales sales = (Sales) karyawan; // Bisa error
   ```

2. **Jangan melakukan casting yang tidak masuk akal**
   ```java
   // ERROR! Sales tidak bisa jadi Programmer
   Programmer prog = (Programmer) salesObject;
   ```

## Kapan Menggunakan Casting?

### Upcasting:
- Ketika ingin menyimpan berbagai tipe child class dalam satu collection
- Untuk mencapai polymorphism
- Ketika method menerima parameter parent class

### Downcasting:
- Ketika perlu mengakses method/atribut spesifik dari child class
- Setelah melakukan upcasting dan perlu kembali ke tipe asli
- Dalam pemrosesan conditional berdasarkan tipe object

## Kesalahan Umum

1. **ClassCastException**: Terjadi saat downcasting ke tipe yang salah
2. **Lupa menggunakan instanceof**: Menyebabkan runtime error
3. **Casting berlebihan**: Menggunakan casting padahal polymorphism sudah cukup

## Cara Menjalankan

```bash
# Compile
javac com/inixindo_surabaya/javaprog/D5_casting_object_references/*.java

# Run
java com.inixindo_surabaya.javaprog.D5_casting_object_references.CastObjectApp
```

## Kesimpulan

Casting object references adalah fitur penting dalam Java yang memungkinkan fleksibilitas dalam bekerja dengan inheritance hierarchy. Kunci utamanya adalah:
- **Upcasting** aman dan otomatis
- **Downcasting** perlu kehati-hatian dan pengecekan dengan `instanceof`
- Gunakan polymorphism sebisa mungkin sebelum melakukan casting
- Selalu handle kemungkinan `ClassCastException`

## Referensi
- Java Inheritance
- Java Polymorphism
- Java instanceof operator
- Java Type Casting