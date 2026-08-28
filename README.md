# Iktikad 50

Aplikasi Android (Kotlin + Jetpack Compose) berisi **Aqaid 50 / Iktikad 50**: 50 perkara iktikad
yang wajib diketahui setiap mukalaf menurut manhaj ahlussunnah wal jamaah (Asy'ariyah).

Isi:

| Kategori | Jumlah |
| --- | --- |
| Sifat wajib bagi Allah | 20 |
| Sifat mustahil bagi Allah | 20 |
| Sifat jaiz bagi Allah | 1 |
| Sifat wajib bagi rasul | 4 |
| Sifat mustahil bagi rasul | 4 |
| Sifat jaiz bagi rasul | 1 |

Setiap entri memuat tulisan Arab, transliterasi latin, arti, keterangan singkat, dan
pengelompokan (nafsiyah, salbiyah, ma'ani, ma'nawiyah). Daftar yang panjang dapat dicari.

## Build

```bash
echo "sdk.dir=$ANDROID_HOME" > local.properties
./gradlew assembleDebug
```

APK hasil build: `app/build/outputs/apk/debug/app-debug.apk`.

Butuh JDK 17, Android SDK platform 34, dan build-tools 34.0.0. Minimum Android 7.0 (API 24).
