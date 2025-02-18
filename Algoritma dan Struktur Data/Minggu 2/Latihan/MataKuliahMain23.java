public class MataKuliahMain23 {
    public static void main(String[] args) {
        MataKuliah23 matkul1 = new MataKuliah23();
        matkul1.kodemk = "AGM";
        matkul1.nama = "Agama";
        matkul1.sks = 10;
        matkul1.jumlahJam = 5;

        matkul1.tampilInformasi();
        matkul1.ubahSks(8);
        matkul1.tambahJam(10);
        matkul1.kurangiJam(5);
        matkul1.tampilInformasi();

        MataKuliah23 matkul2 = new MataKuliah23("SNI", "Seni", 10, 5);
        matkul2.tampilInformasi();
    }
}
