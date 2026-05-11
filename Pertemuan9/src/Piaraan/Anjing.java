// Nama File    : Anjing.java
// NIM          : 24060124110142
// Nama         : Muchammad Yuda Tri Ananda
// Tanggal      : 7 Mei 2026

package Piaraan;

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("melata");
    }

    @Override
    public void bersuara() {
        System.out.println("guk-guk");
    }
}
