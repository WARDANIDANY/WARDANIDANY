package com.wardani.iktikad50

data class Aqidah(
    val number: Int,
    val arabic: String,
    val latin: String,
    val meaning: String,
    val note: String,
    val group: String = ""
)

data class Category(
    val id: String,
    val title: String,
    val subtitle: String,
    val items: List<Aqidah>
)

private val sifatWajibAllah = listOf(
    Aqidah(1, "وُجُوْد", "Wujud", "Ada", "Allah itu ada dengan zat-Nya sendiri, tidak diadakan oleh siapa pun.", "Nafsiyah"),
    Aqidah(2, "قِدَم", "Qidam", "Terdahulu", "Tidak ada permulaan bagi Allah; Dia ada sebelum segala sesuatu.", "Salbiyah"),
    Aqidah(3, "بَقَاء", "Baqa'", "Kekal", "Allah tidak akan binasa, sedangkan makhluk pasti binasa.", "Salbiyah"),
    Aqidah(4, "مُخَالَفَتُهُ لِلْحَوَادِث", "Mukhalafatuhu lil hawadits", "Berbeda dengan makhluk", "Zat dan sifat Allah tidak menyerupai apa pun dari ciptaan-Nya.", "Salbiyah"),
    Aqidah(5, "قِيَامُهُ بِنَفْسِهِ", "Qiyamuhu binafsihi", "Berdiri sendiri", "Allah tidak membutuhkan tempat, zat lain, atau pencipta.", "Salbiyah"),
    Aqidah(6, "وَحْدَانِيَّة", "Wahdaniyah", "Esa", "Esa pada zat, sifat, dan perbuatan-Nya; tidak berbilang dan tidak bersekutu.", "Salbiyah"),
    Aqidah(7, "قُدْرَة", "Qudrat", "Berkuasa", "Kuasa Allah meliputi segala sesuatu yang mungkin terjadi.", "Ma'ani"),
    Aqidah(8, "إِرَادَة", "Iradat", "Berkehendak", "Segala yang terjadi berlaku sesuai kehendak Allah, tanpa paksaan.", "Ma'ani"),
    Aqidah(9, "عِلْم", "Ilmu", "Mengetahui", "Ilmu Allah meliputi yang nyata dan yang tersembunyi.", "Ma'ani"),
    Aqidah(10, "حَيَاة", "Hayat", "Hidup", "Hidup Allah kekal, tidak didahului ketiadaan dan tidak berakhir.", "Ma'ani"),
    Aqidah(11, "سَمْع", "Sama'", "Mendengar", "Allah mendengar segala sesuatu tanpa perantara alat.", "Ma'ani"),
    Aqidah(12, "بَصَر", "Bashar", "Melihat", "Allah melihat segala sesuatu, sekecil apa pun.", "Ma'ani"),
    Aqidah(13, "كَلَام", "Kalam", "Berfirman", "Firman Allah bukan berupa suara dan huruf seperti makhluk.", "Ma'ani"),
    Aqidah(14, "قَادِرًا", "Qadiran", "Yang Maha Berkuasa", "Keadaan Allah senantiasa bersifat kuasa.", "Ma'nawiyah"),
    Aqidah(15, "مُرِيْدًا", "Muridan", "Yang Maha Berkehendak", "Keadaan Allah senantiasa bersifat berkehendak.", "Ma'nawiyah"),
    Aqidah(16, "عَالِمًا", "'Aliman", "Yang Maha Mengetahui", "Keadaan Allah senantiasa bersifat mengetahui.", "Ma'nawiyah"),
    Aqidah(17, "حَيًّا", "Hayyan", "Yang Maha Hidup", "Keadaan Allah senantiasa bersifat hidup.", "Ma'nawiyah"),
    Aqidah(18, "سَمِيْعًا", "Sami'an", "Yang Maha Mendengar", "Keadaan Allah senantiasa bersifat mendengar.", "Ma'nawiyah"),
    Aqidah(19, "بَصِيْرًا", "Bashiran", "Yang Maha Melihat", "Keadaan Allah senantiasa bersifat melihat.", "Ma'nawiyah"),
    Aqidah(20, "مُتَكَلِّمًا", "Mutakalliman", "Yang Maha Berfirman", "Keadaan Allah senantiasa bersifat berkata-kata.", "Ma'nawiyah")
)

private val sifatMustahilAllah = listOf(
    Aqidah(1, "عَدَم", "'Adam", "Tiada", "Lawan dari Wujud.", "Nafsiyah"),
    Aqidah(2, "حُدُوث", "Huduts", "Baharu / ada permulaan", "Lawan dari Qidam.", "Salbiyah"),
    Aqidah(3, "فَنَاء", "Fana'", "Binasa", "Lawan dari Baqa'.", "Salbiyah"),
    Aqidah(4, "مُمَاثَلَتُهُ لِلْحَوَادِث", "Mumatsalatuhu lil hawadits", "Menyerupai makhluk", "Lawan dari Mukhalafatuhu lil hawadits.", "Salbiyah"),
    Aqidah(5, "اِحْتِيَاجُهُ لِغَيْرِهِ", "Ihtiyajuhu li ghairihi", "Membutuhkan yang lain", "Lawan dari Qiyamuhu binafsihi.", "Salbiyah"),
    Aqidah(6, "تَعَدُّد", "Ta'addud", "Berbilang", "Lawan dari Wahdaniyah.", "Salbiyah"),
    Aqidah(7, "عَجْز", "'Ajzun", "Lemah", "Lawan dari Qudrat.", "Ma'ani"),
    Aqidah(8, "كَرَاهَة", "Karahah", "Terpaksa", "Lawan dari Iradat.", "Ma'ani"),
    Aqidah(9, "جَهْل", "Jahlun", "Bodoh", "Lawan dari Ilmu.", "Ma'ani"),
    Aqidah(10, "مَوْت", "Mautun", "Mati", "Lawan dari Hayat.", "Ma'ani"),
    Aqidah(11, "صَمَم", "Shamamun", "Tuli", "Lawan dari Sama'.", "Ma'ani"),
    Aqidah(12, "عَمَى", "'Umyun", "Buta", "Lawan dari Bashar.", "Ma'ani"),
    Aqidah(13, "بُكْم", "Bukmun", "Bisu", "Lawan dari Kalam.", "Ma'ani"),
    Aqidah(14, "عَاجِزًا", "'Ajizan", "Yang lemah", "Lawan dari Qadiran.", "Ma'nawiyah"),
    Aqidah(15, "كَارِهًا", "Karihan", "Yang terpaksa", "Lawan dari Muridan.", "Ma'nawiyah"),
    Aqidah(16, "جَاهِلًا", "Jahilan", "Yang bodoh", "Lawan dari 'Aliman.", "Ma'nawiyah"),
    Aqidah(17, "مَيِّتًا", "Mayyitan", "Yang mati", "Lawan dari Hayyan.", "Ma'nawiyah"),
    Aqidah(18, "أَصَمَّ", "Ashamma", "Yang tuli", "Lawan dari Sami'an.", "Ma'nawiyah"),
    Aqidah(19, "أَعْمَى", "A'ma", "Yang buta", "Lawan dari Bashiran.", "Ma'nawiyah"),
    Aqidah(20, "أَبْكَمَ", "Abkam", "Yang bisu", "Lawan dari Mutakalliman.", "Ma'nawiyah")
)

private val sifatJaizAllah = listOf(
    Aqidah(
        1,
        "فِعْلُ كُلِّ مُمْكِنٍ أَوْ تَرْكُهُ",
        "Fi'lu kulli mumkinin aw tarkuhu",
        "Berbuat atau tidak berbuat sesuatu yang mungkin",
        "Allah berhak melakukan atau meninggalkan segala perkara yang mungkin, tanpa ada yang mewajibkan-Nya."
    )
)

private val sifatWajibRasul = listOf(
    Aqidah(1, "صِدْق", "Shiddiq", "Benar", "Setiap ucapan dan berita rasul adalah benar."),
    Aqidah(2, "أَمَانَة", "Amanah", "Dapat dipercaya", "Rasul terpelihara dari perbuatan dosa dan khianat."),
    Aqidah(3, "تَبْلِيْغ", "Tabligh", "Menyampaikan", "Rasul menyampaikan seluruh wahyu kepada umatnya."),
    Aqidah(4, "فَطَانَة", "Fathanah", "Cerdas", "Rasul memiliki kecerdasan untuk berhujah dan membimbing umat.")
)

private val sifatMustahilRasul = listOf(
    Aqidah(1, "كِذْب", "Kizib", "Dusta", "Lawan dari Shiddiq."),
    Aqidah(2, "خِيَانَة", "Khianat", "Berkhianat", "Lawan dari Amanah."),
    Aqidah(3, "كِتْمَان", "Kitman", "Menyembunyikan wahyu", "Lawan dari Tabligh."),
    Aqidah(4, "بَلَادَة", "Baladah", "Bodoh", "Lawan dari Fathanah.")
)

private val sifatJaizRasul = listOf(
    Aqidah(
        1,
        "الأَعْرَاضُ الْبَشَرِيَّة",
        "Al-a'radh al-basyariyyah",
        "Sifat kemanusiaan yang tidak menurunkan derajat kerasulan",
        "Rasul tetap makan, minum, tidur, sakit, dan berkeluarga sebagaimana manusia biasa."
    )
)

val categories = listOf(
    Category("wajib-allah", "20 Sifat Wajib bagi Allah", "Sifat yang pasti ada pada Allah", sifatWajibAllah),
    Category("mustahil-allah", "20 Sifat Mustahil bagi Allah", "Lawan dari sifat wajib", sifatMustahilAllah),
    Category("jaiz-allah", "1 Sifat Jaiz bagi Allah", "Sifat harus/wenang bagi Allah", sifatJaizAllah),
    Category("wajib-rasul", "4 Sifat Wajib bagi Rasul", "Sifat yang pasti dimiliki rasul", sifatWajibRasul),
    Category("mustahil-rasul", "4 Sifat Mustahil bagi Rasul", "Sifat yang tidak mungkin ada pada rasul", sifatMustahilRasul),
    Category("jaiz-rasul", "1 Sifat Jaiz bagi Rasul", "Sifat harus bagi rasul", sifatJaizRasul)
)

val totalItems: Int = categories.sumOf { it.items.size }
