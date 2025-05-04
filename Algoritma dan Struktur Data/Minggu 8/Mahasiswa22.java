public class Mahasiswa22 {
    
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa22(){}
    Mahasiswa22(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasNilai(int nilai){
        this.nilai = nilai;
    }
}
