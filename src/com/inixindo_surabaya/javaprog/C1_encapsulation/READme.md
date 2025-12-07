# Encapsulation - Rekening Bank

## Deskripsi
Proyek ini mendemonstrasikan konsep **Encapsulation** (Enkapsulasi) dalam pemrograman berorientasi objek menggunakan Java. Enkapsulasi adalah salah satu pilar utama OOP yang menyembunyikan detail implementasi internal suatu class dan hanya mengekspos interface yang diperlukan melalui method public.

## Struktur Proyek

```
com.inixindo_surabaya.javaprog.C1_encapsulation/
├── RekeningBank.java
└── RekeningBankApp.java
```

## Penjelasan Kode

### 1. RekeningBank.java

Class ini merepresentasikan rekening bank dengan tiga atribut private yang dienkapsulasi:

#### Atribut Private
- `nomorRekening`: String - menyimpan nomor rekening
- `namaPemilik`: String - menyimpan nama pemilik rekening
- `saldo`: double - menyimpan saldo rekening

#### Constructor
```java
public RekeningBank(String nomorRekening, String namaPemilik, double saldo)
```
Menginisialisasi objek rekening bank dengan nomor rekening, nama pemilik, dan saldo awal.

#### Getter Methods
- `getNomorRekening()`: mengembalikan nomor rekening
- `getNamaPemilik()`: mengembalikan nama pemilik
- `getSaldo()`: mengembalikan saldo saat ini

#### Setter Method
- `setSaldo(double saldo)`: mengatur saldo dengan validasi (saldo tidak boleh negatif)

#### Business Methods

**setor(double jumlah)**
- Menambahkan sejumlah uang ke saldo rekening
- Validasi: jumlah harus positif
- Menampilkan pesan konfirmasi dengan saldo terbaru

**tarik(double jumlah)**
- Menarik sejumlah uang dari saldo rekening
- Validasi: jumlah harus positif dan tidak melebihi saldo
- Return: `true` jika berhasil, `false` jika gagal
- Menampilkan pesan konfirmasi atau error

### 2. RekeningBankApp.java

Class aplikasi yang mendemonstrasikan penggunaan class `RekeningBank`.

#### Contoh Penggunaan
```java
RekeningBank rekeningBank = new RekeningBank("123456789", "Budi Speed", 1000000);
rekeningBank.setor(500000);
```

Program ini membuat objek rekening bank dengan:
- Nomor rekening: "123456789"
- Nama pemilik: "Budi Speed"
- Saldo awal: Rp 1.000.000,00

Kemudian melakukan setoran sebesar Rp 500.000,00.

## Konsep Encapsulation yang Diterapkan

1. **Data Hiding**: Semua atribut dideklarasikan sebagai `private`, sehingga tidak dapat diakses langsung dari luar class

2. **Controlled Access**: Akses ke atribut hanya melalui getter dan setter methods yang menyediakan kontrol dan validasi

3. **Validation**: Method setter dan business method memiliki validasi untuk memastikan data tetap konsisten:
   - Saldo tidak boleh negatif
   - Jumlah setoran/penarikan harus positif
   - Penarikan tidak boleh melebihi saldo

4. **Information Security**: Detail implementasi tersembunyi, pengguna class hanya perlu tahu interface public yang tersedia

## Output Program

```
Setor berhasil. Saldo: Rp 1500000.0,00
```

## Cara Menjalankan

1. Compile kedua file Java:
```bash
javac com/inixindo_surabaya/javaprog/C1_encapsulation/*.java
```

2. Jalankan aplikasi:
```bash
java com.inixindo_surabaya.javaprog.C1_encapsulation.RekeningBankApp
```

## Manfaat Encapsulation

- **Keamanan Data**: Data sensitif dilindungi dari akses tidak sah
- **Fleksibilitas**: Implementasi internal dapat diubah tanpa mempengaruhi kode yang menggunakan class
- **Maintainability**: Kode lebih mudah dipelihara dan di-debug
- **Validasi**: Memastikan data selalu dalam kondisi valid
- **Reusability**: Class dapat digunakan kembali dengan aman di berbagai konteks

## Pengembangan Lebih Lanjut

Beberapa fitur yang dapat ditambahkan:
- Transfer antar rekening
- Riwayat transaksi
- Bunga deposito
- Biaya administrasi
- Limit penarikan harian
- Multiple currency support