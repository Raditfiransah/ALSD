import java.util.Scanner;

public class VolumeKubus {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Pilihan
        while (true) {
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            
            int pilihan = input.nextInt();
            
            if (pilihan == 4) {
                System.out.println("Terima kasih!");
                break;
            }
            
            System.out.print("Masukkan panjang sisi kubus: ");
            double sisi = input.nextDouble();

            switch (pilihan) {
                case 1:
                    System.out.println("Volume Kubus: " + hitungVolume(sisi));
                    break;
                case 2:
                    System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
                    break;
                case 3:
                    System.out.println("Keliling Kubus: " + hitungKeliling(sisi));
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    //Fungsi Hitung 
    static double hitungVolume(double s) {
        return s * s * s;
    }
    static double hitungLuasPermukaan(double s) {
        return 6 * s * s;
    }

    static double hitungKeliling(double s) {
        return 12 * s;
    }
}
