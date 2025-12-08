# Overriding Object Methods di Java

Repository ini berisi contoh implementasi overriding method-method dari class `Object` di Java, khususnya `toString()`, `equals()`, dan `hashCode()`.

## 📁 Struktur File

```
com.inixindo_surabaya.javaprog.D6_overriding_object_methods/
├── Mahasiswa.java
└── MahasiswaApp.java
```

## 📖 Penjelasan Konsep

### 1. Class Object di Java

Setiap class di Java secara implisit merupakan subclass dari `Object`. Class `Object` memiliki beberapa method yang sering di-override:

- `toString()` - Menghasilkan representasi string dari objek
- `equals(Object obj)` - Membandingkan kesamaan dua objek
- `hashCode()` - Menghasilkan nilai hash untuk objek

### 2. Mengapa Perlu Override?

Implementasi default dari method-method tersebut di class `Object` seringkali tidak sesuai dengan kebutuhan:

- `toString()` default hanya menampilkan nama class dan hash code
- `equals()` default hanya membandingkan referensi objek (==)
- `hashCode()` default menghasilkan nilai berdasarkan alamat memori

## 💻 Detail Implementasi

### Class Mahasiswa.java

Class ini merepresentasikan data mahasiswa dengan tiga atribut:

```java
private String nim;
private String nama;
private double ipk;
```

#### Override toString()

Method ini menghasilkan representasi string yang mudah dibaca dari objek `Mahasiswa`:

```java
@Override
public String toString() {
    return "Mahasiswa{" +
            "NIM='" + nim + '\'' +
            ", Nama='" + nama + '\'' +
            ", IPK=" + ipk +
            '}';
}
```

**Kegunaan:** Memudahkan debugging dan logging dengan output yang informatif.

#### Override equals()

Method ini membandingkan dua objek `Mahasiswa` berdasarkan NIM:

```java
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    
    Mahasiswa mahasiswa = (Mahasiswa) obj;
    return nim.equals(mahasiswa.nim);
}
```

**Logika:**
1. Cek apakah referensi sama (optimasi)
2. Cek apakah objek null atau tipe berbeda
3. Cast ke `Mahasiswa` dan bandingkan NIM
4. Dua mahasiswa dianggap sama jika NIM-nya sama

#### Override hashCode()

Method ini menghasilkan hash code berdasarkan NIM:

```java
@Override
public int hashCode() {
    return nim.hashCode();
}
```

**Penting:** Ketika override `equals()`, **wajib** override `hashCode()` juga. Kedua objek yang equals harus memiliki hash code yang sama.

### Class MahasiswaApp.java

Class ini berisi demonstrasi penggunaan method-method yang telah di-override:

#### 1. Demonstrasi toString()

```java
System.out.println(mhs1);  // Otomatis memanggil toString()
```

Output:
```
Mahasiswa{NIM='12345', Nama='Budi', IPK=3.5}
```

#### 2. Demonstrasi equals()

```java
mhs1.equals(mhs2);  // false (NIM berbeda)
mhs1.equals(mhs3);  // true (NIM sama: "12345")
```

Meskipun nama dan IPK berbeda, `mhs1` dan `mhs3` dianggap sama karena NIM-nya sama.

#### 3. Demonstrasi hashCode()

```java
mhs1.hashCode() == mhs3.hashCode()  // true
```

Karena NIM sama, hash code juga sama.

#### 4. Demonstrasi di HashSet

```java
Set<Mahasiswa> setMahasiswa = new HashSet<>();
setMahasiswa.add(mhs1);  // Ditambahkan
setMahasiswa.add(mhs2);  // Ditambahkan
setMahasiswa.add(mhs3);  // TIDAK ditambahkan (duplikat mhs1)
```

`HashSet` menggunakan `hashCode()` dan `equals()` untuk mendeteksi duplikasi. Karena `mhs3` memiliki NIM yang sama dengan `mhs1`, maka dianggap duplikat dan tidak ditambahkan.

## 🎯 Output Program

```
=== toString() ===
Mahasiswa{NIM='12345', Nama='Budi', IPK=3.5}
Mahasiswa{NIM='67890', Nama='Ani', IPK=3.8}

=== equals() ===
mhs1 equals mhs2: false
mhs1 equals mhs3: true

=== hashCode() ===
HashCode mhs1: 1567810
HashCode mhs2: 2047526
HashCode mhs3: 1567810

=== HashSet Demo ===
Jumlah mahasiswa di set: 2
Mahasiswa{NIM='12345', Nama='Budi', IPK=3.5}
Mahasiswa{NIM='67890', Nama='Ani', IPK=3.8}
```

## 📚 Poin Penting

### Kontrak equals() dan hashCode()

1. **Konsistensi:** Jika `a.equals(b)` true, maka `a.hashCode() == b.hashCode()` harus true
2. **Sebaliknya tidak wajib:** Jika hash code sama, equals tidak harus true (hash collision)
3. **Immutability:** Jika field yang digunakan untuk equals/hashCode berubah, behavior collection bisa error

### Best Practices

1. **Selalu override keduanya:** Jika override `equals()`, wajib override `hashCode()`
2. **Gunakan field yang immutable:** Untuk perhitungan equals dan hashCode
3. **Pertimbangkan semua field relevan:** Atau gunakan business key seperti NIM
4. **Test null safety:** Pastikan tidak terjadi `NullPointerException`
5. **Gunakan IDE generator:** IntelliJ IDEA dan Eclipse bisa generate method ini otomatis

## 🔧 Cara Menjalankan

```bash
# Compile
javac com/inixindo_surabaya/javaprog/D6_overriding_object_methods/*.java

# Run
java com.inixindo_surabaya.javaprog.D6_overriding_object_methods.MahasiswaApp
```

## 📝 Latihan

1. Modifikasi `equals()` untuk membandingkan semua field (NIM, nama, dan IPK)
2. Tambahkan method `compareTo()` untuk sorting berdasarkan IPK
3. Implementasikan pattern Builder untuk membuat objek Mahasiswa
4. Gunakan `Objects.equals()` dan `Objects.hash()` untuk implementasi yang lebih aman

## 📖 Referensi

- [Java Object Class Documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html)
- Effective Java by Joshua Bloch - Item 10: Obey the general contract when overriding equals
- Effective Java by Joshua Bloch - Item 11: Always override hashCode when you override equals

---

**Catatan:** Contoh ini menggunakan NIM sebagai identifier unik. Dalam aplikasi real-world, pertimbangkan menggunakan UUID atau auto-generated ID dari database.