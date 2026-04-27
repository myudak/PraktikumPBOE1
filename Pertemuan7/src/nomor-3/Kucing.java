/* NIM  : 24060124110142
   Nama : Muchammad Yuda Tri Ananda
   Tanggal  : 27 April 2026
*/

// 3. Realisasi subkelas Kucing
public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("melata");
    }

    @Override
    public void bersuara() {
        System.out.println("meong");
    }
}
