# Immutability di Java

## Deskripsi
Repositori ini berisi contoh implementasi konsep **immutability** (ketidakberubahan) dalam pemrograman Java. Immutability adalah prinsip desain dimana objek tidak dapat diubah setelah dibuat, sehingga meningkatkan keamanan, kemudahan debugging, dan thread-safety dalam aplikasi.

## Struktur File

```
com.inixindo_surabaya.javaprog.C2_immutability/
├── Tanggal.java       # Kelas immutable untuk merepresentasikan tanggal
└── TanggalApp.java    # Aplikasi demo penggunaan kelas Tanggal
```

## Penjelasan Kode

### 1. Kelas `Tanggal.java`

Kelas ini merupakan contoh implementasi **immutable class** dengan karakteristik berikut:

#### Atribut Final
```java
private final int hari;
private final int bulan;
private final int tahun;
```
Semua atribut dideklarasikan sebagai `final`, artinya nilai mereka hanya dapat diinisialisasi sekali melalui constructor dan tidak dapat diubah setelahnya.

#### Constructor
```java
public Tanggal(int hari, int bulan, int tahun) {
    this.hari = hari;
    this.bulan = bulan;
    this.tahun = tahun;
}
```
Constructor menginisialisasi semua atribut final saat objek dibuat.

#### Getter Methods
Kelas ini hanya menyediakan getter methods tanpa setter methods:
- `getHari()` - mengembalikan nilai hari
- `getBulan()` - mengembalikan nilai bulan
- `getTahun()` - mengembalikan nilai tahun

Tidak adanya setter memastikan objek tidak dapat dimodifikasi dari luar kelas.

#### Method `tambahHari()`
```java
public Tanggal tambahHari(int jumlah) {
    return new Tanggal(getHari() + jumlah, getBulan(), getTahun());
}
```
Ini adalah pola kunci dalam immutable class. Alih-alih mengubah objek yang ada, method ini **membuat dan mengembalikan objek baru** dengan nilai yang telah dimodifikasi. Objek asli tetap tidak berubah.

#### Method `toString()`
Method ini meng-override method `toString()` dari kelas Object untuk memberikan representasi string yang mudah dibaca.

### 2. Kelas `TanggalApp.java`

Kelas aplikasi ini mendemonstrasikan penggunaan immutable class:

```java
Tanggal tanggal1 = new Tanggal(15, 8, 2025);
System.out.println(tanggal1.toString());  // Output: 15/8/2025

Tanggal tanggal2 = tanggal1.tambahHari(2);
System.out.println(tanggal2.toString());  // Output: 17/8/2025
```

Perhatikan bahwa:
- `tanggal1` tetap bernilai `15/8/2025` setelah pemanggilan `tambahHari()`
- `tanggal2` adalah objek baru yang berbeda dengan nilai `17/8/2025`
- Objek `tanggal1` tidak berubah (immutable)

## Output Program

```
15/8/2025
17/8/2025
```

## Keuntungan Immutability

1. **Thread-Safe**: Objek immutable secara otomatis thread-safe karena tidak ada state yang bisa berubah
2. **Mudah Di-cache**: Nilai objek tidak akan berubah, sehingga aman untuk di-cache atau di-share
3. **Mudah Dipahami**: Kode lebih mudah dipahami karena objek tidak berubah setelah dibuat
4. **Mencegah Bug**: Menghindari bug yang disebabkan oleh modifikasi objek yang tidak diinginkan
5. **Dapat Digunakan sebagai Key**: Objek immutable aman digunakan sebagai key dalam HashMap atau HashSet

## Cara Menjalankan

1. Compile kedua file Java:
```bash
javac com/inixindo_surabaya/javaprog/C2_immutability/*.java
```

2. Jalankan aplikasi:
```bash
java com.inixindo_surabaya.javaprog.C2_immutability.TanggalApp
```

## Catatan Implementasi

Implementasi ini adalah contoh sederhana dan belum mencakup validasi tanggal (misalnya memastikan hari tidak melebihi 31, bulan antara 1-12, dll). Dalam implementasi production, validasi tersebut harus ditambahkan di constructor.

## Referensi

Contoh immutable class lainnya dalam Java Standard Library:
- `String`
- `Integer`, `Long`, `Double` (wrapper classes)
- `LocalDate`, `LocalDateTime` (Java 8+)
- `BigInteger`, `BigDecimal`

---

**Dibuat untuk tujuan pembelajaran di Inixindo Surabaya**