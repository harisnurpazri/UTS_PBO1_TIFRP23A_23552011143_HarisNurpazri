package sisteminformasiakademik;

// Inheritance: CivitasAkademika sebagai kelas induk dari Mahasiswa, Dosen, dan StafAdministrasi
public abstract class CivitasAkademika extends Sivitas {
    private String jadwal;

    public CivitasAkademika(String nama, int id, String status) {
        super(nama, id, status);
    }

    // Getter dan Setter untuk Jadwal
    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    // Metode untuk mengelola nilai atau tugas lainnya
    public abstract void hitungNilai();
    public abstract void absen();  // Pengelolaan absensi
}
