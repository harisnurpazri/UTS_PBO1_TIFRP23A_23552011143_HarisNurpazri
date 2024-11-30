package sisteminformasiakademik;

import java.util.Scanner;

public class SistemInformasiAkademik {
    public static void main(String[] args) {
        boolean pilih = true;
        Scanner input = new Scanner(System.in);
        StafAdministrasi stafAdministrasi = new StafAdministrasi("Admin", 1, "Staf");

        while (pilih) {
            System.out.println("\n============================================");
            System.out.println("|                   MENU                   |");
            System.out.println("============================================");
            System.out.println("1. Registrasi Civitas");
            System.out.println("2. Tampilkan Laporan Akademik");
            System.out.println("3. Hitung Nilai Mahasiswa");
            System.out.println("4. Manajemen Jadwal");
            System.out.println("5. Absensi Civitas");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (1/2/3/4/5/6): ");
            int pilihan = input.nextInt();
            input.nextLine(); 
            System.out.println("============================================");
            
            switch (pilihan) {
                case 1:
                    stafAdministrasi.registrasiCivitas();
                    break;
                case 2:
                    System.out.println("\n============================================");
                    System.out.println("+++++++++++   Laporan Akademik   +++++++++++");
                    System.out.println("============================================");
                    for (CivitasAkademika civitas : StafAdministrasi.getCivitasList()) {
                        civitas.tampilLaporanAkademik();
                        System.out.println("============================================");
                    }
                    break;
                case 3:
                    // Memanggil metode inputNilaiMahasiswa
                    stafAdministrasi.inputNilaiMahasiswa();
                    break;
                case 4:
                    // Manajemen Jadwal (Menampilkan Jadwal Dosen)
                    System.out.println("\n============================================");
                    System.out.println("+++++++++++   Manajemen Jadwal   +++++++++++");
                    System.out.println("============================================");
                    for (CivitasAkademika civitas : StafAdministrasi.getCivitasList()) {
                        if (civitas instanceof Dosen) {
                            Dosen dosen = (Dosen) civitas;
                            System.out.println("Dosen: " + dosen.getNama());
                            System.out.println("Mata Kuliah: " + dosen.getMataKuliah());
                            System.out.println("Jadwal: " + dosen.getJadwal());
                            System.out.println("--------------------------------------------");
                        }
                    }
                    break;
                case 5:
                    // Absensi
                    System.out.println("\n============================================");
                    System.out.println("+++++++++++    Absensi Civitas   +++++++++++");
                    System.out.println("============================================");
                    for (CivitasAkademika civitas : StafAdministrasi.getCivitasList()) {
                        civitas.absen();
                    }
                    break;
                case 6:
                    pilih = false;
                    System.out.println("Terima kasih, program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
