# LATIHAN STUDI KASUS - OOP JAVA
## (Method Overloading, instanceof, Polimorfisme)

---

## 🏥 STUDI KASUS: SISTEM MANAJEMEN RUMAH SAKIT

### Deskripsi:
Buatlah sistem manajemen rumah sakit yang menangani berbagai tipe pasien dan layanan medis.

### Requirements:

#### 1. **Class Hierarchy (Polimorfisme)**
- Buat abstract class `Pasien` dengan:
  - Atribut: `nomorRM`, `nama`, `umur`, `jenisKelamin`
  - Abstract method: `hitungBiayaPengobatan()`, `getDiagnosa()`
  - Concrete method: `tampilkanInfoPasien()`

- Buat 3 child class:
  - **PasienRawatJalan**: 
    - Atribut: `poliklinik`, `dokterPenanggungjawab`, `jumlahKunjungan`
    - Biaya: Rp 150.000 per kunjungan
  - **PasienRawatInap**: 
    - Atribut: `nomorKamar`, `jenisKamar` (VIP/Kelas 1/Kelas 2), `lamaMenginap` (hari)
    - Biaya: VIP=Rp 1.000.000/hari, Kelas 1=Rp 500.000/hari, Kelas 2=Rp 250.000/hari
  - **PasienGawatDarurat**: 
    - Atribut: `tingkatKegawatan` (1-5), `tindakan`, `ambulance` (boolean)
    - Biaya: base Rp 500.000 + (tingkatKegawatan × Rp 200.000) + ambulance Rp 300.000

#### 2. **Class Hospital dengan Method Overloading**
Buat class `Hospital` dengan method overloading `daftarPasien()`:
- `daftarPasien(Pasien pasien)` - daftar 1 pasien
- `daftarPasien(String nama, int umur, String jenisKelamin, String tipePasien)` - daftar pasien baru langsung
- `daftarPasien(Pasien[] daftarPasien)` - daftar multiple pasien dari array
- `daftarPasien(Pasien pasien, boolean prioritas)` - daftar dengan prioritas

#### 3. **Implementasi instanceof**
Buat method `generateLaporan()` yang menggunakan instanceof untuk:
- Hitung total pasien per kategori (Rawat Jalan/Rawat Inap/Gawat Darurat)
- Hitung total pendapatan per kategori
- Identifikasi pasien dengan biaya pengobatan tertinggi
- Generate daftar pasien yang perlu follow-up (Rawat Inap > 7 hari, atau Gawat Darurat tingkat 4-5)

#### 4. **Demonstrasi Polimorfisme**
- Array `Pasien[]` berisi berbagai tipe pasien
- Method `prosesPembayaran(Pasien pasien)` yang handle semua tipe
- Virtual method invocation untuk `hitungBiayaPengobatan()`

### Output yang Diharapkan:
```
=== SISTEM MANAJEMEN RUMAH SAKIT ===

[PENDAFTARAN PASIEN]
✓ Pasien Rawat Jalan terdaftar: Budi (RM: RJ001)
✓ Pasien Rawat Inap terdaftar: Ani (RM: RI001) - Kamar VIP
✓ Pasien Gawat Darurat terdaftar: Citra (RM: GD001) - Tingkat 5

[LAPORAN RUMAH SAKIT]
Total Pasien Rawat Jalan: 15 pasien
Total Pasien Rawat Inap: 8 pasien  
Total Pasien Gawat Darurat: 3 pasien

Total Pendapatan:
- Rawat Jalan: Rp 15.000.000
- Rawat Inap: Rp 45.000.000
- Gawat Darurat: Rp 8.500.000

Pasien Perlu Follow-up:
- Ani (Rawat Inap 10 hari)
- Citra (Gawat Darurat Tingkat 5)
```
