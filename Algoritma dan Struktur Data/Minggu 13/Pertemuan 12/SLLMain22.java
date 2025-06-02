import java.util.Scanner;

public class SLLMain22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList22 sll = new SingleLinkedList22();
        int menu;

        do {
            System.out.println("\n=== PROGRAM PENGOLAHAN DATA MAHASISWA ===");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data pada Indeks Tertentu");
            System.out.println("4. Tambah Data Setelah Nama Tertentu");
            System.out.println("5. Tampilkan Data");
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
                    System.out.print("Kelas\t: ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK\t: ");
                    double ipk = sc.nextDouble();
                    Mahasiswa22 mhs = new Mahasiswa22(nama, nim, kelas, ipk);
                    sll.addFirst(mhs);
                    break;
                case 2:
                    System.out.println("\nMasukkan Data Mahasiswa");
                    System.out.print("Nama\t: ");
                    nama = sc.nextLine();
                    System.out.print("NIM\t: ");
                    nim = sc.nextLine();
                    System.out.print("Kelas\t: ");
                    kelas = sc.nextLine();
                    System.out.print("IPK\t: ");
                    ipk = sc.nextDouble();
                    mhs = new Mahasiswa22(nama, nim, kelas, ipk);
                    sll.addLast(mhs);
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
                    System.out.print("Kelas\t: ");
                    kelas = sc.nextLine();
                    System.out.print("IPK\t: ");
                    ipk = sc.nextDouble();
                    mhs = new Mahasiswa22(nama, nim, kelas, ipk);
                    sll.insertAt(index, mhs);
                    break;
                case 4:
                    System.out.print("\nMasukkan nama mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    System.out.println("\nMasukkan Data Mahasiswa Baru");
                    System.out.print("Nama\t: ");
                    nama = sc.nextLine();
                    System.out.print("NIM\t: ");
                    nim = sc.nextLine();
                    System.out.print("Kelas\t: ");
                    kelas = sc.nextLine();
                    System.out.print("IPK\t: ");
                    ipk = sc.nextDouble();
                    mhs = new Mahasiswa22(nama, nim, kelas, ipk);
                    sll.insertAfter(cariNama, mhs);
                    break;
                case 5:
                    sll.print();
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
