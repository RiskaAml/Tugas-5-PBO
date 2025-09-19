# Data Transaksi Mobil Sport

Aplikasi **CRUD (Create, Read, Update, Delete)** untuk mengelola data transaksi mobil sport menggunakan **Java Swing (JFrame)** dan **PostgreSQL** sebagai database. Aplikasi ini dibuat menggunakan **NetBeans IDE** dengan tujuan praktik implementasi GUI dan koneksi database secara langsung.

---

## Fitur

1. **Insert Data**
   - Menambahkan transaksi baru ke database.
   - Input data: ID Transaksi, Merk Mobil, Harga, Tanggal Pembelian, Nama Pembeli.

2. **Update Data**
   - Mengubah data transaksi yang sudah ada.
   - Pilih data dari tabel lalu update fields yang diinginkan.

3. **Delete Data**
   - Menghapus transaksi berdasarkan ID.

4. **Read Data**
   - Menampilkan seluruh data transaksi dalam tabel.
   - Klik baris tabel untuk otomatis mengisi form input.

5. **Clear Form**
   - Membersihkan semua input form agar siap untuk entri data baru.

---

## Teknologi

- **Bahasa Pemrograman:** Java  
- **GUI Framework:** Swing (JFrame)  
- **Database:** PostgreSQL  
- **IDE:** NetBeans  
- **Library Pendukung:**  
  - `javax.swing.*`  
  - `java.sql.*`  
  - `java.util.logging.*`  
  - `net.proteanit.sql.DbUtils` (untuk menampilkan ResultSet ke JTable)

---

## Struktur Project
src/
└─ FormTransaksi/
├─ DataTransaksiMobil.java // JFrame utama dan GUI
├─ DbUtils.java // Utility konversi ResultSet ke JTable
