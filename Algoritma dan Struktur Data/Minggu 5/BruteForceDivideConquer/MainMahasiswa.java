import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] nilaiUTS = {78,85,90,76,92,88,80,82}; 
        int[] nilaiUAS = {82,88,87,79,95,85,83,84};
        Mahasiswa mhs = new Mahasiswa();

        System.out.println("Nilai UTS Tertinggi: " + mhs.tertinggi(nilaiUTS, 0, nilaiUTS.length - 1));
        System.out.println("Nilai UTS terrendah: " + mhs.terendah(nilaiUTS, 0, nilaiUTS.length - 1));
        System.out.println("Nilai Rata-Rata UTS: " + mhs.rataRata(nilaiUTS));
        System.out.println("Nilai Rata-Rata UAS: " + mhs.rataRata(nilaiUAS));

        input.close();
    }
}
