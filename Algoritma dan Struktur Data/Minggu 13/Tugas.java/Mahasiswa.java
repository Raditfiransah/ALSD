public class Mahasiswa {
    String nim, nama, prodi, kelas;

    Mahasiswa(){}
    Mahasiswa(String nim, String nama, String prodi, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    void tampilkanInformasi(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Kelas: " + kelas);
    }
    
}
