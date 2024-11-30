package sisteminformasiakademik;

// Abstraksi: Kelas abstrak Sivitas yang mendefinisikan metode umum
public abstract class Sivitas {
    private String nama;
    private int id;
    private String status;

    public Sivitas(String nama, int id, String status) {
        this.nama = nama;
        this.id = id;
        this.status = status;
    }

    // Getter dan Setter (Encapsulation)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Metode umum yang harus diimplementasikan oleh subclass
    public abstract void absen();
    public abstract void tampilLaporanAkademik();
}
