import java.util.Scanner;

public class DLLMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList22 dll = new DoubleLinkedList22();
        int menu;

        do {
            System.out.println("\n=== PROGRAM PENGOLAHAN DATA MAHASISWA ===");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Setelah Posisi Tertentu");
            System.out.println("4. Tambah Data pada Indeks Tertentu");
            System.out.println("5. Hapus Data Pertama");
            System.out.println("6. Hapus Data Terakhir");
            System.out.println("7. Hapus Data Setelah Posisi Tertentu");
            System.out.println("8. Hapus Data pada Indeks Tertentu");
            System.out.println("9. Tampilkan Data");
            System.out.println("10. Cari Mahasiswa berdasarkan NIM");
            System.out.println("11. Tampilkan Data Pertama");
            System.out.println("12. Tampilkan Data Terakhir");
            System.out.println("13. Tampilkan Data pada Indeks Tertentu");
            System.out.println("14. Tampilkan Jumlah Data");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("\nMasukkan Data Mahasiswa");
                    System.out.print("NIM\t: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama\t: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi\t: ");
                    String prodi = sc.nextLine();
                    System.out.print("IPK\t: ");
                    double ipk = sc.nextDouble();
                    MahasiswaDLL22 mhs = new MahasiswaDLL22(nim, nama, prodi, ipk);
                    dll.addFirst(mhs);
                    System.out.println("Data berhasil ditambahkan di awal");
                    break;

                case 2:
                    System.out.println("\nMasukkan Data Mahasiswa");
                    System.out.print("NIM\t: ");
                    nim = sc.nextLine();
                    System.out.print("Nama\t: ");
                    nama = sc.nextLine();
                    System.out.print("Prodi\t: ");
                    prodi = sc.nextLine();
                    System.out.print("IPK\t: ");
                    ipk = sc.nextDouble();
                    mhs = new MahasiswaDLL22(nim, nama, prodi, ipk);
                    dll.addLast(mhs);
                    System.out.println("Data berhasil ditambahkan di akhir");
                    break;

                case 3:
                    if (dll.isEmpty()) {
                        System.out.println("List masih kosong!");
                        break;
                    }
                    System.out.print("Masukkan NIM mahasiswa yang ingin ditambahkan setelah : ");
                    String nimAcuan = sc.nextLine();
                    System.out.println("\nMasukkan Data Mahasiswa Baru");
                    System.out.print("NIM\t: ");
                    nim = sc.nextLine();
                    System.out.print("Nama\t: ");
                    nama = sc.nextLine();
                    System.out.print("Prodi\t: ");
                    prodi = sc.nextLine();
                    System.out.print("IPK\t: ");
                    ipk = sc.nextDouble();
                    mhs = new MahasiswaDLL22(nim, nama, prodi, ipk);
                    dll.addAfter(nimAcuan, mhs);
                    break;

                case 4:
                    System.out.print("Masukkan indeks untuk menambah data (0 - " + dll.size() + "): ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.println("\nMasukkan Data Mahasiswa");
                    System.out.print("NIM\t: ");
                    nim = sc.nextLine();
                    System.out.print("Nama\t: ");
                    nama = sc.nextLine();
                    System.out.print("Prodi\t: ");
                    prodi = sc.nextLine();
                    System.out.print("IPK\t: ");
                    ipk = sc.nextDouble();
                    mhs = new MahasiswaDLL22(nim, nama, prodi, ipk);
                    dll.add(index, mhs);
                    break;

                case 5:
                    if (!dll.isEmpty()) {
                        dll.removeFirst();
                    } else {
                        System.out.println("List masih kosong!");
                    }
                    break;

                case 6:
                    if (!dll.isEmpty()) {
                        dll.removeLast();
                    } else {
                        System.out.println("List masih kosong!");
                    }
                    break;

                case 7:
                    if (!dll.isEmpty()) {
                        System.out.print("Masukkan NIM mahasiswa yang datanya ingin dihapus setelahnya: ");
                        String nimHapus = sc.nextLine();
                        dll.removeAfter(nimHapus);
                    } else {
                        System.out.println("List masih kosong!");
                    }
                    break;

                case 8:
                    if (!dll.isEmpty()) {
                        System.out.print("Masukkan indeks data yang ingin dihapus (0 - " + (dll.size() - 1) + "): ");
                        index = sc.nextInt();
                        dll.remove(index);
                    } else {
                        System.out.println("List masih kosong!");
                    }
                    break;

                case 9:
                    dll.print();
                    break;

                case 10:
                    if (!dll.isEmpty()) {
                        System.out.print("Masukkan NIM yang dicari: ");
                        String cariNIM = sc.nextLine();
                        dll.search(cariNIM);
                    } else {
                        System.out.println("List masih kosong!");
                    }
                    break;

                case 11:
                    if (!dll.isEmpty()) {
                        System.out.println("\nData Mahasiswa Pertama:");
                        MahasiswaDLL22 first = dll.getFirst();
                        if (first != null) {
                            first.tampil();
                        }
                    } else {
                        System.out.println("List masih kosong!");
                    }
                    break;

                case 12:
                    if (!dll.isEmpty()) {
                        System.out.println("\nData Mahasiswa Terakhir:");
                        MahasiswaDLL22 last = dll.getLast();
                        if (last != null) {
                            last.tampil();
                        }
                    } else {
                        System.out.println("List masih kosong!");
                    }
                    break;

                case 13:
                    if (!dll.isEmpty()) {
                        System.out.print("Masukkan indeks yang ingin ditampilkan (0 - " + (dll.size() - 1) + "): ");
                        index = sc.nextInt();
                        MahasiswaDLL22 data = dll.getIndex(index);
                        if (data != null) {
                            System.out.println("\nData Mahasiswa pada indeks " + index + ":");
                            data.tampil();
                        }
                    } else {
                        System.out.println("List masih kosong!");
                    }
                    break;

                case 14:
                    System.out.println("Jumlah data dalam list: " + dll.size());
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