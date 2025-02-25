import java.util.Scanner;

public class MataKuliah22 {
    Scanner input = new Scanner(System.in); 
    Scanner input2 = new Scanner(System.in);

    public String kode, nama, dummy; 
    public int sks, jumlahJam;
    
    MataKuliah22(){
    }
    public MataKuliah22(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData(){
        System.out.printf("kode\t: ");
        kode = input.nextLine();
        System.out.printf("Nama\t: ");
        nama = input.nextLine();
        System.out.printf("sks\t: ");
        sks = input2.nextInt();
        System.out.printf("Jumlah jam\t: ");
        dummy = input.nextLine();
        jumlahJam = Integer.parseInt(dummy);
        System.out.printf("\n-----------------------------------\n");
    }

    void cetakInfo(){
        System.out.printf("\nKode\t: "+ kode);
        System.out.printf("\nNama\t: "+ nama);
        System.out.printf("\nSKS\t: "+ sks);
        System.out.printf("\nJumlah jam\t: "+ jumlahJam);
        System.out.printf("\n-----------------------------------\n");
    }
}
