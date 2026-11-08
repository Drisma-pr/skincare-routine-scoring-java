# skincare-routine-scoring-java
Program penilaian rutinitas skincare berbasis Java dengan konsep Object Oriented Programming (OOP)
# Implementasi OOP pada Sistem Penilaian Rutinitas Skincare Berbasis Java

Program ini dibuat untuk memenuhi Tugas E-Learning mata kuliah Pemrograman Berorientasi Objek.

Program ini mensimulasikan rutinitas skincare harian dan memberikan penilaian (skor) berdasarkan tahapan yang dilakukan.

### Konsep OOP yang Diterapkan
- **Class:** Main, SabunCuciMuka, Toner, Serum, Moisturizer, Sunscreen
- **Object:** 5 objek skincare yang diinstansiasi menggunakan Constructor
- **Attribute:** merek (String), harga (int), ukuranMl (int)
- **Method:** cuciMuka(), tuang(), tetes(), oles(), pakai()

### Cara Menjalankan
1. Buka file `Main.java`
2. Compile: `javac Main.java`
3. Jalankan: `java Main`

### Cara Mengubah Simulasi
Ubah nilai `true` / `false` pada bagian Main untuk mengubah tahapan yang dilakukan.
- `true` = tahapan dilakukan
- `false` = tahapan dilewatkan
