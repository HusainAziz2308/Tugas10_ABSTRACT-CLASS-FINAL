# Tugas 10 - Interface
## Identitas
- Nama  : Husain Aziz Al Rosyid
- NIM   : 4124031
- Kelas : A

## Tujuan Pembelajaran
Pada praktikum ini, mahasiswa diharapkan mampu:
1.	Memahami konsep `Abstract Class` di Java.
2.	Memahami penggunaan keyword `final`.
3.	Mengimplementasikan penggunaan abstract class dan keyword final dalam kode program Java.

## Dasar Teori
**1. Abstract Class**

Abstract class adalah kelas yang tidak dapat diinstansiasi, digunakan untuk menyediakan kerangka dasar bagi class turunannya. Abstract class dapat memiliki abstract method (method tanpa implementasi) dan concrete method (method dengan implementasi).

**Aturan dalam Abstract Class:**
- Abstract class harus dideklarasikan dengan keyword `abstract`.
- Abstract method hanya mendeklarasikan signature tanpa body.
- Kelas turunan wajib mengimplementasikan abstract method dari abstract class.
- Abstract class dapat memiliki constructor, field, dan method yang tidak abstract.

**Sintaks Abstract Class:**
```
public abstract class NamaClass {
    public abstract void namaMethod(); // Abstract Method
    public void methodBiasa() {
        // Concrete Method
    }
}
```
**2. Keyword Final**

Keyword `final` digunakan untuk mencegah perubahan pada elemen yang diterapkan, seperti:
- Final Variable: Nilainya tidak dapat diubah setelah diinisialisasi.
- Final Method: Tidak dapat di-override di subclass.
- Final Class: Tidak dapat diwarisi (inherited).

**Sintaks Keyword Final:**
```
final class NamaFinalClass {
    final int nilai = 10; // Variable final

    final void namaMethod() {
        // Method final
    }
}
```

## Implementasi Program

**C. Latihan**

[TestAnimal.java](TestAnimal.java)

**D. TUGAS**

[WeaponProgram.java](WeaponProgram.java)

## Kesimpulan
Melalui praktikum ini, mahasiswa memahami:
1.	Konsep abstract class sebagai kerangka dasar untuk class turunan.
2.	Penggunaan keyword final untuk mencegah perubahan pada variabel, method, atau class.
3.	Implementasi kode program berbasis konsep object-oriented.

Praktikum ini juga menunjukkan pentingnya pengujian dan validasi untuk memastikan program berjalan dengan benar sesuai desain awal. Selain itu, praktikum ini memberikan wawasan mengenai bagaimana merancang kode yang lebih modular dan terstruktur menggunakan pendekatan berbasis object-oriented. Dengan pemahaman ini, mahasiswa diharapkan mampu menerapkan konsep abstract class dan keyword final untuk memecahkan masalah pemrograman yang lebih kompleks di masa depan.
