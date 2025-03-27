import java.util.Scanner;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Mahasiswa : ");
        int jum = input.nextInt();
        input.nextLine();
        MahasiswaBerprestasi22 mhslist = new MahasiswaBerprestasi22(jum);

        for (int i = 0; i < jum;i++){
            System.out.println("data Mahasiswa Ke - " + (i+1));
            System.out.println("Masukkan NIM: ");
            String nim = input.next();
            System.out.println("Masukkan Nama: ");
            String nama = input.next();
            System.out.println("Masukkan Kelas: ");
            String kelas = input.next();
            System.out.println("Masukkan Nilai IPK: ");
            double ipk = input.nextDouble();
            System.out.println("====================================================================");
            
            Mahasiswa22 list = new Mahasiswa22(nim, nama, kelas, ipk);
            mhslist.tambah(list);
        }

        System.out.println("Data Mahasiswa Sebelum Sorting:");
        mhslist.tampil();

        System.out.println("Data Mahasiswa Setelah Sorting (Bubble Sort):");
        mhslist.bubbleSort();
        mhslist.tampil();

        System.out.println("Data Mahasiswa Setelah Sorting (Selection Sort):");
        mhslist.selectionSort();
        mhslist.tampil();

        System.out.println("Data Mahasiswa Setelah Sorting (Insertion Sort):");
        mhslist.insertionSort();
        mhslist.tampil();

        input.close();
    }
}
