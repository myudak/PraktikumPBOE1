// Nama File    : MTeman.java
// NIM          : 24060124110142
// Nama         : Muchammad Yuda Tri Ananda
// Tanggal      : 7 Mei 2026

public class MTeman {
    public static void main(String[] args) {
        Teman t = new Teman();

        t.addNama("Budi");
        t.addNama("Ani");
        t.addNama("Cici");
        t.addNama("Budi");

        System.out.println("=== Daftar Teman ===");
        t.showTeman();

        System.out.println("Jumlah teman: " + t.getNbelm());
        System.out.println("Nama indeks 1: " + t.getNama(1));
        System.out.println("Apakah 'Budi' ada? " + t.isMember("Budi"));
        System.out.println("Jumlah 'Budi': " + t.countNama("Budi"));

        t.setNama("Dedi", 0);
        t.gantiNama("Cici", "Caca");

        System.out.println("\n=== Setelah ubah ===");
        t.showTeman();

        t.delNama("Budi");
        System.out.println("\n=== Setelah hapus 'Budi' ===");
        t.showTeman();
    }
}
