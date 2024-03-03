package com.example.proyekakhirsederhana

object UniData {

    private val uniName = arrayOf("Universitas Indonesia",
        "Institut Pertanian Bogor",
        "Institut Teknologi Bandung",
        "Universitas Gajah Mada",
        "Universitas Andalas",
        "Universitas Pendidikan Indonesia",
        "Universitas Diponogoro",
        "Universitas Padjajaran",
        "Universitas Negeri Padang",
        "Universitas Hassanudding",
        "Universitas Brawijaya")

    private val uniDetaisl = arrayOf("Sejarah Universitas Indonesia dimulai dari tahun 1849, saat Pemerintah Kolonial Belanda membangun sebuah sekolah tinggi ilmu kesehatan. Nama UI sendiri baru resmi digunakan sejak tahun 1950, itupun masih menggunakan bahasa Belanda, yakni Universiteit Indonesia.\nSaat ini, UI memiliki 14 fakultas, dengan lebih dari 291 program studi.Menjadi universitas terbaik di Indonesia, menjadikan UI sebagai tujuan favorit untuk melanjutkan pendidikan tinggi. Tingkat persaingan untuk masuk ke UI juga terbilang sangat ketat lho. Setiap tahunnya, rata-rata persentase pendaftar dan diterima untuk program S1 Reguler berada pada kisaran 3%.",
        "Institut Pertanian Bogor merupakah Perguruan Tinggi Negeri yang berlokasi di Bogor, Jawa Barat. IPB diresmikan pada tahun 1963, yang mana sebelum itu IPB merupakan sebuah fakultas pertanian di Universitas Indonesia.",
        "Institut Teknologi Bandung adalah sebuah perguruan tinggi negeri yang berkedudukan di Kota Bandung. Nama ITB diresmikan pada tanggal 2 Maret 1959. Sejak tanggal 14 Oktober 2013 ITB menjadi Perguruan Tinggi Negeri Badan Hukum yang memiliki otonomi pengelolaan dalam akademik dan nonakademik.",
        "Universitas Gadjah Mada adalah perguruan tinggi negeri di Daerah Istimewa Yogyakarta, Indonesia. Universitas Gadjah Mada merupakan perguruan tinggi pertama yang didirikan oleh Pemerintah Indonesia setelah Indonesia merdeka.",
        "Universitas Andalas adalah perguruan tinggi negeri Indonesia yang terletak di Kota Padang, Sumatra Barat, Indonesia. Universitas ini merupakan salah satu universitas tertua di luar Pulau Jawa yang dibuka secara resmi pada tanggal 23 Desember 1955 oleh Wakil Presiden Mohammad Hatta.",
        "Universitas Pendidikan Indonesia adalah sebuah perguruan tinggi negeri yang kampus utamanya berkedudukan di Kota Bandung, Jawa Barat, Indonesia. Sejak tahun 2012, UPI berstatus sebagai perguruan tinggi yang diselenggarakan pemerintah, berubah dari status sebelumnya sebagai perguruan tinggi Badan Hukum Milik Negara.",
        "Universitas Diponegoro disingkat sebagai Undip adalah sebuah perguruan tinggi negeri di Indonesia yang berlokasi di Semarang, Jawa Tengah, Indonesia. Saat ini Undip telah memiliki 11 Fakultas dan 2 Sekolah. Kampus utama Undip terletak di daerah Tembalang, dan kampus utama lainnya terletak di daerah Pleburan.",
        "Universitas Padjadjaran adalah sebuah perguruan tinggi negeri di Jawa Barat, Indonesia. Kampus utama Unpad, terutama untuk Program Sarjana, berada di Jatinangor, Kabupaten Sumedang, Jawa Barat.",
        "Universitas Negeri Padang, disingkat UNP adalah perguruan tinggi negeri di Padang, Sumatra Barat, Indonesia, yang berdiri pada 23 Oktober 1954. Rektor Universitas Negeri Padang sejak 20 Juli 2016 adalah Prof. Drs. H. Ganefri, M.Pd., Ph.D. Kampus utamanya terletak di Jalan Prof. Dr. Hamka, Air Tawar, Kota Padang.",
        "Universitas Hasanuddin, yang kemudian disingkat Unhas, merupakan sebuah perguruan tinggi negeri di kota Makassar, Provinsi Sulawesi Selatan, Indonesia, yang berdiri pada 10 September 1956.",
        "Universitas Brawijaya adalah perguruan tinggi di Indonesia yang berdiri pada tahun 1963 di Kota Malang, Jawa Timur melalui Ketetapan Menteri Pendidikan dan Ilmu Pengetahuan no.1 tanggal 5 Januari 1963. Tanggal tersebut kemudian ditetapkan sebagai Dies Natalis UB.")

    private val uniImages = intArrayOf(R.drawable.ui,
        R.drawable.ipb,
        R.drawable.itb,
        R.drawable.ugm,
        R.drawable.unand,
        R.drawable.upi,
        R.drawable.undip,
        R.drawable.unpad,
        R.drawable.unp,
        R.drawable.hasanuddin,
        R.drawable.unibraw)

    private val uniAlamat = arrayOf("Pondok Cina, Kecamatan Beji, Kota Depok, Jawa Barat 16424",
        "Jl. Raya Dramaga Kampus IPB Dramaga Bogor 16680 West Java, Indonesia",
        "Jl. Ganesa No.10, Lb. Siliwangi, Kecamatan Coblong, Kota Bandung, Jawa Barat 40132",
        "Bulaksumur, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281",
        "Limau Manis, Kec. Pauh, Kota Padang, Sumatera Barat 25175",
        "Jl. Dr. Setiabudi No.229, Isola, Kec. Sukasari, Kota Bandung, Jawa Barat 40154",
        "Jl. Prof. Sudarto No.13, Tembalang, Kec. Tembalang, Kota Semarang, Jawa Tengah 50275",
        "Jl. Raya Bandung Sumedang KM.21, Hegarmanah, Kec. Jatinangor, Kabupaten Sumedang, Jawa Barat 45363",
        "Jalan Prof Dr Hamka Kampus Air TawarPadangSumatera Barat",
        "Jl. Perintis Kemerdekaan No.KM.10, Tamalanrea Indah, Kec. Tamalanrea, Kota Makassar, Sulawesi Selatan 90245",
        "Jl. Abdul Muis No.52, RT.2/RW.3, Petojo Sel., Kecamatan Gambir, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10160")

    private val uniTelephone = arrayOf("(021) 7867222",
        "+62 251 8622642",
        "(022) 2500935",
        "(0274) 588688",
        "(0751) 71181",
        "(022) 2013163",
        "(024) 7460036",
        "(022) 84288828",
        "0751 7058692",
        "0811-5003-636",
        "+62-341-551611")

    val listData: ArrayList<University>
        get() {
            val list = arrayListOf<University>()
            for (position in uniName.indices) {
                val uni = University(uniName[position],uniDetaisl[position], uniImages[position], uniAlamat[position],  uniTelephone[position])
                list.add(uni)
            }
            return list
        }
}