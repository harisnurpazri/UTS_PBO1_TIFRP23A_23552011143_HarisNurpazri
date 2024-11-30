package sisteminformasiakademik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Mahasiswa extends CivitasAkademika {
    private List<String> namaMataKuliah = new ArrayList<>();
    private List<Double> nilaiMataKuliah = new ArrayList<>();
    private List<String> gradeMataKuliah = new ArrayList<>();
    private List<Integer> bobotMataKuliah = new ArrayList<>();
    private double nilaiIP;

    public Mahasiswa(String nama, int id, String status) {
        super(nama, id, status);
    }

    @Override
    public void absen() {
        System.out.println(getNama() + " ==> (Mahasiswa) hadir di kelas.");
    }

    @Override
    public void tampilLaporanAkademik() {
        System.out.println("============================================");
        System.out.println("++++++++++++  Laporan Mahasiswa  +++++++++++");
        System.out.println("============================================");
        System.out.println("Nama     : " + getNama());
        System.out.println("ID       : " + getId());
        System.out.println("Status   : " + getStatus());
        System.out.println("Nilai IP : " + nilaiIP);
    }

    @Override
    public void hitungNilai() {
        Scanner input = new Scanner(System.in);
        double totalBobot = 0;
        double totalSKS = 21;
        System.out.println("============================================");
        System.out.println("|       Input Nama dan Nilai Matkul        |");
        System.out.println("============================================");

        for (int i = 1; i <= 7; i++) {
            System.out.print("Nama Mata Kuliah  ( " + i + " ) : ");
            String namaMatkul = input.nextLine();

            System.out.print("Nilai Mata Kuliah ( " + i + " ) : ");
            double nilai = input.nextDouble();
            input.nextLine(); 

            // Menentukan grade dan bobot
            String grade = "";
            int bobot = 0;
            if (nilai >= 90 && nilai <= 100) {
                grade = "A";
                bobot = 12;
            } else if (nilai >= 80 && nilai < 90) {
                grade = "B";
                bobot = 9;
            } else if (nilai >= 70 && nilai < 80) {
                grade = "C";
                bobot = 6;
            } else if (nilai >= 60 && nilai < 70) {
                grade = "D";
                bobot = 3;
            } else if (nilai >= 1 && nilai < 60) {
                grade = "E";
                bobot = 0;
            } else {
                System.out.println("Nilai tidak valid!");
                return; // Exit jika nilai tidak valid
            }

            // Menyimpan informasi mata kuliah, nilai, grade, dan bobot
            namaMataKuliah.add(namaMatkul);
            nilaiMataKuliah.add(nilai);
            gradeMataKuliah.add(grade);
            bobotMataKuliah.add(bobot);

            totalBobot += bobot;
        }
        // Hitung IPK (total bobot dibagi 21 (3 sks x 7 mata kuliah) )
        double ip = totalBobot / 21; // perhitungan IPK
        DecimalFormatSymbols bulat = new DecimalFormatSymbols();
        bulat.setDecimalSeparator('.'); // memastikan pemisah desimal adalah titik

        DecimalFormat bulatkan = new DecimalFormat("#.0", bulat); // format dengan satu angka di belakang koma
        String hasilFormat = bulatkan.format(ip); // hasil dalam bentuk string

        // Mengonversi kembali hasil format ke double
        double nilaiIP = Double.parseDouble(hasilFormat);

        // Tampilkan total bobot dan IPK
        System.out.println("----------------------------------------------------");
        System.out.println("| >>>>>>>>>>>>>>  Kartu Hasil Studi <<<<<<<<<<<<<< |");
        System.out.println("----------------------------------------------------");
        System.out.println("Total Bobot Nilai : " + totalBobot);
        System.out.println("IP Mahasiswa      : " + nilaiIP);
        System.out.println("----------------------------------------------------");
        
    }
}
