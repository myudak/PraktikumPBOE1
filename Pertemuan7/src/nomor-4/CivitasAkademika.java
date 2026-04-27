/* NIM  : 24060124110142
   Nama : Muchammad Yuda Tri Ananda
   Tanggal  : 27 April 2026
*/


public abstract class CivitasAkademika {
    private String nama;

    public CivitasAkademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public abstract String getNomor();
}
