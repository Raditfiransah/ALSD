public class MahasiswaDLL22 {
    String nim, nama, prodi;
    double ipk;

    MahasiswaDLL22(String nim, String nama, String prodi, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.ipk = ipk;
    }

    public void tampil(){
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println("IPK : " + ipk);
    }
}
