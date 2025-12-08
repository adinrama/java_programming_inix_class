# Varargs Method - StatistikHelper

## Deskripsi

Proyek ini merupakan contoh implementasi **varargs (variable arguments)** di Java. Varargs memungkinkan sebuah method menerima jumlah parameter yang bervariasi (tidak tetap) dari tipe data yang sama.

## Struktur File

```
com.inixindo_surabaya.javaprog.C5_varargs_method/
├── StatistikHelper.java
└── StatistikApp.java
```

## Penjelasan Kode

### StatistikHelper.java

Class ini menyediakan method-method untuk melakukan operasi statistik dengan menggunakan varargs.

#### Method `jumlahkan(int... angka)`

Method ini menjumlahkan semua angka yang diberikan sebagai parameter.

**Cara Kerja:**
- Parameter `int... angka` dapat menerima 0 atau lebih argumen bertipe `int`
- Di dalam method, varargs diperlakukan seperti array
- Menggunakan enhanced for loop untuk iterasi melalui semua nilai
- Mengembalikan total penjumlahan

**Contoh Penggunaan:**
```java
jumlahkan(1, 2, 3, 4, 5)  // hasil: 15
jumlahkan(10, 20)         // hasil: 30
jumlahkan(100)            // hasil: 100
```

#### Method `maksimal(int... angka)`

Method ini mencari nilai maksimal (terbesar) dari semua angka yang diberikan.

**Cara Kerja:**
- Inisialisasi variabel `maks` dengan elemen pertama array
- Iterasi melalui semua nilai dan membandingkan dengan nilai `maks` saat ini
- Update `maks` jika ditemukan nilai yang lebih besar
- Mengembalikan nilai maksimal

**Contoh Penggunaan:**
```java
maksimal(34, 12, 7, 4, 100, 82)  // hasil: 100
maksimal(5, 3, 8, 1)             // hasil: 8
```

### StatistikApp.java

Class ini adalah aplikasi utama yang mendemonstrasikan penggunaan `StatistikHelper`.

**Alur Program:**
1. Membuat instance dari `StatistikHelper`
2. Memanggil method `jumlahkan()` dengan 5 parameter (1, 2, 3, 4, 5)
3. Menampilkan hasil penjumlahan
4. Memanggil method `maksimal()` dengan 6 parameter (34, 12, 7, 4, 100, 82)
5. Menampilkan nilai maksimal

## Output Program

```
Hasil penjumlahan adalah 15
Nilai maksimal adalah 100
```

## Konsep Penting Varargs

### Sintaks Varargs
```java
returnType namaMethod(tipeData... namaParameter)
```

### Aturan Penggunaan Varargs

1. **Hanya satu varargs per method** - Sebuah method hanya boleh memiliki satu parameter varargs
2. **Harus di posisi terakhir** - Parameter varargs harus menjadi parameter terakhir dalam daftar parameter
3. **Diperlakukan sebagai array** - Di dalam method, varargs dapat diakses seperti array biasa

### Contoh Valid dan Invalid

**Valid:**
```java
void method1(int... numbers)
void method2(String name, int... scores)
void method3(double x, double y, int... values)
```

**Invalid:**
```java
void method4(int... numbers, String name)  // varargs harus di akhir
void method5(int... x, int... y)           // hanya boleh satu varargs
```

## Keuntungan Menggunakan Varargs

1. **Fleksibilitas** - Dapat memanggil method dengan jumlah argumen berapapun
2. **Kode lebih bersih** - Tidak perlu membuat array secara eksplisit saat pemanggilan
3. **Backward compatible** - Dapat menerima array sebagai argumen

## Cara Menjalankan

### Kompilasi
```bash
javac com/inixindo_surabaya/javaprog/C5_varargs_method/*.java
```

### Eksekusi
```bash
java com.inixindo_surabaya.javaprog.C5_varargs_method.StatistikApp
```

## Latihan Tambahan

Cobalah modifikasi atau tambahkan method berikut:

1. `minimal(int... angka)` - mencari nilai terkecil
2. `rataRata(int... angka)` - menghitung rata-rata
3. `urutkan(int... angka)` - mengurutkan angka dari kecil ke besar
4. `gabungkan(String... kata)` - menggabungkan beberapa string

## Referensi

- Java Documentation: Variable Arguments (Varargs)
- Java Tutorial: Arbitrary Number of Arguments