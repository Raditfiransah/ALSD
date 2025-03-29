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

        mhslist.tampil();
        // pencarian data sequential
        System.out.println("====================================");
        System.out.println("Pencarian Data");
        System.out.println("====================================");
        System.out.print("IPK:");
        double cari = input.nextDouble();
        System.out.println();

        System.out.println("Menggunakan Sequential Searching:");
        double posisi = mhslist.sequentialSearching(cari);
        int pss = (int) posisi;
        mhslist.tampilPosisi(cari,pss);
        mhslist.tampilDataSearch(cari,pss);
        
        System.out.println("Menggunakan Binary Searching:");
        double posisi2 = mhslist.findBinarySearch(cari, 0, jum - 1);
        int pss2 = (int) posisi2;
        mhslist.tampilPosisi(cari,pss2);
        mhslist.tampilDataSearch(cari,pss2);


        
        input.close();
    }
}
