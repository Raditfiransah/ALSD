package Tugas;

import java.util.Scanner;

public class KRS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QueueKRS antrian = new QueueKRS(10);
        int pilihan;

        do {
            System.out.println("=== Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS Mahasiswa");
            System.out.println("3. Kosongkan antrian");
            System.out.println("4. Lihat Mahasiswa Terdepan");
            System.out.println("5. Lihat Mahasiswa Akhir");
            System.out.println("6. Lihat Semua Antrian");
            System.out.println("7. Jumlah Mahasiswa Dalam Antrian");
            System.out.println("8. Jumlah Mahasiswa Sudah KRS");
            System.out.println("9. Jumlah Mahasiswa Belum KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan){
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = input.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = input.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nama, nim, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa[] dilayani = antrian.prosesKrs();
                    if (dilayani != null) {
                        System.out.println("Melayani Mahasiswa: ");
                        for (Mahasiswa mahasiswa : dilayani) {
                            mahasiswa.tampilkanData();
                        }
                    }
                    break;
                case 3:
                    antrian.kosongkanAntrian();
                    break;
                case 4:
                    antrian.lihatTerdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    antrian.lihatSemua();
                    break;
                case 7:
                    System.out.println("Jumlah Mahasiswa dalam Antrian: " + antrian.jumlahAntrian());
                    break;
                case 8:
                    System.out.println("Jumlah Mahasiswa Sudah KRS: " + antrian.jumlahSudahKrs);
                    break;
                case 9:
                    System.out.println("Jumlah Mahasiswa Belum KRS: " + antrian.jumlahBelumKrs());
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
        input.close();
    }
}
