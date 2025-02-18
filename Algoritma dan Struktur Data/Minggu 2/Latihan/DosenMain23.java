public class DosenMain23 {
    public static void main(String[] args) {
        Dosen23 dosen1 = new Dosen23();
        dosen1.idDosen = "001";
        dosen1.nama = "Radit Firansah";
        dosen1.bidangKeahlian = "Ngoding";
        dosen1.tahunBergabung = 2010;
        dosen1.statusAktif = true;

        dosen1.tampilkanInformasi();
        dosen1.ubahKeahlian("Teknologi Informasi");
        dosen1.setStatusAktif(false);
        dosen1.hitungMasabergabung(2020);
        dosen1.tampilkanInformasi();

        Dosen23 dosen2 = new Dosen23("002", "Sumbul", "IOT", 2012, true);
        dosen2.tampilkanInformasi();
        dosen2.ubahKeahlian(null);
        dosen2.hitungMasabergabung(2022);
        dosen2.tampilkanInformasi();
    }
}
