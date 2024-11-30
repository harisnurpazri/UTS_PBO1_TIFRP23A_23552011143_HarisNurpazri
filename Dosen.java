package sisteminformasiakademik;

public class Dosen extends CivitasAkademika {
    private String mataKuliah;

    public Dosen(String nama, int id, String status, String mataKuliah, String jadwal) {
        super(nama, id, status);
        this.mataKuliah = mataKuliah;
        setJadwal(jadwal);
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    @Override
    public void absen() {
        System.out.println(getNama() + " (Dosen) ==> hadir dan siap mengajar.");
        System.out.println("+++++++++++    Jadwal Mengajar    ++++++++++");
        System.out.println("--------------------------------------------");
        System.out.println(getJadwal());
    }

    @Override
    public void tampilLaporanAkademik() {
        System.out.println("============================================");
        System.out.println("++++++++++++    Laporan Dosen    +++++++++++");
        System.out.println("============================================");
        System.out.println("Nama        : " + getNama());
        System.out.println("ID          : " + getId());
        System.out.println("Status      : " + getStatus());
        System.out.println("Mata Kuliah : " + mataKuliah);
        System.out.println("Jadwal      : " + getJadwal());
    }

    @Override
    public void hitungNilai() {
        // Dosen tidak memiliki nilai untuk dihitung
        System.out.println("Dosen tidak memiliki nilai akademik.");
    }
}
