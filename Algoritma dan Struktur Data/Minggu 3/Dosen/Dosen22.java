package Dosen;
import java.util.Scanner;
public class Dosen22 {
    Scanner input = new Scanner(System.in);
    String kode,nama,kelamin;
    boolean jenisKelamin;
    int usia;

    Dosen22(){

    }

    public Dosen22(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void inputDataDosen() {
        System.out.printf("kode\t: ");
        kode = input.nextLine();
        System.out.printf("Nama\t: ");
        nama = input.nextLine();
        System.out.printf("Jenis Kelamin\t: ");
        kelamin = input.nextLine();
        jenisKelamin = kelamin.equalsIgnoreCase("perempuan")? true : false;
        System.out.printf("Usia\t: ");
        usia = input.nextInt();
        System.out.printf("\n-----------------------------------\n");
    }

    void cetakInfo(){
        System.out.printf("\nKode\t: "+ kode);
        System.out.printf("\nNama\t: "+ nama);
        System.out.printf("\nJenis Kelamin\t: "+ kelamin);
        System.out.printf("\nUsia\t: "+ usia);
        System.out.printf("\n-----------------------------------\n");
    }
}
