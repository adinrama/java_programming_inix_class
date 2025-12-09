# Access Modifier di Java

## Deskripsi
Repositori ini berisi contoh implementasi **Access Modifier** dalam bahasa pemrograman Java. Access modifier adalah kata kunci yang digunakan untuk mengatur tingkat akses terhadap class, method, dan variabel dalam program Java.

## Struktur Project

```
com.inixindo_surabaya.javaprog.D1_access_modifier/
├── Pegawai.java
├── Manager.java
└── AccessModifierApp.java
```

## Jenis Access Modifier

Java memiliki 4 jenis access modifier:

### 1. **Private**
- Hanya dapat diakses dalam class yang sama
- Contoh pada kode: `nip`, `gaji`, dan method `hitungPajak()`

### 2. **Protected**
- Dapat diakses di dalam package yang sama dan subclass (inheritance)
- Contoh pada kode: `nama`, `umur`, dan method `naikGaji()`

### 3. **Public**
- Dapat diakses dari mana saja (class lain, package lain)
- Contoh pada kode: `departemen`, constructor, dan method `tampilkanGaji()`

### 4. **Default (Package-Private)**
- Tidak menggunakan keyword apapun
- Hanya dapat diakses dalam package yang sama
- Contoh pada kode: `alamat`

## Penjelasan Source Code

### File: Pegawai.java
Class `Pegawai` merupakan class parent/superclass yang mendemonstrasikan penggunaan keempat jenis access modifier.

**Atribut:**
- `private String nip` dan `private double gaji` - Data sensitif yang hanya bisa diakses internal
- `protected String nama` dan `protected int umur` - Dapat diakses oleh subclass
- `public String departemen` - Dapat diakses dari mana saja
- `String alamat` - Default access, hanya dalam package yang sama

**Method:**
- `private void hitungPajak()` - Method internal untuk kalkulasi pajak (5% dari gaji)
- `public void tampilkanGaji()` - Method publik yang menampilkan gaji dan memanggil `hitungPajak()`
- `protected void naikGaji(double persentase)` - Method yang dapat diakses subclass untuk menaikkan gaji

### File: Manager.java
Class `Manager` adalah subclass dari `Pegawai` yang mendemonstrasikan inheritance dan akses ke member protected.

**Fitur:**
- Extends class `Pegawai`
- Menambah atribut `tunjangan` (private)
- Dapat mengakses atribut `nama` (protected) dari parent class
- Dapat memanggil method `naikGaji()` (protected) dari parent class
- Memodifikasi nama dengan menambahkan suffix "(Manager)"

### File: AccessModifierApp.java
Class utama yang berisi method `main()` untuk menjalankan program.

**Alur Eksekusi:**
1. Membuat object `Manager` dengan data:
   - NIP: "210976"
   - Nama: "Bono Bakrie"
   - Gaji: Rp 8.000.000
   - Tunjangan: Rp 500.000
2. Memanggil method `tampilkanInfo()` yang akan:
   - Menampilkan nama manager
   - Menaikkan gaji sebesar 10%
   - Menampilkan gaji setelah kenaikan
   - Menghitung dan menampilkan pajak

## Output Program

```
Nama: Bono Bakrie (Manager)
Gaji: 8800000.0
Pajak: 440000.0
```

**Penjelasan Output:**
- Gaji awal: Rp 8.000.000
- Setelah naik 10%: Rp 8.800.000
- Pajak 5%: Rp 440.000

## Cara Menjalankan

1. Compile semua file Java:
```bash
javac com/inixindo_surabaya/javaprog/D1_access_modifier/*.java
```

2. Jalankan program:
```bash
java com.inixindo_surabaya.javaprog.D1_access_modifier.AccessModifierApp
```

## Konsep Penting

### Encapsulation
Source code ini mendemonstrasikan konsep **encapsulation** dengan:
- Menyembunyikan data sensitif (`nip`, `gaji`) menggunakan modifier `private`
- Menyediakan method public untuk mengakses data tersebut (`tampilkanGaji()`)
- Method internal (`hitungPajak()`) tidak dapat diakses dari luar class

### Inheritance
- Class `Manager` mewarisi properties dan behavior dari class `Pegawai`
- Dapat mengakses member `protected` dari parent class
- Tidak dapat mengakses member `private` dari parent class secara langsung

## Tabel Akses Level

| Modifier | Class | Package | Subclass | World |
|----------|-------|---------|----------|-------|
| public | ✓ | ✓ | ✓ | ✓ |
| protected | ✓ | ✓ | ✓ | ✗ |
| default | ✓ | ✓ | ✗ | ✗ |
| private | ✓ | ✗ | ✗ | ✗ |

## Best Practices

1. **Gunakan private untuk data sensitif** - Seperti NIP dan gaji pegawai
2. **Gunakan protected untuk method yang perlu diakses subclass** - Seperti `naikGaji()`
3. **Gunakan public untuk API publik** - Method yang dimaksudkan untuk digunakan class lain
4. **Hindari public untuk semua member** - Melanggar prinsip encapsulation

## Lisensi
Project ini dibuat untuk keperluan pembelajaran di Inixindo Surabaya.

---
**Author:** Inixindo Surabaya  
**Topik:** Java Programming - Access Modifier