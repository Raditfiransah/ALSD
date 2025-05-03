import java.util.Scanner;

public class Matakuliah {

    // Fungsi hitung rata-rata
    public static double hitungRata(double[] nilai, int jumMatkul) {
        double total = 0;
        for (int i = 0; i < jumMatkul; i++) {
            total += nilai[i];
        }
        return total / jumMatkul;
    }

    // Fungsi kelulusan
    public static String Kelulusan(double rata) {
        if (rata >= 75) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMaha = scanner.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumMatkul = scanner.nextInt();

        // input mahasiswa
        for (int i = 0; i < jumMaha; i++) {
            System.out.println("Masukkan nilai untuk Mahasiswa ke-" + (i + 1) + ":");
            double[] nilai = new double[jumMatkul];

            // Input nilai mata kuliah
            for (int j = 0; j < jumMatkul; j++) {
                System.out.print("NilaiMata Kuliah ke-" + (j + 1) + ": ");
                nilai[j] = scanner.nextDouble();
            }

            // Hitung rata-rata nilai dan kelulusan
            double rata = hitungRata(nilai, jumMatkul);
            String hasilKelulusan = Kelulusan(rata);

            // Tampilkan hasil
            System.out.println("Mahasiswa ke-" + (i + 1) + " memiliki rata-rata nilai = " + rata + " dan dinyatakan: " + hasilKelulusan);
            System.out.println();

            scanner.close();
        }
    }
}
