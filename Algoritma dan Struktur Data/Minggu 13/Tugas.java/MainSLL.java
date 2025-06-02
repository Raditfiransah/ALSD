import java.util.Scanner;

public class MainSLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int menu;

        do {
            System.out.println("\n=== PROGRAM PENGOLAHAN DATA MAHASISWA ===");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data pada Indeks Tertentu");
            System.out.println("4. Tambah Data Setelah Nama Tertentu");
            System.out.println("5. Hapus Data Pertama");
            System.out.println("6. Hapus Data Terakhir");
            System.out.println("7. Hapus Data Berdasarkan Nama");
            System.out.println("8. Hapus Data pada Indeks Tertentu");
            System.out.println("9. Cari Indeks berdasarkan Nama");
            System.out.println("10. Tampilkan Data");
            System.out.println("11. Cek Jumlah Antrian");
            System.out.println("12. Kosongkan List");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("\nMasukkan Data Mahasiswa");
                    System.out.print("Nama\t: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM\t: ");
                    String nim = sc.nextLine();
                    System.out.print("Prodi\t: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas\t: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nama, nim, prodi, kelas);
                    ll.addFirst(mhs);
                    break;
                case 2:
                    System.out.println("\nMasukkan Data Mahasiswa");
                    System.out.print("Nama\t: ");
                    nama = sc.nextLine();
                    System.out.print("NIM\t: ");
                    nim = sc.nextLine();
                    System.out.print("Prodi\t: ");
                    prodi = sc.nextLine();
                    System.out.print("Kelas\t: ");
                    kelas = sc.nextLine();
                    mhs = new Mahasiswa(nama, nim, prodi, kelas);
                    ll.addLast(mhs);
                    break;
                case 3:
                    System.out.println("\nMasukkan Data Mahasiswa");
                    System.out.print("Masukkan indeks: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama\t: ");
                    nama = sc.nextLine();
                    System.out.print("NIM\t: ");
                    nim = sc.nextLine();
                    System.out.print("Prodi\t: ");
                    prodi = sc.nextLine();
                    System.out.print("Kelas\t: ");
                    kelas = sc.nextLine();
                    mhs = new Mahasiswa(nama, nim, prodi, kelas);
                    ll.insertAt(index, mhs);
                    break;
                case 4:
                    System.out.print("\nMasukkan NIM mahasiswa yang dicari: ");
                    String cariNIM = sc.nextLine();
                    System.out.println("\nMasukkan Data Mahasiswa Baru");
                    System.out.print("Nama\t: ");
                    nama = sc.nextLine();
                    System.out.print("NIM\t: ");
                    nim = sc.nextLine();
                    System.out.print("Prodi\t: ");
                    prodi = sc.nextLine();
                    System.out.print("Kelas\t: ");
                    kelas = sc.nextLine();
                    mhs = new Mahasiswa(nama, nim, prodi, kelas);
                    ll.insertAfter(cariNIM, mhs);
                    break;
                case 5:
                    ll.removeFirst();
                    System.out.println("Data pertama berhasil dihapus");
                    break;
                case 6:
                    ll.removeLast();
                    System.out.println("Data terakhir berhasil dihapus");
                    break;
                case 7:
                    System.out.print("Masukkan nama mahasiswa yang akan dihapus: ");
                    String hapusNama = sc.nextLine();
                    ll.remove(hapusNama);
                    System.out.println("Data mahasiswa dengan nama " + hapusNama + " berhasil dihapus");
                    break;
                case 8:
                    System.out.print("Masukkan indeks yang akan dihapus: ");
                    int hapusIndex = sc.nextInt();
                    ll.removeAt(hapusIndex);
                    System.out.println("Data pada indeks " + hapusIndex + " berhasil dihapus");
                    break;
                case 9:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cariNama = sc.nextLine();
                    int hasilIndex = ll.indexOf(cariNama);
                    if (hasilIndex != -1) {
                        System.out.println("Data ditemukan pada indeks ke-" + hasilIndex);
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
                case 10:
                    ll.print();
                    break;
                case 11:
                    System.out.println("Jumlah data dalam list: " + ll.jumlahAntrian());
                    break;
                case 12:
                    ll.clear();
                    System.out.println("List berhasil dikosongkan");
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (menu != 0);
        
        sc.close();
    }
}
