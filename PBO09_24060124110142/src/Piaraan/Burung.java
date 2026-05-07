// Nama File    : Burung.java
// NIM          : 24060124110142
// Nama         : Muchammad Yuda Tri Ananda
// Tanggal      : 7 Mei 2026

package Piaraan;

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("terbang");
    }

    @Override
    public void bersuara() {
        System.out.println("cuit");
    }
}
