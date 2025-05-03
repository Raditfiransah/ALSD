import java.util.Scanner;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        StackTugasMahasiswa22 stack = new StackTugasMahasiswa22(5);
        Scanner scanner = new Scanner(System.in);
        int pilih = 0 ;

        do{
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Daftar Tugas Pertama");
            System.out.println("6. Melihat Total Tugas");
            System.out.print("Pilih menu: ");
            pilih = scanner.nextInt(); 
            scanner.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = scanner.nextLine();
                    Mahasiswa22 mhs = new Mahasiswa22(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.println("Tugas " + mhs.nama + " telah dikumpulkan!");
                    break;
                case 2:
                    Mahasiswa22 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.print("Menilai Tugas Dari: " + dinilai.nama + "\nMasukkan Nilai: ");
                        int nilai = scanner.nextInt();
                        dinilai.tugasNilai(nilai);
                        System.out.println("Nilai Tugas " + dinilai.nama + " dengan nilai: " + nilai);
                        String biner = stack.konversiDesimalkeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa22 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas Terakhir Dikumpulkan Oleh " + lihat.nama );
                    }
                    break;
                case 4:
                    System.out.println("Daftar Tugas:");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                Mahasiswa22 pertama = stack.pertama();
                    if (pertama != null) {
                        System.out.println("Tugas pertama Dikumpulkan Oleh " + pertama.nama );
                    }
                    break;
                case 6:
                    stack.total();
                        break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }while (pilih >= 0 || pilih >= 5);
        scanner.close();
    }
}
