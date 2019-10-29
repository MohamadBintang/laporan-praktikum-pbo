# Laporan Praktikum #9_Abstract_Class_dan_Interface

## Kompetensi

Setelah menyelesaikan lembar kerja ini mahasiswa diharapkan mampu: 
1. Menjelaskan maksud dan tujuan penggunaan Abstract Class; 
2. Menjelaskan maksud dan tujuan penggunaan Interface; 
3. Menerapkan Abstract Class dan Interface di dalam pembuatan program. 

## Ringkasan Materi

### Pendahuluan


## Percobaan

### Percobaan 1  Abstract Class 

#### Hewan 

![hewan](img/hewan.PNG)
[Hewan1841720007Bintang(../../src/9_Abstract_Class_dan_Interface/Hewan1841720007Bintang.java)

#### Kucing

![kucing1](img/kucing.PNG)

[Kucing1841720007Bintang](../../src/9_Abstract_Class_dan_Interface/Kucing1841720007Bintang.java)

#### Ikan

![ikan](img/ikan.PNG)

[Ikan1841720007Bintang](../../src/9_Abstract_Class_dan_Interface/Ikan1841720007Bintang.java)

#### Orang

![Orang](img/orang.PNG)

[Orang1841720007Bintang](../../src/9_Abstract_Class_dan_Interface/Orang1841720007Bintang.java)

#### Program main

![program](img/program.PNG)

[Program1841720007Bintang](../../src/9_Abstract_Class_dan_Interface/Program1841720007Bintang.java)

#### Pertanyaan

Bolehkah apabila sebuah class yang meng-extend suatu abstract class tidak mengimplementasikan method abstract yang ada di class induknya? Buktikan!
jawab :
Tidak 
![pertanyaan1]

### Percobaan 2 Interface 

#### ICumlaude 

![icumlaude](img/ICumlaude.PNG)
[ICumlaude1841720007Bintang](../../src/9_Abstract_Class_dan_Interface/Icumlaude1841720007Bintang.java)

#### Mahasiswa

![mahasiswa](img/mahasiswa.PNG)

[Mahasiswa1841720007Bintang](../../src/9_Abstract_Class_dan_Interface/Mahasiswa18417200007Bintang.java)

#### Sarjana

![sarjana1](img/sarjana.PNG)

[Sarjana1841720007Bintang](../../src/9_Abstract_Class_dan_Interface/Sarjana1841720007Bintang.java)

#### Pascasarjana

![pascasarjana](img/PascaSarjana.PNG)

[PascaSarjana1841720007Bintang](../../src/9_Abstract_Class_dan_Interface/PascaSarjana1841720007Bintang.java)

#### Rektor

![rektor](img/rektor.PNG)

[Rektor1841720007Bintang](../../src/9_Abstract_Class_dan_Interface/Rektor1841720007Bintang.java)

#### Program main

![program2](img/program2.PNG)

[Program2_18417200007Bintang](../../src/9_Abstract_Class_dan_Interface/Program2_18417200007Bintang.java)

#### Pertanyaan

a. Mengapa pada langkah nomor 9 terjadi error? Jelaskan!

jawab:

Karena dari class Mahasiswa tidak mengimplementasikan interface ICumlaude

b. Dapatkah method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class Program? Mengapa demikian?  

jawab :

Bisa, karena class Sarjana adalah child dari class Mahasiswa

c. Dapatkah method kuliahDiKampus() dipanggil dari parameter mahasiswa di method beriSertifikatCumlaude() pada class Rektor? Mengapa demikian? 

jawab :

Tidak, karena tidak ada abstract method pada interface ICumaloud

d. Modifikasilah method beriSertifikatCumlaude() pada class Rektor agar hasil eksekusi class Program menjadi seperti berikut ini: 

jawab :


### Percobaan 3 Multiple Interfaces Implementation 

#### IBerprestasi

![iberprestasi](img/iBerprestasi.PNG)
[IBerprestasi1841720007Bintang](../../src/9_Abstract_Class_dan_Interface/IBerprestasi1841720007Bintang.java)

#### Pascasarjana2

![pascasarjana2](img/pascasarjana2.PNG)

[Pascasarjana2_18417200007Bintang(../../src/9_Abstract_Class_dan_Interface/Pascasarjana2_1841720007Bintang.java)

#### Rektor

![rektor2](img/rektor.PNG)

[Rektor1841720007Bintang](../../src/9_Abstract_Class_dan_Interface/Rektor1841720007Bintang.java)

#### Pascasarjana

![pascasarjana](img/pascasarjana.PNG)

[PascaSarjana1841720007Bintang](../../src/9_Abstract_Class_dan_Interface/PascaSarjana1841720007Bintang.java)

#### Program main

![program3](img/program3.PNG)

[Program3_1841720007Bintang](../../src/9_Abstract_Class_dan_Interface/Program3_1841720007Bintang.java)

#### Pertanyaan

1. Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan menerbitkan artikel di jurnal NASIONAL, maka modifikasilah class-class yang terkait pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat mawapres pada objek sarjanaCumlaude. 

jawab :

![pertanyaan3](img/program3.PNG)

## Kesimpulan

Abstract Class adalah sebuah class yang tidak bisa di-instansiasi (tidak bisa dibuat menjadi objek) dan berperan sebagai 'kerangka dasar' bagi class turunannya. Di dalam abstract class umumnya akan memiliki abstract method.  Interface adalah sebuah tipe referensi pada Java. Interface secara struktur serupa dengan class. Isi dari interface adalah method abstract 

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,



***(Mohamad Bintang Satriavi)***

