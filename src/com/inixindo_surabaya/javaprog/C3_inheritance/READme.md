# Inheritance (Pewarisan) dalam Java

## Deskripsi
Proyek ini mendemonstrasikan konsep **Inheritance** (pewarisan) dalam pemrograman berorientasi objek menggunakan Java. Inheritance memungkinkan sebuah class (child/subclass) mewarisi properti dan method dari class lain (parent/superclass).

## Struktur Proyek

```
com.inixindo_surabaya.javaprog.C3_inheritance/
├── Kendaraan.java      # Parent class (superclass)
├── Mobil.java          # Child class dari Kendaraan
├── Motor.java          # Child class dari Kendaraan
└── InheritanceApp.java # Main class untuk menjalankan program
```

## Penjelasan Class

### 1. Kendaraan.java (Parent Class)
Class ini merupakan **superclass** yang menjadi dasar bagi class turunannya.

**Atribut:**
- `merk` (String) - Merk kendaraan, menggunakan modifier `protected` agar bisa diakses oleh subclass
- `tahunProduksi` (int) - Tahun produksi kendaraan

**Method:**
- `Kendaraan(String merk, int tahunProduksi)` - Constructor untuk inisialisasi objek
- `info()` - Menampilkan informasi dasar kendaraan
- `nyalakan()` - Menampilkan pesan kendaraan dinyalakan

### 2. Mobil.java (Child Class)
Class yang **mewarisi** dari class Kendaraan dengan menambahkan properti spesifik untuk mobil.

**Atribut tambahan:**
- `jumlahPintu` (int) - Jumlah pintu mobil

**Method:**
- `Mobil(String merk, int tahunProduksi, int jumlahPintu)` - Constructor yang memanggil constructor parent menggunakan `super()`
- `info()` - Override method info() dari parent class, menampilkan informasi mobil yang lebih lengkap

### 3. Motor.java (Child Class)
Class yang **mewarisi** dari class Kendaraan dengan menambahkan properti dan behavior spesifik untuk motor.

**Atribut tambahan:**
- `jumlahRoda` (int) - Jumlah roda motor

**Method:**
- `Motor(String merk, int tahunProduksi, int jumlahRoda)` - Constructor yang memanggil constructor parent menggunakan `super()`
- `info()` - Override method info() dari parent class
- `wheelie()` - Method khusus untuk motor (menampilkan aksi wheelie)

### 4. InheritanceApp.java (Main Class)
Class yang berisi method `main()` untuk menjalankan program dan mendemonstrasikan penggunaan inheritance.

## Konsep Penting yang Digunakan

### 1. **extends**
Keyword untuk melakukan inheritance:
```java
public class Mobil extends Kendaraan
```

### 2. **super()**
Digunakan untuk memanggil constructor dari parent class:
```java
super(merk, tahunProduksi);
```

### 3. **@Override**
Annotation yang menandakan method tersebut meng-override method dari parent class:
```java
@Override
public void info() {
    super.info();
    System.out.println("Jumlah pintu: " + this.jumlahPintu);
}
```

### 4. **protected**
Access modifier yang memungkinkan atribut diakses oleh subclass:
```java
protected String merk;
```

## Cara Menjalankan Program

1. Compile semua file Java:
```bash
javac com/inixindo_surabaya/javaprog/C3_inheritance/*.java
```

2. Jalankan class InheritanceApp:
```bash
java com.inixindo_surabaya.javaprog.C3_inheritance.InheritanceApp
```

## Output Program

```
Kendaraan: Honda CB 150 R, Tahun produksi: 2012
Jumlah roda: 2
Motor melakukan sheelie!

Kendaraan: Mitsubishi Expander, Tahun produksi: 2010
Jumlah pintu: 4
Kendaraan dinyalakan..
```

## Keuntungan Inheritance

1. **Code Reusability** - Menghindari duplikasi kode dengan mewarisi properti dan method yang sudah ada
2. **Maintainability** - Perubahan pada parent class otomatis berlaku untuk child class
3. **Extensibility** - Mudah menambahkan fitur baru melalui inheritance
4. **Polymorphism** - Memungkinkan objek diperlakukan sebagai instance dari parent class

## Catatan Tambahan

- Dalam kode Motor.java terdapat typo pada output method `wheelie()`: "sheelie" seharusnya "wheelie"
- Java hanya mendukung **single inheritance** (satu class hanya bisa extend satu parent class)
- Semua class di Java secara implisit mewarisi dari class `Object`