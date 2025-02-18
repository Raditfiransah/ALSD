public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa23 mhs1 = new Mahasiswa23();
        mhs1.nama = "Radit Firansah";
        mhs1.nim = "244107020196";
        mhs1.kelas = "1 F";
        mhs1.ipk = 3.4;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("2 F");
        mhs1.updateIpk(3.7);
        mhs1.tampilkanInformasi();

        Mahasiswa23 mhs2 = new Mahasiswa23("Radit Firansah", "244107030196", 3.4, "1 F");
        mhs2.updateIpk(4.0);
        mhs2.tampilkanInformasi();

        Mahasiswa23 mhsRadit = new Mahasiswa23("Radit Firansah", "081235480893", 3.7, "3 F");
    }
}
