import java.util.Scanner;

public class MainSurat22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackSurat22 stack = new StackSurat22(5);
        int pilihan = 0;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Surat: ");
                    String idSurat = scanner.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String namaMahasiswa = scanner.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = scanner.nextLine();
                    System.out.print("Masukkan Jenis Izin (Sakit(S) / Izin(I)): ");
                    char jenisIzin = scanner.next().charAt(0);
                    System.out.print("Masukkan Durasi (hari): ");
                    int durasi = scanner.nextInt();

                    Surat22 surat = new Surat22(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.println("Surat Izin telah dibuat!");
                    break;
                case 2:
                    Surat22 suratDiproses = stack.pop();
                    if (suratDiproses != null) {
                        System.out.println("=======================================");
                        System.out.println("Surat Izin dari " + suratDiproses.namaMahasiswa + " telah diproses!");
                        System.out.println("ID Surat: " + suratDiproses.idSurat);
                        System.out.println("Kelas: " + suratDiproses.kelas);
                        System.out.println("Jenis Izin: " + suratDiproses.jenisIzin);
                        System.out.println("Durasi: " + suratDiproses.durasi + " hari");
                        System.out.println("=======================================");
                    }
                    break;
                case 3:
                    Surat22 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat Izin Terakhir " + lihat.namaMahasiswa );
                    }
                    break;
                case 4:
                    System.out.print("Masukkan Nama Surat yang dicari: ");
                    String cari = scanner.nextLine();
                    stack.cariSurat(cari);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
        scanner.close();
    }
}
