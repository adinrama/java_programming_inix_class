# Multiple Interface di Java

## Deskripsi
Repositori ini berisi contoh implementasi **multiple interface** dalam Java. Program mendemonstrasikan bagaimana sebuah class dapat mengimplementasikan lebih dari satu interface sekaligus, serta menunjukkan konsep polymorphism melalui interface.

## Struktur Project

```
com.inixindo_surabaya.javaprog.B3_multiple_interface/
├── Readable.java          # Interface untuk operasi membaca
├── Writable.java          # Interface untuk operasi menulis
├── Searchable.java        # Interface untuk operasi pencarian
├── Printable.java         # Interface untuk operasi cetak
├── Dokumen.java           # Class yang mengimplementasi 4 interface
├── Spreadsheet.java       # Class yang mengimplementasi 3 interface
└── MultiInterfaceApp.java # Main program
```

## Penjelasan Interface

### 1. Readable
Interface untuk objek yang dapat dibaca.
```java
public interface Readable {
    public String read();
    public int getPageCount();
}
```
- `read()`: Membaca konten
- `getPageCount()`: Mendapatkan jumlah halaman

### 2. Writable
Interface untuk objek yang dapat ditulis/diedit.
```java
public interface Writable {
    public void write(String content);
    public boolean canEdit();
}
```
- `write(String content)`: Menambah konten
- `canEdit()`: Mengecek apakah bisa diedit

### 3. Searchable
Interface untuk objek yang dapat dicari.
```java
public interface Searchable {
    public boolean search(String keyword);
    public int getSearchResults();
}
```
- `search(String keyword)`: Mencari kata kunci
- `getSearchResults()`: Mendapatkan jumlah hasil pencarian

### 4. Printable
Interface untuk objek yang dapat dicetak.
```java
public interface Printable {
    public void print();
    public String getFormat();
}
```
- `print()`: Mencetak konten
- `getFormat()`: Mendapatkan format file (PDF, XLSX, dll)

## Implementasi Class

### Class Dokumen
Mengimplementasikan **4 interface**: Readable, Writable, Searchable, Printable

**Fitur:**
- Menyimpan judul dan konten dokumen
- Menghitung jumlah halaman otomatis (1 halaman = 500 karakter)
- Dapat diedit atau dikunci (editable flag)
- Pencarian kata kunci (case-insensitive)
- Format: PDF

**Contoh Penggunaan:**
```java
Dokumen dok = new Dokumen("Laporan Tahunan", "Konten dokumen...");
System.out.println(dok.read());              // Membaca dokumen
dok.write("Tambahan konten");                // Menambah konten
boolean found = dok.search("laporan");       // Mencari kata
dok.print();                                 // Mencetak dokumen
```

### Class Spreadsheet
Mengimplementasikan **3 interface**: Readable, Writable, Printable

**Fitur:**
- Menyimpan data dalam bentuk tabel (array 2 dimensi)
- Dapat mengatur nilai per cell
- Format: XLSX

**Contoh Penggunaan:**
```java
Spreadsheet sheet = new Spreadsheet("Data Penjualan", 3, 3);
sheet.setCell(0, 0, "Bulan");
sheet.setCell(0, 1, "Penjualan");
sheet.print();
```

## Konsep yang Didemonstrasikan

### 1. Multiple Interface Implementation
Sebuah class dapat mengimplementasikan banyak interface:
```java
public class Dokumen implements Readable, Writable, Searchable, Printable {
    // Harus mengimplementasi semua method dari 4 interface
}
```

### 2. Polymorphism dengan Interface
Objek dapat diperlakukan sebagai tipe interface-nya:
```java
Printable[] items = {dok, sheet};  // Array tipe Printable
for (Printable item : items) {
    item.print();  // Memanggil method dari interface
}
```

### 3. Kontrak Interface
Setiap class yang mengimplementasikan interface **wajib** menyediakan implementasi semua method yang dideklarasikan dalam interface tersebut.

## Cara Menjalankan

1. **Compile semua file:**
   ```bash
   javac com/inixindo_surabaya/javaprog/B3_multiple_interface/*.java
   ```

2. **Jalankan program:**
   ```bash
   java com.inixindo_surabaya.javaprog.B3_multiple_interface.MultiInterfaceApp
   ```

## Output Program

Program akan menampilkan:
1. Demonstrasi operasi pada objek Dokumen (read, write, search, print)
2. Demonstrasi operasi pada objek Spreadsheet
3. Contoh polymorphism dengan menggunakan array bertipe interface Printable

## Keuntungan Multiple Interface

1. **Fleksibilitas**: Class dapat memiliki banyak "peran" atau "kemampuan"
2. **Reusability**: Interface dapat digunakan ulang di berbagai class
3. **Loose Coupling**: Kode bergantung pada interface, bukan implementasi konkret
4. **Polymorphism**: Objek dapat diperlakukan sebagai berbagai tipe interface
5. **Contract**: Interface mendefinisikan kontrak yang harus dipenuhi implementor

## Catatan Penting

- Java tidak mendukung multiple inheritance untuk class, tetapi **mendukung multiple interface implementation**
- Semua method dalam interface bersifat `public` dan `abstract` secara default
- Class yang mengimplementasikan interface harus menyediakan implementasi untuk **semua method** atau dideklarasikan sebagai `abstract`

## Pembelajaran

Project ini cocok untuk memahami:
- Konsep interface di Java
- Multiple interface implementation
- Polymorphism dengan interface
- Separation of concerns
- Contract-based programming

## Author
Inixindo Surabaya - Java Programming Course

## Lisensi
Educational Purpose