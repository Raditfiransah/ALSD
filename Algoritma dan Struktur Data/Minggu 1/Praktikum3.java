import java.util.Scanner;

public class Praktikum3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputt = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumMatkul = input.nextInt();
        
        //Deklarasi Variabel
        String[] namaMatkul = new String[jumMatkul];
        int[] nilai = new int[jumMatkul];
        double[] sks = new double[jumMatkul];
        double[] bobotNilai = new double[jumMatkul];
        String[] nilaiHuruf = new String[jumMatkul];

        for (int i = 0; i < jumMatkul;i++){
            
            System.out.print("Nama Mata kuliah: ");
            namaMatkul[i] = inputt.nextLine(); 

            System.out.print("Masukkan SKS: ");
            sks[i] = input.nextInt();
            
            System.out.print("Masukkan nilai Mata Kuliah: ");
            nilai[i] = input.nextInt();
        }
        System.err.printf("%-20s%-20s%-20s%-20s%-20s\n","Mata kuliah", "Nilai Angka", "Nilai huruf", "SKS", "Bobot Nilai");
        for (int i = 0; i < jumMatkul;i++){
            if (nilai[i] >= 85) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if (nilai[i] >= 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilai[i] >= 75) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilai[i] >= 70) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilai[i] >= 65) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if (nilai[i] >= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else {
                nilaiHuruf[i] = "E"; 
                bobotNilai[i] = 0;
            }
            System.out.printf("%-20s%-20s%-20s%-20s%-20s\n",namaMatkul[i],nilai[i],nilaiHuruf[i],sks[i],bobotNilai[i]);
        }
        
        double totalBobot = 0;
        double totalSks = 0;
        
        for (int i = 0; i <jumMatkul;i++){
            totalBobot += bobotNilai[i] * sks[i];
            totalSks += sks[i];
        }
        double ipkSemester = totalBobot / totalSks; 
        System.out.print("IP Semester: " + ipkSemester);
        
    }
}
