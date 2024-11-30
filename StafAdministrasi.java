package sisteminformasiakademik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StafAdministrasi extends CivitasAkademika {
    private static List<CivitasAkademika> civitasList = new ArrayList<>();  // Daftar civitas terdaftar

    public StafAdministrasi(String nama, int id, String status) {
        super(nama, id, status);
    }

    // Getter untuk daftar civitas
    public static List<CivitasAkademika> getCivitasList() {
        return civitasList;
    }

    // Metode untuk registrasi civitas ke dalam daftar
    public void registrasiCivitas() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n--------------------------------------------");
        System.out.println("|        Masukan Data Civitas Baru          ");
        System.out.println("--------------------------------------------");
        System.out.print("Nama      : ");
        String nama = input.nextLine();
        System.out.print("ID        : ");
        int id = input.nextInt();
        input.nextLine(); 
        System.out.print("Status (Mahasiswa/Dosen/Staf): ");
        String status = input.nextLine();

        CivitasAkademika civitas = null;
        if (status.equalsIgnoreCase("Mahasiswa")) {
            civitas = new Mahasiswa(nama, id, status);
        } else if (status.equalsIgnoreCase("Dosen")) {
            // Input tambahan untuk Dosen: Mata Kuliah dan Jadwal
            System.out.print("Mata Kuliah : ");
            String mataKuliah = input.nextLine();
            System.out.print("Jadwal      : ");
            String jadwal = input.nextLine();
            civitas = new Dosen(nama, id, status, mataKuliah, jadwal);
        } else if (status.equalsIgnoreCase("Staf")) {
            civitas = new StafAdministrasi(nama, id, status);
        } else {
            System.out.println("Status tidak valid.");
            return;
        }

        civitasList.add(civitas);
        System.out.println("Civitas ( " + civitas.getNama() + " ) berhasil terdaftar. ");
    }

    // Menambahkan metode untuk input nilai mahasiswa
    public void inputNilaiMahasiswa() {
        if (civitasList.isEmpty()) {
            System.out.println("============================================");
            System.out.println("|       Tidak Ada Civitas Terdaptar        |");
            System.out.println("============================================");
            return;
        }

        Scanner input = new Scanner(System.in);

        // Menampilkan daftar mahasiswa terdaftar
        System.out.println("\n--------------------------------------------");
        System.out.println("|        Daftar Mahasiswa Terdaftar         ");
        System.out.println("--------------------------------------------");
        int index = 1;
        for (CivitasAkademika civitas : civitasList) {
            if (civitas.getClass().equals(Mahasiswa.class)) {
                System.out.println(index++ + ". " + civitas.getNama());
            }
        }

        System.out.print("Pilih mahasiswa (1-" + (index - 1) + "): ");
        int pilihan = input.nextInt();
        input.nextLine();  
        if (pilihan < 1 || pilihan >= index) {
            System.out.println("< Pilihan tidak valid! >");
            return;
        }

        Mahasiswa mahasiswa = (Mahasiswa) civitasList.get(pilihan - 1);

        // Memanggil metode hitungNilai() untuk mahasiswa yang dipilih
        mahasiswa.hitungNilai();
    }

    // Polymorphism: Implementasi metode absen
    @Override
    public void absen() {
        System.out.println(getNama() + " (Staf Administrasi) ==> hadir dan siap bekerja.");
    }

    // Polymorphism: Implementasi laporan akademik
    @Override
    public void tampilLaporanAkademik() {
        System.out.println("============================================");
        System.out.println("|        Laporan Staf Administrasi         |");
        System.out.println("============================================");
        System.out.println("Nama  : " + getNama());
        System.out.println("ID    : " + getId());
        System.out.println("Status: " + getStatus());
        System.out.println("Tugas : Mengelola administrasi akademik.");
    }

    @Override
    public void hitungNilai() {
        System.out.println("< Staf Administrasi tidak memiliki nilai akademik. >");
    }
}
