import java.util.Scanner;

public class jadwal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = input.nextInt();
        input.nextLine();

        String[] namaMK = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMK[i] = input.nextLine();
            System.out.print("Jumlah SKS: ");
            sks[i] = input.nextInt();
            System.out.print("Semester: ");
            semester[i] = input.nextInt();
            input.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = input.nextLine();
        }

        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanJadwal(namaMK, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                    String hari = input.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMK, sks, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int sem = input.nextInt();
                    tampilkanJadwalBerdasarkanSemester(namaMK, sks, semester, hariKuliah, sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
                    String cariMK = input.nextLine();
                    cariMataKuliah(namaMK, sks, semester, hariKuliah, cariMK);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    input.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static void tampilkanJadwal(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\nJadwal Kuliah: ");
        for (int i = 0; i < namaMK.length; i++) {
            System.out.println(namaMK[i] + "  SKS: " + sks[i] + "  Semester: " + semester[i] + "  Hari: " + hariKuliah[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, String hari) {
        System.out.println("\nJadwal Kuliah pada " + hari + ":");
        boolean found = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println(namaMK[i] + "  SKS: " + sks[i] + "  Semester: " + semester[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada jadwal kuliah pada " + hari);
        }
    }

    public static void tampilkanJadwalBerdasarkanSemester(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, int sem) {
        System.out.println("\nJadwal Kuliah Semester " + sem + ":");
        boolean found = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (semester[i] == sem) {
                System.out.println(namaMK[i] + "  SKS: " + sks[i] + "  Hari: " + hariKuliah[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada mata kuliah di semester " + sem);
        }
    }

    public static void cariMataKuliah(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, String cariMK) {
        boolean found = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (namaMK[i].equalsIgnoreCase(cariMK)) {
                System.out.println("Nama: " + namaMK[i] + " SKS: " + sks[i] + " Semester: " + semester[i] + " Hari Kuliah: " + hariKuliah[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Mata kuliah tidak ditemukan!");
        }
    }
}
