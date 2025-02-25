import java.util.Scanner;
public class MahasiswaDemo22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        Scanner input2 = new Scanner(System.in); 
        // Mahasiswa22[] arrayOfMahasiswa = new Mahasiswa22[3];

        System.out.println("Masukkan Panjang Element");
        int panjangElemen = input2.nextInt();

        MataKuliah22[] arrayOfMatakuliah = new MataKuliah22[panjangElemen];
        String kode,nama,dummy;
        int sks, jumlahJam;

         for (int i = 0;i < 3;i++){
            arrayOfMatakuliah[i] = new MataKuliah22();
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMatakuliah[i].tambahData();
        }
        
        for (int i = 0;i < 3;i++){
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
        


        
        // for(int i = 0; i < 3; i++){
        //     System.out.println("Masukkan Data Mata kuliah " + (i + 1));
        //     System.out.printf("kode\t: ");
        //     kode = input.nextLine();
        //     System.out.printf("Nama\t: ");
        //     nama = input.nextLine();
        //     System.out.printf("sks\t: ");
        //     sks = input2.nextInt();
        //     System.out.printf("Jumlah jam\t: ");
        //     dummy = input.nextLine();
        //     jumlahJam = Integer.parseInt(dummy);
        //     System.out.printf("\n-----------------------------------\n");

        //     arrayOfMatakuliah[i] = new MataKuliah22(kode, nama, sks, jumlahJam);
            
        // }        

        // for (int i = 0; i < 3;i++){
        //     System.out.println("Data Mahasiswa ke-" + (i + 1));
        //     System.out.printf("\nKode\t: "+ arrayOfMatakuliah[i].kode);
        //     System.out.printf("\nNama\t: "+ arrayOfMatakuliah[i].nama);
        //     System.out.printf("\nSKS\t: "+ arrayOfMatakuliah[i].sks);
        //     System.out.printf("\nJumlah Jam\t: "+ arrayOfMatakuliah[i].jumlahJam);
        //     System.out.printf("\n-----------------------------------\n");
        // }        


        // for(int i = 0; i < 3; i++){
        //     arrayOfMahasiswa[i] = new Mahasiswa22();

        //     System.out.println("Masukkan Data Mahasiswa");
        //     System.out.printf("NIM\t: ");
        //     arrayOfMahasiswa[i].nim = input.nextLine();
        //     System.out.printf("Nama\t: ");
        //     arrayOfMahasiswa[i].nama = input.nextLine();
        //     System.out.printf("Kelas\t: ");
        //     arrayOfMahasiswa[i].kelas = input.nextLine();
        //     System.out.printf("IPK\t: ");
        //     dummy = input.nextLine();
        //     arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
        //     System.out.printf("\n-----------------------------------\n");
            
            
        // }

        // for (int i = 0;i < 3;i++){
        //     System.out.println("Data Mahasiswa ke-" + (i + 1));
        //     arrayOfMahasiswa[i].cetakInfo();
        // }

        

        // for (int i = 0; i < 3;i++){
        //     System.out.println("Data Mahasiswa ke-" + (i + 1));
        //     System.out.printf("\nNIM\t: "+ arrayOfMahasiswa[i].nim);
        //     System.out.printf("\nNIM\t: "+ arrayOfMahasiswa[i].nama);
        //     System.out.printf("\nNIM\t: "+ arrayOfMahasiswa[i].kelas);
        //     System.out.printf("\nNIM\t: "+ arrayOfMahasiswa[i].ipk);
        //     System.out.printf("\n-----------------------------------\n");
            
            
        // }
        input.close();

        // arrayOfMahasiswa[0] = new Mahasiswa22();
        // arrayOfMahasiswa[0].nama = "Radit Firansah";
        // arrayOfMahasiswa[0].nim = "244107020196";
        // arrayOfMahasiswa[0].kelas = "1 F";
        // arrayOfMahasiswa[0].ipk = (float)3.4;

        // arrayOfMahasiswa[1] = new Mahasiswa22();
        // arrayOfMahasiswa[1].nama = "Firansah Radit";
        // arrayOfMahasiswa[1].nim = "244107020197";
        // arrayOfMahasiswa[1].kelas = "2 F";
        // arrayOfMahasiswa[1].ipk = (float)3.7;

        // arrayOfMahasiswa[2] = new Mahasiswa22();
        // arrayOfMahasiswa[2].nama = "Firansah Fiaransah";
        // arrayOfMahasiswa[2].nim = "244107020198";
        // arrayOfMahasiswa[2].kelas = "3 F";
        // arrayOfMahasiswa[2].ipk = (float)3.9;

        // System.out.printf("NIM\t: " + arrayOfMahasiswa[0].nim);
        // System.out.printf("\nNama\t: " + arrayOfMahasiswa[0].nama);
        // System.out.printf("\nKelas\t: " + arrayOfMahasiswa[0].kelas);
        // System.out.printf("\nIPK\t: %.2f%n", arrayOfMahasiswa[0].ipk);
        // System.out.println("----------------------------------------------");
        // System.out.printf("\nNIM\t: " + arrayOfMahasiswa[1].nim);
        // System.out.printf("\nNama\t: " + arrayOfMahasiswa[1].nama);
        // System.out.printf("\nKelas\t: " + arrayOfMahasiswa[1].kelas);
        // System.out.printf("\nIPK\t: %.2f%n", arrayOfMahasiswa[1].ipk);
        // System.out.println("----------------------------------------------");
        // System.out.printf("\nNIM\t: " + arrayOfMahasiswa[2].nim);
        // System.out.printf("\nNama\t: " + arrayOfMahasiswa[2].nama);
        // System.out.printf("\nKelas\t: " + arrayOfMahasiswa[2].kelas);
        // System.out.printf("\nIPK\t: %.2f%n", arrayOfMahasiswa[2].ipk);
    }
}
