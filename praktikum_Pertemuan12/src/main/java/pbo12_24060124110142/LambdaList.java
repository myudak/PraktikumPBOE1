/**
 * File         : LambdaList.java
 * Deskripsi    : Implementasi lambda pada List, digunakan sebagai parameter pada method.
 * Pembuat      : Muchammad Yuda Tri Ananda / 24060124110142
 * Tanggal      : Kamis, 04 Juni 2026
 */
package pbo12_24060124110142;

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        System.out.println("=== Daftar Mahasiswa ===");
        // Lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
