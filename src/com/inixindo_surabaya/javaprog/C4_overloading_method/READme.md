# Method Overloading di Java

## Deskripsi
Repository ini berisi contoh implementasi **Method Overloading** dalam bahasa pemrograman Java. Method overloading adalah fitur dalam Java yang memungkinkan kita membuat beberapa method dengan nama yang sama tetapi dengan parameter yang berbeda (jumlah parameter, tipe data parameter, atau urutan parameter).

## Struktur Project
```
com.inixindo_surabaya.javaprog.C4_overloading_method/
├── Kalkulator.java
└── KalkulatorApp.java
```

## Penjelasan Source Code

### 1. Kalkulator.java
File ini berisi class `Kalkulator` yang mendemonstrasikan konsep method overloading dengan method `tambah()`.

**Method-method yang di-overload:**

- `public int tambah(int a, int b)`
  - Menjumlahkan dua bilangan integer
  - Return type: `int`

- `public int tambah(int a, int b, int c)`
  - Menjumlahkan tiga bilangan integer
  - Return type: `int`

- `public double tambah(double a, double b)`
  - Menjumlahkan dua bilangan double (desimal)
  - Return type: `double`

- `public int tambah(String a, String b)`
  - Menjumlahkan dua angka dalam bentuk String
  - Menggunakan `Integer.parseInt()` untuk konversi String ke integer
  - Return type: `int`

### 2. KalkulatorApp.java
File ini berisi class `KalkulatorApp` dengan method `main()` yang berfungsi untuk menjalankan dan menguji semua method overloading yang ada di class `Kalkulator`.

**Output program:**
```
5 + 8 = 13
3 + 5 + 12 = 20
12 + 16 = 28
```

## Konsep Method Overloading

Method overloading memiliki karakteristik berikut:

1. **Nama method sama** - Semua method menggunakan nama `tambah`
2. **Parameter berbeda** - Setiap method memiliki signature parameter yang berbeda:
   - Jumlah parameter berbeda (2 parameter vs 3 parameter)
   - Tipe data parameter berbeda (int vs double vs String)
3. **Return type boleh sama atau berbeda** - Namun return type saja tidak cukup untuk membedakan overloaded method
4. **Compile-time polymorphism** - Java compiler menentukan method mana yang dipanggil berdasarkan argumen yang diberikan saat compile time

## Cara Menjalankan

1. Pastikan Java Development Kit (JDK) sudah terinstall
2. Compile kedua file Java:
   ```bash
   javac com/inixindo_surabaya/javaprog/C4_overloading_method/Kalkulator.java
   javac com/inixindo_surabaya/javaprog/C4_overloading_method/KalkulatorApp.java
   ```
3. Jalankan program:
   ```bash
   java com.inixindo_surabaya.javaprog.C4_overloading_method.KalkulatorApp
   ```

## Keuntungan Method Overloading

- **Readability** - Kode lebih mudah dibaca dengan menggunakan nama method yang sama untuk operasi serupa
- **Flexibility** - Memberikan fleksibilitas dalam memanggil method dengan berbagai tipe dan jumlah parameter
- **Reusability** - Meningkatkan reusability kode dengan menyediakan berbagai cara untuk melakukan operasi yang sama

## Catatan Penting

- Method overloading berbeda dengan method overriding (yang digunakan dalam inheritance)
- Java tidak mendukung method overloading hanya berdasarkan return type
- Parameter harus berbeda dalam hal jumlah, tipe, atau urutan

## Lisensi
Materi pembelajaran dari Inixindo Surabaya

---
**Dibuat untuk tujuan pembelajaran Java Programming**