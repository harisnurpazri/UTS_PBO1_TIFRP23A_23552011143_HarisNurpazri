# UTS Pemrograman Berorientasi Obyek 1
<ul>
  <li>Mata Kuliah: Pemrograman Berorientasi Obyek 1</li>
  <li>Dosen Pengampu: <a href="https://github.com/Muhammad-Ikhwan-Fathulloh">Muhammad Ikhwan Fathulloh</a></li>
</ul>

## Profil
<ul>
  <li>Nama: Haris Barcode</li>
  <li>NIM: 23552011143</li>
  <li>Studi Kasus: Sistem Informasi Akademik</li>
</ul>

## Judul Studi Kasus
<p>Sistem Informasi Akademik</p>

## Penjelasan Studi Kasus
<p>Sistem Informasi Akademik merupakan sistem pengelolaan civitas akademika yaitu : 

- Registrasi civitas akademika yaitu dosen, mahasiswa dan staf administrasi
- Perhitungan nilai IP dari mahasiswa dari matak kuliah dalam satu semester
- Manajemen jadwal dan penambahan jadwal mengajar dosen
- Penambahan absen
- Menampilkan laporan akademik</p>


## Penjelasan 4 Pilar OOP dalam Studi Kasus

### 1. Inheritance
<p>CivitasAkademika mewarisi Sivitas dan menambahkan atribut yaitu jadwal, metode hitungNilai() serta absen().</p>
<p>Class dosen, mahasiswa dan staf administrasi mewarisi CivitasAkademika dan setiap kelas ini mendapatkan atribut dan metode dari CivitasAkademika</p>

### 2. Encapsulation
<p>Encapsulation diterapkan pada atribut dalam kelas nama, id dan status dikelas Sivitas dikelola melalui getter dan setter.</p>
<p>Clas CivitasAkademika, atribut jadwal menggunakan metode getter dan setter</p>

### 3. Polymorphism
<p>Polymophism terjadi pada saat objek berbeda yaitu dosen, mahasiswa dan staf administrasi mengimplementasikan metode yang sama dengan cara yang berbeda</p>
<p>metode absen() dan tampilLaporanAkademik() diubah disetiap kelas untuk memberikan perilaku yang berbeda tergantung pada tipe data yang memanggilnya</p>

### 4. Abstract
<p>Class Sivitas menjadi kelas abstract yang mendefinisikan absen() dan tampilkanLaporanAkademik() namun tidak mengimplementasikan logika spesifik. Kelas CivitasAkademika dan turunannya (dosen, mahasiswa dan staf administrasi) mengimplementasikan metode ini.</p>
<p>Abstract CivitasAkademika yang mendeklarasikan metode abstrak seperti hitungNilai() yang harus diimplementasikan oleh setiap subsclass</p>

## Demo Proyek
<ul>
  <li>Github: <a href="https://github.com/harisnurpazri/UTS_PBO1_TIFRP23A_23552011143_HarisNurpazri/tree/main">Github</a></li>
  <li>Youtube: <a href="">Youtube</a></li>
</ul>
