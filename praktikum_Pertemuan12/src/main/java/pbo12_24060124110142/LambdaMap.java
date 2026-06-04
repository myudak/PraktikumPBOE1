/**
 * File         : LambdaMap.java
 * Deskripsi    : Menampilkan key (NIM) dan value (Nama Mahasiswa) dari sebuah Map
 *                menggunakan ekspresi lambda.
 * Pembuat      : Muchammad Yuda Tri Ananda / 24060124110142
 * Tanggal      : Kamis, 04 Juni 2026
 */
package pbo12_24060124110142;

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();

        // Key = NIM, Value = Nama Mahasiswa
        mahasiswaMap.put("2301001", "Adi Saputra");
        mahasiswaMap.put("2301002", "Bambang Wijaya");
        mahasiswaMap.put("2301003", "Cici Rahayu");
        mahasiswaMap.put("2301004", "Didi Kurniawan");
        mahasiswaMap.put("2301005", "Eka Putri");

        System.out.println("=== Data Mahasiswa ===");
        System.out.printf("%-12s | %s%n", "NIM", "Nama Mahasiswa");
        System.out.println("-------------+----------------");

        // Lambda digunakan untuk iterasi Map (forEach dengan BiConsumer)
        mahasiswaMap.forEach((nim, nama) ->
            System.out.printf("%-12s | %s%n", nim, nama)
        );
    }
}
