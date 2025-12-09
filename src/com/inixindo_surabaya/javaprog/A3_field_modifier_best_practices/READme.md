# Field Modifier Best Practices

## Deskripsi
Proyek ini mendemonstrasikan best practices dalam penggunaan field modifier di Java melalui implementasi sistem manajemen produk sederhana. Kode ini menunjukkan cara yang tepat dalam menerapkan enkapsulasi, access modifier, dan desain class yang baik.

## Struktur Proyek

```
com.inixindo_surabaya.javaprog.A3_field_modifier_best_practices/
├── Produk.java        # Class model dengan best practices
└── ProdukApp.java     # Class aplikasi untuk testing
```

## Konsep Best Practices yang Diimplementasikan

### 1. **Enkapsulasi dengan Private Fields**
```java
private String id;
private String nama;
private double harga;
private int stok;
```
**Alasan**: Field dibuat private agar tidak dapat diakses langsung dari luar class, melindungi data dari modifikasi yang tidak valid.

### 2. **Konstanta Public Static Final**
```java
public static final double PAJAK_PPN = 0.11;
public static final double DISKON_MAKSIMAL = 0.50;
```
**Alasan**: Konstanta yang bersifat global dan tidak berubah dapat dibuat public untuk memudahkan akses, dengan kata kunci `final` yang memastikan nilainya tidak dapat diubah.

### 3. **Static Variable Private dengan Getter**
```java
private static int jumlahProduk = 0;

public static int getJumlahProduk() {
    return jumlahProduk;
}
```
**Alasan**: Static variable yang dapat berubah dibuat private dan diakses melalui getter untuk kontrol yang lebih baik.

### 4. **Public Constructor**
```java
public Produk(String id, String nama, double harga, int stok) {
    this.id = id;
    this.nama = nama;
    this.harga = harga;
    this.stok = stok;
    jumlahProduk++;
}
```
**Alasan**: Constructor dibuat public agar class dapat diinstansiasi dari package lain.

### 5. **Public Getter Methods**
```java
public String getId() {
    return id;
}

public double getHarga() {
    return harga;
}
```
**Alasan**: Getter memberikan akses read-only terhadap field private, memungkinkan pembacaan data tanpa risiko modifikasi langsung.

### 6. **Setter dengan Validasi**
```java
public void setHarga(double harga) {
    if (harga < 0) {
        throw new IllegalArgumentException("Harga tidak boleh negatif");
    }
    this.harga = harga;
}
```
**Alasan**: Setter memvalidasi input sebelum mengubah nilai field, memastikan data selalu dalam kondisi valid.

### 7. **Public Business Logic Methods**
```java
public double hitungHargaAkhir(double diskon) {
    if (diskon < 0 || diskon > DISKON_MAKSIMAL) {
        throw new IllegalArgumentException("Diskon tidak valid");
    }
    double hargaSetelahDiskon = harga * (1 - diskon);
    return hargaSetelahDiskon * (1 + PAJAK_PPN);
}
```
**Alasan**: Method yang menyediakan fungsionalitas utama dibuat public untuk dapat digunakan oleh class lain.

### 8. **Private Helper Methods**
```java
private boolean validasiStok(int jumlah) {
    return stok >= jumlah;
}
```
**Alasan**: Helper method yang hanya digunakan internal dibuat private untuk menyembunyikan detail implementasi dan mengurangi kompleksitas API public.

### 9. **Public Method dengan Private Helper**
```java
public boolean kurangiStok(int jumlah) {
    if (validasiStok(jumlah)) {
        stok -= jumlah;
        return true;
    }
    return false;
}
```
**Alasan**: Memisahkan validasi (private) dari logic utama (public) membuat kode lebih modular dan mudah di-maintain.

## Cara Menjalankan

1. Compile kedua file Java:
```bash
javac Produk.java ProdukApp.java
```

2. Jalankan aplikasi:
```bash
java com.inixindo_surabaya.javaprog.A3_field_modifier_best_practices.ProdukApp
```

## Output yang Diharapkan

```
Jumlah produk: 2
PPN: 11.0%

Produk: Laptop
Harga: Rp10000000.0
Harga akhir (setelah diskon 10% + PPN): Rp9990000.0
Stok berkurang. Sisa: 3
```

## Penjelasan Alur Program

1. **Inisialisasi**: Membuat 2 objek Produk (Laptop dan Mouse)
2. **Akses Static**: Menampilkan jumlah total produk dan nilai PPN dari konstanta
3. **Getter Usage**: Mengambil informasi nama dan harga produk menggunakan getter
4. **Kalkulasi Bisnis**: Menghitung harga akhir dengan diskon 10% dan PPN 11%
5. **Manipulasi Stok**: Mengurangi stok sebanyak 2 unit dan menampilkan sisa stok

## Keuntungan Pendekatan Ini

1. **Data Integrity**: Validasi di setter memastikan data selalu valid
2. **Encapsulation**: Detail implementasi tersembunyi, hanya interface public yang terekspos
3. **Maintainability**: Perubahan internal tidak mempengaruhi kode yang menggunakan class
4. **Security**: Private fields tidak dapat dimodifikasi langsung dari luar
5. **Flexibility**: Mudah menambah validasi atau logic tanpa mengubah public API
6. **Readability**: Jelas method mana yang untuk penggunaan eksternal (public) dan internal (private)

## Tips Best Practices

- ✅ **DO**: Selalu gunakan private untuk field
- ✅ **DO**: Tambahkan validasi di setter
- ✅ **DO**: Gunakan getter/setter untuk akses field
- ✅ **DO**: Buat konstanta sebagai `public static final`
- ✅ **DO**: Pisahkan helper method dengan access modifier private
- ❌ **DON'T**: Jangan buat field public kecuali konstanta
- ❌ **DON'T**: Jangan skip validasi input
- ❌ **DON'T**: Jangan expose internal implementation details

## Pelajaran Kunci

Penggunaan access modifier yang tepat adalah fondasi dari enkapsulasi yang baik dalam OOP. Dengan mengikuti best practices ini, kode akan lebih aman, mudah di-maintain, dan scalable untuk pengembangan di masa depan.

---

**Package**: `com.inixindo_surabaya.javaprog.A3_field_modifier_best_practices`  
**Author**: Inixindo Surabaya  
**Purpose**: Educational - Demonstrasi Field Modifier Best Practices