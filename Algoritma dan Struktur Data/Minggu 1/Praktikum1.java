import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Deklarasi variabel
        double tugas, kuis, uts, uas;
        
        //Input data
        System.out.print("Masukkan nilai Tugas :");
        tugas = input.nextDouble();
        System.out.print("Masukkan nilai Quiz :");
        kuis = input.nextDouble();
        System.out.print("Masukkan nilai Uts :");
        uts = input.nextDouble();
        System.out.print("Masukkan nilai Uas :");
        uas = input.nextDouble();

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");
            return;
        }
        
        double nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.4);

        String nilaiHuruf;
        if(nilaiAkhir >= 85){
            nilaiHuruf = "A";
        }else if(nilaiAkhir >= 80){
            nilaiHuruf = "B+";
        }else if(nilaiAkhir >= 75){
            nilaiHuruf = "B";
        }else if(nilaiAkhir >= 70){
            nilaiHuruf = "C+";
        }else if(nilaiAkhir >= 65){
            nilaiHuruf = "C";
        }else if(nilaiAkhir >= 50){
            nilaiHuruf = "D";
        }else {
            nilaiHuruf = "E";
        }

        String status;
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || 
            nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || 
            nilaiHuruf.equals("C")) {
            status = "LULUS";
        } else {
            status = "TIDAK LULUS";
        }

        System.out.println("\n=== Hasil Akhir ===");
        System.out.printf("Nilai Akhir: %.2f\n", nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Keterangan: " + status);
    }
}
