# Intent_Result

<a href="https://www.fsf.org">
	<img align="right" src="https://github.com/rendiwibawa/Layout_dan_Intent/blob/master/ezgif.com-gif-maker%20(3).gif">
</a>

### 🌱 Macam-macam Layout?
- ✔️LinearLayout.
LinearLayout adalah susunan tata letak yang paling simple dapat digunakan para
developer android. Karena layout ini hanya memberikan susunan tata letak komponen secara
garis lurus. Bisa secara horizontal maupun vertical.

- ✔️RelativeLayout.
Untuk relativelayout kita bisa mengaturnya mengikuti komponen lainnya, semisal ada
komponen A, B, dan C maka kita bisa mengaturnya seperti , A berada dibawah B, dan C berada
di samping kanan/kiri A dan sebagainya. Intinya adalah komponen satu dan lainnya saling
berkaitan.

- ✔️ConstraintLayout.
adalah sebuah ViewGroup yang dapat kita gunakan untuk menyusun View kita. 
Ini lebih fleksibel tanpa adanya nested layout. Seperti menggunakan RelativeLayout 
di mana semua tampilan ditata seperti sibling views dan parent layout, 
tetapi lebih fleksibel dibandingkan dengan 
RelativeLayout. 

### 💻 component App  :
- [x]	Intent
- [x]	Layout (Relative,Linear,Constraint)

### 🤳 Macam macam method dan urutan livecycle.
- 🎇Method onCreate()
adalah kondisi awal saat Activity baru diciptakan, biasanya dilakukan inisialisasi pada tahapan ini.
Untuk menginisiasi suatu activity, biasanya dipanggil dengan perintah
setContentView(int) untuk resource yang didefinisikan di layout UI, dengan perintah
findViewById(int) untuk memanggil widget yang dibutuhkan UI untuk berinteraksi dengan
aplikasi.

- 🎇Method onStart() 
Ketika aktivitas memasuki status Dimulai, sistem memanggil callback ini. Panggilan onStart()
membuat aktivitas terlihat oleh pengguna, saat aplikasi mempersiapkan aktivitas untuk memasuki latar depan 
dan menjadi interaktif. Misalnya, metode ini adalah tempat aplikasi menginisialisasi kode yang mengelola UI.

- 🎇Method onResume() 
Setelah aktivitas memasuki status Dilanjutkan, aktivitas tersebut masuk ke latar depan, 
kemudian sistem memanggil callback onResume(). Ini adalah status saat aplikasi berinteraksi dengan pengguna. 
Aplikasi tetap dalam status ini sampai terjadi sesuatu untuk mengambil fokus dari aplikasi. 
Peristiwa yang terjadi misalnya adalah menerima panggilan telepon, pengguna beralih ke aktivitas lain, 
atau layar perangkat mati.

- 🎇Method onPause()
Untuk menyatakan ketika user meninggalkan suatu activity. Untuk penggunaan
dengan Context.StartActivity(), Sistem akan memanggil metode ini sebagai indikasi pertama 
bahwa pengguna meninggalkan aktivitas Anda (meskipun tidak selalu berarti aktivitas sedang ditutup); 
hal ini menunjukkan bahwa aktivitas tidak lagi di latar depan (meskipun mungkin masih terlihat jika 
pengguna berada dalam mode multi-jendela).

- 🎇Method onStop() 
adalah kondisi saat Activity tidak ditampilkan dilayar (biasanya saat pengguna menekan tombol Home).
Ini dapat terjadi, misalnya, ketika aktivitas yang baru diluncurkan menutupi seluruh layar. 
Sistem juga dapat memanggil onStop() ketika aktivitas telah selesai berjalan, dan akan segera dihentikan.

- 🎇Method onRestart() 
adalah kondisi saat Activity kembali dibuka oleh pengguna.Jika aktivitas kembali di lakukan, sistem akan memanggil onRestart().
Jika Activity selesai berjalan, sistem akan memanggil onDestroy(). Bagian selanjutnya menjelaskan callback onDestroy().

- 🎇Method onDestroy() 
adalah kondisi saat Activity dihancurkan pada memori.Saat aktivitas berpindah ke status ditutup, 
komponen berbasis siklus proses apa pun yang terkait dengan siklus proses aktivitas akan menerima 
peristiwa ON_DESTROY. Di sinilah komponen siklus proses dapat membersihkan 
apa pun yang diperlukan sebelum Aktivitas ditutup.


<p align="center">
  <a <code><img width="10%" src="https://www.vectorlogo.zone/logos/java/java-ar21.svg"></code>
  </a>
  <a <code><img width="10%" src="https://www.vectorlogo.zone/logos/android/android-ar21.svg"></code>
  </a>
  <a <code><img width="10%" src="https://www.vectorlogo.zone/logos/gradle/gradle-ar21.svg"></code>
  </a>
</p>





