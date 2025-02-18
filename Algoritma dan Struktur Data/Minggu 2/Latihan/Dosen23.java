public class Dosen23 {
    String idDosen, nama, bidangKeahlian;
    int tahunBergabung; 
    boolean statusAktif;

    void tampilkanInformasi(){
        System.out.println("ID Dosen: "+ idDosen);
        System.out.println("Nama Dosen: "+ nama);
        System.out.println("Bidang Keahlian: "+ bidangKeahlian);
        System.out.println("Tahun Bergabung: "+ tahunBergabung);
        System.out.println("Status Aktif: "+ statusAktif);
    }

    void setStatusAktif(boolean statusBaru){
        statusAktif = statusBaru;
    }

    int hitungMasabergabung(int tahunBaru){
        tahunBaru -= tahunBergabung;
        tahunBergabung = tahunBaru;
        return tahunBaru;
    }

    void ubahKeahlian(String bidangBaru){
        bidangKeahlian = bidangBaru;
    }

    public Dosen23(){}
    public Dosen23(String id, String nm, String bidang, int tahun, boolean status){
        idDosen = id;
        nama = nm;
        bidangKeahlian = bidang;
        tahunBergabung = tahun;
        statusAktif = status;
    }
}
