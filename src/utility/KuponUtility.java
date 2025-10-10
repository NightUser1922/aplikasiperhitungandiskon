package utility;

import java.util.HashMap;

/**
 * Utility class untuk mengelola kode kupon diskon
 */
public class KuponUtility {
    
    // Menyimpan daftar kode kupon dan besar diskonnya
    private static final HashMap<String, Integer> kuponList = new HashMap<>();
    
    static {
        // Daftar kupon bisa kamu kembangkan di sini
        kuponList.put("HEMAT10", 10);
        kuponList.put("DISKON5", 5);
        kuponList.put("SUPER25", 25);
        kuponList.put("BELANJA30", 30);
        kuponList.put("AKHIRTAHUN50", 50);
    }
    
    /**
     * Mengecek apakah kode kupon valid
     * @param kodeKupon teks kupon yang dimasukkan pengguna
     * @return true jika kupon ada di daftar
     */
    public static boolean isValidKupon(String kodeKupon) {
        return kuponList.containsKey(kodeKupon.toUpperCase());
    }
    
    /**
     * Mengambil nilai diskon berdasarkan kode kupon
     * @param kodeKupon teks kupon
     * @return nilai diskon (0 jika tidak ada)
     */
    public static int getDiskonKupon(String kodeKupon) {
        return kuponList.getOrDefault(kodeKupon.toUpperCase(), 0);
    }
    
    /**
     * Menampilkan daftar semua kode kupon yang tersedia
     */
    public static String getDaftarKupon() {
        StringBuilder daftar = new StringBuilder("Daftar Kode Kupon Aktif:\n");
        for (String kode : kuponList.keySet()) {
            daftar.append(kode).append(" = ").append(kuponList.get(kode)).append("%\n");
        }
        return daftar.toString();
    }
}
