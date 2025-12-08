# instanceof Operator dalam Java

## Deskripsi
Proyek ini mendemonstrasikan penggunaan operator `instanceof` dalam Java untuk memeriksa tipe objek saat runtime. Implementasi ini menggunakan konsep pewarisan (inheritance) dan polimorfisme dengan hierarki kelas bentuk geometri.

## Struktur Proyek

```
com.inixindo_surabaya.javaprog.D3_instanceof_operator/
├── Bentuk.java
├── Lingkaran.java
├── Persegi.java
└── InstanceOfApp.java
```

## Penjelasan Kelas

### 1. Bentuk.java (Kelas Parent)
Kelas dasar yang merepresentasikan bentuk geometri umum.

**Fitur:**
- Method `gambar()` yang dapat di-override oleh subclass

```java
public void gambar() {
    System.out.println("Menggambar bentuk");
}
```

### 2. Lingkaran.java (Subclass)
Kelas turunan yang merepresentasikan lingkaran.

**Atribut:**
- `radius` (double): jari-jari lingkaran

**Method:**
- `gambar()`: Override method untuk menggambar lingkaran
- `hitungLuas()`: Menghitung luas lingkaran dengan rumus πr²

### 3. Persegi.java (Subclass)
Kelas turunan yang merepresentasikan persegi.

**Atribut:**
- `sisi` (double): panjang sisi persegi

**Method:**
- `gambar()`: Override method untuk menggambar persegi
- `hitungLuas()`: Menghitung luas persegi dengan rumus sisi × sisi

### 4. InstanceOfApp.java (Main Class)
Kelas utama yang mendemonstrasikan penggunaan operator `instanceof`.

## Konsep instanceof Operator

Operator `instanceof` digunakan untuk memeriksa apakah suatu objek adalah instance dari kelas tertentu atau implementasi dari interface tertentu.

**Sintaks:**
```java
objek instanceof NamaKelas
```

**Return Value:** boolean (true/false)

## Cara Kerja Program

### 1. Pembuatan Objek dengan Polimorfisme
```java
Bentuk bentuk1 = new Lingkaran(5.0);
Bentuk bentuk2 = new Persegi(4.0);
Bentuk bentuk3 = new Bentuk();
```
Objek dibuat dengan tipe referensi `Bentuk` tetapi instance-nya adalah `Lingkaran`, `Persegi`, dan `Bentuk`.

### 2. Pengecekan Tipe dengan instanceof
```java
bentuk1 instanceof Lingkaran  // true
bentuk1 instanceof Bentuk     // true
bentuk2 instanceof Persegi    // true
bentuk2 instanceof Lingkaran  // false
```

### 3. Type Casting Aman dengan instanceof
Method `prosesBentuk()` mendemonstrasikan penggunaan `instanceof` sebelum melakukan casting:

```java
if (bentuk instanceof Lingkaran) {
    Lingkaran lingkaran = (Lingkaran) bentuk;
    System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
}
```

Ini mencegah `ClassCastException` yang bisa terjadi jika casting dilakukan tanpa pengecekan.

## Output Program

```
bentuk1 instanceof Lingkaran: true
bentuk1 instanceof Bentuk: true
bentuk2 instanceof Persegi: true
bentuk2 instanceof Lingkaran: false
Menggambar lingkaran dengan radius: 5.0
Luas lingkaran: 78.53981633974483
Menggambar persegi dengan sisi: 4.0
Luas persegi: 16.0
Menggambar bentuk
```

## Kegunaan instanceof

1. **Type Checking**: Memeriksa tipe objek sebelum melakukan operasi spesifik
2. **Safe Casting**: Mencegah `ClassCastException` dengan validasi tipe sebelum casting
3. **Polymorphic Behavior**: Menangani objek dengan tipe berbeda dalam satu method
4. **Conditional Logic**: Membuat logika kondisional berdasarkan tipe objek runtime

## Cara Menjalankan

1. Compile semua file Java:
```bash
javac com/inixindo_surabaya/javaprog/D3_instanceof_operator/*.java
```

2. Jalankan program:
```bash
java com.inixindo_surabaya.javaprog.D3_instanceof_operator.InstanceOfApp
```

## Poin Penting

- Operator `instanceof` mengembalikan `true` jika objek adalah instance dari kelas yang diperiksa atau subclass-nya
- `bentuk1 instanceof Bentuk` mengembalikan `true` karena `Lingkaran` adalah subclass dari `Bentuk`
- Selalu gunakan `instanceof` sebelum melakukan downcasting untuk menghindari error runtime
- `instanceof` mengembalikan `false` jika objek adalah `null`

## Konsep OOP yang Diterapkan

1. **Inheritance**: Lingkaran dan Persegi mewarisi dari Bentuk
2. **Polymorphism**: Referensi tipe Bentuk dapat menunjuk ke objek Lingkaran atau Persegi
3. **Method Overriding**: Method gambar() di-override di subclass
4. **Encapsulation**: Atribut private dengan akses melalui method

## Lisensi
Materi pembelajaran dari Inixindo Surabaya